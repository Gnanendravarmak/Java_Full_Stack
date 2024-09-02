// src/components/Navbar.js
import React from "react";
import { Link, useNavigate } from "react-router-dom";
import "./Navbar.css"; // Importing the CSS file

const Navbar = () => {
  const token = localStorage.getItem("token");
  const navigate  = useNavigate();


  const handleLogout = (e) => {
    e.preventDefault();
    localStorage.removeItem("token");
    localStorage.removeItem("role");
    navigate("/", { replace: true }); // replace the history
    window.location.reload();
  };
  

  return (
    <nav className="navbar">
      <div className="navbar-left">
        <Link to="/" className="navbar-logo">
          <img
            src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSKFNEaBa9ze6mOHjifBbmsM50jDekhpYj07g&s"
            alt="Logo"
          />
        </Link>
        <Link to="/" className="navbar-home">
          Home
        </Link>

        <Link to="/showdata" className="navbar-home">
          Data
        </Link>
      </div>
      <div className="navbar-right">
        {token ? (
          <button onClick={handleLogout} className="navbar-button">
            Logout
          </button>
        ) : (
          <div>
            <Link to="/login" className="navbar-button">
              Login
            </Link>
            <Link to="/signin" className="navbar-button">
              Signup
            </Link>
          </div>
        )}
      </div>
    </nav>
  );
};

export default Navbar;
