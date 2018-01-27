/*CREATE TABLE `Person` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '',
  `country` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);/* ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
commit
База letterhead
Таблицы:
1. sender:
2. recipient:
3.worker:
4. letter:
5. tel:
6. email:

CREATE DATABASE letterhead;
USE letterhead DARABASE changed;*/
/*CREATE TABLE sender (
s_id int(10) AUTO_INCREMENT,
s_ved varchar(50),
s_name varchar(50) NOT NULL,
s_adres varchar(50) NOT NULL,
s_rs varchar(50) NOT NULL,
s_bank varchar(50) NOT NULL,
s_kodbank varchar(50) NOT NULL,
s_unp int(9) NOT NULL,
PRIMARY KEY (s_id)
);
CREATE TABLE recipient (
r_id int (10) AUTO_INCREMENT,
r_name varchar (50) NOT NULL,
PRIMARY KEY (r_id)
);
CREATE TABLE worker(
w_id int(10) AUTO_INCREMENT,
w_position varchar(30),
w_name varchar (20),
w_sname varchar(20),
w_patronymic varchar(20),
w_recipient_id int(10),
PRIMARY KEY (w_id),
FOREIGN KEY (w_recipient_id) REFERENCES recipient (r_id)
);
CREATE TABLE letter (
l_id int (10) AUTO_INCREMENT,
l_sender_id int (10) NOT NULL,
l_recipient_id int (10) NOT NULL,
l_data date,
l_number int(5),
l_subject varchar(100),
l_message blob(1500),
l_worker_id int(10),
l_executor varchar(100),
PRIMARY KEY (l_id),
FOREIGN KEY (l_recipient_id) REFERENCES recipient (r_id),
FOREIGN KEY (l_sender_id) REFERENCES sender (s_id),
FOREIGN KEY (l_worker_id) REFERENCES worker (w_id)
);
CREATE TABLE tel(
t_id int(10) AUTO_INCREMENT,
t_tel varchar(20),
t_sender_id int(10),
t_recipient_id int(10),
PRIMARY KEY (t_id),
FOREIGN KEY (t_recipient_id) REFERENCES recipient (r_id),
FOREIGN KEY (t_sender_id) REFERENCES sender (s_id)
);
CREATE TABLE email(
e_id int(10) AUTO_INCREMENT,
e_email varchar(30),
e_sender_id int(10),
e_recipient_id int(10),
PRIMARY KEY (e_id),
FOREIGN KEY (e_recipient_id) REFERENCES recipient (r_id),
FOREIGN KEY (e_sender_id) REFERENCES sender (s_id)
);*/