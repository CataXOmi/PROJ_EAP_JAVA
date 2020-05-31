# Creare tabele

CREATE TABLE Utilizator(
	id_utilizator INT NOT NULL auto_increment,
    Username VARCHAR(255) NOT NULL,
    Nume VARCHAR(255) NOT NULL,
    Prenume VARCHAR(255) NOT NULL,
	Email VARCHAR(255) NOT NULL UNIQUE,
    Parola VARCHAR(255) NOT NULL,    #Sau Binary
    Parola_2 VARCHAR(255) NOT NULL,    #Sau Binary
    Roles VARCHAR(255) DEFAULT '',
    Activ INT DEFAULT 0,
    
    PRIMARY KEY(id_utilizator)
);

CREATE TABLE Locatie(
	id_locatie INT NOT NULL auto_increment,
    Tara VARCHAR(255) NOT NULL,
    Oras VARCHAR(255) NOT NULL,
	Adresa VARCHAR(255) NOT NULL,
    
    PRIMARY KEY(id_locatie)
);


CREATE TABLE Vacanta(
	id_vacanta INT NOT NULL auto_increment,
    Denumire VARCHAR(255) NOT NULL UNIQUE,
    Data_incepere DATE NOT NULL,
    Data_finala DATE NOT NULL,
    Cheltuieli DECIMAL(10,2) NOT NULL,
    Tip_vacanta VARCHAR(255) ,
    
    fk_id_utilizator INT,
    
    PRIMARY KEY (id_vacanta),
    FOREIGN KEY (fk_id_utilizator) REFERENCES Utilizator(id_utilizator)
);

CREATE TABLE Cazare(
	id_cazare INT NOT NULL auto_increment,
    Nume VARCHAR(255) NOT NULL,
    Tip_cazare VARCHAR(255),
    Data_sosire DATE NOT NULL,
    Data_plecare DATE NOT NULL,
    Oras VARCHAR(255) NOT NULL,
    Rating VARCHAR(255) NOT NULL,
    Adresa VARCHAR(255) NOT NULL,
    Pret DECIMAL(10,2) NOT NULL,
    
    fk_id_vacanta INT,
    
    PRIMARY KEY (id_cazare),
    FOREIGN KEY (fk_id_vacanta) REFERENCES Vacanta(id_vacanta)
);

CREATE TABLE Atractie(
	id_atractie INT NOT NULL auto_increment,
    Denumire VARCHAR(255) NOT NULL ,
	Cost DECIMAL(7,2) NOT NULL,
    Recenzie VARCHAR(255) NOT NULL,
    Nota DECIMAL(5,2) NOT NULL,
    Data_vizita DATE NOT NULL,
    fk_id_vacanta INT,
    fk_id_locatie INT,
    
    PRIMARY KEY (id_atractie),
    FOREIGN KEY (fk_id_vacanta) REFERENCES Vacanta(id_vacanta),
    FOREIGN KEY (fk_id_locatie) REFERENCES Locatie(id_locatie)
);

CREATE TABLE Fotografie(
	id_foto INT NOT NULL auto_increment,
    Nume_fotografie VARCHAR(255) NOT NULL,
    Ora TIME NOT NULL,
    Nume_fotograf VARCHAR(255) NOT NULL,
    fk_id_atractie INT,
    
    PRIMARY KEY (id_foto),
    FOREIGN KEY (fk_id_atractie) REFERENCES Atractie(id_atractie)
);

# Daca stergem Vacanta
alter table Cazare
drop foreign key cazare_ibfk_1;


ALTER TABLE Cazare
ADD FOREIGN KEY (fk_id_vacanta) REFERENCES Vacanta (id_vacanta) 
ON DELETE SET NULL; 

alter table Atractie
drop foreign key atractie_ibfk_1;


ALTER TABLE Atractie
ADD FOREIGN KEY (fk_id_vacanta) REFERENCES Vacanta (id_vacanta) 
ON DELETE SET NULL;

# Daca stergem Atractie
alter table Fotografie
drop foreign key fotografie_ibfk_1;

ALTER TABLE Fotografie
ADD FOREIGN KEY (fk_id_atractie) REFERENCES Atractie (id_atractie) 
ON DELETE CASCADE;
