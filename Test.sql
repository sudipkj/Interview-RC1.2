select * from EMPLOYEES;
select distinct job_id from employees;

select em.employee_id, em.first_name from employees em;

-- query department tables 
select * from DEPARTMENTS dept;
select d.DEPARTMENT_NAME, d.manager_id from DEPARTMENTS d;

-- select distinct department name
select DISTINCT Department_name from departments;

select * from employees em where em.JOB_ID != 'AD_VP' and salary >= 10000;
select * from employees em where em.salary > 0 and em. department_id != 100 and em.commission_pct IS NOT null;

select * from employees em where em.COMMISSION_PCT != null;

select COUNT(*) from employees em where em.SALARY > 5000 and em.DEPARTMENT_ID != 50;

select * from employees em where em.JOB_ID = 'IT_PROG' OR em.JOB_ID = 'ST_MAN';

select * from employees em where em.JOB_ID ! = 'ST_MAN' and em.JOB_ID !='SA_MAM' and em.salary >500; 

SELECT * FROM DEPARTMENTS DE;
SELECT * FROM LOCATIONS LO;

SELECT DISTINCT (EM.FIRST_NAME), DE.DEPARTMENT_NAME, LO.CITY FROM EMPLOYEES EM, DEPARTMENTS DE, LOCATIONS LO WHERE EM.DEPARTMENT_ID = DE.DEPARTMENT_ID;

-- EMPS THOSE DO NOT MAKE ANY COMMISION AND HAVE A SALARY GREATER THAN 1000 BUT LESS THEN 5000, EXCLUDE THE EMPS WHOSE SALARY IS 3000

SELECT * FROM EMPLOYEES EM WHERE EM.COMMISSION_PCT IS NOT NULL;
SELECT * FROM EMPLOYEES EM WHERE EM.COMMISSION_PCT IS NULL AND EM.SALARY BETWEEN 3000 AND 10000 AND EM.SALARY != 4800;

-- RETURN THOSE EMPS WHOSE SALARY IS EITHER 4800 OR GREATER THAN 10000 AND THOSE ARE SALES MEN

SELECT * FROM EMPLOYEES EM WHERE EM.JOB_ID LIKE 'SA_%' AND (EM.SALARY = 4800 OR EM.SALARY > 10000);

-- ALISING ATTRIBUTES
SELECT FIRST_NAME FNAME FROM EMPLOYEES;.

-- CONCATENATION OF ATTRIBUTES AND STRING
SELECT 'EMPLOYEE FIRST NAME IS ' || first_name || ' AND GEYS SALARY OF ' || EM.SALARY AS MESSAGE_NAME  FROM EMPLOYEES EM;

-- Use fo dummy table called dual
select * from dual;
select 'sudip'as "First Name" from dual;

-- Use single row functions upper, lower, concat

select * from employees;
select upper(FIRST_NAME) AS "NAME IN UPPER CASE" , LOWER(lAST_NAME) AS "LAST NAME IN LOWER CASE" FROM EMPLOYEES;
SELECT CONCAT(EM.FIRST_NAME ,CONCAT('   ', EM.LAST_NAME)) AS "FULL NAME" FROM EMPLOYEES EM WHERE EM.FIRST_NAME LIKE 'A%';

select INITCAP('LETS CHECK HTIS ONE') FROM EMPLOYEES;
SELECT * FROM EMPLOYEES;

SELECT length(FIRST_NAME) , em.* FROM EMPLOYEES em;

-- lpad rpad substr rtrim, ltrim
select lpad(em.first_name,5) from employees em;
select substr(first_name, 2,3) from employees;
select sysdate from dual;ecl
select timestamp from dual;

-- Use of NVL
select * from employees;
select NVL(commiss  ion_pct,0), em.* from employees em;

-- select the maximum salaray a manager get
select * from employees where salary = (select max(salary) from employees em where em.JOB_ID like upper('%man%'));

select * from employees where salary < (select max(salary) from employees em where em.job_id like upper('%man%'));
select * from employees where salary = 9000;

-- get the max and second max salaried employee
select * from employees where salary = (select max(salary) from employees); -- steven king gets the max salary
select * from employees where salary < (select max(salary) from employees) and rownum=1;  -- Neena kochhar getrs the second high
select * from employees where salary < (select max(salary) from employees) and rownum=1;


-- get average salary per jod id

select em.job_id, round(avg(salary),2) from employees em group by job_id;

select em.job_id from employees em group by job_id;

-- retrun departments that have atleast 3 employees working with them

select em.department_id , count(*) from employees em group by em.department_id having count(*) > 6 order by em.department_id;

select * from employees;

select em.job_id, em.department_id ,count(*) from employees em group by job_id , em.department_id order by job_id;

select count(*) , job_id from employees group by job_id;

-- select quesries inside select queries nested queries
select * from DEPARTMENTS;
select count(*) ,first_name from employees group by department_id, first_name;
select * from locations where location_id= 1800;

select em.first_name from employees em, departments de , locations lo 
where em.department_id = 20;

select count(*) from departments; 
select * from locations;
select de.department_id from departments de where de.location_id = (select location_id from locations lo where city = 'Toronto');

select * from employees em
where em.department_id = (select de.department_id 
from departments de where de.location_id = 
(select location_id from locations lo where city = 'London'));

select * from employees where department_id in (select * from departments);

select em.FIRST_NAME, em.SALARY , em.job_id
from (select * from employees where employees.job_id like '%MAN%') em, departments de, locations lo 
where em.DEPARTMENT_ID = de.DEPARTMENT_ID and de.location_id = lo.location_id and lo.city in('Seattle','Toronto','London');

--- Inner Joins - contains common between 2 tables
SELECT *
FROM EMPLOYEES EM , DEPARTMENTS DE
WHERE DE.DEPARTMENT_ID = (EM.DEPARTMENT_ID);

SELECT * FROM DEPARTMENTS;

SELECT COUNT(*) 
FROM EMPLOYEES EM , DEPARTMENTS DE
WHERE DE.DEPARTMENT_ID = EM.DEPARTMENT_ID;

SELECT * 
FROM EMPLOYEES EM INNER JOIN DEPARTMENTS DE
ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID;


SELECT *
FROM EMPLOYEES EM RIGHT JOIN DEPARTMENTS DE
ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID;

SELECT COUNT(*) FROM EMPLOYEES WHERE EMPLOYEE_ID IS NOT NULL; -- 107
SELECT * FROM DEPARTMENTS; --27

SELECT * 
FROM EMPLOYEES EM RIGHT JOIN DEPARTMENTS DE
ON EM.DEPARTMENT_ID = DE.DEPARTMENT_ID;

SELECT * 
FROM DEPARTMENTS LEFT JOIN EMPLOYEES
ON DEPARTMENTS.DEPARTMENT_ID = EMPLOYEES.DEPARTMENT_ID;

SELECT * FROM EMPLOYEES
WHERE NOT EXISTS (SELECT * FROM DEPARTMENTS);

SELECT * FROM DEPARTMENTS D
WHERE NOT EXISTS (SELECT * FROM EMPLOYEES E WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID);

-- Creating tables and adding data to it
CREATE TABLE STORES
( "STORE_ID" NUMBER NOT NULL,
  "STORE_NAME" VARCHAR(30) NOT NULL,
  "STORE_DESC" VARCHAR(100),
  "STORE_LOCATION_ID"  NUMBER NOT NULL,
  CONSTRAINT STORE_ID_PK PRIMARY KEY (STORE_ID),
  CONSTRAINT STORE_LOCATION_ID_FK FOREIGN KEY (STORE_LOCATION_ID) REFERENCES LOCATIONS (LOCATION_ID)
);

commit;

insert into STORES 
VALUES (2, 'Ration Store', 'This is a ration store', 1700);
