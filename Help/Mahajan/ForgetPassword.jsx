import React, { useState } from 'react';
import axios from 'axios';
import { toast } from "react-toastify";

const ForgotPassword = () => {
  const [email, setEmail] = useState('');
  const [username, setUsername] = useState('');
  const [password, setpassword] = useState('');
  

  

  const handleResetPassword = async () => {
    try {
      const response = await axios.post('/api/reset-password', { email });
      
      toast.success('password reset succcessfully');
    } catch (error) {
      
      toast.warning("Please Enter valid values.");
    }
  };

  return (
    <div className="container mt-5">
      <div className="row justify-content-center">
        <div className="col-md-6">
          <div className="card">
            <div className="card-body">   
            <center><h2 className="card-title">Forgot Password</h2></center>
              
              <div className="form-group">
                <b>Username: </b>
                <br></br>
                <input
                  type="text"
                  className="form-control"
                  placeholder="Enter your username"
                  value={username}
                  onChange={(e) => setUsername(e.target.value)} required
                />
                 <br></br>
                 <b>Email: </b>
                 <br></br>
                 <input
                  type="email"
                  className="form-control"
                  placeholder="Enter your email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)} required
                />

                 <br></br>
                 <b>Password: </b>
                 <br></br>
                 <input
                  type="text"
                  className="form-control"
                  placeholder="Enter your new password"
                  value={password}
                  onChange={(e) => setpassword(e.target.value)} required
                />

               <br></br>
              </div>
             <center> <button className="btn btn-primary" onClick={handleResetPassword}>Reset Password</button></center>
              
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default ForgotPassword;
