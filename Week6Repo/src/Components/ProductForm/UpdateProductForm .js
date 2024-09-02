// src/components/UpdateProduct/UpdateProduct.js

import React, { useEffect, useState } from "react";
import axios from "axios";
import { useParams, useNavigate } from "react-router-dom";
import "./ProductForm.css"; // Use the same CSS file or create a new one if needed

const UpdateProductForm = () => {
  const { productId } = useParams();
  const navigate = useNavigate();
  const [formData, setFormData] = useState({
    productName: "",
    productDescription: "",
    productPrice: "",
    productStockQuantity: "",
    productCategory: "",
    productTags: "",
    productImageUrl: "",
    productRating: ""
  });
  const [error, setError] = useState('');
  const [success, setSuccess] = useState('');
  const token = localStorage.getItem('token');

  useEffect(() => {
    const fetchProduct = async () => {
      try {
        const response = await axios.get(`http://localhost:8080/api/v1/products/getProduct/${productId}`, {
          headers: {
            Authorization: `Bearer ${token}`
          }
        });
        setFormData(response.data);
      } catch (err) {
        console.error("Error fetching product:", err);
        setError('Failed to fetch product. Please try again.');
      }
    };

    fetchProduct();
  }, [productId]);

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError('');
    setSuccess('');

    try {
      await axios.put(`http://localhost:8080/api/v1/products/updateProduct`, formData, {
        headers: {
          Authorization: `Bearer ${token}`
        }
      });
      setSuccess('Product updated successfully!');
      navigate('/home'); // Redirect to product list page
    } catch (err) {
      setError('Failed to update product. Please try again.');
    }
  };

  return (
    <form onSubmit={handleSubmit} className="product-form">
      <h2>Update Product</h2>
      {error && <p className="error-message">{error}</p>}
      {success && <p className="success-message">{success}</p>}
      {/* Repeat input fields from ProductForm, but pre-filled with product data */}
      <label htmlFor="productName">Product Name:</label>
      <input
        type="text"
        id="productName"
        name="productName"
        value={formData.productName}
        onChange={handleInputChange}
        required
      />

      <label htmlFor="productDescription">Description:</label>
      <textarea
        id="productDescription"
        name="productDescription"
        value={formData.productDescription}
        onChange={handleInputChange}
        required
      />

      <label htmlFor="productPrice">Price:</label>
      <input
        type="text"
        id="productPrice"
        name="productPrice"
        value={formData.productPrice}
        onChange={handleInputChange}
        required
      />

      <label htmlFor="productStockQuantity">Stock Quantity:</label>
      <input
        type="number"
        id="productStockQuantity"
        name="productStockQuantity"
        value={formData.productStockQuantity}
        onChange={handleInputChange}
        required
      />

      <label htmlFor="productCategory">Category:</label>
      <input
        type="text"
        id="productCategory"
        name="productCategory"
        value={formData.productCategory}
        onChange={handleInputChange}
        required
      />

      <label htmlFor="productTags">Tags:</label>
      <input
        type="text"
        id="productTags"
        name="productTags"
        value={formData.productTags}
        onChange={handleInputChange}
        required
      />

      <label htmlFor="productImageUrl">Image URL:</label>
      <input
        type="text"
        id="productImageUrl"
        name="productImageUrl"
        value={formData.productImageUrl}
        onChange={handleInputChange}
        required
      />

      <label htmlFor="productRating">Rating:</label>
      <input
        type="text"
        id="productRating"
        name="productRating"
        value={formData.productRating}
        onChange={handleInputChange}
        required
      />

      <button type="submit" className="add-product-button">Update Product</button>
    </form>
  );
};

export default UpdateProductForm;
