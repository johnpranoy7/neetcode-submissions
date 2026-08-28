-- Write your query below
-- select name, distance
-- from users u, rides r
-- where u.id = r.user_id;

select u.name, coalesce(sum(r.distance),0) as travelled_distance from rides r right outer join users u
on u.id=r.user_id
group by u.name
order by travelled_distance desc;