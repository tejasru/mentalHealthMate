import React from "react";
import './App.css';
import Navbar from './components/NavBar';
import Login from './pages/Login';
import Register from "./pages/Register";
import MedicalHistory from "./pages/MedicalHistory";
import Choice from "./pages/Choice";
import Home from "./pages/Home";
import DoctorLogin from "./pages/DoctorLogin"
import 'bootstrap/dist/css/bootstrap.min.css';
import DoctorRegistration from './pages/DoctorRegistration'

const App = () => {
  return (
    <>
    <Navbar></Navbar>
    {/* <Register /> */}

   {/* <Login></Login>  */}
    {/* <Choice /> */}
    {/* <MedicalHistory /> */}

    {/* <Home /> */}

    {/* <Login></Login> */}
    {/* <Choice /> */}
    {/* <Home /> */}
    {/* <MedicalHistory /> */}
    {/* <DoctorLogin></DoctorLogin> */}
    <DoctorRegistration />
    </>
  );
};

export default App;
