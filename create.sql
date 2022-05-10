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
animalName VARCHAR,
animalType VARCHAR,
rangerName VARCHAR,
locationName VARCHAR,
sightedAt timestamp
);

CREATE DATABASE wildlife_tracker_test;
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
animalName VARCHAR,
animalType VARCHAR,
rangerName VARCHAR,
locationName VARCHAR,
sightedAt timestamp
);