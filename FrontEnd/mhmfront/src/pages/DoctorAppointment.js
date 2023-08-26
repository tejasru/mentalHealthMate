import './styles/Home.css';
import NavBar from '../components/NavBar';
import axios from 'axios';
import { URL } from '../config';
import {RiMapPinLine,RiMapPin3Line} from 'react-icons/ri';
import Card from 'react-bootstrap/Card';
import { useEffect, useState } from 'react';
import {useNavigate} from 'react-router';


const DoctorAppointment=()=>{
    const navigate = useNavigate();
    let [appointments,setAppointment] = useState([]);
    function getData(){
        var id = sessionStorage['id']
        console.log(id);
        axios.get(`${URL}/DocAppointment/${id}`).then((response)=>{
            const data = response.data;
            console.log(response.data);
                setAppointment(data);
        }).catch((error)=>{
            console.error(error);
        });
    }
    function sendData(name){
        sessionStorage['patientName'] = name;
        navigate("/patient");
    }
    function showAppointments(){
        return appointments.map((appointment,i)=>
         {//Make a boolean check here.
            if(appointment.visitedStatus.toString()=='false'){
            return (<div class=" col col-md-auto">
                <RiMapPin3Line/>
            <Card style={{ width: 'auto' }}>
      <Card.Body>
        <Card.Title>{appointment.patient_name}</Card.Title>
        <Card.Subtitle className="mb-2 text-muted">Patients Phone: {appointment.uphone
}</Card.Subtitle>
        <Card.Text>
            Date of the appointment is {appointment.time.slice(0,10)}, and the time of the appointment is  {appointment.time.slice(11,16)}. 
        </Card.Text>
        <div class="card-title">
        <a onClick={()=>sendData(appointment.patient_name)} href="">Visit</a>
        </div>
      </Card.Body>
    </Card>
    </div>)}
         })
    };

    useEffect(()=>{
        getData();
    },[])

    return(
        <>
        <NavBar />
        <div class="wrapper">
            <center></center>
            <div class="column main">
            <h2>Appointments <RiMapPinLine /></h2>
                <div class="rowd">
                        {showAppointments()}
                </div>
            </div>
        </div>
        </>
    );
}
export default DoctorAppointment;