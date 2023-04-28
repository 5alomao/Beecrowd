select p.name, pr.name from products p inner join providers pr on p.id_providers = pr.id  inner join categories c on p.id_categories = c.id where  c.id = 6;
