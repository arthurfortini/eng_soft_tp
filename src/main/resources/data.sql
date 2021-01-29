-- Populating User Table --
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('arthurfortini', 'Arthur Fortini', 23, 'BH', '(31) 99807-1841', '(31) 3428-2326', '@ksh_mir', '@arthur.fortini', '@tutsfortini', '2021-01-21', 'Weekend', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('gsantos', 'Guilherme Santos', 22, 'BH', '(31) 95567-0202', null, '@gui_santos03', '@guilherme', '@guiizinho', '2021-01-21', 'Tue', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('paulinelli', 'Victor Paulinelli', 24, 'BH', '(31) 98976-4444', null, '@vitao_besta', '@vitinho', '@srbesta', '2021-01-21', 'Wed', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('gutinho', 'Augusto Vilaça', 22, 'BH', '(31) 94456-4567', '(31) 3444-5545', '@guto_vilaca2', '@augustovilaca23', '@gutinho_secreto', '2021-01-21', 'Fri', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('gui.rock', 'Guilherme Pedrosa', 23, 'SP', '(11) 92345-9877', '(11) 3466-4477', '@gui.rock2', 'guilherme_pedrosa', null, '2021-01-21', 'Weekend', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('tiagofr', 'Tiago Ribeiro', 45, 'SP', '(11) 94563-0098', null, '@tiaguinhofr', '@tiagoribeir0', '@titizinho', '2021-01-21', 'Weekend', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('mariana_santos', 'Mariana Santos', 31, 'RJ', '(21) 97879-6141', '(21) 1179-2356', '@fugly_maru', '@marianaSantos77', '@paranoid_doll', '2021-01-21', 'Thu', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('gabi_araujo', 'Gabriela Araujo', 14, 'RJ', '(21) 9117-9901', null, '@gaybi', '@gabiAraujo22', '@cosmolita', '2021-01-21', 'Weekend', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('demi', 'Demi Lovato', 28, 'ES', '(27) 97786-0983', '(27) 3444-5545', '@ddlovato', '@ddlovato', '@ddlovato', '2021-01-21', 'Fri', 'banana123');
INSERT INTO User(login, full_name, age, city_name, cell_phone, home_phone, insta, face, twitter, created_at, available_in, password)
            VALUES ('VitorOrnelas', 'Vitor Ornelas', 60, 'ES', '(27) 98799-6769', '(31) 3424-2322', '@vitorhornelas', null, '@vitornelinhas', '2021-01-21', 'Weekend', 'banana123');

-- Populating Game Table --
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Terra Mystica', 2012, 'Jens Drogemuller, Helge Ostertag');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Gloomhaven', 2017, 'Isaac Childres');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Projeto Gaia', 2017, 'Jens Drogemuller, Helge Ostertag');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Terraforming Mars', 2016, 'Jacob Fryxelius');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Brass: Birmingham', 2018, 'Gavan Brown, Matt Tolman');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Brass: Lancashire', 2017, 'Martin Wallace');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Great Western Trail', 2016, 'Alexander Pfister');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('The Castles of Burgundy', 2011, 'Stefan Feld');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Clãs da Caledônia', 2017, 'Juma Al-Joulou');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Puerto Rico', 2002, 'Andreas Seyfarth');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Twilight Imperium (Fourth Edition)', 2017, 'Christian T. Petersen, Dane Beltrami');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Twilight Struggle', 2005, 'Ananda Gupta, Jason Matthews');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Star Wars: Rebellion', 2016, 'Matt Allsopp, David Ardilla');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('7 Wonders Duel', 1991, 'Antoine Bauza, Bruno Cathala');
INSERT INTO Game(full_name, launch_year, developer) VALUES ('Pandemic', 2008, 'Matt Leacock');

-- Populating User Owned Games Table --
INSERT INTO user_owned_games VALUES ('arthurfortini', 'Pandemic');
INSERT INTO user_owned_games VALUES ('arthurfortini', 'Twilight Imperium (Fourth Edition)');
INSERT INTO user_owned_games VALUES ('gsantos', 'Terra Mystica');
INSERT INTO user_owned_games VALUES ('gsantos', 'Gloomhaven');
INSERT INTO user_owned_games VALUES ('paulinelli', 'Projeto Gaia');
INSERT INTO user_owned_games VALUES ('paulinelli', 'Terraforming Mars');
INSERT INTO user_owned_games VALUES ('gutinho', 'Brass: Birmingham');
INSERT INTO user_owned_games VALUES ('gutinho', 'Brass: Lancashire');
INSERT INTO user_owned_games VALUES ('gui.rock', 'Great Western Trail');
INSERT INTO user_owned_games VALUES ('gui.rock', 'The Castles of Burgundy');
INSERT INTO user_owned_games VALUES ('tiagofr', 'Clãs da Caledônia');
INSERT INTO user_owned_games VALUES ('tiagofr', 'Twilight Imperium (Fourth Edition)');
INSERT INTO user_owned_games VALUES ('mariana_santos', 'Star Wars: Rebellion');
INSERT INTO user_owned_games VALUES ('mariana_santos', '7 Wonders Duel');
INSERT INTO user_owned_games VALUES ('gabi_araujo', 'Pandemic');
INSERT INTO user_owned_games VALUES ('gabi_araujo', 'Star Wars: Rebellion');
INSERT INTO user_owned_games VALUES ('demi', 'Puerto Rico');
INSERT INTO user_owned_games VALUES ('demi', 'Pandemic');
INSERT INTO user_owned_games VALUES ('VitorOrnelas', 'Brass: Birmingham');
INSERT INTO user_owned_games VALUES ('VitorOrnelas', 'Terra Mystica');

-- Populating User Wanted Games Table --
INSERT INTO user_wanted_games VALUES ('arthurfortini', 'Gloomhaven');
INSERT INTO user_wanted_games VALUES ('arthurfortini', 'Brass: Lancashire');
INSERT INTO user_wanted_games VALUES ('gsantos', 'Projeto Gaia');
INSERT INTO user_wanted_games VALUES ('gsantos', 'Terraforming Mars');
INSERT INTO user_wanted_games VALUES ('paulinelli', 'Terra Mystica');
INSERT INTO user_wanted_games VALUES ('paulinelli', 'Gloomhaven');
INSERT INTO user_wanted_games VALUES ('gutinho', 'Great Western Trail');
INSERT INTO user_wanted_games VALUES ('gutinho', 'The Castles of Burgundy');
INSERT INTO user_wanted_games VALUES ('gui.rock', 'Brass: Birmingham');
INSERT INTO user_wanted_games VALUES ('gui.rock', 'Brass: Lancashire');
INSERT INTO user_wanted_games VALUES ('tiagofr', 'Star Wars: Rebellion');
INSERT INTO user_wanted_games VALUES ('tiagofr', '7 Wonders Duel');
INSERT INTO user_wanted_games VALUES ('mariana_santos', 'Clãs da Caledônia');
INSERT INTO user_wanted_games VALUES ('mariana_santos', 'Twilight Imperium (Fourth Edition)');
INSERT INTO user_wanted_games VALUES ('gabi_araujo', 'Puerto Rico');
INSERT INTO user_wanted_games VALUES ('gabi_araujo', 'Pandemic');
INSERT INTO user_wanted_games VALUES ('demi', 'Pandemic');
INSERT INTO user_wanted_games VALUES ('demi', 'Star Wars: Rebellion');
INSERT INTO user_wanted_games VALUES ('VitorOrnelas', 'Great Western Trail');
INSERT INTO user_wanted_games VALUES ('VitorOrnelas', 'Gloomhaven');

-- Populating User Friendships Table --
INSERT INTO user_friendships VALUES ('arthurfortini', 'mariana_santos');
INSERT INTO user_friendships VALUES ('mariana_santos', 'tiagofr');
INSERT INTO user_friendships VALUES ('mariana_santos', 'gabi_araujo');
INSERT INTO user_friendships VALUES ('arthurfortini', 'demi');
INSERT INTO user_friendships VALUES ('gabi_araujo', 'gui.rock');
INSERT INTO user_friendships VALUES ('gui.rock', 'arthurfortini');
INSERT INTO user_friendships VALUES ('gsantos', 'gutinho');
INSERT INTO user_friendships VALUES ('gutinho', 'paulinelli');
INSERT INTO user_friendships VALUES ('paulinelli', 'arthurfortini');
INSERT INTO user_friendships VALUES ('VitorOrnelas', 'arthurfortini');
INSERT INTO user_friendships VALUES ('VitorOrnelas', 'demi');
INSERT INTO user_friendships VALUES ('demi', 'mariana_santos');