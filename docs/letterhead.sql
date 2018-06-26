-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: letterhead
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `email`
--

DROP TABLE IF EXISTS `email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email` (
  `e_id` int(10) NOT NULL AUTO_INCREMENT,
  `e_email` varchar(30) DEFAULT NULL,
  `e_sender_id` int(10) DEFAULT NULL,
  `e_recipient_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`e_id`),
  KEY `e_recipient_id` (`e_recipient_id`),
  KEY `e_sender_id` (`e_sender_id`),
  CONSTRAINT `email_ibfk_1` FOREIGN KEY (`e_recipient_id`) REFERENCES `recipient` (`r_id`),
  CONSTRAINT `email_ibfk_2` FOREIGN KEY (`e_sender_id`) REFERENCES `sender` (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `letter`
--

DROP TABLE IF EXISTS `letter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `letter` (
  `l_id` int(10) NOT NULL AUTO_INCREMENT,
  `l_sender_id` int(10) NOT NULL,
  `l_recipient_id` int(10) NOT NULL,
  `l_data` date DEFAULT NULL,
  `l_number` int(5) DEFAULT NULL,
  `l_subject` varchar(100) DEFAULT NULL,
  `l_message` blob,
  `l_worker_id` int(10) DEFAULT NULL,
  `l_executor` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`l_id`),
  KEY `l_recipient_id` (`l_recipient_id`),
  KEY `l_sender_id` (`l_sender_id`),
  KEY `l_worker_id` (`l_worker_id`),
  CONSTRAINT `letter_ibfk_1` FOREIGN KEY (`l_recipient_id`) REFERENCES `recipient` (`r_id`),
  CONSTRAINT `letter_ibfk_2` FOREIGN KEY (`l_sender_id`) REFERENCES `sender` (`s_id`),
  CONSTRAINT `letter_ibfk_3` FOREIGN KEY (`l_worker_id`) REFERENCES `worker` (`w_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `recipient`
--

DROP TABLE IF EXISTS `recipient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recipient` (
  `r_id` int(10) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(50) NOT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sender`
--

DROP TABLE IF EXISTS `sender`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sender` (
  `s_id` int(10) NOT NULL AUTO_INCREMENT,
  `s_ved` varchar(50) DEFAULT NULL,
  `s_name` varchar(50) NOT NULL,
  `s_adres` varchar(50) NOT NULL,
  `s_rs` varchar(50) NOT NULL,
  `s_bank` varchar(50) NOT NULL,
  `s_kodbank` varchar(50) NOT NULL,
  `s_unp` int(9) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `tel`
--

DROP TABLE IF EXISTS `tel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tel` (
  `t_id` int(10) NOT NULL AUTO_INCREMENT,
  `t_tel` varchar(20) DEFAULT NULL,
  `t_sender_id` int(10) DEFAULT NULL,
  `t_recipient_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`t_id`),
  KEY `t_recipient_id` (`t_recipient_id`),
  KEY `t_sender_id` (`t_sender_id`),
  CONSTRAINT `tel_ibfk_1` FOREIGN KEY (`t_recipient_id`) REFERENCES `recipient` (`r_id`),
  CONSTRAINT `tel_ibfk_2` FOREIGN KEY (`t_sender_id`) REFERENCES `sender` (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `worker`
--

DROP TABLE IF EXISTS `worker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `worker` (
  `w_id` int(10) NOT NULL AUTO_INCREMENT,
  `w_position` varchar(30) DEFAULT NULL,
  `w_name` varchar(20) DEFAULT NULL,
  `w_sname` varchar(20) DEFAULT NULL,
  `w_patronymic` varchar(20) DEFAULT NULL,
  `w_recipient_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`w_id`),
  KEY `w_recipient_id` (`w_recipient_id`),
  CONSTRAINT `worker_ibfk_1` FOREIGN KEY (`w_recipient_id`) REFERENCES `recipient` (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-10 11:51:12
