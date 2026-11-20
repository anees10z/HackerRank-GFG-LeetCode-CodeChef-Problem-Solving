# Write your MySQL query statement below

select e.name as Employee
from Employee as e, Employee as m
where e.salary > m.salary
and e.id != m.id;