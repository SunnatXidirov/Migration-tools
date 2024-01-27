create table task(
    id serial primary key ,
    title varchar not null ,
    description varchar,
    label varchar not null default 'backend',
    created_at timestamp not null default current_timestamp
);