import React from "react";
import {BrowserRouter, Route, Routes, Link} from 'react-router-dom'
import './App.css';
import ErrorPage from './pages/ErrorPage';

import Login from './pages/Login';
import Register from "./pages/Register";
import MedicalHistory from "./pages/MedicalHistory";
import Choice from "./pages/Choice";
import DoctorHome from "./pages/DoctorHome";
import DoctorLogin from "./pages/DoctorLogin"
import 'bootstrap/dist/css/bootstrap.min.css';
import DoctorRegistration from './pages/DoctorRegistration'
import PaymentHistory from "./pages/PaymentHistory";
import FreeSlot from "./pages/FreeSlot";
import DoctorAppointment from "./pages/DoctorAppointment";
import PatientAppointment from "./pages/PatientAppointment";
import MedicalHistoryCard from "./pages/MedicalHistoryCard"
import BookAppointment from "./pages/BookAppointment";
import UserHome from "./pages/UserHome"


const AuthorizeDoctor=()=>{
  const loginStatus = sessionStorage['loginStatus'];
  return loginStatus == '1'?<DoctorRegistration />:<DoctorLogin />
}
const AuthorizePayments=()=>{
  const loginStatus = sessionStorage['loginStatus'];
  if(loginStatus=='1'|| loginStatus=='2'){
    return <PaymentHistory />
   }
   else{
     return <Login />
   }
}
const AuthorizeAppointments=()=>{
  const loginStatus = sessionStorage['loginStatus'];
  if(loginStatus=='1'){
    return <DoctorAppointment />
  }else if(loginStatus=='2'){

  }else{
    return <Login />
  }
}
const AuthorizeFreeSlot=()=>{
  const loginStatus = sessionStorage['loginStatus'];
  if(loginStatus=='1'){
   return <FreeSlot />
  }
  else{
    return <Login />
  } 
}
const AuthorizePatient=()=>{
  const loginStatus = sessionStorage['loginStatus']
  if(loginStatus=='1'){
    return <PatientAppointment />
  }
  else{
    <Login />
  }
}
const AuthorizeBookAppointment=()=>{
  const loginStatus = sessionStorage['loginStatus']
  if(loginStatus=='2'){
    return <BookAppointment />
  }
}
const AuthorizeMedicalHistory=()=>{
  const loginStatus = sessionStorage['loginStatus']
  if(loginStatus=='2'){
    return <MedicalHistory />
  }
}
const Authorize=()=>{
  const loginStatus = sessionStorage['loginStatus'];
  if(loginStatus=='1'){
   return <DoctorHome />
  }
  else if(loginStatus=='2'){
    return <UserHome />
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
      <Route path="/bookAppointment" element={<AuthorizeBookAppointment />} />
      <Route path="/appointments" element={<AuthorizeAppointments />} />
      <Route path="/addMedicalHistory" element={<AuthorizeMedicalHistory />} />
      <Route path="/doctorLogin" element={<DoctorLogin />} />
      <Route path="/userRegisteration" element={<Register />} />
      <Route path="/payments" element={<AuthorizePayments />} />
      <Route path="/freeSlot" element={<AuthorizeFreeSlot />} />
      <Route path="/patient" element={<AuthorizePatient />}/>  
      <Route path="/error" element={<ErrorPage/>} /> 
      {/* <Route path="/medicalhistory" element={<MedicalHistory/>} />  */}

    </Routes>
    </BrowserRouter>
    </>
  );
};

export default App;
