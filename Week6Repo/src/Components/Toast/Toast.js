import React from 'react';
import './Toast.css'; // Importing the CSS for styling

const Toast = ({ message, type }) => (
  <div className={`toast ${type}`}>
    {message}
  </div>
);

export default Toast;
