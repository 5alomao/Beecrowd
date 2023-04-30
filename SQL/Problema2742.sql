select lr.name, ROUND(lr.omega*1.618,3) as "Fator N" 
from life_registry lr 
inner join dimensions d on d.id = lr.dimensions_id
where d.name in ('C774','C875') and lr.name like 'Richard%'
order by omega asc;
