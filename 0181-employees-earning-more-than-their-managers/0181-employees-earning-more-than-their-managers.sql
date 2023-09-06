# Write your MySQL query statement below
SELECT emp1.Name AS 'Employee' 
FROM Employee AS emp1, Employee AS emp2
WHERE emp1.ManagerId = emp2.Id
AND emp1.Salary > emp2.Salary;