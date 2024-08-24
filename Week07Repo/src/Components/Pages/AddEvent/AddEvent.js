import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './AddEvents.css'; // Import CSS for styling

const AddEvent = () => {
  const [event, setEvent] = useState({
    name: '',
    location: '',
    date: '',
    startTime: '',
    endTime: '',
    capacity: ''
  });
  const navigate = useNavigate();

  const handleChange = (e) => {
    const { name, value } = e.target;
    setEvent({ ...event, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const storedEvents = JSON.parse(localStorage.getItem('events') || '[]');
    storedEvents.push(event);
    localStorage.setItem('events', JSON.stringify(storedEvents));
    navigate('/events');
  };

  return (
    <div className="add-event">
      <h1>Add New Event</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Name:
          <input type="text" name="name" value={event.name} onChange={handleChange} required />
        </label>
        <label>
          Location:
          <input type="text" name="location" value={event.location} onChange={handleChange} required />
        </label>
        <label>
          Date:
          <input type="date" name="date" value={event.date} onChange={handleChange} required />
        </label>
        <label>
          Start Time:
          <input type="time" name="startTime" value={event.startTime} onChange={handleChange} required />
        </label>
        <label>
          End Time:
          <input type="time" name="endTime" value={event.endTime} onChange={handleChange} required />
        </label>
        <label>
          Capacity:
          <input type="number" name="capacity" value={event.capacity} onChange={handleChange} required />
        </label>
        <button type="submit">Add Event</button>
      </form>
    </div>
  );
};

export default AddEvent;
