import React from "react";
import {BrowserRouter, Route, Routes, Link} from 'react-router-dom'
import './App.css';
import Navbar from './components/NavBar';
import Login from './pages/Login';
import Register from "./pages/Register";
import MedicalHistory from "./pages/MedicalHistory";
import Choice from "./pages/Choice";
import DoctorHome from "./pages/DoctorHome";
import DoctorLogin from "./pages/DoctorLogin"
import 'bootstrap/dist/css/bootstrap.min.css';
import DoctorRegistration from './pages/DoctorRegistration'

const AuthorizeDoctor=()=>{
  const loginStatus = sessionStorage['loginStatus'];
  return loginStatus == '1'?<DoctorRegistration />:<DoctorLogin />
}
const Authorize=()=>{
  const loginStatus = sessionStorage['loginStatus'];
  if(loginStatus=='1'){
   return <DoctorHome />
  }
  else if(loginStatus=='2'){
    // <UserHome />
  }
  else{
    return <Login />
  }
}
const App = () => {
 
  return (
    <>
    <BrowserRouter>
    <Routes>
      {/* <Route path="/" element={} /> */}
      {/* <Route path="/userRegister" element={<Register /> } /> */}
      <Route path="/userLogin" element={<Login></Login>} />
      <Route path="/doctorRegisteration" element={<DoctorRegistration />} />
      <Route path="/" element={<Authorize />} />
      <Route path="/doctorLogin" element={<DoctorLogin />} />
      <Route path="/userRegisteration" element={<Register />} />
      {/* <Route path="/" element={} /> */}
    
    {/* */}

   {/*   */}
    {/* <Choice /> */}
    {/* <MedicalHistory /> */}

    {/* <Home /> */}

    {/* <Login></Login> */}
    {/* <Choice /> */}
    {/* <Home /> */}
    {/* <MedicalHistory /> */}
    {/* <DoctorLogin></DoctorLogin> */}
    
    </Routes>
    </BrowserRouter>
    </>
  );
};

export default App;
