# Write your MySQL query statement below
select (select Distinct salary as SecondHighestSalary from Employee ORDER by salary DESC Limit 1 offset 1) as SecondHighestSalary;