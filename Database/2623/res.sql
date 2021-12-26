SELECT prd.name, ctg.name
FROM products prd
INNER JOIN categories ctg ON prd.id_categories = ctg.id
WHERE prd.amount > 100 AND ctg.id IN (1,2,3,6,9)
ORDER BY ctg.id ASC