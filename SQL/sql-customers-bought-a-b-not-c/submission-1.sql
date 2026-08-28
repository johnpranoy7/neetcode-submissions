select c.customer_id, c.customer_name from customers c
where c.customer_id IN (
    select o.customer_id from orders o 
    where o.product_name IN ('A','B')
    group by o.customer_id
    having count(distinct o.product_name)=2
    except 
        select distinct oo.customer_id from orders oo where oo.product_name = 'C'
) order by c.customer_name;