Create table employees(
    id_emp INT NOT NULL,
    emp_name VARCHAR(30),
    pos_id INT,
    salary INT
)
 
Alter table employees
ADD Primary key(id_emp);
Alter table employees
ADD emp_last_name VARCHAR(30);
 
Alter table employees
MODIFY emp_last_name VARCHAR(50);
 
Create table positions(
    id_pos INT NOT NULL,
    pos_name VARCHAR(30),
    Primary key(id_pos))
 
    Alter table employees
    ADD constraint FK_pos
    Foreign key(pos_id) references positions(id_pos);
 
    Insert into positions (id_pos, name_pos) values(1, 'chistach');