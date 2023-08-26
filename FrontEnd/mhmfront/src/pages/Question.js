import Card from 'react-bootstrap/Card';
import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import {useNavigate} from 'react-router';
import './styles/Home.css';
import {AiOutlineUser} from 'react-icons/ai';
import NavBar from '../components/NavBar';
const Question=()=>{
    const navigate = useNavigate();
    return (
        <>
        <NavBar />
        <div class='Wrapper'>
            <div class='container maind'>
                <div class='row rowd'>
                     <div class='col-md-8'>

                     <header><h3>questionnaire</h3></header>
                         <br></br>

                         <div>
                         <h6>how much depression level do you have?</h6>
                         <input type="checkbox"  id="i1"  value="1" name="questions" autocomplete="off" />
                         <label for="check">1.	extreme level</label> 
                         <input type="checkbox"  id="i2" value="2" name="questions" autocomplete="off" />
                         <label for="check">2.	medium level</label> 
                         <input type="checkbox"  id="i3" value="3" name="questions" autocomplete="off" />
                         <label for="check">3.	low level</label> 
                         <input type="checkbox"  id="i4"   value="4" name="questions"autocomplete="off" />
                         <label for="check">4.	not at all</label> 
                         </div>
                         <br></br>
                         <div >
                         <div >
                         <h6>how much anxiety level do you have?</h6>
                         <input type="checkbox"  id="i1"  value="1" autocomplete="off" />
                         <label for="check">1.	extreme level</label> &nbsp; 
                         <input type="checkbox"  id="i2" value="2" autocomplete="off" />
                         <label for="check">2.	medium level</label> &nbsp; 
                         <input type="checkbox"  id="i3" value="3"  autocomplete="off" />
                         <label for="check">3.	low level</label> &nbsp; 
                         <input type="checkbox"  id="i4"   value="4"autocomplete="off" />
                         <label for="check">4.	not at all</label>&nbsp;  
                         </div>
                         
                         <div >
                         <h6>Give the stage of your bipolar disorder.</h6>
                         <input type="checkbox"  id="i1"  value="1" autocomplete="off" />
                         <label for="check">1.	stage 1</label> &nbsp; 
                         <input type="checkbox"  id="i2" value="2" autocomplete="off" />
                         <label for="check">2.	stage 2</label> &nbsp; 
                         <input type="checkbox"  id="i3" value="3"  autocomplete="off" />
                         <label for="check">3.	stage 3</label> &nbsp; 
                         <input type="checkbox"  id="i4"   value="4"autocomplete="off" />
                         <label for="check">4.	not at all</label> &nbsp; 
                         </div>
                         <br></br>
                         
                         <div >
                         <h6>Rate your Schizophrenia disorder..</h6>
                         <input type="checkbox"  id="i1"  value="1" autocomplete="off" />
                         <label for="check">1.	stage 1</label>&nbsp;  
                         <input type="checkbox"  id="i2" value="2" autocomplete="off" />
                         <label for="check">2.	stage 2</label>&nbsp;  
                         <input type="checkbox"  id="i3" value="3"  autocomplete="off" />
                         <label for="check">3.	stage 3</label>&nbsp;  
                         <input type="checkbox"  id="i4"   value="4"autocomplete="off" />
                         <label for="check">4.	not at all</label> &nbsp; 
                         </div>
                         <br></br>
                         <div >
                         <h6>Give the stage of post traumatic stress disorder.</h6>
                         <input type="checkbox"  id="i1"  value="1" autocomplete="off" />
                         <label for="check">1.	stage 1</label>&nbsp;  
                         <input type="checkbox"  id="i2" value="2" autocomplete="off" />
                         <label for="check">2.	stage 2</label>&nbsp;  
                         <input type="checkbox"  id="i3" value="3"  autocomplete="off" />
                         <label for="check">3.	stage 3</label>&nbsp;  
                         <input type="checkbox"  id="i4"   value="4"autocomplete="off" />
                         <label for="check">4.	not at all</label> &nbsp; 
                         </div>
                         <br></br>
                         <div >
                         <h6>Give the stage of your Autism</h6>
                         <input type="checkbox"  id="i1"  value="1" autocomplete="off" />
                         <label for="check">1.	stage 1</label>&nbsp;  
                         <input type="checkbox"  id="i2" value="2" autocomplete="off" />
                         <label for="check">2.	stage 2</label>&nbsp;  
                         <input type="checkbox"  id="i3" value="3"  autocomplete="off" />
                         <label for="check">3.	stage 3</label>&nbsp;  
                         <input type="checkbox"  id="i4"   value="4"autocomplete="off" />
                         <label for="check">4.	not at all</label> &nbsp; 
                         </div>
                         <br></br><div >
                         <h6>rate your hiperactivity disorder.</h6>
                         <input type="checkbox"  id="i1"  value="1" autocomplete="off" />
                         <label for="check">1.	extreme level</label> &nbsp; 
                         <input type="checkbox"  id="i2" value="2" autocomplete="off" />
                         <label for="check">2.	medium level</label> &nbsp; 
                         <input type="checkbox"  id="i3" value="3"  autocomplete="off" />
                         <label for="check">3.	low level</label> &nbsp; 
                         <input type="checkbox"  id="i4"   value="4"autocomplete="off" />
                         <label for="check">4.	not at all</label>&nbsp;
                         </div>
                         
                         </div>
                         
                         
                         
                     </div>    
                </div>


            </div> 

        </div>
        
      </>
    )

}
export default Question;