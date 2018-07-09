CREATE DATABASE PROYECTO_SUPER
GO
USE PROYECTO_SUPER
GO

CREATE TABLE Cargo(
	idCargo INT IDENTITY CONSTRAINT PK_idCargo PRIMARY KEY,
	cargo varchar(50) NOT NULL UNIQUE,
	descripcion VARCHAR(100)
)

CREATE TABLE EstadoEmpleado(
	idEstadoEmpleado INT IDENTITY CONSTRAINT PK_idEstadoEmpleado PRIMARY KEY,
	estado varchar(50) NOT NULL
)

CREATE TABLE Empleado(
	idEmpleado INT IDENTITY CONSTRAINT PK_idEmpleado PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL,
	apellido VARCHAR(50) NOT NULL,
	fecha_nac DATE NOT NULL,
	dui VARCHAR(10) NOT NULL UNIQUE,
	nit VARCHAR(17) NOT NULL UNIQUE,
	correo VARCHAR(25) NOT NULL,
	sueldo MONEY NOT NULL,
	FK_idEstadoEmpleado INT NOT NULL CONSTRAINT FK_idEstadoEmpleado REFERENCES EstadoEmpleado(idEstadoEmpleado),
	FK_idCargo INT NOT NULL CONSTRAINT FK_idCargo REFERENCES Cargo (idCargo)
)

CREATE TABLE Usuario(
	idUsuario INT IDENTITY CONSTRAINT pk_idUsuario PRIMARY KEY,
	usuario VARCHAR(25) NOT NULL UNIQUE,
	pass VARCHAR(100) NOT NULL, --VARBINARY(MAX)
	FK_idEmpleado INT NOT NULL CONSTRAINT FK_idEmpleado REFERENCES Empleado (idEmpleado)
)

CREATE TABLE Proveedor(
	idProveedor INT IDENTITY CONSTRAINT PK_idProveedor PRIMARY KEY,
	nombre_empresa VARCHAR(50) NOT NULL UNIQUE,
	nombre_encargado VARCHAR(50) NOT NULL,
	dui VARCHAR(10) NOT NULL,
	telefono VARCHAR(9) NOT NULL,
	url VARCHAR(200) NOT NULL
)



CREATE TABLE Marca(
	idMarca INT IDENTITY CONSTRAINT PK_idMarca PRIMARY KEY,
	nombre_empresa VARCHAR(50) NOT NULL UNIQUE,
	nombre_marca VARCHAR(50) NOT NULL UNIQUE,
	descripcion VARCHAR(200),
	FK_idProveedor INT NOT NULL CONSTRAINT FK_idProveedor REFERENCES Proveedor(idProveedor)
)

SELECT * FROM Producto
UPDATE Empleado SET FK_idCargo = 2 WHERE idEmpleado = 1

CREATE TABLE CategoriaProducto(
	idCategoriaProducto INT IDENTITY CONSTRAINT PK_idProductoCategoria PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL UNIQUE,
	descripcion VARCHAR(MAX)
)

CREATE TABLE Producto(
	idProducto VARCHAR(25) CONSTRAINT PK_idProducto PRIMARY KEY,
	nombre_producto VARCHAR(100) NOT NULL,
	cantidad_producto INT NOT NULL,
	precio_compra MONEY NOT NULL,
	precio_venta MONEY NOT NULL,
	fecha_ingreso DATE NOT NULL,
	fecha_caducidad DATE NOT NULL,
	descripcion_producto VARCHAR(200),
	FK_idMarca INT NOT NULL CONSTRAINT FK_idMarca REFERENCES Marca(idMarca),
	FK_idCategoriaProducto INT NOT NULL CONSTRAINT FK_idCategoriaProducto REFERENCES CategoriaProducto(idCategoriaProducto)
)

CREATE TABLE Facturacion(
	idFactura INT CONSTRAINT pk_idfactura PRIMARY KEY,
	fecha_facturacion DATE NOT NULL,
	hora_facturacion TIME NOT NULL,
	FK_idEmpleado INT NOT NULL CONSTRAINT FK_idEmpleado2 REFERENCES Empleado(idEmpleado)
)

CREATE TABLE DetalleFacturacion(
	PKFK_idFacturacion INT NOT NULL,
	PKFK_idProducto VARCHAR(25) NOT NULL,
	cantidad INT NOT NULL
)

ALTER TABLE DetalleFacturacion ADD CONSTRAINT PKFK_idFacturacionxDetalle PRIMARY KEY(PKFK_idFacturacion, PKFK_idProducto)
ALTER TABLE DetalleFacturacion ADD CONSTRAINT PKFK_idFacturacion FOREIGN KEY(PKFK_idFacturacion) REFERENCES Facturacion(idFactura)
ALTER TABLE DetalleFacturacion ADD CONSTRAINT PKFK_idproducto FOREIGN KEY(PKFK_idProducto) REFERENCES Producto(idProducto)
ALTER TABLE Cargo add acceso tinyint


------------------------ INSERTANDO DATOS PARA TABLA CARGO
SELECT *from cargo

INSERT INTO cargo values('Cajero',null,1)
INSERT INTO cargo values('Gerente',null,1)
----------------------- INSERTANDO DATOS PARA TABLA ESTADO EMPLEADO
SELECT * FROM EstadoEmpleado

INSERT INTO EstadoEmpleado VALUES('Disponible')
INSERT INTO EstadoEmpleado VALUES('Inhabilitado')
INSERT INTO EstadoEmpleado VALUES('Despedido')

----------------------- INSERTANDO DATOS PARA TABLA CATEGORIA PRODUCTO
SELECT * FROM CategoriaProducto

INSERT INTO CategoriaProducto VALUES('Limpieza',null)
INSERT INTO CategoriaProducto VALUES('Galletas',null)
INSERT INTO CategoriaProducto VALUES('Bebidas',null)

----------------------- INSERTANDO DATOS PARA TABLA PROVEEDOR
SELECT * FROM PROVEEDOR 

INSERT INTO Proveedor VALUES('Inc. Constancia','Donald Trump','83926428-2','7170-4019','www.Constancia.com')
INSERT INTO Proveedor VALUES('Cleanex','Cristiano Ronaldo','93346412-7','7978-2483','www.Cleanex.com')
INSERT INTO Proveedor VALUES('BocaDeli','Bill Gates','70345405-9','7023-2215','www.BocaDeli.com')

----------------------- INSERTANDO DATOS PARA TABLA MARCA
SELECT * FROM MARCA

INSERT INTO MARCA VALUES('Inc. Constancia','Pilsener',null,1)
INSERT INTO MARCA VALUES('Cleanex','Detergente',null,3)
INSERT INTO MARCA VALUES('BocaDeli','Chiky',null,2)

----------------------- INSERTANDO DATOS PARA TABLA PRODUCTO
SELECT * FROM PRODUCTO

INSERT INTO PRODUCTO VALUES('1','Pilsener',50,1.50,1.00,'08/07/2018','08/09/2018',null,1,3)
INSERT INTO PRODUCTO VALUES('2','Detergente',72,0.15,0.25,'02/07/2018','08/12/2018',null,2,1)
INSERT INTO PRODUCTO VALUES('3','Chiky',90,0.50,2.00,'05/07/2018','08/08/2018',null,3,2)