SELECT e.cpf, e.enome, d.dnome
FROM empregados e
INNER JOIN departamentos d ON e.dnumero = d.dnumero
WHERE e.cpf_supervisor IS NULL
ORDER BY e.cpf;
