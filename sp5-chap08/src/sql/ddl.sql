-- 서버 만드는 예제에 쓸 테이블
create table user_practice
(
    id       serial primary key,
    email    varchar(255) not null,
    password varchar(255) not null,
    name     varchar(50)  not null,
    reg_date timestamp,
    unique (email)
);

insert into user_practice (email, password, name, reg_date)
values ('test@test.com', '1234', 'test', now());