import 'bootstrap/dist/css/bootstrap.min.css';
import Button from 'react-bootstrap/Button';
import React,{useState} from 'react';
import './styles/MedicalHistory.css';
import NavBar from '../components/NavBar';
import {AiOutlineUser} from 'react-icons/ai';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
import { URL } from '../config';


const MedicalHistory = ()=>{
    const navigate = useNavigate();
    let new_diagnosis="";
    let new_medication="";
    let allergy="";
    let history="";

    let [medicalHistory, setMedicalHistory] = useState({
        medication : [],
        diagnosis : []
    });

    function handler(e){

       new_diagnosis = e.target.value;
    };
    function handler2(e){
        new_medication = e.target.value;
    }
    function AllergyHandler(e){
        allergy=e.target.value;
    }
  function handler3(){
    let updated_diagnosis = [...medicalHistory.diagnosis];
    let updated_medication = [...medicalHistory.medication];
    updated_diagnosis.push(new_diagnosis);
    updated_medication.push(new_medication);
    setMedicalHistory({diagnosis:updated_diagnosis,medication:updated_medication});

    //make a JSON object.. {diagnosis: array_of_medication}
    }

    function handler5(){
        var id = sessionStorage['id']
        console.log(id);
        const body={
            "userId":id,
           "allergies":allergy,
           "familyHistory":history,
           "diagnosisDTO": medicalHistory.diagnosis.map(diagnosis => ({ "diagnosisName": diagnosis })),
           "medicationDTO": medicalHistory.medication.map(medication => ({ "medications": medication }))
        }
        console.log(body);
        axios.post(`${URL}/user/addMedicalHistory`,body).then((response)=>{
             const result = response.data;
             const status = response.status;
             if(status==200){
                 navigate('/')
             }
        }).catch((error)=>{
            console.error(error);
        })
    }

    function handler4(){
        let updated_diagnosis = [...medicalHistory.diagnosis];
        let updated_medication = [...medicalHistory.medication];
        updated_diagnosis.pop();
        updated_medication.pop();
        setMedicalHistory({diagnosis:updated_diagnosis,medication:updated_medication});
          }

    function getDiagnosis(){
        return medicalHistory.diagnosis.map((diag,index)=>{return <tr><div class="input-field"><td>{diag}</td></div><td>{medicalHistory.medication[index]}</td></tr>});
    }

    function historyHandler(e){
        history=e.target.value;
    }


    return (
        <>
        <NavBar />
        <div class="wrapper">
    <div class="container main">
        <div class="row">
            <div class="col right">
                <div class="input-box">
                   <header><h2>Medical History form <AiOutlineUser /></h2></header>
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
                        <td>
                        <Button onClick={handler3} variant="outline-primary ">+</Button>{' '}   
                        </td>
                        <td>
                        <Button onClick={handler4} variant="outline-primary">-</Button>{' '}
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <div class="input-field">
                        <input type="text" class="input" onBlur={AllergyHandler} id="allergies" required="" autocomplete="off" />
                        <label for="allergies">Allergies</label>
                        </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <div class="input-field">
                        <input type="text" class="input" onBlur={historyHandler} id="familyHistory" required="" autocomplete="off" />
                        <label for="familyHistory">Family-History</label>
                        </div>
                        </td>
                    </tr>
                    <tr>
                        <th><div class="input-field">Diagnosis</div></th>
                        <th><div class="input-field">Medications</div></th>
                    </tr>
                    
                             {getDiagnosis()}
                            {/* {getMedication()}  */}
                   </table>
                   <div class="input-field">
                        <input type="button" class="medical" onClick={handler5} value="Submit Medical History" />
                         <br></br>
                       </div>
                   </div>
                </div>
            </div>
        </div>
    </div>
        </>
    )
}
export default MedicalHistory;
