import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { URL } from '../config';
import NavBar from '../components/NavBar';
import { PieChart, Pie } from 'recharts';
import {AiOutlineUser} from 'react-icons/ai';


const PatientAppointment = () => {
  const [patient, setPatient] = useState([]);
  const [allData, setAllData] = useState({
    chartData: [],
    medHis: []
  }); // State for chart data
//   const [medHis,setMedHis] = useState([]);

  var diagnosis=""
  function handler(e){
    diagnosis=e.target.value;
  }
  var medications=""
  function handler2(e){
    medications=e.target.value;
  }
  function sendUpdate(){
    axios.post()
  }

  var patient2 = sessionStorage['patientName'];

  function PatientData() {
    return axios.get(`${URL}/DocAppointment/patient/${patient2}`).then((response) => response.data);
  }

function calculateChartData(patientData) {
    const anxity = patientData.siteReport.anxity * 11;
    const autism = patientData.siteReport.autism * 11;
    const hyperActivity = patientData.siteReport.hyperActivity * 11;
    const ocd = patientData.siteReport.ocd * 11;
    const parenoia = patientData.siteReport.parenoia * 11;
    const ptsd = patientData.siteReport.ptsd * 11;
    const a = patientData.medicalHistory.medicalHistory;

    const data = [
      { name: 'anxity', students: anxity },
      { name: 'autism', students: autism },
      { name: 'ocd', students: ocd },
      { name: 'hyperActivity', students: hyperActivity },
      { name: 'parenoia', students: parenoia },
      { name: 'ptsd', students: ptsd },
    ];

    setAllData({
        chartData:data,medHis:a
    });
  }

  function printSiteHistory(){
    return allData.chartData.map((answer,i)=>{
        return (<p key={i}>He marked his {answer.name} as {(answer.students)/11}</p>)})
  }
  
  useEffect(() => {
    PatientData().then((responseData) => {
      setPatient(responseData);
      calculateChartData(responseData);
    });
  }, []);

  return (
    <>
      <NavBar />
      <div className="wrapper">
        <div className="container main">
          <div className="row rowd">
            <div className="col col-md-auto col-sm-auto">
                <h3>{patient2} last diagnosis</h3>
              <PieChart width={400} height={250}>
                <Pie data={allData.chartData} dataKey="students" nameKey="name" label outerRadius={105} fill="#5C4B99" />
              </PieChart>
              <div style={{display:"inline"}} class="input-field">
                <p style={{display:"inline"}} type="text" id="text" class="input">Patient last answers to the questions were:</p>
                        {printSiteHistory()}
                </div> 
            </div>
          </div>
          <div className="row rowd justify-content-md-center">
            <div className="col col-md-auto col-sm-auto">
                <div class="input-box">
                   <header><h2>Enter New Diagnosis<AiOutlineUser /></h2></header>
                   <table>
                    <tr>
                        <td>
                        <div class="input-field">
                        <input type="text" class="input" onBlur={handler} id="diagnoses" required="" autocomplete="off" />
                        <label for="diagnoses">Dignoses</label>
                    </div>
                        </td>
                        <td>
                        <div class="input-field">
                        <input type="text" onBlur={handler2} class="input" id="meds" required="" />
                        <label for="meds">Medication</label>
                    </div>
                        </td>
                    </tr>
                   </table>
                   <div class="input-field">
                        <input type="button" class="medical" onClick={sendUpdate} value="Send new Diagnosis" />
                         <br></br>
                       </div>
                   </div>
                {/* {printMedicalHistory()} */}
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default PatientAppointment;
