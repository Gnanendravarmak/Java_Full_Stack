import logo from './logo.svg';
import './App.css';
import Navbar from './Components/Navbar/Navbar';
import { Route, Router, Routes } from 'react-router-dom';
import Login from './Components/Login/Login';
import SignUp from './Components/SignUp/SignUp';
import Home from './Components/Home/Home';
import ShowEvents from './Components/Pages/ShowEvnents/ShowEvents';
import AddEvent from './Components/Pages/AddEvent/AddEvent';
import EditEvent from './Components/Pages/EditEvent/EditEvent';
import "./Components/Data/EventsData";


function App() {
  return (
    <div className="App">
      
      <Navbar/>
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route path="/login"  element={<Login />} />
        <Route path='/signup' element={<SignUp/>}/>
        <Route path="/events" element={<ShowEvents />} />
        <Route path="/add-event" element={<AddEvent />} />
        <Route path="/edit-event/:index" element={<EditEvent />} />
      </Routes>
    </div>
  );
}

export default App;
