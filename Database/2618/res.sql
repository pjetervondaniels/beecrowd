SELECT prd.name, pvd.name, ctg.name
FROM providers pvd
INNER JOIN products prd ON prd.id_providers = pvd.id
INNER JOIN categories ctg ON prd.id_categories = ctg.id
WHERE pvd.name LIKE '%Sansul SA%' AND ctg.name LIKE '%Imported%'
