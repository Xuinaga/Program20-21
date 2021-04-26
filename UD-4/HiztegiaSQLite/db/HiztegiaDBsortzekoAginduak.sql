CREATE TABLE Terminoak
(
Id INTEGER PRIMARY KEY AUTOINCREMENT,
Euskaraz varchar(255),
Gazteleraz varchar(255),
Inglesez varchar(255)
);

Insert into Terminoak
values(null,'Txoria','Pajaro','Bird');

Insert into Terminoak(Euskaraz,Gazteleraz,Inglesez)
values ('Armiarma','Araña','Spyder');
ALTER TABLE Terminoak AUTO_INCREMENT = 1;