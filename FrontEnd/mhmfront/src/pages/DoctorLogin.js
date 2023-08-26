import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import {useNavigate} from 'react-router';
import './styles/Login.css';
import {AiOutlineUser} from 'react-icons/ai';
import {URL} from '../config'
import axios from 'axios';
import NavBar from '../components/NavBar';

// import loginpic from "../images/login.svg"

const DoctorLogin = () =>{
    const navigate = useNavigate();
    var username="";
    var password="";
    function handler1(e){
        username=e.target.value;
    }
    function handler2(e){
        password=e.target.value;
    }
    function loginFunction(){
        const body={
           "username":username,
           "password":password,
        }
        //console.log(body);
        axios.post(`${URL}/doctor/login`,body).then((response)=>{
             console.log("sucessfull login");
             const result = response.data;
             const status = response.status;
             if(status==200){
                 console.log(result)

                 sessionStorage['id']=result.doctor_id;
                 sessionStorage['dname']=result.duserName;
                 sessionStorage['email']=result.email;
                 sessionStorage['loginStatus']=1;
                 navigate('/')
             }
        }).catch((error)=>{
            console.error(error);
        })
    }
    return (
        <>
        <NavBar />
        <div class="wrapper">
    <div class="container main">
        <div class="row">
            <div class="col-md-6 dside-image">        
            </div>
            <div 
            class="col-md-6 right">
                
                <div class="input-box">
                   
                   <header><h2>Doctor <AiOutlineUser /></h2></header>
                   <div class="input-field">
                        <input type="text" class="input" onBlur={handler1} id="email" required="" autocomplete="off" />
                        <label for="email">Username</label> 
                    </div> 
                   <div class="input-field">
                        <input type="password" class="input" onBlur={handler2} id="pass" required="" />
                        <label for="pass">Password</label>
                    </div> 
                    <div class="input-field">
                        
                        <input type="button" class="login" onClick={loginFunction} value="Login" />
                   </div> 
                </div>  
            </div>
        </div>
    </div>
</div>
        </>
    )
}
export default DoctorLogin;