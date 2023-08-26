import React, { useState } from 'react';
import { PieChart, Pie } from 'recharts';
import 'bootstrap/dist/css/bootstrap.min.css';
import './styles/Tables.css';

   
const PieChartPage = (props) => {
    
 	// Sample data
    //console.log(props)
    let [data1,setData1] = useState([]);
    setData1(props);
    function fun(){
        data1 = props.props;
    }
    
	const data = [
		{ name: 'anxity', students: (data1.anxity*10) },
		{ name: 'autism', students: (data1.autism*10) },
		{ name: 'ocd', students: (data1.ocd*10) },
		{ name: 'parenoia', students: (data1.parenoia*10) },
        { name: 'ptsd', students: (data1.ptsd*10) },
        { name: 'schizophrenia', students: (data1.schizophrenia*10) },
        { name: 'stress', students: (data1.stress*10) }
	];

	// useEffect(()=>{
	// 	getData();
	// },[])
    
	return (
        <>     
        {fun()}
		<PieChart width={400} height={250}>
            {/* dataKey is key of each sector value */}
			<Pie data={data} dataKey="students" nameKey="name" label outerRadius={75} fill="#5C4B99">
            </Pie>
		</PieChart>
        </>
	);
}

export default PieChartPage;