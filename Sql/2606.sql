SELECT pr.id, pr.name 
FROM products pr
LEFT JOIN categories ca ON ca.id = pr.id_categories
WHERE ca.name LIKE '%super%'