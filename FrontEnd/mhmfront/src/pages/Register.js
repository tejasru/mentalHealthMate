import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import './styles/Register.css';
import {AiOutlineUsergroupAdd} from 'react-icons/ai';
import NavBar from '../components/NavBar';
const Register = () =>{
    return (
        <>
        <NavBar />
        <div class="wrapper">
    <div class="container main">
        
        <div class="row">
        
        <div class="col-md-6 left">    
        <header><h2>Register <AiOutlineUsergroupAdd /></h2></header>    
            </div>
            
            <div class="col col-md-6 right">
                
                <div class="input-box">
                   <div class="input-field">
                        <input type="text" class="input" id="name" required="" autocomplete="off" />
                        <label for="name">Name</label> 
                    </div> 
                   <div class="input-field">
                        <input type="password" class="input" id="pass" required="" />
                        <label for="pass">Password</label>
                    </div> 
                    <div class="input-field">
                        <input type="number" class="input" id="num" required="" />
                        <label for="num">Number</label>
                    </div> 
                    <div class="input-field">
                        <input type="email" class="input" id="email" required="" />
                        <label for="email">Email</label>
                    </div>
                    <div class="input-field">
                        <input type="number" class="input" id="age" required="" />
                        <label for="age">Age</label>
                    </div>
                   <div class="input-field"> 
                        <input type="submit" class="register" value="Register" />
                   </div> 
                </div>  
            </div>
        </div>
    </div>
</div>
        </>
    )
}
export default Register;