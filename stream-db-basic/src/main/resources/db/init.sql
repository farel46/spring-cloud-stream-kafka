
drop sequence of exists event_id_seq;

create sequence event_id_seq
    start with 1
    increment by 1;

drop  table if exists event;

create table event (
    id int not null,
    message varchar(255) not null
);

alter table event
    add constraint event_pk primary key (id);

