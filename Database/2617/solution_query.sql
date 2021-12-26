SELECT prd.name, pvd.name
FROM providers pvd
LEFT JOIN products prd ON prd.id_providers = pvd.id
WHERE pvd.name LIKE '%Ajax SA%'