# Write your MySQL query statement below
select e1.event_day as day,
e1.emp_id,
SUM(e1.out_time-e1.in_time) as total_time
from employees as e1
group by emp_id , day;