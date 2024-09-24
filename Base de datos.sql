CREATE DATABASE IF NOT EXISTS ticketWizard;
USE ticketWizard;

-- Crear tabla Usuarios
CREATE TABLE Usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) UNIQUE NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    saldo DECIMAL(10,2) NOT NULL,
    contrasena VARCHAR(255) NOT NULL
);

-- Crear tabla Eventos
CREATE TABLE Eventos (
    id_evento INT AUTO_INCREMENT PRIMARY KEY,
    nombre_evento VARCHAR(100) NOT NULL,
    fecha_evento DATE NOT NULL,
    venue VARCHAR(100) NOT NULL,
    ciudad VARCHAR(100) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    descripcion TEXT NOT NULL
);

-- Crear tabla Boletos
CREATE TABLE Boletos (
    id_boleto INT AUTO_INCREMENT PRIMARY KEY,
    numero_serie VARCHAR(8) UNIQUE NOT NULL,
    fila VARCHAR(10) NOT NULL,
    asiento VARCHAR(10) NOT NULL,
    precio_original DECIMAL(10,2) NOT NULL,
    precio_reventa DECIMAL(10,2) NOT NULL,
    id_evento INT NOT NULL,
    id_usuario INT NOT NULL,
    CONSTRAINT fk_evento FOREIGN KEY (id_evento) REFERENCES Eventos(id_evento),
    CONSTRAINT fk_usuario FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario)
);

-- Crear tabla HistorialCompras
CREATE TABLE HistorialCompras (
    id_historial INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    id_boleto INT NOT NULL,
    id_comprador INT NOT NULL,
    id_vendedor INT NOT NULL,
    CONSTRAINT fk_boleto FOREIGN KEY (id_boleto) REFERENCES Boletos(id_boleto),
    CONSTRAINT fk_comprador FOREIGN KEY (id_comprador) REFERENCES Usuarios(id_usuario),
    CONSTRAINT fk_vendedor FOREIGN KEY (id_vendedor) REFERENCES Usuarios(id_usuario)
);
