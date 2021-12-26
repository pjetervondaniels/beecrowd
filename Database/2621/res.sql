SELECT prd.name
FROM providers pvd
INNER JOIN products prd ON prd.id_providers = pvd.id
WHERE (prd.amount > 10 AND prd.amount < 20) AND pvd.name LIKE '%P%'
