import 'bootstrap/dist/css/bootstrap.min.css';
import React, { useEffect, useState } from 'react';
import './styles/Tables.css';
import NavBar from '../components/NavBar';
import axios from 'axios';
import { URL } from '../config';

const MedicalReports=()=>{
// const [resData,setResData]=useState({});
// const getPayment=()=>{
//     axios.get(`${URL}/Payment`).then((response)=>{
//         //console.log(response);
//         const status = response.status;
//         const data = response.data;
//         if(status==200){
//             setResData(data);
//             console.log(data)
//             //upaymentId: 5, cType: 'Rupay', bankName: 'ICICI', accountNo: 76476756, amount: 56000.3
//            // const {id,typ}
//         }
//         //if(resp)
//     })
// }
// useEffect(()=>{
//     getPayment();
// },[])
    return (
    <>
    <NavBar />

    <body>
  <header>
    <h1>Received Payments</h1>
  </header>

  <section class="payment-list">
    <table class="table1">
      <thead>
        <tr>
        <th>Medical ID</th>
        <th>Patient Name</th>
        <th>Diagnosis</th>
        <th>Allergies</th>
        <th>Date</th>
          <th>Date</th>
          <th>Amount</th>
        </tr>
        </thead>
      <tbody>
        <tr>
          <td>001</td>
          <td>Anisha Malode</td>
          <td></td>
          <td>crustaceans</td>
          <td>15-08-23</td>
          <td>INR.12,346</td>
        </tr>
        <tr>
          <td>002</td>
          <td>Sanskruti Mankar</td>
          <td>24-08-23</td>
          <td>INR.6,420</td>
        </tr>
      </tbody>
    </table>
  </section>
</body>


    </>
    )
    }
export default PaymentHistory;