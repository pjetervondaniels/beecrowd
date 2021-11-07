SELECT mo.id, mo.name 
FROM movies mo
LEFT JOIN prices pr ON pr.id = mo.id_prices
WHERE pr.value < 2