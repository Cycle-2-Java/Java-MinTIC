
DROP SCHEMA IF EXISTS universidad;
CREATE SCHEMA universidad;
USE universidad;

-- Tabla de alumnos
CREATE TABLE Alumno (
  primer_nombre VARCHAR(30) NOT NULL,
  segundo_nombre VARCHAR(30),
  primer_apellido VARCHAR(30) NOT NULL,
  segundo_apellido VARCHAR(30),
  cedula integer NOT NULL,
  edad integer,
  semestre smallint,
  PRIMARY KEY  (cedula)
);

-- Tabla carrera
CREATE TABLE Carrera (
  -- codigo SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  codigo VARCHAR(10) NOT NULL,
  nombre VARCHAR(30),
  duracion smallint,
  PRIMARY KEY  (codigo)
);

-- Tabla materia
CREATE TABLE Materia (
  codigo SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  -- codigo VARCHAR(10) NOT NULL,
  nombre VARCHAR(30),
  credito smallint,
  PRIMARY KEY  (codigo)
);


-- Tabla profesor
CREATE TABLE Profesor (
  primer_nombre VARCHAR(30) NOT NULL,
  segundo_nombre VARCHAR(30),
  primer_apellido VARCHAR(30) NOT NULL,
  segundo_apellido VARCHAR(30),
  cedula integer NOT NULL,
  telefono bigint NOT NULL,
  oficina smallint NOT NULL,
  PRIMARY KEY  (cedula)
);


-- Tablas auxiliares
-- Tabla alumnos por profesor
CREATE TABLE Alumnos_Profesor (
  cc_profesor integer NOT NULL,
  cc_alumno integer NOT NULL,
  CONSTRAINT `FK_profesor` FOREIGN KEY (cc_profesor) REFERENCES Profesor (cedula),
  CONSTRAINT `FK_alumno` FOREIGN KEY (cc_alumno) REFERENCES Alumno (cedula),
  PRIMARY KEY  (cc_profesor, cc_alumno)
);

-- Tabla profesor por materia
CREATE TABLE Profesor_Materia (
  cc_profesor integer NOT NULL,
  codigo_materia SMALLINT UNSIGNED NOT NULL,
  CONSTRAINT `FK_profesor1` FOREIGN KEY (cc_profesor) REFERENCES Profesor (cedula),
  CONSTRAINT `FK_materia` FOREIGN KEY (codigo_materia) REFERENCES Materia (codigo),
  PRIMARY KEY  (cc_profesor, codigo_materia)
);

-- Tabla alumnos por materia
CREATE TABLE Alumno_Materia (
  cc_alumno integer NOT NULL,
  codigo_materia SMALLINT UNSIGNED NOT NULL,
  CONSTRAINT `FK_alumno1` FOREIGN KEY (cc_alumno) REFERENCES Alumno (cedula),
  CONSTRAINT `FK_materia1` FOREIGN KEY (codigo_materia) REFERENCES Materia (codigo),
  PRIMARY KEY  (cc_alumno, codigo_materia)
);