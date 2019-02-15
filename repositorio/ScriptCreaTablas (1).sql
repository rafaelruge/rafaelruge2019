USE carcenter;

-- TABLA DE DOMINIOS
CREATE TABLE DOMINIOS(
ID_DOMINIO		VARCHAR(15)		NOT NULL,
NOM_DOMINIO		VARCHAR(50)		NOT NULL,
ABR_DOMINIO		VARCHAR(5)		NOT NULL,
PRIMARY KEY (ID_DOMINIO, NOM_DOMINIO)
);

-- TABLA DE MECANICOS
CREATE TABLE MECANICOS(
ID_MECANICO			NUMERIC(10)		PRIMARY KEY,
NOM_MECANICO		VARCHAR(50)		NOT NULL,
ESTADO_MECANICO		VARCHAR(5)		NOT NULL DEFAULT 'L'
);

-- TABLA DE MARCAS
CREATE TABLE MARCA(
ID_MARCA	NUMERIC(3)		IDENTITY(1,1)	PRIMARY KEY,
NOM_MARCA	VARCHAR(50)		NOT NULL
);

CREATE TABLE FACTURA(
NRO_FACTURA		NUMERIC(10)		IDENTITY(1,1)	PRIMARY KEY,
FECHA_FACTURA	DATE			NOT NULL,
VLR_BASE		NUMERIC(10,2)	NOT NULL,
VLR_IVA			NUMERIC(10,2)	NOT NULL
);

CREATE TABLE CLIENTES(
ID_CLIENTE		NUMERIC(10)		PRIMARY KEY,
NOM_CLIENTE		VARCHAR(50)		NOT NULL,
TEL_CLIENTE		NUMERIC(10)		NOT NULL,
CORREO_CLIENTE	VARCHAR(50)		NOT NULL
);

CREATE TABLE VEHICULOS(
PLACA			VARCHAR(6)		PRIMARY KEY,
MODELO			NUMERIC(4)		NOT NULL,
COLOR			VARCHAR(5)		NOT NULL,
TIPO_CARROCERIA	VARCHAR(5)		NOT NULL,
ID_MARCA		NUMERIC(3)		NOT NULL,
FOREIGN KEY (ID_MARCA) REFERENCES MARCA(ID_MARCA)
);

CREATE TABLE CLIENTE_VEHICULO(
ID_CLIENTE_VEHICULO		NUMERIC(10)		PRIMARY KEY IDENTITY(1,1),
ID_CLIENTE		NUMERIC(10)		NOT NULL,
PLACA			VARCHAR(6)		NOT NULL,	
DUENO_ACTUAL	VARCHAR(5)		NOT NULL,
FOREIGN KEY(ID_CLIENTE) REFERENCES CLIENTES(ID_CLIENTE),
FOREIGN KEY(PLACA) REFERENCES VEHICULOS(PLACA)
);

CREATE TABLE CITA(
ID_CITA		NUMERIC(10)		PRIMARY KEY		IDENTITY(1,1),
FEC_CITA	DATE			NOT NULL,
HORA_CITA	TIME			NOT NULL,
PRESUPUESTO	NUMERIC(10,2),
PLACA		VARCHAR(6)		NOT NULL,
FOREIGN KEY(PLACA) REFERENCES VEHICULOS(PLACA)
);

CREATE TABLE ESTADO_VEHICULO(
ID_EST_VEHICULO		NUMERIC(10)		PRIMARY KEY		IDENTITY(1,1),
URL_FOTO			VARCHAR(100)	NOT NULL,
ID_CITA				NUMERIC(10)		NOT NULL,
FOREIGN KEY(ID_CITA) REFERENCES CITA(ID_CITA)
);

CREATE TABLE SERVICIOS(
ID_SERVICIO			NUMERIC(10)		PRIMARY KEY		IDENTITY(1,1),
DESC_SERVICIO		VARCHAR(50)		NOT NULL,
TIEMPO_ESTIMADO		NUMERIC(2)		NOT NULL,
VLR_SERVICIO		NUMERIC(10,2)	NOT NULL,
EST_SERVICIO		VARCHAR(5)		NOT NULL,
ID_CITA				NUMERIC(10)		NOT NULL,
ID_MECANICO			NUMERIC(10)		NOT NULL,
NRO_FACTURA			NUMERIC(10)		NOT NULL,
FOREIGN KEY(ID_CITA) REFERENCES CITA(ID_CITA),
FOREIGN KEY(ID_MECANICO) REFERENCES MECANICOS(ID_MECANICO),
FOREIGN KEY(NRO_FACTURA) REFERENCES FACTURA(NRO_FACTURA)
);

CREATE TABLE REPUESTOS(
ID_REPUESTO		NUMERIC(10)		PRIMARY KEY		IDENTITY(1,1),
NOM_REPUESTO	VARCHAR(50)		NOT NULL);

CREATE TABLE SERVICIO_REPUESTO(
ID_SERVICIO_REPUESTO	NUMERIC(10)		PRIMARY KEY		IDENTITY(1,1),
ID_SERVICIO		NUMERIC(10)		NOT NULL,
ID_REPUESTO		NUMERIC(10)		NOT NULL,
VLR_ACTUAL		NUMERIC(10,2)	NOT NULL,
FOREIGN KEY(ID_SERVICIO) REFERENCES SERVICIOS(ID_SERVICIO),
FOREIGN KEY(ID_REPUESTO) REFERENCES REPUESTOS(ID_REPUESTO)
);
