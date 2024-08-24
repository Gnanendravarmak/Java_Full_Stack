import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import './ShowEvents.css'; // Import CSS for styling

const ShowEvents = () => {
  const [events, setEvents] = useState([]);
  const [searchTerm, setSearchTerm] = useState('');

  useEffect(() => {
    // Load events from local storage on component mount
    const storedEvents = localStorage.getItem('events');
    if (storedEvents) {
      setEvents(JSON.parse(storedEvents));
    }
  }, []);

  const handleDelete = (index) => {
    // Remove the event from the state and local storage
    const updatedEvents = events.filter((_, i) => i !== index);
    setEvents(updatedEvents);
    localStorage.setItem('events', JSON.stringify(updatedEvents));
  };

  // Filter events based on the search term
  const filteredEvents = events.filter(event => {
    return (
      event.name.toLowerCase().includes(searchTerm.toLowerCase()) ||
      event.location.toLowerCase().includes(searchTerm.toLowerCase()) ||
      event.date.includes(searchTerm)
    );
  });

  return (
    <div className="show-events">
     
      <div className="controls">
      <h1>Event List</h1>
        <div className="search-bar-container">
          <input
            type="text"
            placeholder="Search by name, location, or date"
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
            className="search-bar"
          />
        </div>
        <Link to="/add-event" className="add-event-button">Add Event</Link>
      </div>
      <table className="events-table">
        <thead>
          <tr>
            <th>Name</th>
            <th>Location</th>
            <th>Date</th>
            <th>Start Time</th>
            <th>End Time</th>
            <th>Capacity</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {filteredEvents.length > 0 ? (
            filteredEvents.map((event, index) => (
              <tr key={index}>
                <td>{event.name}</td>
                <td>{event.location}</td>
                <td>{event.date}</td>
                <td>{event.startTime}</td>
                <td>{event.endTime}</td>
                <td>{event.capacity}</td>
                <td>
                  <Link to={`/edit-event/${index}`} className="edit-button">Edit</Link>
                  <button onClick={() => handleDelete(index)} className="delete-button">Delete</button>
                </td>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="7">No events found</td>
            </tr>
          )}
        </tbody>
      </table>
    </div>
  );
};

export default ShowEvents;
