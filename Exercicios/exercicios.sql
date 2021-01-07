create database loja_online;

use loja_online;

create table cliente(
	id_cliente int primary key auto_increment,
    nome varchar(50),
    cpf varchar(14) unique,
    rg varchar(14),
    email varchar(100) unique
) engine = InnoDB;

insert into cliente (nome, cpf, rg, email) values("João da Silva",  "524.628.674-52", "25.623.184-12", "jsilva96@gmail.com");
insert into cliente (nome, cpf, rg, email) values("Maria Emilia", "448.236.764-28", "48.354.658-69", "emy_ma@gmail.com");
insert into cliente values(null, "José Benevides", "658.321.879-85", "32.854.898-44", "bene_87@gmail.com");

alter table cliente add column nascimento date;

create table telefone(
	ddd varchar(2) not null,
    numero varchar(10) not null,
    fk_id_cliente int not null,
    foreign key (fk_id_cliente) references cliente(id_cliente)
) engine = InnoDB;

insert into telefone values("25", "988457125", 1);
insert into telefone values("16", "991782541", 1);
insert into telefone values("51", "981571152", 2);
insert into telefone values("86", "998825416", 3);

CREATE TABLE `produto` (
  `id_produto` int NOT NULL auto_increment,
  `nome` varchar(70) NOT NULL,
  `descricao` text NOT NULL,
  `estoque` int NOT NULL,
  `preco` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE=InnoDB;

/*Data for the table `products` */

insert  into `produto`(`nome`,`descricao`,`estoque`,`preco`) values 

('1969 Harley Davidson Ultimate Chopper' ,'This replica features working kickstand, front suspension, gear-shift lever, footbrake lever, drive chain, wheels and steering. All parts are particularly delicate due to their precise scale and require special care and attention.',33,'20810.00'),

('1952 Alpine Renault 1300','Turnable front wheels; steering function; detailed interior; detailed engine; opening hood; opening trunk; opening doors; and detailed chassis.',73,'21430.00'),

('1996 Moto Guzzi 1100i','Official Moto Guzzi logos and insignias, saddle bags located on side of motorcycle, detailed engine, working steering, working suspension, two leather seats, luggage rack, dual exhaust pipes, small saddle bag located on handle bars, two-tone paint with chrome accents, superior die-cast detail , rotating wheels , working kick stand, diecast metal with plastic parts and baked enamel finish.',25,'11894.00'),

('2003 Harley-Davidson Eagle Drag Bike','Model features, official Harley Davidson logos and insignias, detachable rear wheelie bar, heavy diecast metal with resin parts, authentic multi-color tampo-printed graphics, separate engine drive belts, free-turning front fork, rotating tires and rear racing slick, certificate of authenticity, detailed engine, display stand\r\n, precision diecast replica, baked enamel finish, 1:10 scale model, removable fender, seat and tank cover piece for displaying the superior detail of the v-twin engine',55,'19360.00'),

('1972 Alfa Romeo GTA','Features include: Turnable front wheels; steering function; detailed interior; detailed engine; opening hood; opening trunk; opening doors; and detailed chassis.',32,'13600.00'),

('1962 LanciaA Delta 16V','Features include: Turnable front wheels; steering function; detailed interior; detailed engine; opening hood; opening trunk; opening doors; and detailed chassis.',67,'14774.00'),

('1968 Ford Mustang','Hood, doors and trunk all open to reveal highly detailed interior features. Steering wheel actually turns the front wheels. Color dark green.',68,'19457.00'),

('2001 Ferrari Enzo','Turnable front wheels; steering function; detailed interior; detailed engine; opening hood; opening trunk; opening doors; and detailed chassis.',36,'20780.00'),

('1958 Setra Bus','Model features 30 windows, skylights & glare resistant glass, working steering system, original logos',15,'13667.00'),

('2002 Suzuki XREO','Official logos and insignias, saddle bags located on side of motorcycle, detailed engine, working steering, working suspension, two leather seats, luggage rack, dual exhaust pipes, small saddle bag located on handle bars, two-tone paint with chrome accents, superior die-cast detail , rotating wheels , working kick stand, diecast metal with plastic parts and baked enamel finish.',99,'15062.00'),

('1969 Corvair Monza','1:18 scale die-cast about 10\" long doors open, hood opens, trunk opens and wheels roll','22', '15108.00'),

('1968 Dodge Charger','1:12 scale model of a 1968 Dodge Charger. Hood, doors and trunk all open to reveal highly detailed interior features. Steering wheel actually turns the front wheels. Color black',91,'11744.00'),

('1969 Ford Falcon','Turnable front wheels; steering function; detailed interior; detailed engine; opening hood; opening trunk; opening doors; and detailed chassis.',10,'17302'),

('1970 Plymouth Hemi Cuda','Very detailed 1970 Plymouth Cuda model in 1:12 scale. The Cuda is generally accepted as one of the fastest original muscle cars from the 1970s. This model is a reproduction of one of the orginal 652 cars built in 1970. Red color.',56,'7980'),

('1957 Chevy Pickup','1:12 scale die-cast about 20\" long Hood opens, Rubber wheels',61,'11850'),

('1969 Dodge Charger','Detailed model of the 1969 Dodge Charger. This model includes finely detailed interior and exterior features. Painted in red and white.',73,'11516'),

('1940 Ford Pickup Truck','This model features soft rubber tires, working steering, rubber mud guards, authentic Ford logos, detailed undercarriage, opening doors and hood,  removable split rear gate, full size spare mounted in bed, detailed interior with opening glove box',26,'11667'),

('1993 Mazda RX-7','This model features, opening hood, opening doors, detailed engine, rear spoiler, opening trunk, working steering, tinted windows, baked enamel finish. Color red.',39,'14154'),

('1937 Lincoln Berline','Features opening engine cover, doors, trunk, and fuel filler cap. Color black',86,'10274'),

('1936 Mercedes-Benz 500K Special Roadster','This 1:18 scale replica is constructed of heavy die-cast metal and has all the features of the original: working doors and rumble seat, independent spring suspension, detailed interior, working steering system, and a bifold hood that reveals an engine so accurate that it even includes the wiring. All this is topped off with a baked enamel finish. Color white.',86,'5391'),

('1965 Aston Martin DB5','Die-cast model of the silver 1965 Aston Martin DB5 in silver. This model includes full wire wheels and doors that open with fully detailed passenger compartment. In 1:18 scale, this model measures approximately 10 inches/20 cm long.',90,'12444');

CREATE TABLE endereco (
	numero INT NOT NULL,
    rua VARCHAR(100) NOT NULL,
	bairro VARCHAR(100) NOT NULL,
    complemento VARCHAR(255),
    cidade VARCHAR(100),
    estado VARCHAR(50),
    fk_cliente INT,
    FOREIGN KEY (fk_cliente) REFERENCES cliente(id_cliente)
) ENGINE = InnoDB;

INSERT INTO endereco
VALUES(27, "Travessa Rio Tietê", "Jardim Santa Luzia", NULL, "Passos", "Minas Gerais", 1), 
(346 ,"Rua Samuel da Rocha Galvão", "Cidade da Saúde", NULL, "Itapevi", "São Paulo", 2),
(169 ,"Rua 4 de Dezembro", "Vila Formosa", NULL, "São Paulo", "São Paulo", 3);

CREATE TABLE pedido (
	nfe VARCHAR(50) PRIMARY KEY DEFAULT 0,
    data_emissao DATE NOT NULL,
    valor_total DECIMAL(10,2) NOT NULL DEFAULT 0,
    status_pedido VARCHAR(10) NOT NULL DEFAULT "pendente",
    fk_cliente INT,
    FOREIGN KEY (fk_cliente) REFERENCES cliente(id_cliente)
) ENGINE = InnoDB;

INSERT INTO pedido 
VALUES ("2020000001", '2020-02-22', (SELECT preco FROM produto WHERE id_produto = 1), "pendente", 1),
("2020000002", '2020-02-23', (SELECT preco FROM produto WHERE id_produto = 5) + (SELECT preco FROM produto WHERE id_produto = 10), "concluído", 2),
("2020000003", '2020-02-23', (SELECT preco FROM produto WHERE id_produto = 7), "cancelado", 3),
("2020000004", '2020-02-23', (SELECT preco FROM produto WHERE id_produto = 9), "concluído", 3);

SELECT * FROM pedido;

CREATE TABLE produto_pedido(
	fk_produto INT NOT NULL,
    fk_pedido VARCHAR(50) NOT NULL,
    quantidade_produto INT,
    FOREIGN KEY (fk_produto) REFERENCES produto(id_produto),
    FOREIGN KEY (fk_pedido) REFERENCES pedido(nfe)
) ENGINE = InnoDB;

INSERT INTO produto_pedido VALUES(1, "2020000001", 1);
INSERT INTO produto_pedido VALUES(5, "2020000002", 1);
INSERT INTO produto_pedido VALUES(10, "2020000002", 1);
INSERT INTO produto_pedido VALUES(7, "2020000003", 1);
INSERT INTO produto_pedido VALUES(9, "2020000004", 1);

/*Exercicios*/

/*Devolva a soma de todos os pedidos;*/
SELECT SUM(valor_total) FROM pedido;

/*Devolva a soma de todos os produtos de id par;*/
SELECT SUM(preco) FROM produto WHERE id_produto%2 = 0;

/*Devolva a média de valores dos produtos cadastrados;*/
SELECT AVG(preco) FROM produto;

/*Devolva a média de valores dos produtos da marca Harley Davidson;*/
SELECT AVG(preco) FROM produto WHERE nome LIKE '%Harley%';

/*Devolva o produto mais barato da década de 60;*/
SELECT * FROM produto
WHERE preco = (SELECT MIN(preco) FROM produto WHERE nome LIKE "196%");

/*Devolva o produto mais caro da década de 60;*/
SELECT * FROM produto
WHERE preco = (SELECT MAX(preco) FROM produto WHERE nome LIKE "196%");

/*Devolva o produto com maior estoque;*/
SELECT * FROM produto
WHERE estoque = (SELECT MAX(estoque) FROM produto);

/*Devolva o produto com menor estoque;*/
SELECT * FROM produto
WHERE estoque = (SELECT MIN(estoque) FROM produto);

/*Devolva a quantidade de produtos da marca Ford;*/
SELECT COUNT(id_produto) FROM produto WHERE nome LIKE '%Ford%';

/*Apresente uma tabela contendo o nome do cliente, a data da emissão do pedido,
valor total e status do pedido*/
SELECT c.nome, p.data_emissao, p.valor_total, p.status_pedido 
FROM cliente c INNER JOIN pedido ON c.id_cliente = p.fk_cliente 
WHERE p.status_pedido != "cancelado";

/*Agrupe os valores dos produtos em relação às NFEs.*/
SELECT produto.id_produto, produto.preco AS preco_produto, pedido.nfe AS nfe_pedido FROM produto 
INNER JOIN produto_pedido on id_produto = fk_produto 
INNER JOIN pedido on fk_pedido = pedido.nfe; 
