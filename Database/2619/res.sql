SELECT prd.name, pvd.name, prd.price
FROM providers pvd
INNER JOIN products prd ON prd.id_providers = pvd.id
INNER JOIN categories ctg ON prd.id_categories = ctg.id
WHERE ctg.name LIKE '%Super Luxury%' AND prd.price > 1000
