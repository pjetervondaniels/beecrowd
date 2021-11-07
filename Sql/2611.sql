SELECT mo.id, mo.name 
FROM genres ge
LEFT JOIN movies mo ON ge.id = mo.id_genres
WHERE ge.description = 'Action'