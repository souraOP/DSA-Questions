# Write your MySQL query statement below
-- select max(salary) as SecondHighestSalary from Employee where 
-- salary != (select max(salary) from Employee);

Select (select salary  from Employee 
order by salary DESC
LIMIT 1 OFFSET 1 ) as SecondHighestSalary;