create table `political status`
(
	id char(32) not null
		primary key,
	name varchar(45) not null,
	constraint name
		unique (name)
);

