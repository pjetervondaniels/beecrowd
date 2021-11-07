SELECT ca.name, SUM(pr.amount) AS SUM
FROM products pr
LEFT JOIN categories ca ON ca.id = pr.id_categories
GROUP BY ca.name