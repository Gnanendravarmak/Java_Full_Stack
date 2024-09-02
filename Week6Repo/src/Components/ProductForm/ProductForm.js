// src/components/ProductForm.js

import React, { useState } from "react";
import axios from "axios";
import "./ProductForm.css"; // Import the CSS file for ProductForm
import { useNavigate } from "react-router-dom";

const ProductForm = ({ onProductAdded }) => {
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
  const token  = localStorage.getItem('token');
  const navigate  = useNavigate();



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
      const response = await axios.post("http://localhost:8080/api/v1/products/addProduct", formData,
        {
            headers: {
                Authorization: `Bearer ${token}` // Include token in the headers
              }
        }
      );
      setSuccess('Product added successfully!');
      setFormData({
        productName: "",
        productDescription: "",
        productPrice: "",
        productStockQuantity: "",
        productCategory: "",
        productTags: "",
        productImageUrl: "",
        productRating: ""
      });
      navigate('/home');
    //   window.location.reload();
   
      onProductAdded(); // Notify parent to refresh products list
    } catch (err) {
      setError('Failed to add product. Please try again.');
    }
  };

  return (
    <form onSubmit={handleSubmit} className="product-form">
      <h2>Add New Product</h2>
      {error && <p className="error-message">{error}</p>}
      {success && <p className="success-message">{success}</p>}
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

      <button type="submit" className="add-product-button">Add Product</button>
    </form>
  );
};

export default ProductForm;
