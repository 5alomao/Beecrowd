select p.name, pr.name, ca.name from products p
inner join providers pr on p.id_providers = pr.id 
inner join categories ca on p.id_categories = ca.id
where pr.name = 'Sansul SA' and ca.name = 'Imported';
