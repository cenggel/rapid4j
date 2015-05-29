/*
Navicat PGSQL Data Transfer

Source Server         : 本机
Source Server Version : 90400
Source Host           : localhost:5432
Source Database       : rapid4j
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90400
File Encoding         : 65001

Date: 2015-05-23 15:44:02
*/


-- ----------------------------
-- Sequence structure for seq_permission_id
-- ----------------------------
DROP SEQUENCE  IF EXISTS "public"."seq_permission_id";
CREATE SEQUENCE "public"."seq_permission_id"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
SELECT setval('"public"."seq_permission_id"', 1, true);

-- ----------------------------
-- Sequence structure for seq_role_id
-- ----------------------------
DROP SEQUENCE  IF EXISTS "public"."seq_role_id";
CREATE SEQUENCE "public"."seq_role_id"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
SELECT setval('"public"."seq_role_id"', 1, true);

-- ----------------------------
-- Sequence structure for seq_role_permission_id
-- ----------------------------
DROP SEQUENCE  IF EXISTS "public"."seq_role_permission_id";
CREATE SEQUENCE "public"."seq_role_permission_id"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
SELECT setval('"public"."seq_role_permission_id"', 1, true);

-- ----------------------------
-- Sequence structure for seq_user_id
-- ----------------------------
DROP SEQUENCE  IF EXISTS "public"."seq_user_id";
CREATE SEQUENCE "public"."seq_user_id"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
SELECT setval('"public"."seq_user_id"', 1, true);

-- ----------------------------
-- Sequence structure for seq_user_role_id
-- ----------------------------
DROP SEQUENCE  IF EXISTS "public"."seq_user_role_id";
CREATE SEQUENCE "public"."seq_user_role_id"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
SELECT setval('"public"."seq_user_role_id"', 1, true);

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_customer";
CREATE TABLE "public"."t_customer" (
"customerid" varchar(40) COLLATE "default" NOT NULL,
"companyname" varchar(255) COLLATE "default",
"address" varchar(255) COLLATE "default",
"city" varchar(40) COLLATE "default",
"region" varchar(40) COLLATE "default",
"postalcode" varchar(40) COLLATE "default",
"country" varchar(40) COLLATE "default",
"phonenumber" varchar(40) COLLATE "default",
"fax" varchar(40) COLLATE "default",
"datecreated" date,
"dateupdated" date,
"contactname" varchar(255) COLLATE "default",
"contacttitle" varchar(255) COLLATE "default",
"customercode" varchar(40) COLLATE "default",
"websiteurl" varchar(255) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO "public"."t_customer" VALUES ('ALFKI', 'Alfreds Futterkiste', 'Obere Str. 57', 'Berlin', 'NULL', '12209', 'Germany', '030-0074321', '030-0076545', null, null, 'Maria Anders', 'Sales Representative', 'ALFKI', null);
INSERT INTO "public"."t_customer" VALUES ('ANATR', 'Ana Trujillo Emparedados y helados', 'Avda. de la Constitución 2222', 'México D.F.', 'NULL', '05021', 'Mexico', '(5) 555-4729', '(5) 555-3745', null, null, 'Ana Trujillo', 'Owner', 'ANATR', null);
INSERT INTO "public"."t_customer" VALUES ('ANTON', 'Antonio Moreno Taquería', 'Mataderos  2312', 'México D.F.', 'NULL', '05023', 'Mexico', '(5) 555-3932', 'NULL', null, null, 'Antonio Moreno', 'Owner', 'ANTON', null);
INSERT INTO "public"."t_customer" VALUES ('AROUT', 'Around the Horn', '120 Hanover Sq.', 'London', 'NULL', 'WA1 1DP', 'UK', '(171) 555-7788', '(171) 555-6750', null, null, 'Thomas Hardy', 'Sales Representative', 'AROUT', null);
INSERT INTO "public"."t_customer" VALUES ('BERGS', 'Berglunds snabbköp', 'Berguvsvägen  8', 'Luleå', 'NULL', 'S-958 22', 'Sweden', '0921-12 34 65', '0921-12 34 67', null, null, 'Christina Berglund', 'Order Administrator', 'BERGS', null);
INSERT INTO "public"."t_customer" VALUES ('BLAUS', 'Blauer See Delikatessen', 'Forsterstr. 57', 'Mannheim', 'NULL', '68306', 'Germany', '0621-08460', '0621-08924', null, null, 'Hanna Moos', 'Sales Representative', 'BLAUS', null);
INSERT INTO "public"."t_customer" VALUES ('BLONP', 'Blondesddsl père et fils', '24, place Kléber', 'Strasbourg', 'NULL', '67000', 'France', '88.60.15.31', '88.60.15.32', null, null, 'Frédérique Citeaux', 'Marketing Manager', 'BLONP', null);
INSERT INTO "public"."t_customer" VALUES ('BOLID', 'Bólido Comidas preparadas', 'C/ Araquil, 67', 'Madrid', 'NULL', '28023', 'Spain', '(91) 555 22 82', '(91) 555 91 99', null, null, 'Martín Sommer', 'Owner', 'BOLID', null);
INSERT INTO "public"."t_customer" VALUES ('BONAP', 'Bon app''', '12, rue des Bouchers', 'Marseille', 'NULL', '13008', 'France', '91.24.45.40', '91.24.45.41', null, null, 'Laurence Lebihan', 'Owner', 'BONAP', null);
INSERT INTO "public"."t_customer" VALUES ('BOTTM', 'Bottom-Dollar Markets', '23 Tsawassen Blvd.', 'Tsawassen', 'BC', 'T2F 8M4', 'Canada', '(604) 555-4729', '(604) 555-3745', null, null, 'Elizabeth Lincoln', 'Accounting Manager', 'BOTTM', null);
INSERT INTO "public"."t_customer" VALUES ('BSBEV', 'B''s Beverages', 'Fauntleroy Circus', 'London', 'NULL', 'EC2 5NT', 'UK', '(171) 555-1212', 'NULL', null, null, 'Victoria Ashworth', 'Sales Representative', 'BSBEV', null);
INSERT INTO "public"."t_customer" VALUES ('CACTU', 'Cactus Comidas para llevar', 'Cerrito 333', 'Buenos Aires', 'NULL', '1010', 'Argentina', '(1) 135-5555', '(1) 135-4892', null, null, 'Patricio Simpson', 'Sales Agent', 'CACTU', null);
INSERT INTO "public"."t_customer" VALUES ('CENTC', 'Centro comercial Moctezuma', 'Sierras de Granada 9993', 'México D.F.', 'NULL', '05022', 'Mexico', '(5) 555-3392', '(5) 555-7293', null, null, 'Francisco Chang', 'Marketing Manager', 'CENTC', null);
INSERT INTO "public"."t_customer" VALUES ('CHOPS', 'Chop-suey Chinese', 'Hauptstr. 29', 'Bern', 'NULL', '3012', 'Switzerland', '0452-076545', 'NULL', null, null, 'Yang Wang', 'Owner', 'CHOPS', null);
INSERT INTO "public"."t_customer" VALUES ('COMMI', 'Comércio Mineiro', 'Av. dos Lusíadas, 23', 'Sao Paulo', 'SP', '05432-043', 'Brazil', '(11) 555-7647', 'NULL', null, null, 'Pedro Afonso', 'Sales Associate', 'COMMI', null);
INSERT INTO "public"."t_customer" VALUES ('CONSH', 'Consolidated Holdings', 'Berkeley Gardens 12  Brewery', 'London', 'NULL', 'WX1 6LT', 'UK', '(171) 555-2282', '(171) 555-9199', null, null, 'Elizabeth Brown', 'Sales Representative', 'CONSH', null);
INSERT INTO "public"."t_customer" VALUES ('DRACD', 'Drachenblut Delikatessen', 'Walserweg 21', 'Aachen', 'NULL', '52066', 'Germany', '0241-039123', '0241-059428', null, null, 'Sven Ottlieb', 'Order Administrator', 'DRACD', null);
INSERT INTO "public"."t_customer" VALUES ('DUMON', 'Du monde entier', '67, rue des Cinquante Otages', 'Nantes', 'NULL', '44000', 'France', '40.67.88.88', '40.67.89.89', null, null, 'Janine Labrune', 'Owner', 'DUMON', null);
INSERT INTO "public"."t_customer" VALUES ('EASTC', 'Eastern Connection', '35 King George', 'London', 'NULL', 'WX3 6FW', 'UK', '(171) 555-0297', '(171) 555-3373', null, null, 'Ann Devon', 'Sales Agent', 'EASTC', null);
INSERT INTO "public"."t_customer" VALUES ('ERNSH', 'Ernst Handel', 'Kirchgasse 6', 'Graz', 'NULL', '8010', 'Austria', '7675-3425', '7675-3426', null, null, 'Roland Mendel', 'Sales Manager', 'ERNSH', null);
INSERT INTO "public"."t_customer" VALUES ('FAMIA', 'Familia Arquibaldo', 'Rua Orós, 92', 'Sao Paulo', 'SP', '05442-030', 'Brazil', '(11) 555-9857', 'NULL', null, null, 'Aria Cruz', 'Marketing Assistant', 'FAMIA', null);
INSERT INTO "public"."t_customer" VALUES ('FISSA', 'FISSA Fabrica Inter. Salchichas S.A.', 'C/ Moralzarzal, 86', 'Madrid', 'NULL', '28034', 'Spain', '(91) 555 94 44', '(91) 555 55 93', null, null, 'Diego Roel', 'Accounting Manager', 'FISSA', null);
INSERT INTO "public"."t_customer" VALUES ('FOLIG', 'Folies gourmandes', '184, chaussée de Tournai', 'Lille', 'NULL', '59000', 'France', '20.16.10.16', '20.16.10.17', null, null, 'Martine Rancé', 'Assistant Sales Agent', 'FOLIG', null);
INSERT INTO "public"."t_customer" VALUES ('FOLKO', 'Folk och fä HB', 'Åkergatan 24', 'Bräcke', 'NULL', 'S-844 67', 'Sweden', '0695-34 67 21', 'NULL', null, null, 'Maria Larsson', 'Owner', 'FOLKO', null);
INSERT INTO "public"."t_customer" VALUES ('FRANK', 'Frankenversand', 'Berliner Platz 43', 'München', 'NULL', '80805', 'Germany', '089-0877310', '089-0877451', null, null, 'Peter Franken', 'Marketing Manager', 'FRANK', null);
INSERT INTO "public"."t_customer" VALUES ('FRANR', 'France restauration', '54, rue Royale', 'Nantes', 'NULL', '44000', 'France', '40.32.21.21', '40.32.21.20', null, null, 'Carine Schmitt', 'Marketing Manager', 'FRANR', null);
INSERT INTO "public"."t_customer" VALUES ('FRANS', 'Franchi S.p.A.', 'Via Monte Bianco 34', 'Torino', 'NULL', '10100', 'Italy', '011-4988260', '011-4988261', null, null, 'Paolo Accorti', 'Sales Representative', 'FRANS', null);
INSERT INTO "public"."t_customer" VALUES ('FURIB', 'Furia Bacalhau e Frutos do Mar', 'Jardim das rosas n. 32', 'Lisboa', 'NULL', '1675', 'Portugal', '(1) 354-2534', '(1) 354-2535', null, null, 'Lino Rodriguez', 'Sales Manager', 'FURIB', null);
INSERT INTO "public"."t_customer" VALUES ('GALED', 'Galería del gastrónomo', 'Rambla de Cataluña, 23', 'Barcelona', 'NULL', '08022', 'Spain', '(93) 203 4560', '(93) 203 4561', null, null, 'Eduardo Saavedra', 'Marketing Manager', 'GALED', null);
INSERT INTO "public"."t_customer" VALUES ('GODOS', 'Godos Cocina Típica', 'C/ Romero, 33', 'Sevilla', 'NULL', '41101', 'Spain', '(95) 555 82 82', 'NULL', null, null, 'José Pedro Freyre', 'Sales Manager', 'GODOS', null);
INSERT INTO "public"."t_customer" VALUES ('GOURL', 'Gourmet Lanchonetes', 'Av. Brasil, 442', 'Campinas', 'SP', '04876-786', 'Brazil', '(11) 555-9482', 'NULL', null, null, 'André Fonseca', 'Sales Associate', 'GOURL', null);
INSERT INTO "public"."t_customer" VALUES ('GREAL', 'Great Lakes Food Market', '2732 Baker Blvd.', 'Eugene', 'OR', '97403', 'USA', '(503) 555-7555', 'NULL', null, null, 'Howard Snyder', 'Marketing Manager', 'GREAL', null);
INSERT INTO "public"."t_customer" VALUES ('GROSR', 'GROSELLA-Restaurante', '5ª Ave. Los Palos Grandes', 'Caracas', 'DF', '1081', 'Venezuela', '(2) 283-2951', '(2) 283-3397', null, null, 'Manuel Pereira', 'Owner', 'GROSR', null);
INSERT INTO "public"."t_customer" VALUES ('HANAR', 'Hanari Carnes', 'Rua do Paço, 67', 'Rio de Janeiro', 'RJ', '05454-876', 'Brazil', '(21) 555-0091', '(21) 555-8765', null, null, 'Mario Pontes', 'Accounting Manager', 'HANAR', null);
INSERT INTO "public"."t_customer" VALUES ('HILAA', 'HILARION-Abastos', 'Carrera 22 con Ave. Carlos Soublette #8-35', 'San Cristóbal', 'Táchira', '5022', 'Venezuela', '(5) 555-1340', '(5) 555-1948', null, null, 'Carlos Hernández', 'Sales Representative', 'HILAA', null);
INSERT INTO "public"."t_customer" VALUES ('HUNGC', 'Hungry Coyote Import Store', 'City Center Plaza 516 Main St.', 'Elgin', 'OR', '97827', 'USA', '(503) 555-6874', '(503) 555-2376', null, null, 'Yoshi Latimer', 'Sales Representative', 'HUNGC', null);
INSERT INTO "public"."t_customer" VALUES ('HUNGO', 'Hungry Owl All-Night Grocers', '8 Johnstown Road', 'Cork', 'Co. Cork', 'NULL', 'Ireland', '2967 542', '2967 3333', null, null, 'Patricia McKenna', 'Sales Associate', 'HUNGO', null);
INSERT INTO "public"."t_customer" VALUES ('ISLAT', 'Island Trading', 'Garden House Crowther Way', 'Cowes', 'Isle of Wight', 'PO31 7PJ', 'UK', '(198) 555-8888', 'NULL', null, null, 'Helen Bennett', 'Marketing Manager', 'ISLAT', null);
INSERT INTO "public"."t_customer" VALUES ('KOENE', 'Königlich Essen', 'Maubelstr. 90', 'Brandenburg', 'NULL', '14776', 'Germany', '0555-09876', 'NULL', null, null, 'Philip Cramer', 'Sales Associate', 'KOENE', null);
INSERT INTO "public"."t_customer" VALUES ('LACOR', 'La corne d''abondance', '67, avenue de l''Europe', 'Versailles', 'NULL', '78000', 'France', '30.59.84.10', '30.59.85.11', null, null, 'Daniel Tonini', 'Sales Representative', 'LACOR', null);
INSERT INTO "public"."t_customer" VALUES ('LAMAI', 'La maison d''Asie', '1 rue Alsace-Lorraine', 'Toulouse', 'NULL', '31000', 'France', '61.77.61.10', '61.77.61.11', null, null, 'Annette Roulet', 'Sales Manager', 'LAMAI', null);
INSERT INTO "public"."t_customer" VALUES ('LAUGB', 'Laughing Bacchus Wine Cellars', '1900 Oak St.', 'Vancouver', 'BC', 'V3F 2K1', 'Canada', '(604) 555-3392', '(604) 555-7293', null, null, 'Yoshi Tannamuri', 'Marketing Assistant', 'LAUGB', null);
INSERT INTO "public"."t_customer" VALUES ('LAZYK', 'Lazy K Kountry Store', '12 Orchestra Terrace', 'Walla Walla', 'WA', '99362', 'USA', '(509) 555-7969', '(509) 555-6221', null, null, 'John Steel', 'Marketing Manager', 'LAZYK', null);
INSERT INTO "public"."t_customer" VALUES ('LEHMS', 'Lehmanns Marktstand', 'Magazinweg 7', 'Frankfurt a.M.', 'NULL', '60528', 'Germany', '069-0245984', '069-0245874', null, null, 'Renate Messner', 'Sales Representative', 'LEHMS', null);
INSERT INTO "public"."t_customer" VALUES ('LETSS', 'Let''s Stop N Shop', '87 Polk St. Suite 5', 'San Francisco', 'CA', '94117', 'USA', '(415) 555-5938', 'NULL', null, null, 'Jaime Yorres', 'Owner', 'LETSS', null);
INSERT INTO "public"."t_customer" VALUES ('LILAS', 'LILA-Supermercado', 'Carrera 52 con Ave. Bolívar #65-98 Llano Largo', 'Barquisimeto', 'Lara', '3508', 'Venezuela', '(9) 331-6954', '(9) 331-7256', null, null, 'Carlos González', 'Accounting Manager', 'LILAS', null);
INSERT INTO "public"."t_customer" VALUES ('LINOD', 'LINO-Delicateses', 'Ave. 5 de Mayo Porlamar', 'I. de Margarita', 'Nueva Esparta', '4980', 'Venezuela', '(8) 34-56-12', '(8) 34-93-93', null, null, 'Felipe Izquierdo', 'Owner', 'LINOD', null);
INSERT INTO "public"."t_customer" VALUES ('LONEP', 'Lonesome Pine Restaurant', '89 Chiaroscuro Rd.', 'Portland', 'OR', '97219', 'USA', '(503) 555-9573', '(503) 555-9646', null, null, 'Fran Wilson', 'Sales Manager', 'LONEP', null);
INSERT INTO "public"."t_customer" VALUES ('MAGAA', 'Magazzini Alimentari Riuniti', 'Via Ludovico il Moro 22', 'Bergamo', 'NULL', '24100', 'Italy', '035-640230', '035-640231', null, null, 'Giovanni Rovelli', 'Marketing Manager', 'MAGAA', null);
INSERT INTO "public"."t_customer" VALUES ('MAISD', 'Maison Dewey', 'Rue Joseph-Bens 532', 'Bruxelles', 'NULL', 'B-1180', 'Belgium', '(02) 201 24 67', '(02) 201 24 68', null, null, 'Catherine Dewey', 'Sales Agent', 'MAISD', null);
INSERT INTO "public"."t_customer" VALUES ('MEREP', 'Mère Paillarde', '43 rue St. Laurent', 'Montréal', 'Québec', 'H1J 1C3', 'Canada', '(514) 555-8054', '(514) 555-8055', null, null, 'Jean Fresnière', 'Marketing Assistant', 'MEREP', null);
INSERT INTO "public"."t_customer" VALUES ('MORGK', 'Morgenstern Gesundkost', 'Heerstr. 22', 'Leipzig', 'NULL', '04179', 'Germany', '0342-023176', 'NULL', null, null, 'Alexander Feuer', 'Marketing Assistant', 'MORGK', null);
INSERT INTO "public"."t_customer" VALUES ('NORTS', 'North/South', 'South House 300 Queensbridge', 'London', 'NULL', 'SW7 1RZ', 'UK', '(171) 555-7733', '(171) 555-2530', null, null, 'Simon Crowther', 'Sales Associate', 'NORTS', null);
INSERT INTO "public"."t_customer" VALUES ('OCEAN', 'Océano Atlántico Ltda.', 'Ing. Gustavo Moncada 8585 Piso 20-A', 'Buenos Aires', 'NULL', '1010', 'Argentina', '(1) 135-5333', '(1) 135-5535', null, null, 'Yvonne Moncada', 'Sales Agent', 'OCEAN', null);
INSERT INTO "public"."t_customer" VALUES ('OLDWO', 'Old World Delicatessen', '2743 Bering St.', 'Anchorage', 'AK', '99508', 'USA', '(907) 555-7584', '(907) 555-2880', null, null, 'Rene Phillips', 'Sales Representative', 'OLDWO', null);
INSERT INTO "public"."t_customer" VALUES ('OTTIK', 'Ottilies Käseladen', 'Mehrheimerstr. 369', 'Köln', 'NULL', '50739', 'Germany', '0221-0644327', '0221-0765721', null, null, 'Henriette Pfalzheim', 'Owner', 'OTTIK', null);
INSERT INTO "public"."t_customer" VALUES ('PARIS', 'Paris spécialités', '265, boulevard Charonne', 'Paris', 'NULL', '75012', 'France', '(1) 42.34.22.66', '(1) 42.34.22.77', null, null, 'Marie Bertrand', 'Owner', 'PARIS', null);
INSERT INTO "public"."t_customer" VALUES ('PERIC', 'Pericles Comidas clásicas', 'Calle Dr. Jorge Cash 321', 'México D.F.', 'NULL', '05033', 'Mexico', '(5) 552-3745', '(5) 545-3745', null, null, 'Guillermo Fernández', 'Sales Representative', 'PERIC', null);
INSERT INTO "public"."t_customer" VALUES ('PICCO', 'Piccolo und mehr', 'Geislweg 14', 'Salzburg', 'NULL', '5020', 'Austria', '6562-9722', '6562-9723', null, null, 'Georg Pipps', 'Sales Manager', 'PICCO', null);
INSERT INTO "public"."t_customer" VALUES ('PRINI', 'Princesa Isabel Vinhos', 'Estrada da saúde n. 58', 'Lisboa', 'NULL', '1756', 'Portugal', '(1) 356-5634', 'NULL', null, null, 'Isabel de Castro', 'Sales Representative', 'PRINI', null);
INSERT INTO "public"."t_customer" VALUES ('QUEDE', 'Que Delícia', 'Rua da Panificadora, 12', 'Rio de Janeiro', 'RJ', '02389-673', 'Brazil', '(21) 555-4252', '(21) 555-4545', null, null, 'Bernardo Batista', 'Accounting Manager', 'QUEDE', null);
INSERT INTO "public"."t_customer" VALUES ('QUEEN', 'Queen Cozinha', 'Alameda dos Canàrios, 891', 'Sao Paulo', 'SP', '05487-020', 'Brazil', '(11) 555-1189', 'NULL', null, null, 'Lúcia Carvalho', 'Marketing Assistant', 'QUEEN', null);
INSERT INTO "public"."t_customer" VALUES ('QUICK', 'QUICK-Stop', 'Taucherstraße 10', 'Cunewalde', 'NULL', '01307', 'Germany', '0372-035188', 'NULL', null, null, 'Horst Kloss', 'Accounting Manager', 'QUICK', null);
INSERT INTO "public"."t_customer" VALUES ('RANCH', 'Rancho grande', 'Av. del Libertador 900', 'Buenos Aires', 'NULL', '1010', 'Argentina', '(1) 123-5555', '(1) 123-5556', null, null, 'Sergio Gutiérrez', 'Sales Representative', 'RANCH', null);
INSERT INTO "public"."t_customer" VALUES ('RATTC', 'Rattlesnake Canyon Grocery', '2817 Milton Dr.', 'Albuquerque', 'NM', '87110', 'USA', '(505) 555-5939', '(505) 555-3620', null, null, 'Paula Wilson', 'Assistant Sales Representative', 'RATTC', null);
INSERT INTO "public"."t_customer" VALUES ('REGGC', 'Reggiani Caseifici', 'Strada Provinciale 124', 'Reggio Emilia', 'NULL', '42100', 'Italy', '0522-556721', '0522-556722', null, null, 'Maurizio Moroni', 'Sales Associate', 'REGGC', null);
INSERT INTO "public"."t_customer" VALUES ('RICAR', 'Ricardo Adocicados', 'Av. Copacabana, 267', 'Rio de Janeiro', 'RJ', '02389-890', 'Brazil', '(21) 555-3412', 'NULL', null, null, 'Janete Limeira', 'Assistant Sales Agent', 'RICAR', null);
INSERT INTO "public"."t_customer" VALUES ('RICSU', 'Richter Supermarkt', 'Grenzacherweg 237', 'Genève', 'NULL', '1203', 'Switzerland', '0897-034214', 'NULL', null, null, 'Michael Holz', 'Sales Manager', 'RICSU', null);
INSERT INTO "public"."t_customer" VALUES ('ROMEY', 'Romero y tomillo', 'Gran Vía, 1', 'Madrid', 'NULL', '28001', 'Spain', '(91) 745 6200', '(91) 745 6210', null, null, 'Alejandra Camino', 'Accounting Manager', 'ROMEY', null);
INSERT INTO "public"."t_customer" VALUES ('SANTG', 'Santé Gourmet', 'Erling Skakkes gate 78', 'Stavern', 'NULL', '4110', 'Norway', '07-98 92 35', '07-98 92 47', null, null, 'Jonas Bergulfsen', 'Owner', 'SANTG', null);
INSERT INTO "public"."t_customer" VALUES ('SAVEA', 'Save-a-lot Markets', '187 Suffolk Ln.', 'Boise', 'ID', '83720', 'USA', '(208) 555-8097', 'NULL', null, null, 'Jose Pavarotti', 'Sales Representative', 'SAVEA', null);
INSERT INTO "public"."t_customer" VALUES ('SEVES', 'Seven Seas Imports', '90 Wadhurst Rd.', 'London', 'NULL', 'OX15 4NB', 'UK', '(171) 555-1717', '(171) 555-5646', null, null, 'Hari Kumar', 'Sales Manager', 'SEVES', null);
INSERT INTO "public"."t_customer" VALUES ('SIMOB', 'Simons bistro', 'Vinbæltet 34', 'Kobenhavn', 'NULL', '1734', 'Denmark', '31 12 34 56', '31 13 35 57', null, null, 'Jytte Petersen', 'Owner', 'SIMOB', null);
INSERT INTO "public"."t_customer" VALUES ('SPECD', 'Spécialités du monde', '25, rue Lauriston', 'Paris', 'NULL', '75016', 'France', '(1) 47.55.60.10', '(1) 47.55.60.20', null, null, 'Dominique Perrier', 'Marketing Manager', 'SPECD', null);
INSERT INTO "public"."t_customer" VALUES ('SPLIR', 'Split Rail Beer & Ale', 'P.O. Box 555', 'Lander', 'WY', '82520', 'USA', '(307) 555-4680', '(307) 555-6525', null, null, 'Art Braunschweiger', 'Sales Manager', 'SPLIR', null);
INSERT INTO "public"."t_customer" VALUES ('SUPRD', 'Suprêmes délices', 'Boulevard Tirou, 255', 'Charleroi', 'NULL', 'B-6000', 'Belgium', '(071) 23 67 22 20', '(071) 23 67 22 21', null, null, 'Pascale Cartrain', 'Accounting Manager', 'SUPRD', null);
INSERT INTO "public"."t_customer" VALUES ('THEBI', 'The Big Cheese', '89 Jefferson Way Suite 2', 'Portland', 'OR', '97201', 'USA', '(503) 555-3612', 'NULL', null, null, 'Liz Nixon', 'Marketing Manager', 'THEBI', null);
INSERT INTO "public"."t_customer" VALUES ('THECR', 'The Cracker Box', '55 Grizzly Peak Rd.', 'Butte', 'MT', '59801', 'USA', '(406) 555-5834', '(406) 555-8083', null, null, 'Liu Wong', 'Marketing Assistant', 'THECR', null);
INSERT INTO "public"."t_customer" VALUES ('TOMSP', 'Toms Spezialitäten', 'Luisenstr. 48', 'Münster', 'NULL', '44087', 'Germany', '0251-031259', '0251-035695', null, null, 'Karin Josephs', 'Marketing Manager', 'TOMSP', null);
INSERT INTO "public"."t_customer" VALUES ('TORTU', 'Tortuga Restaurante', 'Avda. Azteca 123', 'México D.F.', 'NULL', '05033', 'Mexico', '(5) 555-2933', 'NULL', null, null, 'Miguel Angel Paolino', 'Owner', 'TORTU', null);
INSERT INTO "public"."t_customer" VALUES ('TRADH', 'Tradição Hipermercados', 'Av. Inês de Castro, 414', 'Sao Paulo', 'SP', '05634-030', 'Brazil', '(11) 555-2167', '(11) 555-2168', null, null, 'Anabela Domingues', 'Sales Representative', 'TRADH', null);
INSERT INTO "public"."t_customer" VALUES ('TRAIH', 'Trail''s Head Gourmet Provisioners', '722 DaVinci Blvd.', 'Kirkland', 'WA', '98034', 'USA', '(206) 555-8257', '(206) 555-2174', null, null, 'Helvetius Nagy', 'Sales Associate', 'TRAIH', null);
INSERT INTO "public"."t_customer" VALUES ('VAFFE', 'Vaffeljernet', 'Smagsloget 45', 'Århus', 'NULL', '8200', 'Denmark', '86 21 32 43', '86 22 33 44', null, null, 'Palle Ibsen', 'Sales Manager', 'VAFFE', null);
INSERT INTO "public"."t_customer" VALUES ('VICTE', 'Victuailles en stock', '2, rue du Commerce', 'Lyon', 'NULL', '69004', 'France', '78.32.54.86', '78.32.54.87', null, null, 'Mary Saveley', 'Sales Agent', 'VICTE', null);
INSERT INTO "public"."t_customer" VALUES ('VINET', 'Vins et alcools Chevalier', '59 rue de l''Abbaye', 'Reims', 'NULL', '51100', 'France', '26.47.15.10', '26.47.15.11', null, null, 'Paul Henriot', 'Accounting Manager', 'VINET', null);
INSERT INTO "public"."t_customer" VALUES ('WANDK', 'Die Wandernde Kuh', 'Adenauerallee 900', 'Stuttgart', 'NULL', '70563', 'Germany', '0711-020361', '0711-035428', null, null, 'Rita Müller', 'Sales Representative', 'WANDK', null);
INSERT INTO "public"."t_customer" VALUES ('WARTH', 'Wartian Herkku', 'Torikatu 38', 'Oulu', 'NULL', '90110', 'Finland', '981-443655', '981-443655', null, null, 'Pirkko Koskitalo', 'Accounting Manager', 'WARTH', null);
INSERT INTO "public"."t_customer" VALUES ('WELLI', 'Wellington Importadora', 'Rua do Mercado, 12', 'Resende', 'SP', '08737-363', 'Brazil', '(14) 555-8122', 'NULL', null, null, 'Paula Parente', 'Sales Manager', 'WELLI', null);
INSERT INTO "public"."t_customer" VALUES ('WHITC', 'White Clover Markets', '305 - 14th Ave. S. Suite 3B', 'Seattle', 'WA', '98128', 'USA', '(206) 555-4112', '(206) 555-4115', null, null, 'Karl Jablonski', 'Owner', 'WHITC', null);
INSERT INTO "public"."t_customer" VALUES ('WILMK', 'Wilman Kala', 'Keskuskatu 45', 'Helsinki', 'NULL', '21240', 'Finland', '90-224 8858', '90-224 8858', null, null, 'Matti Karttunen', 'Owner/Marketing Assistant', 'WILMK', null);
INSERT INTO "public"."t_customer" VALUES ('WOLZA', 'Wolski  Zajazd', 'ul. Filtrowa 68', 'Warszawa', 'NULL', '01-012', 'Poland', '(26) 642-7012', '(26) 642-7012', null, null, 'Zbyszek Piestrzeniewicz', 'Owner', 'WOLZA', null);

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_menu";
CREATE TABLE "public"."t_menu" (
"menuid" varchar(40) COLLATE "default" NOT NULL,
"description" varchar(40) COLLATE "default",
"route" varchar(40) COLLATE "default",
"module" varchar(40) COLLATE "default",
"requiresauthenication" bool,
"menuorder" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO "public"."t_menu" VALUES ('06b0db8f-a340-4b75-9d84-db876a499c3b', 'Home', '#Main/Home', 'Main', 'f', '1');
INSERT INTO "public"."t_menu" VALUES ('1eb866d7-379a-4fe7-b7d0-ffc32fed165d', 'Register', '#Accounts/Register', 'Main', 'f', '3');
INSERT INTO "public"."t_menu" VALUES ('3174a370-d237-413f-bf83-d7a1974db2d0', 'Home', '#Main/Home', 'Main', 't', '6');
INSERT INTO "public"."t_menu" VALUES ('3be27129-e290-4426-b241-f7c5d2c64f32', 'About', '#Main/About', 'Main', 'f', '2');
INSERT INTO "public"."t_menu" VALUES ('3ddefed6-1a18-46fe-b659-9cbcdc5af98d', 'Customer Inquiry', '#Customers/CustomerInquiry', 'Customers', 't', '1');
INSERT INTO "public"."t_menu" VALUES ('406054fd-0c5c-4ad7-a0b2-eb52058b424c', 'Logout', '#Accounts/Logout', 'Main', 't', '5');
INSERT INTO "public"."t_menu" VALUES ('41bbdca7-763a-4f29-befc-1d9e2dbcbe78', 'Order Inquiry', '#Orders/OrderInquiry', 'Orders', 't', '2');
INSERT INTO "public"."t_menu" VALUES ('5b1da2cd-286c-4451-948b-ec69fb363979', 'Orders', '#Orders/OrderEntryCustomerInquiry', 'Main', 't', '2');
INSERT INTO "public"."t_menu" VALUES ('5cd361b5-4624-4a2e-a496-6c96c41bb337', 'About', '#Main/About', 'Main', 't', '7');
INSERT INTO "public"."t_menu" VALUES ('63705e1c-9be5-4198-95a6-149e2558934d', 'Order Entry', '#Orders/OrderEntryCustomerInquiry', 'Orders', 't', '1');
INSERT INTO "public"."t_menu" VALUES ('644e707e-df8b-436c-896b-900273164229', 'Product Maintenance', '#Products/ProductMaintenance', 'Products', 't', '2');
INSERT INTO "public"."t_menu" VALUES ('6cbb859a-83fb-4833-b8eb-d90044551c4a', 'Customers', '#Customers/CustomerInquiry', 'Main', 't', '1');
INSERT INTO "public"."t_menu" VALUES ('75586eda-bfd1-4f7b-a7f8-391c185900c2', 'Product Inquiry', '#Products/ProductInquiry', 'Products', 't', '1');
INSERT INTO "public"."t_menu" VALUES ('859123bf-c663-4612-95fa-8eb016f1d683', 'Products', '#Products/ProductInquiry', 'Main', 't', '3');
INSERT INTO "public"."t_menu" VALUES ('927fa02a-17c8-4045-af53-d14c115465d6', 'My Account', '#Accounts/MyAccount', 'Main', 't', '4');
INSERT INTO "public"."t_menu" VALUES ('aefdfe3b-479c-444b-88fe-9bbc67e2dda2', 'Import Product Test Data', '#Products/ImportProducts', 'Products', 't', '4');
INSERT INTO "public"."t_menu" VALUES ('b4883db7-0319-4356-93f8-ae9d4b0b6b45', 'Login', '#Accounts/Login', 'Main', 'f', '4');
INSERT INTO "public"."t_menu" VALUES ('ba12b379-65a9-4630-aff8-2de785adbd7f', 'Import Customer Test Data', '#Customers/ImportCustomers', 'Customers', 't', '3');
INSERT INTO "public"."t_menu" VALUES ('f250364e-a4fd-4e3d-9a46-d9cd47eee303', 'Customer Maintenance', '#Customers/CustomerMaintenance', 'Customers', 't', '2');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_order";
CREATE TABLE "public"."t_order" (
"orderid" varchar(40) COLLATE "default" NOT NULL,
"customerid" varchar(40) COLLATE "default" NOT NULL,
"orderdate" date,
"requireddate" date,
"shipvia" varchar(40) COLLATE "default",
"shipname" varchar(40) COLLATE "default",
"shipaddress" varchar(40) COLLATE "default",
"shipcity" varchar(40) COLLATE "default",
"shipregion" varchar(40) COLLATE "default",
"shippostalcode" varchar(40) COLLATE "default",
"shipcountry" varchar(40) COLLATE "default",
"ordertotal" float8,
"dateupdated" date
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_order
-- ----------------------------

-- ----------------------------
-- Table structure for t_orderdetail
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_orderdetail";
CREATE TABLE "public"."t_orderdetail" (
"orderdetailid" varchar(40) COLLATE "default" NOT NULL,
"orderid" varchar(40) COLLATE "default" NOT NULL,
"lineitemnumber" int4,
"productid" varchar(40) COLLATE "default" NOT NULL,
"quantity" int4,
"datecreated" date,
"dateupdated" date
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_orderdetail
-- ----------------------------

-- ----------------------------
-- Table structure for t_product
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_product";
CREATE TABLE "public"."t_product" (
"productid" varchar(40) COLLATE "default" NOT NULL,
"productname" varchar(255) COLLATE "default",
"description" varchar(40) COLLATE "default",
"unitprice" numeric,
"unitofmeasure" varchar(40) COLLATE "default",
"datecreated" date,
"dateupdated" date,
"supplierid" varchar(40) COLLATE "default",
"categoryid" varchar(40) COLLATE "default",
"quantityperunit" varchar(40) COLLATE "default",
"unitsinstock" varchar(40) COLLATE "default",
"unitsonorder" varchar(40) COLLATE "default",
"reorderlevel" varchar(40) COLLATE "default",
"discontinued" varchar(40) COLLATE "default",
"productcode" varchar(255) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_product
-- ----------------------------
INSERT INTO "public"."t_product" VALUES ('1', 'Chai', 'Chai', '18.00', '10 boxes x 20 bags', null, null, '1', '1', '10 boxes x 20 bags', '39', '0', '10', '0', '1');
INSERT INTO "public"."t_product" VALUES ('10', 'Ikura', 'Ikura', '31.00', '12 - 200 ml jars', null, null, '4', '8', '12 - 200 ml jars', '31', '0', '0', '0', '10');
INSERT INTO "public"."t_product" VALUES ('11', 'Queso Cabrales', 'Queso Cabrales', '21.00', '1 kg pkg.', null, null, '5', '4', '1 kg pkg.', '22', '30', '30', '0', '11');
INSERT INTO "public"."t_product" VALUES ('12', 'Queso Manchego La Pastora', 'Queso Manchego La Pastora', '38.00', '10 - 500 g pkgs.', null, null, '5', '4', '10 - 500 g pkgs.', '86', '0', '0', '0', '12');
INSERT INTO "public"."t_product" VALUES ('13', 'Konbu', 'Konbu', '6.00', '2 kg box', null, null, '6', '8', '2 kg box', '24', '0', '5', '0', '13');
INSERT INTO "public"."t_product" VALUES ('14', 'Tofu', 'Tofu', '23.25', '40 - 100 g pkgs.', null, null, '6', '7', '40 - 100 g pkgs.', '35', '0', '0', '0', '14');
INSERT INTO "public"."t_product" VALUES ('15', 'Genen Shouyu', 'Genen Shouyu', '15.50', '24 - 250 ml bottles', null, null, '6', '2', '24 - 250 ml bottles', '39', '0', '5', '0', '15');
INSERT INTO "public"."t_product" VALUES ('16', 'Pavlova', 'Pavlova', '17.45', '32 - 500 g boxes', null, null, '7', '3', '32 - 500 g boxes', '29', '0', '10', '0', '16');
INSERT INTO "public"."t_product" VALUES ('17', 'Alice Mutton', 'Alice Mutton', '39.00', '20 - 1 kg tins', null, null, '7', '6', '20 - 1 kg tins', '0', '0', '0', '1', '17');
INSERT INTO "public"."t_product" VALUES ('18', 'Carnarvon Tigers', 'Carnarvon Tigers', '62.50', '16 kg pkg.', null, null, '7', '8', '16 kg pkg.', '42', '0', '0', '0', '18');
INSERT INTO "public"."t_product" VALUES ('19', 'Teatime Chocolate Biscuits', 'Teatime Chocolate Biscuits', '9.20', '10 boxes x 12 pieces', null, null, '8', '3', '10 boxes x 12 pieces', '25', '0', '5', '0', '19');
INSERT INTO "public"."t_product" VALUES ('2', 'Chang', 'Chang', '19.00', '24 - 12 oz bottles', null, null, '1', '1', '24 - 12 oz bottles', '17', '40', '25', '0', '2');
INSERT INTO "public"."t_product" VALUES ('20', 'Sir Rodney''s Marmalade', 'Sir Rodney''s Marmalade', '81.00', '30 gift boxes', null, null, '8', '3', '30 gift boxes', '40', '0', '0', '0', '20');
INSERT INTO "public"."t_product" VALUES ('21', 'Sir Rodney''s Scones', 'Sir Rodney''s Scones', '10.00', '24 pkgs. x 4 pieces', null, null, '8', '3', '24 pkgs. x 4 pieces', '3', '40', '5', '0', '21');
INSERT INTO "public"."t_product" VALUES ('22', 'Gustaf''s Knäckebröd', 'Gustaf''s Knäckebröd', '21.00', '24 - 500 g pkgs.', null, null, '9', '5', '24 - 500 g pkgs.', '104', '0', '25', '0', '22');
INSERT INTO "public"."t_product" VALUES ('23', 'Tunnbröd', 'Tunnbröd', '9.00', '12 - 250 g pkgs.', null, null, '9', '5', '12 - 250 g pkgs.', '61', '0', '25', '0', '23');
INSERT INTO "public"."t_product" VALUES ('24', 'Guaraná Fantástica', 'Guaraná Fantástica', '4.50', '12 - 355 ml cans', null, null, '10', '1', '12 - 355 ml cans', '20', '0', '0', '1', '24');
INSERT INTO "public"."t_product" VALUES ('25', 'NuNuCa Nuß-Nougat-Creme', 'NuNuCa Nuß-Nougat-Creme', '14.00', '20 - 450 g glasses', null, null, '11', '3', '20 - 450 g glasses', '76', '0', '30', '0', '25');
INSERT INTO "public"."t_product" VALUES ('26', 'Gumbär Gummibärchen', 'Gumbär Gummibärchen', '31.23', '100 - 250 g bags', null, null, '11', '3', '100 - 250 g bags', '15', '0', '0', '0', '26');
INSERT INTO "public"."t_product" VALUES ('27', 'Schoggi Schokolade', 'Schoggi Schokolade', '43.90', '100 - 100 g pieces', null, null, '11', '3', '100 - 100 g pieces', '49', '0', '30', '0', '27');
INSERT INTO "public"."t_product" VALUES ('28', 'Rössle Sauerkraut', 'Rössle Sauerkraut', '45.60', '25 - 825 g cans', null, null, '12', '7', '25 - 825 g cans', '26', '0', '0', '1', '28');
INSERT INTO "public"."t_product" VALUES ('29', 'Thüringer Rostbratwurst', 'Thüringer Rostbratwurst', '123.79', '50 bags x 30 sausgs.', null, null, '12', '6', '50 bags x 30 sausgs.', '0', '0', '0', '1', '29');
INSERT INTO "public"."t_product" VALUES ('3', 'Aniseed Syrup', 'Aniseed Syrup', '10.00', '12 - 550 ml bottles', null, null, '1', '2', '12 - 550 ml bottles', '13', '70', '25', '0', '3');
INSERT INTO "public"."t_product" VALUES ('30', 'Nord-Ost Matjeshering', 'Nord-Ost Matjeshering', '25.89', '10 - 200 g glasses', null, null, '13', '8', '10 - 200 g glasses', '10', '0', '15', '0', '30');
INSERT INTO "public"."t_product" VALUES ('31', 'Gorgonzola Telino', 'Gorgonzola Telino', '12.50', '12 - 100 g pkgs', null, null, '14', '4', '12 - 100 g pkgs', '0', '70', '20', '0', '31');
INSERT INTO "public"."t_product" VALUES ('32', 'Mascarpone Fabioli', 'Mascarpone Fabioli', '32.00', '24 - 200 g pkgs.', null, null, '14', '4', '24 - 200 g pkgs.', '9', '40', '25', '0', '32');
INSERT INTO "public"."t_product" VALUES ('33', 'Geitost', 'Geitost', '2.50', '500 g', null, null, '15', '4', '500 g', '112', '0', '20', '0', '33');
INSERT INTO "public"."t_product" VALUES ('34', 'Sasquatch Ale', 'Sasquatch Ale', '14.00', '24 - 12 oz bottles', null, null, '16', '1', '24 - 12 oz bottles', '111', '0', '15', '0', '34');
INSERT INTO "public"."t_product" VALUES ('35', 'Steeleye Stout', 'Steeleye Stout', '18.00', '24 - 12 oz bottles', null, null, '16', '1', '24 - 12 oz bottles', '20', '0', '15', '0', '35');
INSERT INTO "public"."t_product" VALUES ('36', 'Inlagd Sill', 'Inlagd Sill', '19.00', '24 - 250 g  jars', null, null, '17', '8', '24 - 250 g  jars', '112', '0', '20', '0', '36');
INSERT INTO "public"."t_product" VALUES ('37', 'Gravad lax', 'Gravad lax', '26.00', '12 - 500 g pkgs.', null, null, '17', '8', '12 - 500 g pkgs.', '11', '50', '25', '0', '37');
INSERT INTO "public"."t_product" VALUES ('38', 'Côte de Blaye', 'Côte de Blaye', '263.50', '12 - 75 cl bottles', null, null, '18', '1', '12 - 75 cl bottles', '17', '0', '15', '0', '38');
INSERT INTO "public"."t_product" VALUES ('39', 'Chartreuse verte', 'Chartreuse verte', '18.00', '750 cc per bottle', null, null, '18', '1', '750 cc per bottle', '69', '0', '5', '0', '39');
INSERT INTO "public"."t_product" VALUES ('4', 'Chef Anton''s Cajun Seasoning', 'Chef Anton''s Cajun Seasoning', '22.00', '48 - 6 oz jars', null, null, '2', '2', '48 - 6 oz jars', '53', '0', '0', '0', '4');
INSERT INTO "public"."t_product" VALUES ('40', 'Boston Crab Meat', 'Boston Crab Meat', '18.40', '24 - 4 oz tins', null, null, '19', '8', '24 - 4 oz tins', '123', '0', '30', '0', '40');
INSERT INTO "public"."t_product" VALUES ('41', 'Jack''s New England Clam Chowder', 'Jack''s New England Clam Chowder', '9.65', '12 - 12 oz cans', null, null, '19', '8', '12 - 12 oz cans', '85', '0', '10', '0', '41');
INSERT INTO "public"."t_product" VALUES ('42', 'Singaporean Hokkien Fried Mee', 'Singaporean Hokkien Fried Mee', '14.00', '32 - 1 kg pkgs.', null, null, '20', '5', '32 - 1 kg pkgs.', '26', '0', '0', '1', '42');
INSERT INTO "public"."t_product" VALUES ('43', 'Ipoh Coffee', 'Ipoh Coffee', '46.00', '16 - 500 g tins', null, null, '20', '1', '16 - 500 g tins', '17', '10', '25', '0', '43');
INSERT INTO "public"."t_product" VALUES ('44', 'Gula Malacca', 'Gula Malacca', '19.45', '20 - 2 kg bags', null, null, '20', '2', '20 - 2 kg bags', '27', '0', '15', '0', '44');
INSERT INTO "public"."t_product" VALUES ('45', 'Rogede sild', 'Rogede sild', '9.50', '1k pkg.', null, null, '21', '8', '1k pkg.', '5', '70', '15', '0', '45');
INSERT INTO "public"."t_product" VALUES ('46', 'Spegesild', 'Spegesild', '12.00', '4 - 450 g glasses', null, null, '21', '8', '4 - 450 g glasses', '95', '0', '0', '0', '46');
INSERT INTO "public"."t_product" VALUES ('47', 'Zaanse koeken', 'Zaanse koeken', '9.50', '10 - 4 oz boxes', null, null, '22', '3', '10 - 4 oz boxes', '36', '0', '0', '0', '47');
INSERT INTO "public"."t_product" VALUES ('48', 'Chocolade', 'Chocolade', '12.75', '10 pkgs.', null, null, '22', '3', '10 pkgs.', '15', '70', '25', '0', '48');
INSERT INTO "public"."t_product" VALUES ('49', 'Maxilaku', 'Maxilaku', '20.00', '24 - 50 g pkgs.', null, null, '23', '3', '24 - 50 g pkgs.', '10', '60', '15', '0', '49');
INSERT INTO "public"."t_product" VALUES ('5', 'Chef Anton''s Gumbo Mix', 'Chef Anton''s Gumbo Mix', '21.35', '36 boxes', null, null, '2', '2', '36 boxes', '0', '0', '0', '1', '5');
INSERT INTO "public"."t_product" VALUES ('50', 'Valkoinen suklaa', 'Valkoinen suklaa', '16.25', '12 - 100 g bars', null, null, '23', '3', '12 - 100 g bars', '65', '0', '30', '0', '50');
INSERT INTO "public"."t_product" VALUES ('51', 'Manjimup Dried Apples', 'Manjimup Dried Apples', '53.00', '50 - 300 g pkgs.', null, null, '24', '7', '50 - 300 g pkgs.', '20', '0', '10', '0', '51');
INSERT INTO "public"."t_product" VALUES ('52', 'Filo Mix', 'Filo Mix', '7.00', '16 - 2 kg boxes', null, null, '24', '5', '16 - 2 kg boxes', '38', '0', '25', '0', '52');
INSERT INTO "public"."t_product" VALUES ('53', 'Perth Pasties', 'Perth Pasties', '32.80', '48 pieces', null, null, '24', '6', '48 pieces', '0', '0', '0', '1', '53');
INSERT INTO "public"."t_product" VALUES ('54', 'Tourtière', 'Tourtière', '7.45', '16 pies', null, null, '25', '6', '16 pies', '21', '0', '10', '0', '54');
INSERT INTO "public"."t_product" VALUES ('55', 'Pâté chinois', 'Pâté chinois', '24.00', '24 boxes x 2 pies', null, null, '25', '6', '24 boxes x 2 pies', '115', '0', '20', '0', '55');
INSERT INTO "public"."t_product" VALUES ('56', 'Gnocchi di nonna Alice', 'Gnocchi di nonna Alice', '38.00', '24 - 250 g pkgs.', null, null, '26', '5', '24 - 250 g pkgs.', '21', '10', '30', '0', '56');
INSERT INTO "public"."t_product" VALUES ('57', 'Ravioli Angelo', 'Ravioli Angelo', '19.50', '24 - 250 g pkgs.', null, null, '26', '5', '24 - 250 g pkgs.', '36', '0', '20', '0', '57');
INSERT INTO "public"."t_product" VALUES ('58', 'Escargots de Bourgogne', 'Escargots de Bourgogne', '13.25', '24 pieces', null, null, '27', '8', '24 pieces', '62', '0', '20', '0', '58');
INSERT INTO "public"."t_product" VALUES ('59', 'Raclette Courdavault', 'Raclette Courdavault', '55.00', '5 kg pkg.', null, null, '28', '4', '5 kg pkg.', '79', '0', '0', '0', '59');
INSERT INTO "public"."t_product" VALUES ('6', 'Grandma''s Boysenberry Spread', 'Grandma''s Boysenberry Spread', '25.00', '12 - 8 oz jars', null, null, '3', '2', '12 - 8 oz jars', '120', '0', '25', '0', '6');
INSERT INTO "public"."t_product" VALUES ('60', 'Camembert Pierrot', 'Camembert Pierrot', '34.00', '15 - 300 g rounds', null, null, '28', '4', '15 - 300 g rounds', '19', '0', '0', '0', '60');
INSERT INTO "public"."t_product" VALUES ('61', 'Sirop d''érable', 'Sirop d''érable', '28.50', '24 - 500 ml bottles', null, null, '29', '2', '24 - 500 ml bottles', '113', '0', '25', '0', '61');
INSERT INTO "public"."t_product" VALUES ('62', 'Tarte au sucre', 'Tarte au sucre', '49.30', '48 pies', null, null, '29', '3', '48 pies', '17', '0', '0', '0', '62');
INSERT INTO "public"."t_product" VALUES ('63', 'Vegie-spread', 'Vegie-spread', '43.90', '15 - 625 g jars', null, null, '7', '2', '15 - 625 g jars', '24', '0', '5', '0', '63');
INSERT INTO "public"."t_product" VALUES ('64', 'Wimmers gute Semmelknödel', 'Wimmers gute Semmelknödel', '33.25', '20 bags x 4 pieces', null, null, '12', '5', '20 bags x 4 pieces', '22', '80', '30', '0', '64');
INSERT INTO "public"."t_product" VALUES ('65', 'Louisiana Fiery Hot Pepper Sauce', 'Louisiana Fiery Hot Pepper Sauce', '21.05', '32 - 8 oz bottles', null, null, '2', '2', '32 - 8 oz bottles', '76', '0', '0', '0', '65');
INSERT INTO "public"."t_product" VALUES ('66', 'Louisiana Hot Spiced Okra', 'Louisiana Hot Spiced Okra', '17.00', '24 - 8 oz jars', null, null, '2', '2', '24 - 8 oz jars', '4', '100', '20', '0', '66');
INSERT INTO "public"."t_product" VALUES ('67', 'Laughing Lumberjack Lager', 'Laughing Lumberjack Lager', '14.00', '24 - 12 oz bottles', null, null, '16', '1', '24 - 12 oz bottles', '52', '0', '10', '0', '67');
INSERT INTO "public"."t_product" VALUES ('68', 'Scottish Longbreads', 'Scottish Longbreads', '12.50', '10 boxes x 8 pieces', null, null, '8', '3', '10 boxes x 8 pieces', '6', '10', '15', '0', '68');
INSERT INTO "public"."t_product" VALUES ('69', 'Gudbrandsdalsost', 'Gudbrandsdalsost', '36.00', '10 kg pkg.', null, null, '15', '4', '10 kg pkg.', '26', '0', '15', '0', '69');
INSERT INTO "public"."t_product" VALUES ('7', 'Uncle Bob''s Organic Dried Pears', 'Uncle Bob''s Organic Dried Pears', '30.00', '12 - 1 lb pkgs.', null, null, '3', '7', '12 - 1 lb pkgs.', '15', '0', '10', '0', '7');
INSERT INTO "public"."t_product" VALUES ('70', 'Outback Lager', 'Outback Lager', '15.00', '24 - 355 ml bottles', null, null, '7', '1', '24 - 355 ml bottles', '15', '10', '30', '0', '70');
INSERT INTO "public"."t_product" VALUES ('71', 'Flotemysost', 'Flotemysost', '21.50', '10 - 500 g pkgs.', null, null, '15', '4', '10 - 500 g pkgs.', '26', '0', '0', '0', '71');
INSERT INTO "public"."t_product" VALUES ('72', 'Mozzarella di Giovanni', 'Mozzarella di Giovanni', '34.80', '24 - 200 g pkgs.', null, null, '14', '4', '24 - 200 g pkgs.', '14', '0', '0', '0', '72');
INSERT INTO "public"."t_product" VALUES ('73', 'Röd Kaviar', 'Röd Kaviar', '15.00', '24 - 150 g jars', null, null, '17', '8', '24 - 150 g jars', '101', '0', '5', '0', '73');
INSERT INTO "public"."t_product" VALUES ('74', 'Longlife Tofu', 'Longlife Tofu', '10.00', '5 kg pkg.', null, null, '4', '7', '5 kg pkg.', '4', '20', '5', '0', '74');
INSERT INTO "public"."t_product" VALUES ('75', 'Rhönbräu Klosterbier', 'Rhönbräu Klosterbier', '7.75', '24 - 0.5 l bottles', null, null, '12', '1', '24 - 0.5 l bottles', '125', '0', '25', '0', '75');
INSERT INTO "public"."t_product" VALUES ('76', 'Lakkalikööri', 'Lakkalikööri', '18.00', '500 ml', null, null, '23', '1', '500 ml', '57', '0', '20', '0', '76');
INSERT INTO "public"."t_product" VALUES ('77', 'Original Frankfurter grüne Soße', 'Original Frankfurter grüne Soße', '13.00', '12 boxes', null, null, '12', '2', '12 boxes', '32', '0', '15', '0', '77');
INSERT INTO "public"."t_product" VALUES ('8', 'Northwoods Cranberry Sauce', 'Northwoods Cranberry Sauce', '40.00', '12 - 12 oz jars', null, null, '3', '2', '12 - 12 oz jars', '6', '0', '0', '0', '8');
INSERT INTO "public"."t_product" VALUES ('9', 'Mishi Kobe Niku', 'Mishi Kobe Niku', '97.00', '18 - 500 g pkgs.', null, null, '4', '6', '18 - 500 g pkgs.', '29', '0', '0', '1', '9');

-- ----------------------------
-- Table structure for t_shipper
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_shipper";
CREATE TABLE "public"."t_shipper" (
"shipperid" varchar(40) COLLATE "default" NOT NULL,
"shippername" varchar(40) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_shipper
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS "public"."t_user";
CREATE TABLE "public"."t_user" (
"userid" varchar(40) COLLATE "default" NOT NULL,
"username" varchar(40) COLLATE "default",
"firstname" varchar(40) COLLATE "default",
"lastname" varchar(40) COLLATE "default",
"password" varchar(40) COLLATE "default",
"emailaddress" varchar(40) COLLATE "default",
"defaultpage" varchar(40) COLLATE "default",
"datecreated" date,
"dateupdated" date,
"datelastlogin" date
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO "public"."t_user" VALUES ('66dc9f13-82ef-44a0-bafa-3fb62d57f558', 'test', 'Wee', 'Cai', 'test', 'mignetwee@gmail.com', null, null, null, null);

-- ----------------------------
-- Table structure for tsys_permission
-- ----------------------------
DROP TABLE IF EXISTS "public"."tsys_permission";
CREATE TABLE "public"."tsys_permission" (
"id" int4 DEFAULT nextval('seq_permission_id'::regclass) NOT NULL,
"permission_name" varchar(32) COLLATE "default",
"permission_sign" varchar(128) COLLATE "default",
"description" varchar(256) COLLATE "default"
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."tsys_permission" IS '权限表';
COMMENT ON COLUMN "public"."tsys_permission"."id" IS '权限id';
COMMENT ON COLUMN "public"."tsys_permission"."permission_name" IS '权限名';
COMMENT ON COLUMN "public"."tsys_permission"."permission_sign" IS '权限标识,程序中判断使用,如"user:create"';
COMMENT ON COLUMN "public"."tsys_permission"."description" IS '权限描述,UI界面显示使用';

-- ----------------------------
-- Records of tsys_permission
-- ----------------------------
INSERT INTO "public"."tsys_permission" VALUES ('1', '用户新增', 'user:create', '新增用户');

-- ----------------------------
-- Table structure for tsys_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."tsys_role";
CREATE TABLE "public"."tsys_role" (
"id" int4 DEFAULT nextval('seq_role_id'::regclass) NOT NULL,
"role_name" varchar(32) COLLATE "default",
"role_sign" varchar(128) COLLATE "default",
"description" varchar(256) COLLATE "default"
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."tsys_role" IS '角色表';
COMMENT ON COLUMN "public"."tsys_role"."id" IS '角色id';
COMMENT ON COLUMN "public"."tsys_role"."role_name" IS '角色名';
COMMENT ON COLUMN "public"."tsys_role"."role_sign" IS '角色标识,程序中判断使用,如"admin"';
COMMENT ON COLUMN "public"."tsys_role"."description" IS '角色描述,UI界面显示使用';

-- ----------------------------
-- Records of tsys_role
-- ----------------------------
INSERT INTO "public"."tsys_role" VALUES ('1', 'admin', 'admin', '管理员');

-- ----------------------------
-- Table structure for tsys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS "public"."tsys_role_permission";
CREATE TABLE "public"."tsys_role_permission" (
"id" int4 DEFAULT nextval('seq_role_permission_id'::regclass) NOT NULL,
"role_id" numeric(20),
"permission_id" numeric(20)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."tsys_role_permission" IS '角色与权限关联表';
COMMENT ON COLUMN "public"."tsys_role_permission"."id" IS '表id';
COMMENT ON COLUMN "public"."tsys_role_permission"."role_id" IS '角色id';
COMMENT ON COLUMN "public"."tsys_role_permission"."permission_id" IS '权限id';

-- ----------------------------
-- Records of tsys_role_permission
-- ----------------------------
INSERT INTO "public"."tsys_role_permission" VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for tsys_user
-- ----------------------------
DROP TABLE IF EXISTS "public"."tsys_user";
CREATE TABLE "public"."tsys_user" (
"id" int4 DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
"username" varchar(50) COLLATE "default",
"password" char(64) COLLATE "default",
"state" varchar(32) COLLATE "default",
"create_time" date,
"firstname" varchar(40) COLLATE "default",
"lastname" varchar(40) COLLATE "default",
"emailaddress" varchar(40) COLLATE "default",
"update_time" date,
"lastlogin_time" date
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."tsys_user" IS '用户表';
COMMENT ON COLUMN "public"."tsys_user"."id" IS '用户id';
COMMENT ON COLUMN "public"."tsys_user"."username" IS '用户名';
COMMENT ON COLUMN "public"."tsys_user"."password" IS '密码';
COMMENT ON COLUMN "public"."tsys_user"."state" IS '状态';
COMMENT ON COLUMN "public"."tsys_user"."create_time" IS '创建时间';

-- ----------------------------
-- Records of tsys_user
-- ----------------------------
INSERT INTO "public"."tsys_user" VALUES ('1', 'kermit', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', null, '2014-07-17', null, null, null, null, null);

-- ----------------------------
-- Table structure for tsys_user_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."tsys_user_role";
CREATE TABLE "public"."tsys_user_role" (
"id" int4 DEFAULT nextval('seq_user_role_id'::regclass) NOT NULL,
"user_id" numeric(20),
"role_id" numeric(20)
)
WITH (OIDS=FALSE)

;
COMMENT ON TABLE "public"."tsys_user_role" IS '用户与角色关联表';
COMMENT ON COLUMN "public"."tsys_user_role"."id" IS '表id';
COMMENT ON COLUMN "public"."tsys_user_role"."user_id" IS '用户id';
COMMENT ON COLUMN "public"."tsys_user_role"."role_id" IS '角色id';

-- ----------------------------
-- Records of tsys_user_role
-- ----------------------------
INSERT INTO "public"."tsys_user_role" VALUES ('1', '1', '1');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
ALTER SEQUENCE "public"."seq_permission_id" OWNED BY "tsys_permission"."id";
ALTER SEQUENCE "public"."seq_role_id" OWNED BY "tsys_role"."id";
ALTER SEQUENCE "public"."seq_role_permission_id" OWNED BY "tsys_role_permission"."id";
ALTER SEQUENCE "public"."seq_user_id" OWNED BY "tsys_user"."id";
ALTER SEQUENCE "public"."seq_user_role_id" OWNED BY "tsys_user_role"."id";

-- ----------------------------
-- Primary Key structure for table t_customer
-- ----------------------------
ALTER TABLE "public"."t_customer" ADD PRIMARY KEY ("customerid");

-- ----------------------------
-- Primary Key structure for table t_menu
-- ----------------------------
ALTER TABLE "public"."t_menu" ADD PRIMARY KEY ("menuid");

-- ----------------------------
-- Primary Key structure for table t_order
-- ----------------------------
ALTER TABLE "public"."t_order" ADD PRIMARY KEY ("orderid");

-- ----------------------------
-- Primary Key structure for table t_orderdetail
-- ----------------------------
ALTER TABLE "public"."t_orderdetail" ADD PRIMARY KEY ("orderdetailid");

-- ----------------------------
-- Primary Key structure for table t_product
-- ----------------------------
ALTER TABLE "public"."t_product" ADD PRIMARY KEY ("productid");

-- ----------------------------
-- Primary Key structure for table t_shipper
-- ----------------------------
ALTER TABLE "public"."t_shipper" ADD PRIMARY KEY ("shipperid");

-- ----------------------------
-- Primary Key structure for table t_user
-- ----------------------------
ALTER TABLE "public"."t_user" ADD PRIMARY KEY ("userid");

-- ----------------------------
-- Primary Key structure for table tsys_permission
-- ----------------------------
ALTER TABLE "public"."tsys_permission" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table tsys_role
-- ----------------------------
ALTER TABLE "public"."tsys_role" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table tsys_role_permission
-- ----------------------------
ALTER TABLE "public"."tsys_role_permission" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table tsys_user
-- ----------------------------
ALTER TABLE "public"."tsys_user" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table tsys_user_role
-- ----------------------------
ALTER TABLE "public"."tsys_user_role" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Foreign Key structure for table "public"."t_order"
-- ----------------------------
ALTER TABLE "public"."t_order" ADD FOREIGN KEY ("customerid") REFERENCES "public"."t_customer" ("customerid") ON DELETE NO ACTION ON UPDATE NO ACTION;
