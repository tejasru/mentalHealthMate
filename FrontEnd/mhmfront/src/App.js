import React from "react";
import './App.css';
import Navbar from './components/NavBar';
import Login from './pages/Login'
import 'bootstrap/dist/css/bootstrap.min.css';


const App = () => {
  return (
    <>
    <Navbar></Navbar>
    <Login></Login>
    </>
  );
};

export default App;