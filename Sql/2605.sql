SELECT pr.name, pv.name
FROM products pr
LEFT JOIN providers pv ON pv.id = pr.id_providers
WHERE pr.id_categories = 6