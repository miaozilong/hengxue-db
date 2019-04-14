create table nativeaddress_province
(
    id   char(32) default '' not null comment 'ID'
        primary key,
    name varchar(32)         not null comment '省的名称',
    constraint nativeaddress_province_name_uindex
        unique (name)
)
    comment '籍贯 省';

INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('3a5db31952de47c08b26063e7502dcf4', '上海市');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('20ed65051bcc4c6c8fb79088679cc82d', '云南省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('cb2524f4acea4710adf5c35c611d6f72', '内蒙古自治区');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('d4c1888652da44879d7d44ddb7fd99c5', '北京市');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('66dad33692ea42798f343e75b99f706f', '台湾省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('96f29c172b99486b8d6e735f3940d48b', '吉林省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('c8e88bbd22eb4408a50f5560f3d85eac', '四川省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('9fbdf807b80a40e684eda06465164f4c', '天津市');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('41fde6b6834241b398ffda87d430d90f', '宁夏回族自治区');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('7ed4913bdfe74d54880a321fe20961a0', '安徽省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('9ba9da8dc26940ec87be6d8e44f168aa', '山东省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('cbf6a12c791840cba135e0f2100ee596', '山西省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('deb8013745284ad183ad96ead5c33d05', '广东省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('52b7c7252a1b4baea9697b995d09c793', '广西壮族自治区');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('36e48e6702c1443a8f6fae4a66cc7fd0', '新疆维吾尔自治区');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('948a766cf7e847e7895c2d5809381903', '江苏省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('676892321cc54a2cbc86cb01a669fcbf', '江西省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('3b13f577bdff480cbed5ed4da06b7a76', '河北省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('c40fbd3978e64f1c96e52a02a56108b3', '河南省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('4438a24400a64f0aa91e0dbd23d1b7bc', '浙江省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('dc13ac92c30742cdb3f0c0865003ae0a', '海南省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('5a67d1305e214e4a8022379ab8f23d89', '湖北省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('3690ae5a3a994e87ab00ffda0632ae5d', '湖南省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('d8ee18ef88bb429893963f2e9d117d9e', '澳门特别行政区');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('25fecf4b2c8f402592c9dbc5129fb960', '甘肃省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('0d58cd64ef1d4b61a1897b81dbbeb6f4', '福建省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('628cf9be74ab4da8a8454df6a25219a5', '西藏自治区');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('36058cfd7e38494c823be577699bbfb2', '贵州省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('1720c266f59b4c4bb8eeeeec10def9e4', '辽宁省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('429cdf507b064e859561400c8b2415c1', '重庆市');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('cc0616c133b24de292c94277ace8f063', '陕西省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('7bd0e23567b749e4b9a5e2e86bab5cbf', '青海省');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('037a0eb6a14f429d90ed0396a87a24f8', '香港特别行政区');
INSERT INTO hengxue_student_management.nativeaddress_province (id, name) VALUES ('753f146349f544d4aeee6ff034776f80', '黑龙江省');