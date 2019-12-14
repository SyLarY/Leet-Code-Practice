/*
The Employee table holds all employees including their managers. Every employee has an Id, and there is also a column for the manager Id.

+----+-------+--------+-----------+
| Id | Name  | Salary | ManagerId |
+----+-------+--------+-----------+
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | NULL      |
| 4  | Max   | 90000  | NULL      |
+----+-------+--------+-----------+
Given the Employee table, write a SQL query that finds out employees who earn more than their managers. For the above table, Joe is the only employee who earns more than his manager.

+----------+
| Employee |
+----------+
| Joe      |
+----------+

Test Case:
{"headers": {"Employee": ["Id", "Name", "Salary", "ManagerId"]}, 
"rows": {"Employee": [[1, "Mark", 40000, 3], [3, "Jack", 30000, 2], [2, "Alan", 20000, null]]}}
+----+-------+--------+-----------+
| Id | Name  | Salary | ManagerId |
+----+-------+--------+-----------+
| 1  | Mark  | 40000  | 3         |
| 2  | Alan  | 20000  | NULL      |
| 3  | Jack   | 30000  | 2        |
+----+-------+--------+-----------+
*/

SELECT Name AS Employee
FROM Employee e
    LEFT JOIN (SELECT Id, Salary AS ManagerSalary
    FROM Employee) t
    ON e.ManagerId = t.Id
Where Salary > ManagerSalary;