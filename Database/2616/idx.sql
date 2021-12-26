SELECT cst.id, cst.name
FROM customers cst 
LEFT JOIN locations lct ON cst.id = lct.id_customers
GROUP BY 1,2
HAVING COUNT(lct.id) = 0
ORDER BY 1