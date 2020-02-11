DROP TABLE IF EXISTS exercises;

CREATE TABLE exercises (
    id UUID PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL
)

INSERT INTO exercises (name, description) VALUES
('Squat', ''),
('Bench Press', ''),
('Military Press', ''),
('Leg Press', ''),
('Bicep Curls', ''),
('Kettlebell Swings', ''),

