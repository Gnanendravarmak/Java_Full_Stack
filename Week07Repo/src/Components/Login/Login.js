import React, { useState } from 'react';
import './Login.css'; 
import { Link, useNavigate } from 'react-router-dom';

const LoginPage = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const navigate =  useNavigate();


  const handleSubmit = (e) => {
    e.preventDefault();
    localStorage.setItem("token","token");
    console.log('Login submitted:', { email, password });
 
    navigate("/");
    window.location.reload();
  };

  return (
    <div className="login-container">
      <h1>Login</h1>
      <form onSubmit={handleSubmit} className="login-form">
        <label>
          Email:
          <input
            type="email"
            name="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
        </label>
        <label>
          Password:
          <input
            type="password"
            name="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </label>
        <button type="submit">Login</button>
        <div className="login-links">
            <p>Don't have an account?
            <Link to ="/signup" className="link">Create Account</Link></p>
        
        <Link to="/forgot-password" className="link link-btn">Forgot password?</Link>
        
      </div>
      </form>
      
    </div>
  );
};

export default LoginPage;
