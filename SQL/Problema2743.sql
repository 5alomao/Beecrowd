select p.name, length(p.name) as length from people p 
order by length desc;
