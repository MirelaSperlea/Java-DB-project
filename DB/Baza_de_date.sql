--
-- File generated with SQLiteStudio v3.3.3 on Wed Jan 18 19:36:17 2023
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Licitatii
CREATE TABLE Licitatii (
    Licitatie_ID   INTEGER  PRIMARY KEY,
    Nume_Licitatie VARCHAR,
    Telefon_ID     INTEGER  REFERENCES Telefoane (Telefon_ID),
    Vanzator       VARCHAR  REFERENCES Utilizatori (Mail) 
                            NOT NULL,
    Data           DATETIME,
    Durata         VARCHAR,
    Pret           VARCHAR
);

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          1,
                          'licitez iphone 11pro',
                          1,
                          'anapopescu@yahoo.com',
                          '10/10/2022',
                          '2 zile',
                          '380'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          2,
                          'licitatie iphone',
                          2,
                          'florioleanu@gmail.com',
                          '10/10/2022',
                          '4 zile',
                          '1100'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          3,
                          'Apple licitatie',
                          3,
                          'valitomo@yahoo.ro',
                          '11/10/2022',
                          '2 zile',
                          '400'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          4,
                          'Sumsung Liciteaza',
                          4,
                          'andrapop@yahoo.com',
                          '16/10/2022',
                          '3 zile',
                          '500'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          5,
                          'Apple iphine 12',
                          5,
                          'floandrei@yahoo.com',
                          '16/10/2022',
                          '4 zile',
                          '1000'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          6,
                          'sumsung licitatie',
                          6,
                          'anapopescu@yahoo.com',
                          '18/10/2022',
                          '2 zile',
                          '560'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          7,
                          'Huawei telefon',
                          7,
                          'andrapop@yahoo.com',
                          '18/10/2022',
                          '2 zile',
                          '290'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          8,
                          'sumsung telefon',
                          8,
                          'floandrei@yahoo.com',
                          '20/10/2022',
                          '6 zile',
                          '789'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          9,
                          'Apple licitatie',
                          9,
                          'cristinamutu@yahoo.com',
                          '20/10/2022',
                          '4 zile',
                          '1000'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          10,
                          'Huawei',
                          10,
                          'andrapop@yahoo.com',
                          '02/12/2023',
                          '2 zile',
                          '1200'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          11,
                          'Samsung licitatie',
                          11,
                          'biancapopovici@yahoo.com',
                          '01/12/2024',
                          '4 zile',
                          '600'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          12,
                          'Licitatie Huawei',
                          12,
                          'valitomi@yahoo.ro',
                          '12/11/2022',
                          '3 zile',
                          '850'
                      );

INSERT INTO Licitatii (
                          Licitatie_ID,
                          Nume_Licitatie,
                          Telefon_ID,
                          Vanzator,
                          Data,
                          Durata,
                          Pret
                      )
                      VALUES (
                          13,
                          'licitatie noua',
                          13,
                          'andrapop@yahoo.com',
                          '11/09/2022',
                          '3 zile',
                          '700'
                      );


-- Table: Licitatii_Finalizate
CREATE TABLE Licitatii_Finalizate (
    Licitatie_ID INTEGER  PRIMARY KEY,
    Cumparator   VARCHAR  REFERENCES Utilizatori (Mail) 
                          NOT NULL,
    Pret_Final   VARCHAR,
    Data         DATETIME
);

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     1,
                                     'cristinamutu@yahoo.com',
                                     '350',
                                     '12/10/2022'
                                 );

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     2,
                                     'andrapop@yahoo.com',
                                     '1000',
                                     '14/10/2022'
                                 );

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     3,
                                     'biancapopovici@yahoo.com',
                                     '380',
                                     '13/10/2022'
                                 );

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     4,
                                     'floandrei@yahoo.com',
                                     '478',
                                     '19/10/2022'
                                 );

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     5,
                                     'andrapop@yahoo.com',
                                     '900',
                                     '20/10/2022'
                                 );

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     6,
                                     'ancavasile@gamil.com',
                                     '520',
                                     '20/10/2022'
                                 );

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     7,
                                     'popescuandrei@yahoo.com',
                                     '250',
                                     '20/10/2022'
                                 );

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     8,
                                     'andrapop@yahoo.com',
                                     '700',
                                     '25/10/2022'
                                 );

INSERT INTO Licitatii_Finalizate (
                                     Licitatie_ID,
                                     Cumparator,
                                     Pret_Final,
                                     Data
                                 )
                                 VALUES (
                                     9,
                                     'popescuandrei@yahoo.com',
                                     '970',
                                     '24/10/2022'
                                 );


-- Table: Livrari
CREATE TABLE Livrari (
    Livrare_ID  INTEGER PRIMARY KEY,
    Nume        VARCHAR,
    Prenume     VARCHAR,
    Strada      VARCHAR,
    Numar       VARCHAR,
    Oras        VARCHAR,
    [Judet/Sec] VARCHAR,
    Cod_Postal  VARCHAR
);

INSERT INTO Livrari (
                        Livrare_ID,
                        Nume,
                        Prenume,
                        Strada,
                        Numar,
                        Oras,
                        [Judet/Sec],
                        Cod_Postal
                    )
                    VALUES (
                        1,
                        'Pop',
                        'Andra',
                        'Marasti',
                        '7',
                        'Bucuresti',
                        'Sector 6',
                        '220910'
                    );


-- Table: Marci
CREATE TABLE Marci (
    Marca_ID INTEGER PRIMARY KEY,
    Marca    VARCHAR,
    Detalii  VARCHAR
);

INSERT INTO Marci (
                      Marca_ID,
                      Marca,
                      Detalii
                  )
                  VALUES (
                      1,
                      'Apple',
                      'Este considerata a fi una dintre cele 5 (Big Five) cele mai mari companii de tehnologia informa?iei din USA, '
                  );

INSERT INTO Marci (
                      Marca_ID,
                      Marca,
                      Detalii
                  )
                  VALUES (
                      2,
                      'Samsung',
                      'Potrivit fondatorului Samsung, semnifica?ia cuvântului este„trei stele”, cuvântul „trei” reprezinta ceva „mare, numeros ?i puternic”'
                  );

INSERT INTO Marci (
                      Marca_ID,
                      Marca,
                      Detalii
                  )
                  VALUES (
                      3,
                      'Huawei',
                      'Este o companie multina?ionala producatoare de echipamente de telecomunica?ii din Republica Populara Chineza. Compania a avut vânzari de 17,7 miliarde de dolari în anul 2018.'
                  );

INSERT INTO Marci (
                      Marca_ID,
                      Marca,
                      Detalii
                  )
                  VALUES (
                      4,
                      'Allview',
                      'Este un brand de?inut de compania româneasca Visual Fan care comercializeaza smartphone-uri. Activeaza din 2002 în zona de electronice ?i fondatorul este Lucian Peticila.'
                  );

INSERT INTO Marci (
                      Marca_ID,
                      Marca,
                      Detalii
                  )
                  VALUES (
                      5,
                      'Sony',
                      'Este un conglomerat japonez multina?ional care are sediul în sectorul Minato, Tokio, Japonia, fiind dupa marime al cincilea conglomerat media din lume, cu venituri anuale de aproximativ 7,730 trilioane.'
                  );


-- Table: Telefoane
CREATE TABLE Telefoane (
    Telefon_ID    INTEGER PRIMARY KEY,
    Vanzator      VARCHAR REFERENCES Utilizatori (Mail),
    Marca         VARCHAR REFERENCES Marci (Marca),
    Model         VARCHAR,
    Starea        VARCHAR,
    An_fabricatie VARCHAR
);

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          1,
                          'anapopescu@yahoo.com',
                          'Apple',
                          'iPhone 11 pro',
                          'prezinta mici defecte',
                          '2020'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          2,
                          'florioleanu@gmail.com',
                          'Apple',
                          'iPhone 14 ',
                          'nou',
                          '2022'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          3,
                          'valitomi@yahoo.ro',
                          'Apple',
                          '13 pro max',
                          'cateva zgarieturi',
                          '2021'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          4,
                          'andrapop@yahoo.com',
                          'Samsung',
                          'S11',
                          'buna',
                          '2019'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          5,
                          'floandrei@yahoo.com',
                          'Apple',
                          'iphone 12',
                          'cateva defecte',
                          '2020'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          6,
                          'anapopescu@yahoo.com',
                          'Samsung',
                          'S12 ',
                          'buna',
                          '2020'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          7,
                          'andrapop@yahoo.com',
                          'Apple',
                          'iphone 12',
                          'nou',
                          '2019'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          8,
                          'floandrei@yahoo.com',
                          'Samsung',
                          'A70',
                          'uzat',
                          '2018'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          9,
                          'cristinamutu@yahoo.com',
                          'Apple',
                          'iphone 14 plus',
                          'nou',
                          '2022'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          10,
                          'andrapop@yahoo.com',
                          'Huawei',
                          'Plite',
                          'uzat',
                          '2019'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          11,
                          'biancapopovici@yahoo.com',
                          'Samsung',
                          'S11',
                          'cateva zgarieturi',
                          '2020'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          12,
                          'valitomi@yahoo.ro',
                          'Huawei',
                          'Plite',
                          'nou',
                          '2019'
                      );

INSERT INTO Telefoane (
                          Telefon_ID,
                          Vanzator,
                          Marca,
                          Model,
                          Starea,
                          An_fabricatie
                      )
                      VALUES (
                          13,
                          'andrapop@yahoo.com',
                          'Apple',
                          '11',
                          'nou',
                          '2019'
                      );


-- Table: Utilizator_Licitatie
CREATE TABLE Utilizator_Licitatie (
    Licitator    VARCHAR  REFERENCES Utilizatori (Mail) 
                          NOT NULL,
    Licitatie_ID INTEGER  REFERENCES Licitatii (Licitatie_ID),
    Pret_Licitat VARCHAR,
    Data         DATETIME
);

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'valitomi@yahoo.ro',
                                     1,
                                     '350',
                                     '10/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'valitomi@yahoo.ro',
                                     2,
                                     '980',
                                     '10/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'andrapop@yahoo.com',
                                     1,
                                     '360',
                                     '11/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'florioleanu@gmail.com',
                                     8,
                                     '700',
                                     '22/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'popescuandrei@yahoo.com',
                                     7,
                                     '250',
                                     '19/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'popescuandrei@yahoo.com',
                                     2,
                                     '1000',
                                     '11/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'andrapop@yahoo.com',
                                     8,
                                     '750',
                                     '23/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'andrapop@yahoo.com',
                                     2,
                                     '1001',
                                     '11/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'ancavasile@gamil.com',
                                     6,
                                     '520',
                                     '18/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     'cristinamutu@yahoo.com',
                                     1,
                                     '370',
                                     '12/10/2022'
                                 );

INSERT INTO Utilizator_Licitatie (
                                     Licitator,
                                     Licitatie_ID,
                                     Pret_Licitat,
                                     Data
                                 )
                                 VALUES (
                                     '',
                                     '',
                                     '',
                                     ''
                                 );


-- Table: Utilizatori
CREATE TABLE Utilizatori (
    Utilizator_ID INTEGER  PRIMARY KEY,
    Mail          VARCHAR  NOT NULL
                           UNIQUE,
    Parola        VARCHAR  NOT NULL
                           UNIQUE,
    Nume          VARCHAR,
    Prenume       VARCHAR,
    Data_Nasterii DATETIME,
    Nr_Telefon    VARCHAR  NOT NULL
);

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            1,
                            'andrapop@yahoo.com',
                            'pop123',
                            'Pop',
                            'Andra',
                            '22/01/2000',
                            '729280911'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            2,
                            'popescuandrei@yahoo.com',
                            'popescu1233',
                            'Popescu',
                            'Andrei',
                            '11/02/2000',
                            '758478637'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            4,
                            'floandrei@yahoo.com',
                            'flo123',
                            'Andrei',
                            'Flo',
                            '11/02/2000',
                            '728112234'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            6,
                            'Admin',
                            'Admin123',
                            'Admin',
                            'Admin',
                            '31/08/2001',
                            '725673165'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            8,
                            'cristinamutu@yahoo.com',
                            'cristina123',
                            'Mutu',
                            'Cristina',
                            '11/07/2000',
                            '7268868192'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            9,
                            'florioleanu@gmail.com',
                            'flori123',
                            'Olteanu',
                            'Flori',
                            '01/02/2000',
                            '5463783321'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            10,
                            'valitomi@yahoo.ro',
                            'vali999',
                            'Tomescu',
                            'Valentin',
                            '15/08/2006',
                            '78183653'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            11,
                            'biancapopovici@yahoo.com',
                            'Popovici123',
                            'Popovici',
                            'Bianca',
                            '11/11/1978',
                            '762823613'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            12,
                            'ancavasile@gamil.com',
                            'vasilica311',
                            'Vasile',
                            'Anca',
                            '6/09/1998',
                            '786345214'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            13,
                            'admin',
                            'admin123',
                            'admin',
                            'admin',
                            'admin',
                            '738971934'
                        );

INSERT INTO Utilizatori (
                            Utilizator_ID,
                            Mail,
                            Parola,
                            Nume,
                            Prenume,
                            Data_Nasterii,
                            Nr_Telefon
                        )
                        VALUES (
                            14,
                            'sperleamirela@yahoo.com',
                            'mirela',
                            'Sperlea',
                            'Mirela',
                            '31/10/2000',
                            '2456758679'
                        );


COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
