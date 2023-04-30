select p.name, pr.name, p.price from products p 
inner join providers pr on p.id_providers = pr.id
inner join categories ca on p.id_categories = ca.id 
where p.price > 1000 and ca.name = 'Super Luxury';
