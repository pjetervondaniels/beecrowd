CREATE TABLE legal_person(
    cnpj char(18),
    contact varchar(30),
)

ADD CONSTRAINT id_customers FOREIGN KEY (id_customers) REFERENCES dbo.customers (id)
ALTER TABLE dbo.legal_person ADD id_customers INT NOT NULL
ALTER TABLE dbo.legal_person ADD CONSTRAINT id_customers FOREIGN KEY (id_customers) REFERENCES dbo.customers (id)