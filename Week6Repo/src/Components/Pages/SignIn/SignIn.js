import React, { useState } from 'react';
import axios from 'axios';
import './SignIn.css'; // Import the CSS file
import { Link, useNavigate } from 'react-router-dom';
import Loader from '../../Loader/Loader';

const SignIn = () => {
  const [userName, setUserName] = useState('');
  const [userEmail, setUserEmail] = useState('');
  const [password, setPassword] = useState('');
  const [role, setRole] = useState('');
  const [error, setError] = useState('');
  const [loading, setLoading] = useState(false);
  const navigate  = useNavigate();


  const validateEmail = (email) => /\S+@\S+\.\S+/.test(email);
  const validatePassword = (password) => {
    const minLength = 8;
    const hasUpperCase = /[A-Z]/.test(password);
    const hasSpecialChar = /[!@#$%^&*(),.?":{}|<>]/.test(password);
    const hasNumber = /\d/.test(password);
    return password.length >= minLength && hasUpperCase && hasSpecialChar && hasNumber;
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setError('');

    if (!validateEmail(userEmail)) {
      setError('Invalid email format.');
      return;
    }

    if (!validatePassword(password)) {
      setError('Password must start with a capital letter, have at least 8 characters, include one special character, and one number.');
      return;
    }
    setLoading(true);
    try {
      const response = await axios.post('http://localhost:8080/api/v1/auth/signup', {
        userName,
        userEmail,
        password,
        role
      });
      console.log(response.data);
      navigate('/login');
    } catch (err) {
        // console.log(response.data)
      setError("Account Creation failed");

    }
    setLoading(false);
  };

  return (
    <div className="signin-container">
      <p className='sign-in'>Sign In</p>
      {loading?<Loader/>:null}
      <form onSubmit={handleSubmit} className="signin-form">
        {error && <p className="error-message">{error}</p>}
        <label htmlFor="userName">Username:</label>
        <input
          type="text"
          id="userName"
          value={userName}
          onChange={(e) => setUserName(e.target.value)}
          required
        />

        <label htmlFor="userEmail">Email:</label>
        <input
          type="email"
          id="userEmail"
          value={userEmail}
          onChange={(e) => setUserEmail(e.target.value)}
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

        <label htmlFor="role">Role:</label>
        <select
          id="role"
          value={role}
          onChange={(e) => setRole(e.target.value)}
          required
        >
          <option value="">Select a role</option>
          <option value="admin">Admin</option>
          <option value="user">User</option>
        </select>

        <button type="submit">Sign In</button>

      </form>
      <p>Already Have An Account Login <Link to="/login">here</Link></p>

    </div>
  );
};

export default SignIn;
