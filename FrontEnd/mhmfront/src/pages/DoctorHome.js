import Card from 'react-bootstrap/Card';
import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import {useNavigate} from 'react-router';
import './styles/Home.css';
import {LiaMedkitSolid} from 'react-icons/lia';
import NavBar from '../components/NavBar';

let navigate;
const paymentHandler=()=>{
  navigate("/payments");
}
const schedule=()=>{
  navigate("/freeSlot")
}
const patientHandler=()=>{
  navigate("/appointments")
}
const DoctorHome=()=>{
  navigate = useNavigate()
  
  const name = sessionStorage['dname'];
  console.log(name);
    return (
    <>
    <NavBar />
      <div class="wrapper">
      <center>
        <h1>Welcome <LiaMedkitSolid/>Dr. {name}</h1></center>
        <div class="container maind">
        <div class="row">
          <div class="col-md-6 homeimagesschedule">
          </div>
          <div class="col col-md-6">
          <Card>
      <Card.Body>
        <Card.Title>
        <div class="card-heading">
          <h5>Schedule</h5>
          </div>
        </Card.Title>
        <Card.Text>
          Click here to check your free slots here. You can edit your slots as well.
        </Card.Text>
        <div class="card-title">
        <a onClick={schedule} href="#">Visit</a>
        </div>
      </Card.Body>
    </Card>
          </div>
        </div>
        <div class="row">
        <div class="col-md-6 homeimages">
          </div>
          <div class="col col-md-6">
          <Card>
      <Card.Body>
        <Card.Title>
          <div class="card-heading">
          <h5>Payments</h5>
          </div>
          </Card.Title>
        <Card.Text>
          Some quick example text to build on the card title and make up the
          bulk of the card's content.
        </Card.Text>
        <div class="card-title">
        <a onClick={paymentHandler} href="">Visit</a>
        </div>
      </Card.Body>
    </Card>
          </div>
        </div>
        <div class="row">
          <div class="col-md-6 homeimagespatient">
          </div>
          <div class="col col-md-6">
          <Card>
      <Card.Body>
        {/* <Card.Img className="images"></Card.Img> */}
        <Card.Title>
        <div class="card-heading">
          <h5>Patients</h5>
          </div>
        </Card.Title>
        <Card.Text>
          Some quick example text to build on the card title and make up the
          bulk of the card's content.
        </Card.Text>
        <div class="card-title">
        <a onClick={patientHandler} href=''>Visit</a>
        </div>
      </Card.Body>
    </Card>
          </div>
        </div>
        </div>
      </div>  
    </>
  );
}
export default DoctorHome;