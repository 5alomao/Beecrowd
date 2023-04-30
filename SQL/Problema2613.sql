select f.id, f.name from movies f inner join prices p on f.id_prices = p.id where p.value < 2; 
