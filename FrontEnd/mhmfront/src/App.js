import React from "react";
import './App.css';
import Navbar from './components/NavBar';
import Login from './pages/Login';
import Register from "./pages/Register";
import MedicalHistory from "./pages/MedicalHistory";
import Choice from "./pages/Choice";
import Home from "./pages/Home";
import PieChartPage from "./pages/PieChart";
import 'bootstrap/dist/css/bootstrap.min.css';


const App = () => {
  return (
    <>
    <Navbar></Navbar>
    {/* <Register /> */}
   {/* <Login></Login>  */}
    {/* <Choice /> */}
    {/*<MedicalHistory />*/}
    <PieChartPage />
    {/* <Home /> */}
    {/* <Login></Login> */}
    {/* <Choice /> */}
    {/* <Home /> */}
    {/* <MedicalHistory /> */}
    </>
  );
};

export default App;
