
insert into user_table values(1,23,"manju@gmail.com",'f',"manjiri","manjiri123","9988776655","manjiri_123");
insert into  user_table values(2,21,"piyush@gmail.com",'m',"piyush","piyush123","9912374665","piyush_123");
insert into user_table values(3,24,"shridhi@gmail.com",'f',"Shridhika","Shridhika123","1122334455","Shridhika_123");
insert into user_table values(4,26,"shreeyash@gmail.com",'m',"shreeyash","shreeyash123","9823456181","Shreeyash_123");
insert into user_table values(5,27,"sumedh@gmail.com",'f',"sumedh","sumedh123","9876543221","Sumedh_123");

insert into address_table values(1,"pune",123456,"shankar nagar",1);
insert into address_table values(2,"amaravi",997733,"shivaji nagar",2);
insert into address_table values(3,"nagpur",886633,"sambhaji nagar",3);
insert into address_table values(4,"mumbai",223344,"karve nagar",4);
insert into address_table values(5,"delhi",556633,"manish nagar",5);

insert into user_payment values(1,11223344,2000.30,"HSBC","Rupay","Anju@gmail.com",1234567890);
insert into user_payment values(2,12334564,23000.30,"PNB","Master","shridhi@gmail.com",0987654321);
insert into user_payment values(3,18753452,42000.30,"SBI","Rupay","shreeyash@gmail.com",7654321676);
insert into user_payment values(4,65372782,65000.30,"COSMOS","Master","Sumedh@gmail.com",985456563);
insert into user_payment values(5,76476756,56000.30,"ICICI","Rupay","piyush@gmail.com",65475256754);


insert into user_appointment values(1,"Sheetej","7744524362","yes",'2022-12-12',1,1);
insert into user_appointment values(2,"Atharva","7038608726","yes",'2022-10-11',2,1);
insert into user_appointment values(3,"Sheetej","7744524362","yes",'2022-05-02',1,3);
insert into user_appointment values(4,"Sheetej","7744524362","yes",'2022-06-05',1,5);
insert into user_appointment values(5,"Sheetej","7744524362","yes",'2022-04-24',4,1);

insert into site_generated_table values(1,2,3,'2023-12-08',4,2,1,4,2,3,4);
insert into site_generated_table values(2,4,3,'2023-12-08',1,2,4,4,3,3,1);
insert into site_generated_table values(3,2,4,'2023-12-08',2,1,1,2,4,3,2);
insert into site_generated_table values(4,4,3,'2023-12-08',3,1,2,2,4,1,4);
insert into site_generated_table values(5,3,3,'2023-12-08',4,1,4,2,3,1,4);

insert into medical_history_table values(1,"crustaceans","asthma,cancer",1,'2023-12-03');
insert into medical_history_table values(6,"egg","Mother-High Blood, father-cancer",4,'2023-11-04');
insert into medical_history_table values(3,"milk","Sister-breast cancer,father-heart issues",2,'2023-10-23');
insert into medical_history_table values(5,"pet","mother-asthma,cancer",2,'2023-09-05');

insert into medical_history_table_diagnosis values(1,2);

insert into medical_history_table_diagnosis values(5,4);

insert into medication_table values(1,"sertraline",4);
insert into medication_table values(2,"lamotrigine",1);
insert into medication_table values(3,"dulooxetine",2);
insert into medication_table values(4,"dosulepin",3);
insert into medication_table values(5,"beta blockers",4);

insert into diagnosis_table values(1,'2023-12-3'," Alzheimer’s disease",1);
insert into diagnosis_table values(2,'2023-12-3'," Disruptive behaviour and dissocial disorders",2);
insert into diagnosis_table values(3,'2023-12-3'," Schizophrenia",3);
insert into diagnosis_table values(4,'2023-12-3',"Bipolar Disorder",3);
insert into diagnosis_table values(5,'2023-12-3'," Depression",5);

insert into doctor_table values(1,"vishakha","vishakha_123","vishakha@gmail.com","vishakha123","9988776655","MBBS");
insert into doctor_table values(2,"vaibhav","vaibhav_123","vaibhav@gmail.com","vaibhav123","9911223344","MD");
insert into doctor_table values(3,"lavnya","lavnya_123","lavnya@gmail.com","lavnya123","9976644655","MD");
insert into doctor_table values(4,"prajesh","prajesh_123","prajesh@gmail.com","prajesh123","9873476726","MBBS");
insert into doctor_table values(5,"Nilesh","Nilesh_123","Nilesh@gmail.com","Nilesh123","9456523234","MD");

insert into doc_payment_table values(1,20093.39,0,1);

insert into doc_appointment values(1,"piyush",'2023-02-01 :10:00',"2798473455",1,1);
insert into doc_appointment values(2,"shridhika",'2023-02-01 :11:00',"2798473455",0,1);


insert into free_slot values(1,2,1)
insert into free_slot values(2,3,1)