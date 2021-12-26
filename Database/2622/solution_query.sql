SELECT cst.name
FROM legal_person lgl
LEFT JOIN customers cst ON cst.id = lgl.id_customers
