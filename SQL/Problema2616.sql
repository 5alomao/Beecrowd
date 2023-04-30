select c.id, c.name from customers c where not exists (select 1 from locations l where l.id_customers = c.id) order by c.id;
