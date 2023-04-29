select f.id, f.name from movies f inner join genres g on f.id_genres = g.id where g.description = 'Action';
