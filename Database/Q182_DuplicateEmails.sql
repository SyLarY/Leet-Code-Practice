/*
Write a SQL query to find all duplicate emails in a table named Person.

+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
For example, your query should return the following for the above table:

+---------+
| Email   |
+---------+
| a@b.com |
+---------+
Note: All emails are in lowercase.
*/

--Approach 1:
SELECT Email
FROM (SELECT Email, Count(Email) as number
    FROM Person
    GROUP BY Email) t
WHERE t.number > 1;


--Approach 2:
SELECT Email
FROM Person
GROUP BY Email
HAVING Count(Email) > 1;