import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import './styles/Login.css';
import {AiOutlineUser} from 'react-icons/ai';
import NavBar from '../components/NavBar';

// import loginpic from "../images/login.svg"

const Login = () =>{
    
    return (
        <>
        <NavBar />
        <div class="wrapper">
    <div class="container main">
        <div class="row">
            <div class="col-md-6 side-image">        
            </div>
            <div class="col-md-6 right">  
                <div class="input-box">
                   <header><h2>Login <AiOutlineUser /></h2></header>
                   <div class="input-field">
                        <input type="text" class="input" id="email" required="" autocomplete="off" />
                        <label for="email">Email</label> 
                    </div> 
                   <div class="input-field">
                        <input type="password" class="input" id="pass" required="" />
                        <label for="pass">Password</label>
                    </div> 
                   <div class="input-field">
                        <input type="submit" class="login" value="Login" />
                   </div> 
                   <div class="signin">
                    <span>For Registeration: <a href="#">Register here</a></span>
                   </div>
                </div>  
            </div>
        </div>
    </div>
</div>
        </>
    )
}
export default Login;