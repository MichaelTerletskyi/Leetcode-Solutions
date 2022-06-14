SELECT
    FirstName,
    LastName,
    City,
    State
FROM
    person
        LEFT JOIN address ON person.PersonId = address.PersonId