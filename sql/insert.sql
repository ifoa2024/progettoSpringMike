-- INSERT INTO authors (firstname, lastname, email)
-- value ("Vincenzo","Bianchi","vincblanche@tin.it");

-- INSERT INTO authors (firstname, lastname, email)
-- value ("Antonio","Rossi","antonred@mail.it");

INSERT INTO posts (title, body, publish_date, author_id)
SELECT 'Lorem ipsum .....', 'Ciao', null, id
FROM authors
where firstname = 'Vincenzo'
and lastname = 'Bianchi';

INSERT INTO posts (title, body, publish_date, author_id)
SELECT 'Lorem ipsum .....', 'Non sono Ciao', null, id
FROM authors
where firstname = 'Vincenzo'
and lastname = 'Bianchi';

