create table `political status`
(
    id   char(32)    not null
        primary key,
    name varchar(45) not null,
    constraint name
        unique (name)
);

INSERT INTO hengxue_student_management.`political status` (id, name) VALUES ('3d1eb8115e4e11e9a7c528d2446833e7', '党员');
INSERT INTO hengxue_student_management.`political status` (id, name) VALUES ('3e8a2e705e4e11e9a7c528d2446833e7', '团员');
INSERT INTO hengxue_student_management.`political status` (id, name) VALUES ('3e9a42485e4e11e9a7c528d2446833e7', '群众');