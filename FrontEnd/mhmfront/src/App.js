import React from "react";
import './App.css';
import Navbar from './components/NavBar';
import Login from './pages/Login';
import Register from "./pages/Register";
import MedicalHistory from "./pages/MedicalHistory";
import Choice from "./pages/Choice";
import Home from "./pages/Home";
import 'bootstrap/dist/css/bootstrap.min.css';


const App = () => {
  return (
    <>
    <Navbar></Navbar>
    {/* <Register /> */}
<<<<<<< HEAD
   <Login></Login> 
    {/* <Choice /> */}
    {/*<MedicalHistory />*/}

    {/* <Home /> */}
=======
    {/* <Login></Login> */}
    <Choice />
    {/* <Home /> */}
    {/* <MedicalHistory /> */}
>>>>>>> 56a77d2 (Entities uploaded)
    </>
  );
};

export default App;
