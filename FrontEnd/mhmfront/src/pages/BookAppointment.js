
import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import {useNavigate} from 'react-router';
import './styles/Home.css';
import {BsFillJournalBookmarkFill} from 'react-icons/bs';
import NavBar from '../components/NavBar';
import axios from 'axios';
import { URL } from '../config';

const BookAppointment=()=>{
  const navigate = useNavigate();
    var slot;
    function handler(e){
        slot=e.target.value;
    }
    function bookFunctoin(){
      var id = sessionStorage['id']
      console.log(id);
      console.log(slot);
      const body={
          "doctorId":1,
         "slot":slot,
         "userId":id
      }
      //console.log(body);
      axios.post(`${URL}/appointments/book`,body).then((response)=>{
           const result = response.data;
           const status = response.status;
           if(status==200){
               navigate('/')
           }
      }).catch((error)=>{
          console.error(error);
      })
  }
    return (
        <>
        <NavBar />
        <div class='Wrapper'>
              <div class='container main'>
                 <div class='row justify-content-md-center'> 
                 <div class="col col-md-auto">        
        <header><h2>Book Appointment <BsFillJournalBookmarkFill /></h2></header>
        <div class="form-check">
  <input class="form-check-input" onClick={handler} type="radio" name="flexRadioDefault" id="i1" value="1"/>
  <label class="form-check-label" for="i1">
    9 A.M to 12 P.M
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" onClick={handler} type="radio" name="flexRadioDefault" id="i2" value="2"/>
  <label class="form-check-label" for="i2">
    12 P.M to 3 P.M
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" onClick={handler} type="radio" name="flexRadioDefault" id="i3" value="3"/>
  <label class="form-check-label" for="i3">
  3 P.M to 6 P.M
  </label>
</div>
<div class="input-field">
<input type="submit" class="medical" onClick={bookFunctoin} value="Book Slot" />

                       </div>
                   </div>
                         </div> 
                   </div> 
            </div>
        </>
    )

}
export default BookAppointment;