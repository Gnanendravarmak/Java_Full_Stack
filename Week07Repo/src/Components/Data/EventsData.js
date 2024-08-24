// initializeLocalStorage.js

const events = [
    { name: "New Year Celebration", location: "City Hall", date: "2024-01-01", startTime: "09:00", endTime: "12:00", capacity: 150 },
    { name: "Tech Conference 2024", location: "Convention Center", date: "2024-02-15", startTime: "10:00", endTime: "17:00", capacity: 300 },
    { name: "Valentine's Day Gala", location: "Grand Hotel", date: "2024-02-14", startTime: "19:00", endTime: "23:00", capacity: 200 },
    { name: "Spring Festival", location: "City Park", date: "2024-03-20", startTime: "10:00", endTime: "16:00", capacity: 500 },
    { name: "Art Exhibition", location: "Gallery Museum", date: "2024-04-10", startTime: "11:00", endTime: "18:00", capacity: 100 },
    { name: "Music Concert", location: "Stadium", date: "2024-05-05", startTime: "20:00", endTime: "23:00", capacity: 10000 },
    { name: "Food Truck Festival", location: "Downtown Square", date: "2024-06-15", startTime: "12:00", endTime: "20:00", capacity: 200 },
    { name: "Charity Run", location: "Riverside Park", date: "2024-07-04", startTime: "07:00", endTime: "10:00", capacity: 500 },
    { name: "Book Fair", location: "Library Auditorium", date: "2024-08-10", startTime: "09:00", endTime: "18:00", capacity: 150 },
    { name: "Tech Hackathon", location: "Tech Hub", date: "2024-09-12", startTime: "09:00", endTime: "21:00", capacity: 200 },
    { name: "Halloween Party", location: "Community Center", date: "2024-10-31", startTime: "18:00", endTime: "23:00", capacity: 300 },
    { name: "Christmas Parade", location: "Main Street", date: "2024-12-25", startTime: "15:00", endTime: "18:00", capacity: 1000 },
    { name: "Winter Wonderland", location: "City Square", date: "2024-12-01", startTime: "12:00", endTime: "20:00", capacity: 800 },
    { name: "Cooking Workshop", location: "Culinary School", date: "2024-11-10", startTime: "10:00", endTime: "14:00", capacity: 30 },
    { name: "Science Fair", location: "University Hall", date: "2024-09-20", startTime: "08:00", endTime: "16:00", capacity: 150 },
    { name: "Dance Competition", location: "Dance Studio", date: "2024-10-05", startTime: "14:00", endTime: "18:00", capacity: 100 },
    { name: "Film Festival", location: "Cinema Complex", date: "2024-11-25", startTime: "18:00", endTime: "23:00", capacity: 250 },
    { name: "Sports Meet", location: "Sports Complex", date: "2024-07-20", startTime: "09:00", endTime: "17:00", capacity: 500 },
    { name: "Fashion Show", location: "Fashion Arena", date: "2024-08-15", startTime: "19:00", endTime: "22:00", capacity: 200 },
    { name: "Startup Pitch Event", location: "Innovation Center", date: "2024-06-25", startTime: "10:00", endTime: "16:00", capacity: 100 },
    { name: "Community Picnic", location: "Central Park", date: "2024-05-01", startTime: "11:00", endTime: "15:00", capacity: 250 }
  ];
  
  // Save the array of events to local storage
  localStorage.setItem('events', JSON.stringify(events));
  
  // Optionally verify by retrieving and logging the events
  const storedEvents = localStorage.getItem('events');
  const parsedEvents = storedEvents ? JSON.parse(storedEvents) : [];
  console.log(parsedEvents);
  