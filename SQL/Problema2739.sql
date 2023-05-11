SELECT name, CAST(DATE_PART('day', payday) as integer) AS day FROM loan;
