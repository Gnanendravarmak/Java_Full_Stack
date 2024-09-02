import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link, useNavigate } from "react-router-dom";
import "./Product.css";
import Loader from "../Loader/Loader";

const Product = () => {
  const [products, setProducts] = useState([]);
  const [filteredProducts, setFilteredProducts] = useState([]);
  const [error, setError] = useState('');
  const [searchTerm, setSearchTerm] = useState('');
  const [minPrice, setMinPrice] = useState('');
  const [maxPrice, setMaxPrice] = useState('');
  const [userRole, setUserRole] = useState('');
  const [currentRating, setCurrentRating] = useState({});
  const [loading, setLoading] = useState(false);

  const token = localStorage.getItem("token");
  const navigate = useNavigate();

  useEffect(() => {
    const role = localStorage.getItem("role") || 'user';
    setUserRole(role);
    fetchProducts();
  }, []);

  const fetchProducts = async () => {
    setLoading(true);
    try {
      const response = await axios.get("http://localhost:8080/api/v1/products/getAllProducts", {
        headers: {
          Authorization: `Bearer ${token}`
        }
      });
      setProducts(response.data);
      setFilteredProducts(response.data);
      setError('');
    } catch (err) {
      console.error("Error fetching products:", err);
      setError('Failed to fetch products. Please check your connection or server.');
    }
    setLoading(false);
  };

  const handleProductAdded = () => {
    fetchProducts();
  };

  const handleEditClick = (productId) => {
    navigate(`/updateProduct/${productId}`);
  };

  const handleDeleteClick = async (productId) => {
    setLoading(true);
    try {
      await axios.delete(`http://localhost:8080/api/v1/products/deleteProduct/${productId}`, {
        headers: {
          Authorization: `Bearer ${token}`
        }
      });
      fetchProducts();
      navigate("/home");
    } catch (err) {
      console.error("Error deleting product:", err);
      setError('Failed to delete product. Please try again.');
    }
    setLoading(false);
  };

  const handleSearchChange = (event) => {
    const query = event.target.value.toLowerCase();
    setSearchTerm(query);
    filterProducts(query, minPrice, maxPrice);
  };

  const handlePriceRangeChange = () => {
    filterProducts(searchTerm, minPrice, maxPrice);
  };

  const filterProducts = (query, minPrice, maxPrice) => {
    const filtered = products.filter((product) => {
      const tags = product.productTags.split(',').map(tag => tag.trim().toLowerCase());
      const price = product.productPrice;
      const matchesSearch = 
        product.productName.toLowerCase().includes(query) ||
        product.productDescription.toLowerCase().includes(query) ||
        product.productCategory.toLowerCase().includes(query) ||
        tags.some(tag => tag.includes(query));
      const matchesPrice = 
        (minPrice === '' || price >= parseFloat(minPrice)) &&
        (maxPrice === '' || price <= parseFloat(maxPrice));
      return matchesSearch && matchesPrice;
    });
    setFilteredProducts(filtered);
  };

  const handleRatingChange = (productId, newRating) => {
    setCurrentRating((prev) => ({ ...prev, [productId]: newRating }));
  };

  const submitRating = async (productId) => {
    const rating = currentRating[productId];
    if (!rating) {
      setError('Please select a rating before submitting.');
      return;
    }
    setLoading(true);
    try {
      await axios.put(
        `http://localhost:8080/api/v1/user/rating/${productId}/${rating}`, // Rating sent in URL
        {},
        {
          headers: {
            Authorization: `Bearer ${token}`
          }
        }
      );
      fetchProducts(); // Refresh products to reflect updated rating
    } catch (err) {
      console.error("Error submitting rating:", err);
      setError('Failed to submit rating. Please try again.');
    }
    setLoading(false);
  };

  const calculateRating = (rating) => {
    const stars = Math.round(rating); // Assuming rating is a whole number or rounded to nearest integer
    return '★'.repeat(stars) + '☆'.repeat(5 - stars); // 5 stars total
  };

  return (
    <div className="product-container">
      {userRole === 'admin' && (
        <Link to="/addProduct" className="add-product">
          Add New Product
        </Link>
      )}
        {loading?<Loader/>:null}
      <div className="search-bar-container">
        <input
          type="text"
          value={searchTerm}
          onChange={handleSearchChange}
          placeholder="Search products..."
          className="search-bar"
        />
        <div className="price-filter-container">
          <input
            type="number"
            value={minPrice}
            onChange={(e) => setMinPrice(e.target.value)}
            placeholder="Min Price"
            className="price-input"
          />
          <input
            type="number"
            value={maxPrice}
            onChange={(e) => setMaxPrice(e.target.value)}
            placeholder="Max Price"
            className="price-input"
          />
          <button onClick={handlePriceRangeChange} className="filter-button">
            Apply Filter
          </button>
        </div>
      </div>

      {/* Display Error */}
      {error && <p className="error-message">{error}</p>}

      {/* Displaying products */}
      <div className="products-list">
        {filteredProducts.map((product) => (
          <div className="product-card" key={product.productId}>
            <img
              src={product.productImageUrl}
              alt={product.productName}
              className="product-image"
            />
            <div className="product-details">
              <h2 className="product-name">{product.productName}</h2>
              <p className="product-description">{product.productDescription}</p>
              <p className="product-price">Price: {product.productPrice}</p>
              <p className="product-stock">In Stock: {product.productStockQuantity}</p>
              <p className="product-category">Category: {product.productCategory}</p>
              <p className="product-tags">Tags: {product.productTags}</p>
              <p className="product-rating">
                Rating: {calculateRating(product.productRating)}
              </p>
              {userRole !== 'admin' && (
                <div className="rating-container">
                  <select
                    value={currentRating[product.productId] || ''}
                    onChange={(e) => handleRatingChange(product.productId, parseInt(e.target.value))}
                    className="rating-select"
                  >
                    <option value="">Rate this product</option>
                    {[1, 2, 3, 4, 5].map((star) => (
                      <option key={star} value={star}>
                        {star} Star{star > 1 ? 's' : ''}
                      </option>
                    ))}
                  </select>
                  <button onClick={() => submitRating(product.productId)} className="submit-rating-button">
                    Submit Rating
                  </button>
                </div>
              )}
              {userRole === 'admin' && (
                <div className="product-actions">
                  <button onClick={() => handleEditClick(product.productId)} className="edit-button">Edit</button>
                  <button onClick={() => handleDeleteClick(product.productId)} className="delete-button">Delete</button>
                </div>
              )}
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Product;
