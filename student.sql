create table student
(
	id char(32) default '' not null comment '编号'
		primary key,
	name varchar(45) not null comment '姓名',
	gender varchar(45) null comment '性别',
	political_status_id int null comment '政治面貌',
	nativeaddress_province varchar(45) null comment '籍贯 省',
	nativeaddress_city varchar(45) null comment '籍贯 市',
	nativeaddress_district varchar(45) null comment '籍贯 区',
	work_company varchar(500) null comment '工作单位',
	address varchar(500) null comment '地址',
	QQ varchar(45) null comment 'QQ',
	landline_telephone varchar(45) null comment '固定电话',
	identification_card_id char(18) null comment '身份证号',
	email varchar(45) null comment '邮箱',
	enroll_date date null comment '报名日期',
	exam_school_id varchar(32) null comment '报考学校ID',
	attribute_id varchar(32) null comment '报考性质ID',
	major_id varchar(32) null,
	exam_level_id varchar(32) null,
	enroll_point_id varchar(32) null,
	studentcol1 varchar(45) null
);

