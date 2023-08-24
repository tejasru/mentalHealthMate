import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import './styles/Choice.css';
import NavBar from '../components/NavBar';

const Choice =()=>{
    return(
        <>
        <NavBar />
            <div class="wrapper">
                <div class="container main1">
                    
                     <div class="row row1">
                        <div class="card images" style={{width: '18rem'}}>
                            <div class="card-body">
                                <h5 class="card-title text">
                                <a href="#" class="btn btn-secondary">Yes</a>
                                </h5>
                                <h4 class="card-text">I want to make an appointment</h4>
                                
                            </div>
                        </div>
                    </div>
                    <div class="row row1">
                        <div class="card images" style={{width: '18rem'}}>
                            <div class="card-body">
                                <h5 class="card-title text">
                                <a href="#" class="btn btn-secondary">Skip Doctor appointment</a>
                                </h5>                
                            </div>
                        </div>
  
                    </div>
                </div>
            </div>
        </>
    )
}
export default Choice;