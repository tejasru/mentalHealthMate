import React from 'react';
import { PieChart, Pie } from 'recharts';


const PieChartPage = () => {

	// Sample data
	const data = [
		{ name: 'Geeksforgeeks', students: 400 },
		{ name: 'Technical scripter', students: 700 },
		{ name: 'Geek-i-knack', students: 200 },
		{ name: 'Geek-o-mania', students: 1000 }
	];
    
	return (
		<PieChart width={600} height={450}>
            {/* dataKey is key of each sector value */}
			<Pie data={data} dataKey="students" nameKey="name" label outerRadius={175} fill="#5C4B99">
            </Pie>
		</PieChart>
	);
}

export default PieChartPage;