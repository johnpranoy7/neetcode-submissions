-- Write your query below

select sales_person.name from sales_person 
where sales_person.sales_id NOT IN (
    select orders.sales_id from orders, company
    where orders.com_id=company.com_id
    and company.name='CRIMSON'
    group by orders.sales_id
);