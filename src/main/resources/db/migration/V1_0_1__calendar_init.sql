    create table EVENT (
        id bigserial not null,
        name varchar(255),
        description varchar(255),
        init_date timestamp,
        end_date timestamp,
        init_time time,
        end_time time,
        is_repeated boolean,
        sunday boolean,
        monday boolean,
        tuesday boolean,
        wednesday boolean,
        thursday boolean,
        friday boolean,
        saturday boolean,
        primary key (id)
    );

COMMENT ON COLUMN EVENT.id IS 'Campo numérico auto-incrementable. ID del evento.';
COMMENT ON COLUMN EVENT.name IS 'Campo de texto. Nombre del evento.';
COMMENT ON COLUMN EVENT.description IS 'Campo de texto. Descripcion del evento.';
COMMENT ON COLUMN EVENT.init_date IS 'Campo de fecha. Fecha inicio del evento.';
COMMENT ON COLUMN EVENT.end_date IS 'Campo de fecha. Fecha fin del evento.';
COMMENT ON COLUMN EVENT.init_time IS 'Campo de time. Hora que inicia el evento.';
COMMENT ON COLUMN EVENT.end_time IS 'Campo de time. Hora que finaliza el evento.';
COMMENT ON COLUMN EVENT.is_repeated IS 'Campo de booleano. Indica si el evento se repite.';
COMMENT ON COLUMN EVENT.sunday IS 'Campo de booleano. Indica si el evento se repite los domingos.';
COMMENT ON COLUMN EVENT.monday IS 'Campo de booleano. Indica si el evento se repite los lunes.';
COMMENT ON COLUMN EVENT.tuesday IS 'Campo de booleano. Indica si el evento se repite los martes.';
COMMENT ON COLUMN EVENT.wednesday IS 'Campo de booleano. Indica si el evento se repite los miercoles.';
COMMENT ON COLUMN EVENT.thursday IS 'Campo de booleano. Indica si el evento se repite los jueves.';
COMMENT ON COLUMN EVENT.friday IS 'Campo de booleano. Indica si el evento se repite los viernes.';
COMMENT ON COLUMN EVENT.saturday IS 'Campo de booleano. Indica si el evento se repite los sabados.';

