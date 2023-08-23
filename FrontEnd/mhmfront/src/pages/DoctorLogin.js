import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import {useNavigate} from 'react-router';
import {toast} from 'react-toastify';
import './styles/DoctorLogin.css';
import {AiOutlineUser} from 'react-icons/ai';
import {URL} from '../config'
import axios from 'axios';

// import loginpic from "../images/login.svg"

const DoctorLogin = () =>{
    const navigate = useNavigate;
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
        axios.post(`${URL}/doctor/login`,body).then((response)=>{
             console.log("sucessfull login");
             const result = response.data;
             const status = response.status;
             if(status==200){
                 console.log(result)
                 toast.success(`Welcome ${result.doctor_name}`);
                 const {id, name, username, email, pass, phoneno, qualification} = result;
                 sessionStorage['id']=id;
                 sessionStorage['name']=name;
                 sessionStorage['username']=username;
                 sessionStorage['email']=email;
                 sessionStorage['pass']=pass;
                 sessionStorage['phoneno']=phoneno;
                 sessionStorage['qualification']=qualification
                 sessionStorage['loginStatus']=1;
                 navigate('/doctorRegister')
             }else{
                 toast.error("Wrong credentials");
             }
        }).catch((error)=>{
            console.error(error);
        })
    }
    return (
        <>
        <div class="wrapper">
    <div class="container main">
        <div class="row">
            <div class="col-md-6 side-image">        
            </div>
            <div 
            class="col-md-6 right">
                
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