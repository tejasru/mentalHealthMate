import 'bootstrap/dist/css/bootstrap.min.css';
import React, { useEffect, useState } from 'react';
import './styles/Home.css';
import axios from 'axios';
import NavBar from '../components/NavBar';
import { URL } from '../config';
import Button from 'react-bootstrap/Button';
import {useNavigate} from 'react-router';


const FreeSlot=()=>{
    const navigate = useNavigate();
    var slotID="";
    var slotNumber="";
    function handler(e){
        slotID = e.target.value;
    }    
    function handler1(e){
        slotNumber = e.target.value;
    }
    function sendData(){
        var id = sessionStorage['id'];
        console.log(id);
        axios.post(`${URL}/FreeSlots/addslot/${id}/${slotNumber}`).then((response)=>{
            const status = response.status;
            console.log(response);
            if(status==200){
                navigate("/")
            }
        })
    }
    const [tableData,setResData]=useState([]);
    const getFreeSlots=()=>{
        var id = sessionStorage['id'];
        console.log(id);
         axios.get(`${URL}/FreeSlots/show/${id}`).then((response)=>{
             const status = response.status;
             const data = response.data;
             if(status==200){
               console.log(response.data);
               const data2 = data;
                 setResData(data2);
                 //console.log(tableData);
               }
         }).catch((error)=>{
            console.error(error);
         }
         )
     }
     function showSlots(){
        return tableData.map((table,i)=>
         {
            let status = table.slotStatus.toString();
           return(
        <tr key={table.slotId}>
            <th scope="row">{table.slotId}</th>
            <td>{table.slot}</td>
            <td>{status}</td>
          </tr>
           );
         })
      }
      useEffect(()=>{
        getFreeSlots();
      },[])
    return(<>
    <NavBar />
    <div class="wrapper">
        <div class="container main">
            <div class="row rowd">
                <section class="payment-list">
                <table>
      <thead>
        <tr>
        <th>Slot ID</th>
        <th>Slot</th>
        <th>Free Slot?</th>
        <th></th>
        </tr>
        </thead>
      <tbody>
        {showSlots()}
        <tr>
        <td>
            <div class="input-field">
            <input type="text" onBlur={handler} class="input" id="allergies" required="" autocomplete="off" />
            <label for="allergies">Add Slot Id</label>
            </div>
            </td>
            <td>
            <div class="input-field">
            <input type="text" onBlur={handler1} class="input" id="allergies" required="" autocomplete="off" />
            <label for="allergies">Add Slot</label>
            </div>
            </td>
            <td>By default true</td>
            <td><Button onClick={sendData} variant="outline-primary ">+</Button>{' '}</td>
        </tr>
      </tbody>
    </table>
                </section>
            </div>
        </div>
    </div>
    </>);
}
export default FreeSlot;