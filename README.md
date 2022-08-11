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

</pre>
