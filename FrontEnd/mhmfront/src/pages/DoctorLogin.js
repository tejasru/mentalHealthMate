import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
 import './styles/DoctorLogin.css';
import {AiOutlineUser} from 'react-icons/ai';
import {URL} from '../config'
import axios from 'axios';

// import loginpic from "../images/login.svg"

const DoctorLogin = () =>{
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
           username,
           password,
        }
        axios.post(`${URL}/doctor/login`,body).then((response)=>{
             console.log("sucessfull login");
        })
    }
    return (
        <>
        <div class="wrapper">
    <div class="container main">
        <div class="row">
            <div class="col-md-6 side-image">        
            </div>
            <div class="col-md-6 right">
                
                <div class="input-box">
                   
                   <header><h2>Doctor<AiOutlineUser /></h2></header>
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