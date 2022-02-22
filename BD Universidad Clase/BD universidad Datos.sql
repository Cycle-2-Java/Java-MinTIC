use universidad;
insert into Alumno (primer_nombre, primer_apellido, cedula) 
values('carlos','caicedo', 123456), ('Pedro','Perez', 123654);

insert into Profesor (
  primer_nombre, primer_apellido, segundo_apellido, cedula, telefono, oficina)
values ('Emanuel', 'Montoya', 'Gomez', 654321, 2546578, 1);

insert into Carrera (codigo, nombre, duracion)
values('Carrera001', 'Ingeniería de software', 10);

insert into Materia (nombre, credito)
values ('Programación en JAVA', 5);