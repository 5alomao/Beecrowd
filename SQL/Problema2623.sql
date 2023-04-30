select p.name, ca.name from products p
inner join categories ca on ca.id = p.id_categories
where p.amount > 100 and ca.id in (1,2,3,6,9) order by ca.id asc;
