select p.name, round(p.salary*0.1,2) as tax from people p
where p.salary > 3000;
