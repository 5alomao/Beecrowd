SELECT c.name, o.id FROM orders o
INNER JOIN customers c ON c.id = o.id_customers
WHERE EXTRACT(MONTH FROM o.orders_date) <= 6;
