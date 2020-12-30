SELECT providers.name, products.name
FROM providers
INNER JOIN products ON products.id_providers = providers.id
WHERE providers.name LIKE 'Ajax SA';