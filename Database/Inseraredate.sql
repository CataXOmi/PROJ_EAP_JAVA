#Inserare date in tabele

#Utilizator
INSERT INTO Utilizator VALUES(1,'PopStef','Popescu','Stefan','pop.stefan@gmail.com',md5('pop1212'),md5('pop1212'),'ADMIN',0);
INSERT INTO Utilizator VALUES(2,'MrCat','Marin','Catalin','mrcata@gmail.com',md5('catmr369'),md5('catmr369'),'ADMIN',0);
INSERT INTO Utilizator VALUES(3,'SebiTr','Traian','Sebastian','traian_sebi@gmail.com',md5('trseb8301'),md5('trseb8301'),'USER',0);
INSERT INTO Utilizator VALUES(4,'MarcIo','Marcel','Ion','ionmarc@gmail.com',md5('im74ar54'),md5('im74ar54'),'USER',0);
INSERT INTO Utilizator VALUES(5,'TeoVasi','Teodorescu','Vasile','t_vasi@yahoo.com',md5('131vasta54'),md5('131vasta54'),'USER',0);
INSERT INTO Utilizator VALUES(6,'VasiTom','Vasilescu','Tomita','v.tomita@gmail.com',md5('vastom11220548'),md5('vastom11220548'),'USER',0);
INSERT INTO Utilizator VALUES(7,'CriRare','Cristea','Rares','rares.cr@yahoo.com',md5('racs74458'),md5('racs74458'),'USER',0);
INSERT INTO Utilizator VALUES(8,'EnaTud','Enache','Tudor','enachet@yahoo.com',md5('648asf8ent'),md5('648asf8ent'),'USER',0);
INSERT INTO Utilizator VALUES(9,'DimAnd','Dima','Andrei','dimaa@gmail.com',md5('46as1f26cew'),md5('46as1f26cew'),'USER',0);
INSERT INTO Utilizator VALUES(10,'GerRiv','Geralt','Rivian','geralt.rivian@yahoo.com',md5('6asecfd'),md5('6asecfd'),'USER',0);

#Locatie
INSERT INTO Locatie VALUES(1,'Japonia','Tokyo','1-1 Yoyogikamizonocho, Shibuya City, Tokyo 151-8557');
INSERT INTO Locatie VALUES(2,'Anglia','Londra','Tower Bridge Rd, London SE1 2UP');
INSERT INTO Locatie VALUES(3,'Germania','Berlin','Pariser Platz, 10117 Berlin');
INSERT INTO Locatie VALUES(4,'Romania','Maramures','Sapanta 437305');
INSERT INTO Locatie VALUES(5,'Spania','Barcelona','Carrer de Mallorca, 401, 08013 Barcelona');
INSERT INTO Locatie VALUES(6,'Franta','Paris','Champ de Mars, 5 Avenue Anatole France, 75007 Paris');
INSERT INTO Locatie VALUES(7,'Italia','Roma','Piazza del Colosseo, 1, 00184 Roma RM');
INSERT INTO Locatie VALUES(8,'Austria','Viena','Schönbrunner Schloßstraße 47, 1130 Wien');
INSERT INTO Locatie VALUES(9,'Italia','Venetia','Piazza San Marco, 30100 Venezia VE');
INSERT INTO Locatie VALUES(10,'Romania','Brasov','Bulevardul Griviței 2F, Brașov 500182');

#Vacanta
INSERT INTO Vacanta VALUES(1,'Sejur de 7 zile in Europa','2020-03-01','2020-03-08',25549.99,'Familie',1);
INSERT INTO Vacanta VALUES(2,'Vacanta de 4 zile in Romania, Maramures','2020-04-21','2020-04-25',1999.99,'Familie',3);
INSERT INTO Vacanta VALUES(3,'Sejur de 10 zile in Italia','2020-05-11','2020-05-21',52239.99,'Afaceri',4);
INSERT INTO Vacanta VALUES(4,'Sejur in jurul lumii','2020-03-01','2020-04-04',99999.99,'Familie',2);
INSERT INTO Vacanta VALUES(5,'Vacanta de 14 zile in Asia','2020-06-01','2020-06-15',2699.99,'Interes militar',5);
INSERT INTO Vacanta VALUES(6,'Sejur de 10 in Anglia','2020-07-01','2020-07-11',25549.99,'Familie',8);
INSERT INTO Vacanta VALUES(7,'Vacanta de 7 zile in Austria','2020-08-14','2020-08-21',8999.99,'Familie',6);
INSERT INTO Vacanta VALUES(8,'Vacanta de 10 zile in Roma','2020-02-01','2020-02-11',10000.99,'Familie',7);
INSERT INTO Vacanta VALUES(9,'Sejur de 8 zile in Barcelona','2020-03-01','2020-03-09',12555.50,'Afaceri',9);
INSERT INTO Vacanta VALUES(10,'Vacanta de 4 zile in Londra','2020-05-01','2020-05-05',7999.99,'Familie',10);
INSERT INTO Vacanta VALUES(11,'Vacanta de 15 zile in Dubai','2020-07-01','2020-07-16',49999.99,'Afaceri',1);
INSERT INTO Vacanta VALUES(12,'Vacanta de 7 zile in Santorini','2020-06-01','2020-06-08',25555.55,'Familie',1);
INSERT INTO Vacanta VALUES(13,'Vacanta de 13 zile in Atena','2020-09-11','2020-09-24',15239.99,'Afaceri',2);
INSERT INTO Vacanta VALUES(14,'Sejur de 10 zile in Norvegia','2020-04-01','2020-04-11',12145.99,'Afaceri',1);
INSERT INTO Vacanta VALUES(15,'Sejur de 10 zile in Suedia','2020-05-12','2020-05-22',10254.99,'Familie',1);

#Cazare
INSERT INTO Cazare VALUES(1,'Hotel The Savoy','Apartament','2020-03-01','2020-03-02','Londra','Un loc minunat cu un personal incantator','Strand, London WC2R 0EZ',4000.75,1);
INSERT INTO Cazare VALUES(2,'Vila Ana','Camera de 4 persoane','2020-04-21','2020-04-25','Maramures','Un loc traditional ce trezeste amintiri din copilarie','Strada Rotundului 138, Borșa 435200',8999.75,2);
INSERT INTO Cazare VALUES(3,'Hotel Elvetico','Apartament','2020-03-03','2020-03-05','Locarno','Un loc in care natura formeaza peisaje uluitoare','Via Valle Maggia 31, 6600 Locarno',7000.25,1);
INSERT INTO Cazare VALUES(4,'Hotel - Restaurant Sperlhof','Apartament','2020-08-14','2020-08-21','Edlbach','Un loc linistitor cu multe programe interesante si cu multe feluri de mancare specifice','Edlbach 34, 4580 Edlbach',3999.99,7);
INSERT INTO Cazare VALUES(5,'Hotel One Paralelo','Camera de 2 persoane','2020-03-01','2020-03-09','Barcelona','Un loc plin de momente de neuitat','Carrer de Salvà, 62, 08004 Barcelona',6555.25,9);
INSERT INTO Cazare VALUES(6,'Hotel Orange','Apartament','2020-03-06','2020-03-08','La Louvière','Un loc luxuriant','Chaussée du Pont du Sart 238, 7110 La Louvière',6500.15,1);
INSERT INTO Cazare VALUES(7,'Crowne Plaza Athens - City Centre','Camera de 3 persoane','2020-09-11','2020-09-24','Atena','Un loc in care confortul este exemplar','Michalakopoulou Street, Athina 115 28',8562.99,13);
INSERT INTO Cazare VALUES(8,'Dusit Thani Dubai','Apartament','2020-07-01','2020-07-16','Dubai','Luxul este la apogeul sau','Sheikh Zayed Rd - Dubai',15255.55,11);
INSERT INTO Cazare VALUES(9,'Hotel NH Roma Villa Carpegna','Apartament','2020-02-01','2020-02-11','Roma','Pe langa confort, piscina a fost locul unde magia se-ntampla','Via Pio IV, 6, 00165 Roma RM',5622.45,8);
INSERT INTO Cazare VALUES(10,'Deep Blue Suite','Camera de 3 persoane','2020-06-01','2020-06-08','Santorini','Un loc cu peisaje mirifice','Thera 847 00',1555.55,12);

#Atractie
INSERT INTO Atractie VALUES(1,'Podul Londrei',200.25,'Unul din locurile care trebuie vizitate neaparat daca ajungeti in Londra',9,'2020-05-02',10,2);
INSERT INTO Atractie VALUES(2,'Turnul Eiffel',500.75,'Unul dintre cele mai renumite obiective turistice din Franta si chiar si din Europa',8.75,'2020-03-04',1,6);
INSERT INTO Atractie VALUES(3,'Sagrada Familia',2500.25,'Cuvintele sunt de prisos, ceea ce vezi si simti cand vizitezi aceasta capodopera de arta, este dincolo de cuvinte',10,'2020-03-03',9,5);
INSERT INTO Atractie VALUES(4,'Gradina Nationala Shinjuku Gyoen',2020.25,'Intretinerea parcului este impecabila, iar bucuria localnicilor si turistilor la cote ridicate de emotie si incantare',10,'2020-06-07',5,1);
INSERT INTO Atractie VALUES(5,'Cimitirul Vesel',150.55,'Un loc minunat din Maramures, o arhitectura deosebita a bisericii si un concept cu totul aparte al cimitirului',7.5,'2020-04-22',2,4);
INSERT INTO Atractie VALUES(6,'Neuschwanstein',1250.65,'Locatie superba si un peisaj spectaculos',10,'2020-03-06',1,3);
INSERT INTO Atractie VALUES(7,'Vatican',1750.26,'Cu siguranta unul dintre punctele culminante ale Romei',9.5,'2020-02-03',8,7);
INSERT INTO Atractie VALUES(8,'Colosseum',750.21,'Colosseumul era cea mai mare constructie a vremurilor sale si astazi este cel mai mare amfiteatru antic care poate fi vizitat in Italia',9.4,'2020-02-06',8,7);
INSERT INTO Atractie VALUES(9,'Piata San Marco',821.25,'Piata centrala a Venetiei reprezinta un loc incarcat de secole de istorie',9.3,'2020-03-07',1,9);
INSERT INTO Atractie VALUES(10,'Palatul Schönbrunn',1925.65,'Gradinile palatului sunt fascinante. Palatul in sine este o constructie impresionanta, iar decorul camerelor mi-a amintit de Palatul Dolmanahce din Istanbul',9.8,'2020-08-17',7,8);

#Fotografie
INSERT INTO Fotografie VALUES(1,'Anglia1','11:22:33','Pablo Maurizzio',1);
INSERT INTO Fotografie VALUES(2,'Franta1','10:21:17','Vasile Ion',2);
INSERT INTO Fotografie VALUES(3,'Japonia','09:22:15','Teodorescu Stefan',4);
INSERT INTO Fotografie VALUES(4,'Romania','14:25:12','Lupu Mihai',5);
INSERT INTO Fotografie VALUES(5,'Germania','13:18:19','Geralt George',6);
INSERT INTO Fotografie VALUES(6,'Anglia2','16:24:29','Popescu Stefan',1);
INSERT INTO Fotografie VALUES(7,'Italia1','17:15:31','Marin Catalin',8);
INSERT INTO Fotografie VALUES(8,'Italia2','10:22:21','Tavi Ion',9);
INSERT INTO Fotografie VALUES(9,'Austria1','10:45:28','Lewa Robert',10);
INSERT INTO Fotografie VALUES(10,'Anglia3','11:21:31','Alphonso Elric',1);
INSERT INTO Fotografie VALUES(11,'Japonia','12:15:16','Tanjiro',4);
INSERT INTO Fotografie VALUES(12,'Austria2','15:18:19','Edward Laurence',10);
INSERT INTO Fotografie VALUES(13,'Franta2','14:19:25','Luis Alberto',2);
INSERT INTO Fotografie VALUES(14,'Italia3','13:22:28','Marian Lucian',7);
INSERT INTO Fotografie VALUES(15,'Spania','16:28:16','Cosmin Ioan',3);