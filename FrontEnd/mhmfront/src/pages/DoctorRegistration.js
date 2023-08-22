import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import './styles/DoctorRegisteration.css';
import {AiOutlineUsergroupAdd} from 'react-icons/ai';
import axios from 'axios';
import {URL} from '../config'

const DoctorRegister = () =>{
    
    var doctor_id;
    var duserName="";
    var doctor_name="";
    var qualification="";
    var email="";
    var phone_no;
    var password="";

    function handler1(e){
        doctor_id=e.target.value;
    }
    function handler2(e){
        doctor_name=e.target.value;
    }
    function handler3(e){
        password=e.target.value;
    }
    function handler4(e){
        duserName=e.target.value;
    }
    function handler5(e){
        email=e.target.value;
    }
    function handler6(e){
        phone_no=e.target.value;
    }
    function handler7(e){
        qualification=e.target.value;
    }
    
    function register(){
        const body={
            "doctor_id":doctor_id,
            "duserName":duserName,
            "doctor_name":doctor_name,
            "qualification":qualification,
            "email":email,
            "phone_no":phone_no,
            "password":password
        }
        console.log(body);
        axios.post(`${URL}/doctor/register`,body).then((response)=>{
            console.log("data inserted");
        }).catch((error)=>{
            console.error(error);
        })
    }
    


    return (
        <>
        <div class="wrapper">
    <div class="container main">
        
        <div class="row">
        
        <div class="col-md-6 left">    
        <header><h2>Doctor Register <AiOutlineUsergroupAdd /></h2></header>    
            </div>
            
            <div class="col-md-6 right">
                
                <div class="input-box">
                   
                <div class="input-field">
                        <input type="number" class="input" id="doctor_id" onBlur={handler1} required="" autocomplete="off" />
                        <label for="doctor_id">Doctor Id</label> 
                    </div> 
                   <div class="input-field">
                        <input type="text" class="input" id="doctor_name"  onBlur={handler2} required="" autocomplete="off" />
                        <label for="doctor_name">Doctor Name</label> 
                    </div> 
                   <div class="input-field">
                        <input type="password" class="input" onBlur={handler3}  id="password" required="" />
                        <label for="password">Password</label>
                    </div> 
                    <div class="input-field">
                        <input type="text" class="input" onBlur={handler4}  id="dusername" required="" />
                        <label for="dusername">Username</label>
                    </div> 
                    <div class="input-field">
                        <input type="email" class="input" onBlur={handler5}  id="email" required="" />
                        <label for="email">Email</label>
                    </div>
                    <div class="input-field">
                        <input type="number" class="input" onBlur={handler6}  id="age" required="" />
                        <label for="phone_no">Phone number</label>
                    </div>
                    <div class="input-field">
                        <input type="text" class="input" onBlur={handler7}  id="qualification" required="" />
                        <label for="qualification">Qualification</label>
                    </div>
                   <div class="input-field"> 
                        <input type="button" class="register" onClick={register} value="Register" />
                   </div> 
                </div>  
            </div>
        </div>
    </div>
</div>
        </>
    )
}
export default DoctorRegister;