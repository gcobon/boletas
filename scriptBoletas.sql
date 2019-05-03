create table boleta
(
    codigo        int auto_increment
        primary key,
    fechaRegistro date        null,
    boleta        int         not null,
    banco         varchar(50) not null,
    valor         double      not null,
    factura       int         not null,
    cliente       varchar(50) not null,
    telefono      int         null,
    fechaUso      date        null,
    hora          time        null,
    atendio       varchar(20) null,
    estado        varchar(20) null
);


