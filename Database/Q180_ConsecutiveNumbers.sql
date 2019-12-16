/*
Write a SQL query to find all numbers that appear at least three times consecutively.

+----+-----+
| Id | Num |
+----+-----+
| 1  |  1  |
| 2  |  1  |
| 3  |  1  |
| 4  |  2  |
| 5  |  1  |
| 6  |  2  |
| 7  |  2  |
+----+-----+
For example, given the above Logs table, 1 is the only number that 
appears consecutively for at least three times.

+-----------------+
| ConsecutiveNums |
+-----------------+
| 1               |
+-----------------+
*/

SELECT DISTINCT Num AS ConsecutiveNums
FROM Logs
WHERE (id +1, num) IN (SELECT * FROM Logs) 
AND (id + 2, Num) IN (SELECT * FROM Logs); 