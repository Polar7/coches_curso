create table clientes
(
    cedula          varchar(255) not null
        primary key,
    activo          integer,
    correo          varchar(255),
    nombre_completo varchar(255),
    numero_celular  double precision,
    contrasenia     varchar(255),
    rol             varchar(255)
);

create table compras
(
    numero_factura serial
        primary key,
    cliente_cedula varchar(255)
        constraint fkauu0631j70fiv097sj24cylhe
            references clientes,
    fecha          timestamp(6),
    medio_pago     varchar(255),
    total          double precision
);

create table marca_coche
(
    id          serial
        primary key,
    descripcion varchar(255)
);

create table coches
(
    codigo_coche           serial
        primary key,
    marca_coche_id         integer
        constraint fk4m5c9mn0806wd0n5po3uaef3k
            references marca_coche,
    categoria              varchar(255),
    color                  varchar(255),
    cilindraje             double precision,
    tipo_combustible       varchar(255),
    numero_caballos_fuerza double precision,
    ruta_imagen            varchar(255),
    anio_modelo            double precision,
    cantidad_puertas       integer,
    cantidad_asientos      integer,
    precio                 double precision,
    referencia             varchar(255),
    direccion              varchar(255),
    traccion               integer,
    transmision            varchar(255),
    stock                  integer
);

create table coches_compras
(
    coches_codigo_coche    integer not null
        constraint fkh0l7s0kisxakvxjf45l79fh
            references coches,
    compras_numero_factura integer not null
        constraint fkjk5rbyxmmqi3tygwadgaj6j6o
            references compras,
    cantidad               integer,
    total                  integer,
    primary key (coches_codigo_coche, compras_numero_factura)
);
