
CREATE DATABASE `Pruebas`;
USE `Pruebas`;



CREATE TABLE IF NOT EXISTS Clientes(
    cod_cliente VARCHAR(10),
    DNI VARCHAR(100) NOT NULL UNIQUE,
    Nombre VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL,
    total_pedidos INT DEFAULT 0,
    cantidad_total FLOAT DEFAULT 0.0,
    PRIMARY KEY (cod_cliente)
);

CREATE TABLE `Pedidos`(
    cod_pedido VARCHAR(10),
    cod_cliente VARCHAR(10),
    descripcion VARCHAR(500) NOT NULL,
    fecha_realizacion DATE NOT NULL,
    fecha_entrega DATE,
    PRIMARY KEY (cod_pedido),
    FOREIGN KEY (cod_cliente)
    REFERENCES clientes (cod_cliente)
);

Insert into CLIENTES (cod_cliente,DNI,Nombre,email,total_pedidos,cantidad_total) values ('c1','21492542P','Bruce','brucebanner@marvel.com',140,143000.0);
Insert into CLIENTES (cod_cliente,DNI,Nombre,email,total_pedidos,cantidad_total) values ('c2','35198860M','Clark','clarkkent@dc.com',3,1285.78);
Insert into CLIENTES (cod_cliente,DNI,Nombre,email,total_pedidos,cantidad_total) values ('c3','05698721B','Peter','peterparker@marvel.com',37,34987.2);
Insert into CLIENTES (cod_cliente,DNI,Nombre,email,total_pedidos,cantidad_total) values ('c4','23055754W','Tony','tonystark@marvel.com',986,8845390.0);
Insert into CLIENTES (cod_cliente,DNI,Nombre,email,total_pedidos,cantidad_total) values ('c5','09097878K','BruceW','brucewayne@dc.com',5,143.16);
Insert into CLIENTES (cod_cliente,DNI,Nombre,email,total_pedidos,cantidad_total) values ('c6','17826889A','Flash','barryallen@marvel.com',10,185.65);
Insert into CLIENTES (cod_cliente,DNI,Nombre,email,total_pedidos,cantidad_total) values ('c7','59470397X','Wonder Woman','dianaprince@marvel.com',370,87.1);
Insert into CLIENTES (cod_cliente,DNI,Nombre,email,total_pedidos,cantidad_total) values ('c8','54176653S','Thor','Donalblake@marvel.com',98,8845390.0);


Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p1','c1','Pedido p1 del cliente c1','2020-01-01','2020-01-10');
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p10','c7','Pedido p10 del cliente c7','2020-05-01','2020-05-10');
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p11',null,'Pedido p11 de un cliente externo','2020-05-15',null);
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p12',null,'Pedido p12 de un cliente externo','2020-05-15',null);
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p2','c1','Pedido p2 del cliente c1','2020-01-15','2020-01-25');
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p3','c7','Pedido p3 del cliente c7','2020-01-30','2020-02-10');
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p4','c6','Pedido p4 del cliente c6','2020-02-15','2020-02-25');
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p5','c5','Pedido p5 del cliente c5','2020-03-01','2020-03-10');
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p6','c6','Pedido p6 del cliente c6','2020-03-15',null);
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p7','c5','Pedido p7 del cliente c5','2020-03-30',null);
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p8','c2','Pedido p8 del cliente c2','2020-04-01','2020-04-11');
Insert into PEDIDOS (cod_pedido,cod_cliente,descripcion,fecha_realizacion,fecha_entrega) values ('p9','c6','Pedido p9 del cliente c6','2020-04-15','2020-04-25');

SELECT* FROM Clientes;

SELECT* FROM Pedidos;

SELECT*
FROM clientes AS c
LEFT JOIN pedidos AS p ON (c.cod_clientes = p.cod_clientes);











