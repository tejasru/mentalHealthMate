import 'bootstrap/dist/css/bootstrap.min.css';
import Table from 'react-bootstrap/Table';
import React, { useEffect, useState } from 'react';
import './styles/Tables.css';
import {FcMoneyTransfer,FcBusinessman} from 'react-icons/fc';
import {CiCalendarDate,CiMoneyCheck1} from 'react-icons/ci'
import NavBar from '../components/NavBar';
import axios from 'axios';
import { URL } from '../config';

const PaymentHistory=()=>{
const [tableData,setResData]=useState([]);

const getPayment=()=>{
   var id = sessionStorage['id'];
   //console.log(id);
    axios.get(`${URL}/DocPayment/${id}`).then((response)=>{
        
        const status = response.status;
        const data = response.data;
        if(status==200){
          console.log(response.data);
          const data2 = data;
            setResData(data2);
            //console.log(tableData);
          }
    })
}
function showPayments(){
  return tableData.map((table,i)=>
   { 
    var id = sessionStorage['id'];
    if(table.dpayment.doctor.doctor_id==id){
     return(
      <tr key={table.paymentId}>
      <th scope="row">{table.paymentId}</th>
      <td>{table.dpayment.patient_name}</td>
      <td>{table.dpayment.time}</td>
      <td>{table.amount}</td>
    </tr>
     );}
   })
}
useEffect(()=>{
    getPayment();
},[])
    return (
    <>
    <NavBar />
    <div class="wrapper">
      <div class="container main">
      <center><h1>Received Payments<FcMoneyTransfer /></h1></center>
        <div class="row">
          <div class="col-md-auto">
  <section class="payment-list">
    <Table striped>
      <thead>
        <tr>
        <th>Payment ID</th>
        <th>Patient Name<FcBusinessman/></th>
          <th>Date<CiCalendarDate/></th>
          <th>Amount<CiMoneyCheck1/></th>
        </tr>
        </thead>
      <tbody>
      {showPayments()}
      </tbody>
    </Table>
  </section>
  </div>
  </div>
  </div>
  </div>

    </>
    )
}
export default PaymentHistory;