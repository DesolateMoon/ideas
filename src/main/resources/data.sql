/*create table user 
(
	id integer not null,
	name varchar(255) not null,
	email varchar(255) not null,
	password varchar (255) not null,
	primary key(id)
);*/

insert into user(name, email, password) 
values('Julia', 'julia@mail.com', 'foo');
insert into user(name, email, password) 
values('Austin', 'austin@mail.com', 'bar');
insert into user(name, email, password) 
values('Lan', 'lan@mail.com', 'jar');

insert into ideas(name)
values('A hologram phone');
insert into ideas(name)
values('Wireless charging for laptops');
insert into ideas(name)
values('Streaming website for movies and tv shows');
insert into ideas(name)
values('A hologram phone');