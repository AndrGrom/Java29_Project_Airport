create database db_airport;
use db_airport;

CREATE TABLE pilot (
     id int NOT NULL AUTO_INCREMENT,
     first_name varchar(40) NOT NULL,
     last_name varchar(40) NOT NULL,
     rang varchar(20) NOT NULL,
     cod_pilot varchar(20) UNIQUE NOT NULL,
     PRIMARY KEY(id)
     );
CREATE TABLE plane (
	id int NOT NULL AUTO_INCREMENT,
    brand varchar(30) NOT NULL,
    model varchar(30) NOT NULL,
    total_people int NOT NULL,
    board_number int UNIQUE,
    PRIMARY KEY(id)
	);
CREATE TABLE cruise (
    id int NOT NULL AUTO_INCREMENT,
    plane_key int,
    pilot_key int,
    date_cruise date NOT NULL,
    time_cruise time NOT NULL,
    cruise_number int UNIQUE NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (pilot_key) REFERENCES pilot(id),
    FOREIGN KEY (plane_key) REFERENCES plane(id)
    );