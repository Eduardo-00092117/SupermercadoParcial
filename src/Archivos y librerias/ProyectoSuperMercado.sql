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

CREATE TABLE CategoriaMarca(
	idCategoriaMarca INT CONSTRAINT PK_idCategoriaMarca PRIMARY KEY,
	nombre VARCHAR(100) NOT NULL UNIQUE,
	descripcion VARCHAR(100)
)

CREATE TABLE Marca(
	idMarca INT IDENTITY CONSTRAINT PK_idMarca PRIMARY KEY,
	nombre_empresa VARCHAR(50) NOT NULL UNIQUE,
	nombre_marca VARCHAR(50) NOT NULL UNIQUE,
	descripcion VARCHAR(200),
	FK_idProveedor INT NOT NULL CONSTRAINT FK_idProveedor REFERENCES Proveedor(idProveedor)
)

CREATE TABLE MarcaxCategoria(
	PKFK_idMarca INT NOT NULL,
	PKFK_idCategoria INT NOT NULL
)

ALTER TABLE MarcaxCategoria ADD CONSTRAINT PKFK_idMarcaxProveedor PRIMARY KEY(PKFK_idMarca,PKFK_idCategoria)
ALTER TABLE MarcaxCategoria ADD CONSTRAINT PKFK_idMarca FOREIGN KEY (PKFK_idMarca) REFERENCES Marca(idMarca)
ALTER TABLE MarcaxCategoria ADD CONSTRAINT PKFK_idCategoria FOREIGN KEY(PKFK_idCategoria) REFERENCES CategoriaMarca(idCategoriaMarca)

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

SELECT * FROM Proveedor
