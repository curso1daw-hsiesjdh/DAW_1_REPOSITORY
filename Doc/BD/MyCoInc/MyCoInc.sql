/*
*
* SCRIPT DE CREACIÓN DE LA DB 'My company Inc'.
* Ver D-E/R: MyCoInc-ERM.pdf
*
*/

-- INICIO

DROP DATABASE `My company Inc`;

-- Creación de la DB `My company Inc` 
CREATE DATABASE `My company Inc`;

USE `My company Inc`;


-- Tabla Clientes
CREATE TABLE IF NOT EXISTS Clientes(
    cod_cliente INTEGER AUTO_INCREMENT,
    DNI VARCHAR(100) NOT NULL UNIQUE,
    Nombre VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL UNIQUE,
    tlfno VARCHAR(50) NOT NULL UNIQUE,
    direccion VARCHAR(50) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    pais VARCHAR(50) NOT NULL,
    cod_postal VARCHAR(50) NOT NULL,
    credito_limite double default 0.0,
    PRIMARY KEY (cod_cliente)
);

-- Tabla Empleados
CREATE TABLE IF NOT EXISTS Empleados(
    cod_empleado INTEGER AUTO_INCREMENT,
    DNI VARCHAR(100) NOT NULL UNIQUE,
    Nombre VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL UNIQUE,
    tlfno VARCHAR(50) NOT NULL UNIQUE,
    extension VARCHAR(10) NOT NULL,
    oficina VARCHAR(10),
    departamento ENUM('commercial', 'marketing', 'logistic', 'finance') DEFAULT 'marketing',
    informa_a INTEGER,
    PRIMARY KEY (cod_empleado),
    FOREIGN KEY (informa_a) REFERENCES Empleados(cod_empleado)
);

-- Tabla Oficinas
CREATE TABLE IF NOT EXISTS Oficinas(
    cod_oficina VARCHAR(10),
    ciudad VARCHAR(50) NOT NULL,
    pais VARCHAR(50) NOT NULL,
    tlfno VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY (cod_oficina)
);

-- Relación entre las oficinas y sus empleados asociados.
ALTER TABLE Empleados
ADD CONSTRAINT fk_empleados_oficnas FOREIGN KEY (oficina) REFERENCES oficinas(cod_oficina);

-- Tabla Pedidos

CREATE TABLE IF NOT EXISTS Pedidos(
    cod_pedido VARCHAR(10),
    fecha_pedido DATE NOT NULL,
    fecha_envio DATE,
    fecha_entrega DATE,
    estado ENUM ('ESPERA', 'ENVIADO', 'DEVUELTO', 'TERMINADO') DEFAULT 'ESPERA',
    descripcion TEXT,
    cod_empleado INTEGER NOT NULL,
    PRIMARY KEY (cod_pedido),
    FOREIGN KEY (cod_empleado) REFERENCES Empleados(cod_empleado)
);

-- Tabla Pagos
CREATE TABLE IF NOT EXISTS Pagos(
    cod_pago INTEGER AUTO_INCREMENT UNIQUE,
    cod_cliente INTEGER,
    cantidad DOUBLE NOT NULL,
    num_plazos SMALLINT DEFAULT 1,
    num_pago SMALLINT DEFAULT 1,
    cuantia_plazo DOUBLE DEFAULT 0.0,
    cod_pedido VARCHAR(10) UNIQUE, -- Esta restricción UNIQUE es para asegurar la cardinalidad 1:1 entre Pagos y Pedidos; es decir, cada pedido debe tener un único pago asociado.
    pago_master INTEGER,
    PRIMARY KEY (cod_pago, cod_cliente),
    FOREIGN KEY (pago_master) REFERENCES Pagos(cod_pago),
    FOREIGN KEY (cod_cliente) REFERENCES Clientes(cod_cliente),
    FOREIGN KEY (cod_pedido) REFERENCES Pedidos(cod_pedido)
);

-- Tabla Detalles_pedidos
CREATE TABLE IF NOT EXISTS Detalles_pedidos(
    cod_pedido VARCHAR(10),
    cod_producto INTEGER,
    cantidad INTEGER NOT NULL DEFAULT 1,
    precio_unidad DOUBLE DEFAULT 1.0,
    PRIMARY KEY (cod_pedido, cod_producto),
    FOREIGN KEY (cod_pedido) REFERENCES Pedidos(cod_pedido)
);

-- Tabla Productos
CREATE TABLE IF NOT EXISTS Productos(
    cod_producto INTEGER AUTO_INCREMENT,
    nombre_producto VARCHAR(50) NOT NULL,
    descripcion TEXT,
    cantidad Integer,
    precio_compra_unitario DOUBLE NOT NULL DEFAULT 1.0,
    PRIMARY KEY (cod_producto)
);

-- Relación de los pedidos con sus productos asociados
ALTER TABLE Detalles_pedidos
ADD CONSTRAINT fk_detalles_pedidos_productos FOREIGN KEY (cod_producto) REFERENCES Productos(cod_producto);



-- FIN

    