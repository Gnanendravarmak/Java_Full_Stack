import React from 'react';
import { Link, useNavigate } from 'react-router-dom';
import './Navbar.css'; // Import the CSS for styling

function Navbar() {
  const data = localStorage.getItem("token");
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem("token");
    navigate("/login");
    window.location.reload();
  };

  return (
    <nav className="navbar">
      <div className="navbar-left">
        <Link to="/">
          <img 
            src="https://www.anantabd.net/wp-content/uploads/2020/04/How-to-Start-Event-Management-Business-in-Bangladesh.jpg" 
            alt="Logo" 
            className="navbar-logo" 
          />
        </Link>
        <Link to="/" className="navbar-link">Home</Link>
        <Link to="/about" className="navbar-link">About</Link>
        {data && (
          <div>
            <Link to="/events" className="navbar-link">Show Events</Link>
            <Link to="/add-event" className="navbar-link">Add Event </Link>
            <Link to="/delete-event" className="navbar-link">Delete Event</Link>
            <Link to="/update-event" className="navbar-link">Update Event</Link>
          </div>
        )}
      </div>
      <div className="navbar-right">
        {!data ? (
          <div>
            <Link to="/login" className="nav-link">Login</Link>
            <Link to="/signup" className="nav-link">Signup</Link>
          </div>
        ) : (
          <button onClick={handleLogout} className="nav-link nav-btn">LogOut</button>
        )}
      </div>
    </nav>
  );
}

export default Navbar;
