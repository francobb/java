create table player
(
    uuid        uuid    not null
        primary key,
    name        char    not null,
    height      varchar(4)    not null,
    position    varchar(2) not null
)