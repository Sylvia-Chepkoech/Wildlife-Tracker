CREATE DATABASE wildlife_tracker;
\c
CREATE TABLE animals (
id serial PRIMARY KEY,
name VARCHAR,
type VARCHAR,
health VARCHAR,
age VARCHAR
);

CREATE TABLE sightings(
id serial PRIMARY KEY,
ranger_name VARCHAR,
locationId VARCHAR,
sightedAt timestamp
);