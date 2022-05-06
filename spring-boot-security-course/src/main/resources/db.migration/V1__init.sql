CREATE TABLE IF NOT EXISTS player (
  id            uuid           not null primary key,
  first_name     varchar(50)    not null,
  last_name     varchar(50)    not null,
  height        varchar(4)     not null,
  position      varchar(2)     not null,
  stats_id      uuid           null ,
  constraint player_stats_fkey
        foreign key (stats_id) references stats (id)
);

CREATE TABLE IF NOT EXISTS stats (
  id            uuid           not null primary key,
  ppg           smallint       not null,
  fgm           smallint       not null,
  fga           smallint       not null,
  fta           smallint       not null,
  ftm           smallint       not null
);
