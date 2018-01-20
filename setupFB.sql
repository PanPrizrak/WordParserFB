/*CREATE TABLE `Person` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '',
  `country` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
commit
База letterhead
Таблицы:
1. sender:
-id 
-ved
-name
-adres
-id_tel
-id_email
-rs
-bank
-kodbank
-unp
2. recipient:
-id
-name
-id_worker
-id_tel
-id_email
3. letter:
-id
-sender_id
-recipient_id
-data
-number
-


*/