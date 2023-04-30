SELECT c.name FROM customers c WHERE EXISTS 
(SELECT 1 FROM legal_person lp where lp.id_customers = c.id);
