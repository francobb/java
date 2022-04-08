CREATE TABLE IF NOT EXISTS player (
  id            uuid           not null primary key,
  first_name     varchar(50)    not null,
  last_name     varchar(50)    not null,
  height        varchar(4)     not null,
  position      varchar(2)     not null
);