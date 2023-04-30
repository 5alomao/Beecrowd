select p.name from products p
inner join providers pr on p.id_providers = pr.id
WHERE p.amount >= 10 AND p.amount <= 20 and pr.name like 'P%';
