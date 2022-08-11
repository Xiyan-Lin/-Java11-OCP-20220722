# JavaOCP11_20220722
JavaOCP11 20220722
<pre>
Derby 資料庫下載
請下載: 10.14.2.0 版本 (支援 Java 8 以上)
https://db.apache.org/derby/derby_downloads.html

pom.xml 依賴配置
<dependency>
    <groupId>org.apache.derby</groupId>
    <artifactId>derby</artifactId>
    <version>10.14.2.0</version>
</dependency>

SQL 語法 for Derby 資料庫
https://www.tutorialspoint.com/apache_derby/apache_derby_create_table.htm

-- 建立 person 資料表
create table person(
    id int not null generated always as identity,
    username varchar(50) not null,
    password varchar(255) not null,
    age int,
    createtime timestamp default current_timestamp,
    primary key(id)
);

-- 新增 Person 資料紀錄
insert into person(username, password, age) values('John', '1234', 18);
insert into person(username, password, age) values('Mary', '5678', 19);
insert into person(username, password, age) values('Helen', '1111', 20);
insert into person(username, password, age) values('Tom', '2222', 17);

-- 查詢 person 表內的資料
select * from person;
select id, username, password, age, createtime from person;
select p.ID, p.USERNAME, p.PASSWORD, p.AGE, p.CREATETIME from person p;
select p.USERNAME, p.AGE from person p;

-- 修改 person 的資料
update person set age = 21, password = 'aaaa' where id = 2;

-- 刪除 person 紀錄
delete from person where id = 4;

-- 建立 cource 資料表
create table course(
    id int not null generated always as identity,
    name varchar(50) not null,
    hours int not null,
    price int not null,
    primary key(id)
);

-- 新增 course 資料紀錄
insert into course(name, hours, price) values('Java', 50, 10000);
insert into course(name, hours, price) values('Python', 40, 8000);
insert into course(name, hours, price) values('MySQL', 30, 7000);
insert into course(name, hours, price) values('ART', 35, 5000);

-- 建立 course_person_ref 關聯資料表
create table course_person_ref(
    id int not null generated always as identity,
    course_id int not null,
    person_id int not null,
    primary key(id),
    constraint course_id_fk foreign key (course_id) references course(id),
    constraint person_id_fk foreign key (person_id) references person(id)
);

-- 新增 course_person_ref 關聯資料表紀錄
insert into course_person_ref(course_id, person_id) values(1, 1);
insert into course_person_ref(course_id, person_id) values(3, 2);
insert into course_person_ref(course_id, person_id) values(2, 2);
insert into course_person_ref(course_id, person_id) values(4, 3);
insert into course_person_ref(course_id, person_id) values(2, 1);
insert into course_person_ref(course_id, person_id) values(1, 1);

-- 資料表改名
RENAME TABLE cource_person_ref TO course_person_ref;

</pre>
