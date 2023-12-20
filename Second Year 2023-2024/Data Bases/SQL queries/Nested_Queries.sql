SELECT last_name, salary
FROM employees
WHERE salary > (SELECT salary
                FROM employees
                WHERE last_name = 'Abel');
                

SELECT first_name, last_name, department_name
FROM employees
JOIN departments
ON departments.DEPARTMENT_ID = employees.DEPARTMENT_ID
WHERE employees.department_id = (SELECT department_id
                        FROM employees
                        WHERE last_name = 'Hall');
                        
SELECT first_name, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(SALARY)
                FROM DEPARTMENTS
                JOIN EMPLOYEES
                ON EMPLOYEES.DEPARTMENT_ID = DEPARTMENTS.DEPARTMENT_ID);
                
SELECT first_name, last_name, job_title
FROM employees
JOIN jobs
ON JOBS.JOB_ID = EMPLOYEES.JOB_ID
WHERE employees.job_id = (SELECT job_id
                            )
                            
                            
SELECT * (                           
SELECT first_name, last_name, hire_date
FROM employees
ORDER BY hire_date desc
);
                            