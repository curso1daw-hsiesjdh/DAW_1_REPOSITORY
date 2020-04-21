/*
*
* SCRIPT DE CARGA DE DATOS PARA LA DB 'My company Inc'.
*
*/

-- INICIO

USE `My company Inc`;

-- Carga inicial de la tabla Clientes
INSERT INTO Clientes (DNI, Nombre, email, tlfno, ciudad, direccion, pais, cod_postal, credito_limite) 
VALUES ('21492542P', 'Paul Newman', 'paulnewman@metrogoldwynmayer.com', '555111111', 'LA', 'Stars Av', 'US', '111111', 100000.0);
INSERT INTO Clientes (DNI, Nombre, email, tlfno, ciudad, direccion, pais, cod_postal, credito_limite) 
VALUES ('35198860M', 'Robert Redford', 'robertredford@metrogoldwynmayer.com', '555222222', 'NY', 'Mountains Av', 'US', '222222', 90000.0);
INSERT INTO Clientes (DNI, Nombre, email, tlfno, ciudad, direccion, pais, cod_postal, credito_limite) 
VALUES ('05698721B', 'Clint Eastwood', 'clinteastwood@malpaso.com', '555333333', 'WS', 'Horses Av', 'US', '333333', 100000.0);
INSERT INTO Clientes (DNI, Nombre, email, tlfno, ciudad, direccion, pais, cod_postal, credito_limite) 
VALUES ('23055754W', 'Grace Kelly', 'gracekelly@warnerbro.com', '555444444', 'LA', 'Stars Av', 'US', '111111', 100000.0);
INSERT INTO Clientes (DNI, Nombre, email, tlfno, ciudad, direccion, pais, cod_postal, credito_limite) 
VALUES ('09097878K', 'Natalie Wood', 'nataliewood@warnerbro.com', '555777777', 'NY', 'Rivers Av', 'US', '444444', 100000.0);
INSERT INTO Clientes (DNI, Nombre, email, tlfno, ciudad, direccion, pais, cod_postal, credito_limite) 
VALUES ('17826889A', 'Burt Lancaster', 'burtlancaster@warnerbro.com', '555888888', 'SF', 'Pine Woods Av', 'US', '555555', 80000.0);
INSERT INTO Clientes (DNI, Nombre, email, tlfno, ciudad, direccion, pais, cod_postal, credito_limite) 
VALUES ('59470397X', 'Rex Harrison', 'rexharrison@metrogoldwynmayer.com', '555999999', 'LN', 'Firs Woods Av', 'UK', '777777', 50000.0);
INSERT INTO Clientes (DNI, Nombre, email, tlfno, ciudad, direccion, pais, cod_postal, credito_limite) 
VALUES ('54176653S', 'Elizabeth Tylor', 'elizabethtaylor@metrogoldwynmayer.com', '555101010', 'MN', 'Oaks Woods Av', 'US', '101010', 50000.0);

-- Carga inicial de la tabla Oficinas
INSERT INTO Oficinas VALUES 
    ('OF_01', 'LA', 'US', '555212121'),
    ('OF_02', 'LA', 'US', '555313131'),
    ('OF_03', 'NY', 'US', '555414141'),
    ('OF_04', 'SF', 'US', '555444444');

-- Carga inicial de la tabla Empleados
INSERT INTO Empleados (DNI, Nombre, email, tlfno, extension, oficina) VALUES ('59840570K', 'George Roy Hill', 'georgeroyhill@Metrowoldwynmayer.com', 555202020, 'EXT_01', 'OF_01');
INSERT INTO Empleados (DNI, Nombre, email, tlfno, extension, oficina, informa_a) 
    SELECT '43207030N', 'William Wyler', 'williamwyler@warnerbro.com', 555303030, 'EXT_02', 'OF_02', cod_empleado FROM Empleados WHERE DNI='59840570K';
INSERT INTO Empleados (DNI, Nombre, email, tlfno, extension, oficina, departamento, informa_a) 
    SELECT '72850874F', 'David Lean', 'davidlean@warnerbro.com', 555505050, 'EXT_01', 'OF_01', 'logistic', cod_empleado FROM Empleados WHERE DNI='59840570K';  
INSERT INTO Empleados (DNI, Nombre, email, tlfno, extension, informa_a) 
    SELECT '51190963R', 'Cecil B. DeMille', 'cecilbdemille@Metrowoldwynmayer.com', 555404040, 'EXT_03', cod_empleado FROM Empleados WHERE DNI='72850874F';
INSERT INTO Empleados (DNI, Nombre, email, tlfno, extension, informa_a, departamento) 
    SELECT '47356203P', 'Sydney Pollack', 'sydneypollack@Metrowoldwynmayer.com', 555707070, 'EXT_03', cod_empleado, 'logistic' FROM Empleados WHERE DNI='59840570K';
INSERT INTO Empleados (DNI, Nombre, email, tlfno, extension, oficina, informa_a) 
    SELECT '16170520W', 'Brian de Palma', 'briandepalma@warnerbro.com', 555606060, 'EXT_02', 'OF_02', cod_empleado FROM Empleados WHERE DNI='47356203P';
INSERT INTO Empleados (DNI, Nombre, email, tlfno, extension, oficina, informa_a) 
    SELECT '37615276H', 'Roman Polansky', 'romanpolanskyk@Metrowoldwynmayer.com', 555808080, 'EXT_01', 'OF_01', cod_empleado FROM Empleados WHERE DNI='43207030N';


-- Carga inicial de la tabla Productos
INSERT INTO Productos (nombre_producto, descripcion, cantidad, precio_compra_unitario) 
    VALUES ('p1', 'Producto p1', 1000000, 100.0),
        ('p2', 'Producto p2', 5000, 2500.0),
        ('p3', 'Producto p3', 50000, 100.0),
        ('p4', 'Producto p4', 700000, 350.0),
        ('p5', 'Producto p5', 500000, 50.0),
        ('p6', 'Producto p6', 100, 10000.0),
        ('p7', 'Producto p7', 2000, 40000.0),
        ('p8', 'Producto p8', 10000, 10.0),
        ('p9', 'Producto p9', 3500, 20.0),
        ('p10', 'Producto p10', 1000, 20.0),
        ('p11', 'Producto p11', 1, 600000.0),
        ('p12', 'Producto p12', 30, 100.0),
        ('p13', 'Producto p13', 750, 10.0),
        ('p14', 'Producto p14', 15, 300.0),
        ('p15', 'Producto p15', 7500, 15.0),
        ('p16', 'Producto p16', 900, 90.0),
        ('p17', 'Producto p17', 30, 30.0),
        ('p18', 'Producto p18', 1000000, 100.0),
        ('p19', 'Producto p19', 100, 100.0),
        ('p20', 'Producto p20', 20, 20.0);
     
-- Carga inicial de la tabla Pedidos        
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, fecha_entrega, estado) VALUES ('P_00001', '2020-01-01', '2020-01-02', '2020-01-09', 4);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, estado) VALUES ('P_00002', '2020-01-01', '2020-01-02', 2);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, estado) VALUES ('P_00003', '2020-01-02', '2020-01-03', 2);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, fecha_entrega, estado) VALUES ('P_00004', '2020-01-02', '2020-01-03', '2020-01-10', 3);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, fecha_entrega, estado) VALUES ('P_00005', '2020-01-04', '2020-01-05', '2020-01-15', 4);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, fecha_entrega, estado) VALUES ('P_00006', '2020-01-04', '2020-01-05', '2020-01-15', 4);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, fecha_entrega, estado) VALUES ('P_00007', '2020-01-04', '2020-01-05', '2020-01-15', 4);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, fecha_entrega, estado) VALUES ('P_00008', '2020-01-05', '2020-01-06', '2020-01-16', 3);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, estado) VALUES ('P_00009', '2020-01-06', '2020-01-07', 2);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, estado) VALUES ('P_00010', '2020-01-06', '2020-01-07', 2);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, estado) VALUES ('P_00011', '2020-01-07', '2020-01-08', 2);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, fecha_envio, estado) VALUES ('P_00012', '2020-01-07', '2020-01-08', 2);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, estado) VALUES ('P_00013', '2020-01-08', 1);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, estado) VALUES ('P_00014', '2020-01-08', 1);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, estado) VALUES ('P_00015', '2020-01-08', 1);
INSERT INTO Pedidos (cod_pedido, fecha_pedido, estado) VALUES ('P_00016', '2020-01-09', 1);

-- Carga inicial de la tabla Pagos
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cod_pedido) VALUES (1, 100.0, 0, 'P_00001');  -- Pago maestro 1 sin pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cuantia_plazo, cod_pedido) VALUES (1, 1000.0, 2, 500.0, 'P_00002');  -- Pago maestro 2 con 2 pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cuantia_plazo, cod_pedido) VALUES (2, 10000.0, 2, 5000.0, 'P_00003');  -- Pago maestro 3 con 2 pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cuantia_plazo, cod_pedido) VALUES (2, 10000.0, 0, 10000.0, 'P_00004');  -- Pago maestro 4 sin pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (1, 500.0, 2, 1, 2); -- Pago parcial 1 de 2 del pago maestro 2
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (1, 500.0, 2, 2, 2); -- Pago parcial 2 de 2 del pago maestro 2
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (2, 5000.0, 2, 1, 3); -- Pago parcial 1 de 2 del pago maestro 3
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (2, 5000.0, 2, 2, 3); -- Pago parcial 2 de 2 del pago maestro 3
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cuantia_plazo, cod_pedido) VALUES (3, 8400.1, 4, 2100.025, 'P_00005'); -- Pago maestro 9 con 4 pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 2100.025, 4, 1, 9);  -- Pago parcial 1 de 4 del pago maestro 9
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 2100.025, 4, 2, 9); -- Pago parcial 2 de 4 del pago maestro 9
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 2100.025, 4, 3, 9); -- Pago parcial 3 de 4 del pago maestro 9
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 2100.025, 4, 4, 9); -- Pago parcial 4 de 4 del pago maestro 9
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cuantia_plazo, cod_pedido) VALUES (3, 24000.0, 6, 2100.025, 'P_00006'); -- Pago maestro 14 con 6 pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 4000.0, 6, 1, 14);  -- Pago parcial 1 de 6 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 4000.0, 6, 2, 14);  -- Pago parcial 2 de 6 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 4000.0, 6, 3, 14);  -- Pago parcial 3 de 6 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 4000.0, 6, 4, 14);  -- Pago parcial 4 de 6 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 4000.0, 6, 5, 14);  -- Pago parcial 5 de 6 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (3, 4000.0, 6, 6, 14);  -- Pago parcial 6 de 6 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cuantia_plazo, cod_pedido) VALUES (4, 12000.0, 3, 4000.0, 'P_00007'); -- Pago maestro 21 con 6 pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (4, 4000.0, 6, 1, 21);  -- Pago parcial 1 de 3 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (4, 4000.0, 6, 2, 21);  -- Pago parcial 2 de 3 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, num_pago, pago_master) VALUES (4, 4000.0, 6, 3, 21);  -- Pago parcial 3 de 3 del pago maestro 14
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cod_pedido) VALUES (4, 1000.0, 0, 'P_00008');  -- Pago maestro 25 sin pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cod_pedido) VALUES (5, 7500.25, 0, 'P_00009');  -- Pago maestro 26 sin pagos parciales
INSERT INTO Pagos (cod_cliente, cantidad, num_plazos, cod_pedido) VALUES (5, 16400.0, 0, 'P_00010');  -- Pago maestro 27 sin pagos parciales

-- Carga inicial de la tabla Detalles_pedidos
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00001', 1);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00001', 2);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00002', 1);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00002', 2);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00003', 3);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00004', 3);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00004', 5);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00004', 7);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00005', 1);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00006', 20);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00006', 19);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00006', 1);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00006', 2);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00007', 1);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00008', 20);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00009', 19);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00009', 1);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00010', 1);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00010', 2);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00010', 3);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00011', 15);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00011', 16);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00012', 1);
INSERT INTO Detalles_pedidos (cod_pedido, cod_producto) VALUES ('P_00012', 2);


-- FIN

SELECT* FROM Detalles_pedidos;

SELECT* FROM Pagos;

SELECT* FROM Empleados;

