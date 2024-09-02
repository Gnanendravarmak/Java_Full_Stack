import React, { useState } from 'react';
import axios from 'axios';
import './Login.css'; // Import the CSS file
import { Link, useNavigate } from 'react-router-dom';
import Loader from '../../Loader/Loader';

const Login = () => {
  // Update the state variable name to match the backend field
  const [userEmail, setUserEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const navigate = useNavigate();
  const [loading, setLoading] = useState(false);

  // Use the correct variable name in validation
  const validateEmail = (email) => /\S+@\S+\.\S+/.test(email);
  const validatePassword = (password) => password.length >= 8;

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError('');

    // Validation using the updated state variable
    if (!validateEmail(userEmail)) {
      setError('Invalid email format.');
      return;
    }

    if (!validatePassword(password)) {
      setError('Password must be at least 8 characters long.');
      return;
    }
    setLoading(true);
    try {
      const response = await axios.post('http://localhost:8080/api/v1/auth/login', {
        userEmail, // Correct field name for the email
        password
      });

      console.log(response.data);
      // Assuming backend sends a single string with token and role separated by a space
      const [receivedToken, receivedRole] = response.data.split(' ');

      // Store the token and role in localStorage
      localStorage.setItem('token', receivedToken);
      localStorage.setItem('role', receivedRole);

     
      // Redirect to the home page after successful login
      navigate("/home");
      window.location.reload();

    } catch (err) {
      // Assuming the backend returns error messages in the response's data object
      if (err.response && err.response.data) {
        setError(err.response.data.message || 'Failed to log in. Please try again.');
      } else {
        setError('Failed to log in. Please try again.');
      }
    }
    setLoading(false);
  };

  return (
    <div className="login-container">
      <p className='login-title'>Login</p>
      {loading?<Loader/>:null}
      <form onSubmit={handleSubmit} className="login-form">
        <label htmlFor="userEmail">Email:</label>
        <input
          type="email"
          id="userEmail" // Match the id with the updated field name
          value={userEmail} // Update state variable
          onChange={(e) => setUserEmail(e.target.value)} // Update handler
          required
        />

        <label htmlFor="password">Password:</label>
        <input
          type="password"
          id="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />

        <button type="submit">Login</button>

        {error && <p className="error-message">{error}</p>}
      </form>
      <p>Don't have an Account? Create one <Link to="/signin">here</Link></p>
    </div>
  );
};

export default Login;
