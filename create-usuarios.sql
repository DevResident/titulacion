CREATE DATABASE usuarios;

CREATE TABLE IF NOT EXISTS usuario(

	usua_id_usuario SERIAL PRIMARY KEY,
	usua_numero_cuenta VARCHAR(9) UNIQUE NOT NULL,
	usua_correo VARCHAR(255) UNIQUE NOT NULL,
	usua_rol VARCHAR(30) NOT NULL DEFAULT 'Estudiante',
	usua_estatus BOOLEAN NOT NULL DEFAULT TRUE

);
