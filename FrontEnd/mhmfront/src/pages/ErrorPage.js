import React from 'react';
import './styles/Home.css';

const ErrorPage = ({ errorCode }) => {
  return (
    <div class="wrapper">
    <div class="container main">
    
    <div class="row">

      {errorCode === 404 ? (
        <h1><b>404 - Page Not Found</b></h1>
      ) : (
        <h1><b>An Error Occurred</b>
        <br>
        </br>
        <p>Sorry, the page you are looking for cannot be found.</p>
</h1>

      )}
      
    </div>
    </div>
    </div>
  );
};

export default ErrorPage;
