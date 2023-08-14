import 'bootstrap/dist/css/bootstrap.min.css';
import Button from 'react-bootstrap/Button';
import React,{useState} from 'react';
import './styles/MedicalHistory.css';

import {AiOutlineUser} from 'react-icons/ai';



const MedicalHistory = ()=>{    
    let new_diagnosis="";
    let new_medication=""; 

    let [medicalHistory, setMedicalHistory] = useState({
        medication : [],
        diagnosis : []
    });
    
    function handler(e){
    
       new_diagnosis = e.target.value;
       console.log(new_diagnosis);
       console.log(medicalHistory.medication);
       console.log(medicalHistory);
    };
    function handler2(e){
        new_medication = e.target.value;
    //    let updated_medication = [...this.state.medication];
    //    updated_medication.push(new_medication);
    //    this.setState({diagnosis:updated_medication});
      console.log(new_medication);
    }
  function handler3(){
    let updated_diagnosis = [...medicalHistory.diagnosis];
    console.log(updated_diagnosis);
    let updated_medication = [...medicalHistory.medication];
    updated_diagnosis.push(new_diagnosis);
    updated_medication.push(new_medication);
    setMedicalHistory({diagnosis:updated_diagnosis,medication:updated_medication});
    console.log(medicalHistory)
  }

    function getDiagnosis(){
        return medicalHistory.diagnosis.map((diag,index)=>{return <tr><div class="input-field"><td>{diag}</td></div><td>{medicalHistory.medication[index]}</td></tr>});
    }
   

    return (
        <>
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
                        <Button onClick={handler3} variant="outline-primary">+</Button>{' '}
                        </td>
                    </tr>
 
                             {getDiagnosis()}
                            {/* {getMedication()}  */}
                   </table> 
                   <div class="input-field">
                        
                        <input type="submit" class="medical" value="Submit Medical History" />
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