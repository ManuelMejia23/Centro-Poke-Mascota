-- MariaDB dump 10.19  Distrib 10.4.27-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: centropokemascota
-- ------------------------------------------------------
-- Server version	10.4.27-MariaDB-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administradores`
--

DROP TABLE IF EXISTS `administradores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administradores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(35) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `contrasena` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administradores`
--

LOCK TABLES `administradores` WRITE;
/*!40000 ALTER TABLE `administradores` DISABLE KEYS */;
INSERT INTO `administradores` VALUES (1,'manuel','mejia.velazquez.20015@itsmante.edu.mx','manuel23'),(2,'Juan Carranza','juancarranza@gmail.com','12345678'),(3,'Guadalupe Vega','lupita@gmail.com','abcdefgh'),(4,'Jaime Camil','camilo@gmail.com','p@ssw0rd');
/*!40000 ALTER TABLE `administradores` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_administradores AFTER INSERT ON Administradores

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Agrego', NEW.id, 'Administradores', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_administradores2 AFTER UPDATE ON Administradores

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Actualizo', OLD.id, 'Administradores', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_administradores3 AFTER DELETE ON Administradores

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Elimino', OLD.id, 'Administradores', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `bitacora_cambios`
--

DROP TABLE IF EXISTS `bitacora_cambios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bitacora_cambios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) DEFAULT NULL,
  `tipo_cambio` varchar(10) DEFAULT NULL,
  `id_afectado` int(11) DEFAULT NULL,
  `tabla_afectada` varchar(50) DEFAULT NULL,
  `fecha_hora` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bitacora_cambios`
--

LOCK TABLES `bitacora_cambios` WRITE;
/*!40000 ALTER TABLE `bitacora_cambios` DISABLE KEYS */;
INSERT INTO `bitacora_cambios` VALUES (1,'root@localhost','Actualizo',1,'Administradores','2023-06-01 10:28:52'),(2,'root@localhost','Agrego',83,'Persona','2023-06-01 11:13:57'),(3,'root@localhost','Agrego',63,'Clientes','2023-06-01 11:13:57'),(4,'root@localhost','Actualizo',13,'Persona','2023-06-01 11:14:36'),(5,'root@localhost','Elimino',63,'Clientes','2023-06-01 11:14:51'),(6,'root@localhost','Elimino',83,'Persona','2023-06-01 11:14:51'),(7,'root@localhost','Actualizo',3,'Persona','2023-06-01 11:15:43'),(8,'root@localhost','Actualizo',3,'Veterinarios','2023-06-01 11:15:43'),(9,'root@localhost','Agrego',53,'Ventas','2023-06-01 11:17:15'),(10,'root@localhost','Actualizo',25,'Visitas','2023-06-01 11:17:39'),(11,'root@localhost','Actualizo',52,'Visitas','2023-06-01 11:18:06'),(12,'root@localhost','Actualizo',52,'Ventas','2023-06-01 11:18:06'),(13,'root@localhost','Agrego',54,'Ventas','2023-06-02 03:06:43'),(14,'root@localhost','Agrego',84,'Persona','2023-06-02 03:25:53'),(15,'root@localhost','Agrego',64,'Clientes','2023-06-02 03:25:53'),(16,'root@localhost','Actualizo',11,'Persona','2023-06-02 03:26:44'),(17,'root@localhost','Elimino',64,'Clientes','2023-06-02 03:26:56'),(18,'root@localhost','Elimino',84,'Persona','2023-06-02 03:26:56'),(19,'root@localhost','Agrego',85,'Persona','2023-06-02 03:42:35'),(20,'root@localhost','Agrego',12,'Veterinarios','2023-06-02 03:42:35'),(21,'root@localhost','Actualizo',4,'Persona','2023-06-02 03:43:35'),(22,'root@localhost','Actualizo',4,'Veterinarios','2023-06-02 03:43:35'),(23,'root@localhost','Elimino',12,'Veterinarios','2023-06-02 03:43:42'),(24,'root@localhost','Elimino',85,'Persona','2023-06-02 03:43:42'),(25,'root@localhost','Agrego',166,'Mascotas','2023-06-02 03:44:35'),(26,'root@localhost','Actualizo',112,'Mascotas','2023-06-02 03:45:29'),(27,'root@localhost','Elimino',166,'Mascotas','2023-06-02 03:45:56'),(28,'root@localhost','Agrego',54,'Visitas','2023-06-02 03:48:03'),(29,'root@localhost','Actualizo',25,'Visitas','2023-06-02 03:48:27'),(30,'root@localhost','Elimino',46,'Visitas','2023-06-02 03:48:37'),(31,'root@localhost','Agrego',55,'Productos','2023-06-02 03:51:23'),(32,'root@localhost','Actualizo',2,'Productos','2023-06-02 03:52:11'),(33,'root@localhost','Actualizo',2,'Productos','2023-06-02 03:52:21'),(34,'root@localhost','Elimino',52,'Productos','2023-06-02 03:52:31'),(35,'root@localhost','Agrego',55,'Ventas','2023-06-02 03:53:46'),(36,'root@localhost','Actualizo',7,'Ventas','2023-06-02 04:03:33'),(37,'root@localhost','Elimino',53,'Ventas','2023-06-02 04:03:44'),(38,'root@localhost','Actualizo',54,'Visitas','2023-06-02 04:04:10'),(39,'root@localhost','Actualizo',55,'Ventas','2023-06-02 04:04:10'),(40,'root@localhost','Actualizo',13,'Persona','2023-06-03 15:58:53'),(41,'root@localhost','Agrego',86,'Persona','2023-06-03 18:56:49'),(42,'root@localhost','Agrego',65,'Clientes','2023-06-03 18:56:49'),(43,'root@localhost','Elimino',65,'Clientes','2023-06-03 18:57:56'),(44,'root@localhost','Elimino',86,'Persona','2023-06-03 18:57:56'),(45,'root@localhost','Agrego',56,'Ventas','2023-06-03 19:22:48'),(46,'root@localhost','Elimino',56,'Ventas','2023-06-03 19:40:20'),(47,'root@localhost','Agrego',57,'Ventas','2023-06-03 19:40:29'),(48,'root@localhost','Elimino',57,'Ventas','2023-06-03 20:07:20'),(49,'root@localhost','Agrego',58,'Ventas','2023-06-03 20:08:36'),(50,'root@localhost','Agrego',59,'Ventas','2023-06-03 20:55:17'),(51,'root@localhost','Agrego',87,'Persona','2023-06-01 18:07:07'),(52,'root@localhost','Agrego',66,'Clientes','2023-06-01 18:07:07');
/*!40000 ALTER TABLE `bitacora_cambios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `persona` int(11) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `persona` (`persona`),
  CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`persona`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,9,'2015-02-14'),(2,10,'2015-03-01'),(3,11,'2015-05-10'),(4,12,'2015-07-22'),(5,13,'2015-02-14'),(6,14,'2015-03-01'),(7,15,'2015-05-10'),(8,16,'2015-07-22'),(9,17,'2015-09-11'),(10,18,'2015-12-05'),(11,19,'2016-02-14'),(12,20,'2016-04-01'),(13,21,'2016-06-10'),(14,22,'2016-08-22'),(15,23,'2016-10-11'),(16,24,'2016-12-05'),(17,25,'2017-02-14'),(18,26,'2017-04-01'),(19,27,'2017-06-10'),(20,28,'2017-08-22'),(21,29,'2017-10-11'),(22,30,'2017-12-05'),(23,31,'2018-02-14'),(24,32,'2018-04-01'),(25,33,'2018-06-10'),(26,34,'2018-08-22'),(27,35,'2018-10-11'),(28,36,'2018-12-05'),(29,37,'2019-02-14'),(30,38,'2019-04-01'),(31,39,'2019-06-10'),(32,40,'2019-08-22'),(33,41,'2019-10-11'),(34,42,'2019-12-05'),(35,43,'2020-02-14'),(36,44,'2020-04-01'),(37,45,'2020-06-10'),(38,46,'2020-08-22'),(39,47,'2020-10-11'),(40,48,'2021-12-05'),(41,49,'2021-02-14'),(42,50,'2021-04-01'),(43,51,'2021-05-14'),(45,53,'2021-07-02'),(46,54,'2021-07-23'),(47,55,'2021-08-02'),(48,56,'2021-08-10'),(49,57,'2021-09-07'),(50,58,'2021-09-13'),(66,87,'2023-06-01');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_clientes AFTER INSERT ON Clientes

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Agrego', NEW.id, 'Clientes', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_clientes2 AFTER UPDATE ON Clientes

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Actualizo', OLD.id, 'Clientes', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_clientes3 AFTER DELETE ON Clientes

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Elimino', OLD.id, 'Clientes', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `mascotas`
--

DROP TABLE IF EXISTS `mascotas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mascotas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `especie` varchar(70) DEFAULT NULL,
  `raza` varchar(50) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `longitud` float DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `dueno` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `dueno` (`dueno`),
  CONSTRAINT `dueno` FOREIGN KEY (`dueno`) REFERENCES `clientes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mascotas`
--

LOCK TABLES `mascotas` WRITE;
/*!40000 ALTER TABLE `mascotas` DISABLE KEYS */;
INSERT INTO `mascotas` VALUES (109,'Luno','Gato','Persa','2019-01-10','Masculino',0.4,3.2,1),(110,'Max','Perro','Labrador','2018-06-22','Masculino',0.8,22.5,2),(111,'Bella','Gato','Siames','2020-03-15','Femenino',0.3,2.1,3),(112,'Rocky','Perro','Bulldog','2017-11-05','Masculino',0.7,25,2),(113,'Fluffy','Conejo','Cabeza de Leon','2019-12-01','Femenino',0.5,1.8,5),(114,'Speedy','Tortuga',NULL,'2016-08-10','Masculino',0.2,0.7,6),(115,'Kiwi','P├íjaro','Canario','2021-01-02','Masculino',0.1,0.2,7),(116,'Buddy','Perro','Golden Retriever','2015-05-20','Masculino',0.9,30,8),(117,'Simba','Gato','Mestizo','2017-02-14','Masculino',0.4,3.5,9),(118,'Lucky','Perro','Chihuahua','2016-09-18','Femenino',0.2,2,10),(119,'Ringo','Conejo','Holland Lop','2020-06-05','Masculino',0.3,1.5,11),(120,'Slinky','Hamster','Sirio','2018-08-03','Masculino',0.1,0.2,12),(121,'Toby','Perro','Beagle','2019-07-10','Masculino',0.6,18,13),(122,'Peaches','Gato','Mestizo','2016-11-29','Femenino',0.3,2.5,14),(123,'Oscar','Perro','Cocker Spaniel','2020-05-18','Masculino',0.7,16.5,15),(124,'Bugs','Conejo','Holandes Enano','2017-04-12','Femenino',0.2,1,16),(125,'Ziggy','P├íjaro','Perico','2018-12-07','Masculino',0.1,0.15,17),(126,'Rosie','Gato','Sphynx','2021-02-14','Femenino',0.2,2,18),(127,'Rufus','Perro','B├│xer','2019-09-08','Masculino',0.8,28,19),(128,'Molly','Gato','British Shorthair','2020-08-13','Femenino',0.4,4.1,20),(129,'Loki','Perro','Bulldog Franc├⌐s','2017-05-01','Masculino',0.6,12.5,21),(130,'Maggie','Gato','Mestizo','2018-01-24','Femenino',0.3,3,22),(131,'Bugsy','Perro','Bich├│n Fris├⌐','2016-12-03','Femenino',0.3,5.5,23),(132,'Thumper','Conejo','Rex','2019-03-05','Masculino',0.4,3,24),(133,'Sonic','Hamster','Ruso','2017-11-16','Masculino',0.1,0.1,25),(134,'Maggie','Tortuga',NULL,'2015-09-22','Femenino',0.4,1.2,26),(135,'Tweety','P├íjaro','Canario','2021-05-01','Femenino',0.15,0.22,27),(136,'Buddy','Perro','Labrador Retriever','2018-02-20','Masculino',0.9,35,28),(137,'Tigger','Gato','Siam├⌐s','2017-06-12','Masculino',0.4,4.5,29),(138,'Charlie','Perro','Golden Retriever','2020-01-01','Masculino',0.7,28,30),(139,'Snowball','Conejo','Holand├⌐s','2018-12-21','Femenino',0.5,3.5,31),(140,'Speedy','Hamster','Sirio','2016-10-01','Femenino',0.1,0.2,32),(141,'Turtle','Tortuga',NULL,'2019-02-12','Femenino',0.3,1.4,33),(142,'Polly','P├íjaro','Loro','2016-05-07','Femenino',0.1,0.16,34),(143,'Jax','Serpiente','Boa Constrictor','2017-08-22','Masculino',1.5,4,35),(144,'Whiskers','Rat├│n','Albino','2018-06-11','Femenino',0.2,0.1,36),(145,'Lola','Hur├│n','Mascota','2019-11-08','Femenino',0.3,2,37),(146,'Luna','Perro','Labrador Retriever','2018-05-10','Femenino',1.2,30.5,38),(147,'Max','Perro','Boxer','2017-09-22','Masculino',1.1,25.6,39),(148,'Toby','Gato','Siam├⌐s','2019-01-08','Masculino',0.6,4.8,40),(149,'Nina','Gato','Persa','2020-04-16','Femenino',0.8,5.1,41),(150,'Bugs','Conejo','Holand├⌐s Enano','2017-11-30','Masculino',0.3,1.5,42),(151,'Lulu','Conejo','Lop Ingl├⌐s','2018-07-21','Femenino',0.4,2,43),(152,'Chester','Hamster','Enano Ruso','2019-02-14','Masculino',0.1,0.2,45),(153,'Fiona','Hamster','Sirio','2018-12-11','Femenino',0.2,0.4,45),(154,'Tortuguita','Tortuga','Tortuga de tierra','2009-09-01','Femenino',10,2.5,46),(155,'Peluso','Tortuga','Tortuga acu├ítica','2015-06-03','Masculino',25,4,47),(156,'Piol├¡n','P├íjaro','Canario','2021-02-20','Masculino',0.1,0.02,48),(157,'Kiwi','P├íjaro','Periquito australiano','2020-07-08','Femenino',0.3,0.05,49),(158,'Kaa','Serpiente','Boa constrictor','2016-12-19','Masculino',1.5,3,50),(159,'Medusa','Serpiente','Cobra real','2017-06-14','Femenino',2,2.5,1),(160,'Stuart','Rat├│n','Rat├│n de laboratorio','2019-11-01','Masculino',0.15,0.03,2),(161,'Jinx','Rat├│n','H├ímster Ruso','2020-01-07','Femenino',0.1,0.15,3),(162,'Oreo','Hur├│n','Hur├│n Blanco','2017-04-28','Femenino',0.4,2,4),(163,'Perrita','Perro','Pomerano','2018-09-12','Femenino',0.5,15,3),(165,'Pelusilla','Gato','Ragdoll','2014-06-17','Femenino',25,4,47);
/*!40000 ALTER TABLE `mascotas` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_mascotas AFTER INSERT ON Mascotas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Agrego', NEW.id, 'Mascotas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_mascotas2 AFTER UPDATE ON Mascotas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Actualizo', OLD.id, 'Mascotas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_mascotas3 AFTER DELETE ON Mascotas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Elimino', OLD.id, 'Mascotas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Temporary table structure for view `nocobrado`
--

DROP TABLE IF EXISTS `nocobrado`;
/*!50001 DROP VIEW IF EXISTS `nocobrado`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `nocobrado` AS SELECT
 1 AS `cliente`,
  1 AS `servicio`,
  1 AS `producto`,
  1 AS `cantidad`,
  1 AS `precio`,
  1 AS `cobrado` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `nombre_clientes`
--

DROP TABLE IF EXISTS `nombre_clientes`;
/*!50001 DROP VIEW IF EXISTS `nombre_clientes`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `nombre_clientes` AS SELECT
 1 AS `cliente_id`,
  1 AS `nombre_cliente` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `nombre_veterinarios`
--

DROP TABLE IF EXISTS `nombre_veterinarios`;
/*!50001 DROP VIEW IF EXISTS `nombre_veterinarios`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `nombre_veterinarios` AS SELECT
 1 AS `veterinario_id`,
  1 AS `nombre_veterinario` */;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(150) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` bigint(20) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Juan P├⌐rez Garc├¡a L├│pez','Avenida de la Reforma #123, 12345 Ciudad de M├⌐xico',5551234567,'1990-05-01','juanperez@gmail.com'),(2,'Ana L├│pez Gonz├ílez Garc├¡a','Calle 5 de Mayo #456, 67890 Puebla',5552345678,'1995-12-10','anita@gmail.com'),(3,'Maria Rodriguez Hernandez','Calle de la Luz #789, 43210 M├⌐rida',5553456789,'1992-08-15','mariarodriguez@gmail.com'),(4,'Pedro Gomez Paredes','Calle de la Luna #254, 56789 Guadalajara',5554567890,'1987-04-20','pedrogarcia@gmail.com'),(5,'Eduardo Flores Jim├⌐nez','Avenida Ju├írez #567, 90123 Monterrey',5555678901,'1998-11-05','eduardoflores@gmail.com'),(6,'Luis Hern├índez Garc├¡a','Calle de las Flores #789, 23456 Quer├⌐taro',5556789012,'1993-06-30','luis_hernandez@gmail.com'),(7,'Laura G├│mez Rodr├¡guez','Calle de la Paz #12, 78901 Tijuana',5557890123,'1991-03-25','lauragomez@gmail.com'),(8,'Rosario Gonzalez Perez','Avenida de las Am├⌐ricas #345, 12345 Ciudad Ju├írez',5558901234,'1989-10-15','rosariogonzalez@gmail.com'),(9,'Diego S├ínchez Garc├¡a','Calle de la Libertad #567, 67890 Acapulco',5559012345,'1997-07-10','diegosanchez@gmail.com'),(10,'Ana Mar├¡a Jim├⌐nez Hern├índez','Calle de los Naranjos #789, 43210 Canc├║n',5550123456,'1994-04-05','anamaria@gmail.com'),(11,'Miguel Mendez Jimenez','Avenida de los Pinos #234, 56789 Puerto Vallarta',5551234566,'1999-01-23','miguelmartinez@itsmante.edu.mx'),(12,'Gabriela P├⌐rez Gonz├ílez','Calle del Mar #567, 90123 Playa del Carmen',5552345679,'1996-08-25','gabrielaperez@gmail.com'),(13,'Carlos Juan Flores','Avenida de las Palmas #789, 23456 Cozumel',5553456788,'1990-10-02','carloshernandez@gmail.com'),(14,'Ana S├ínchez Gonz├ílez','Av. M├⌐xico 123, 64000 Monterrey',5512345678,'1990-05-10','ana.sanchez@gmail.com'),(15,'Jos├⌐ Antonio P├⌐rez L├│pez','Calle Independencia 456, 44100 Guadalajara',5534567890,'1988-12-22','joseantonio.perez@gmail.com'),(16,'Mar├¡a del Carmen Garc├¡a Gonz├ílez','Calle del Sur 789, 72000 Puebla',5545678901,'1995-06-15','mariadelcarmen.garcia@gmail.com'),(17,'Juan Manuel Hern├índez S├ínches','Calle de la Luna 111, 76000 Quer├⌐taro',5567890123,'1987-09-01','juanmanuel.hernandez@gmail.com'),(18,'Luisa Fernanda Torres Hern├índez','Av. de las Flores 222, 97000 M├⌐rida',5589012345,'1998-02-28','luisafernanda.torres@gmail.com'),(19,'Carlos Mart├¡nez S├ínchez','Calle del Bosque 333, 22000 Tijuana',5512345678,'1993-07-12','carlos.martinez@gmail.com'),(20,'Sof├¡a Gonz├ílez Fern├índez','Calle del Mar 444, 11000 Ciudad de M├⌐xico',5534567890,'1992-09-20','sofia.gonzalez@gmail.com'),(21,'Jorge Alberto Soto Castillo','Av. Ju├írez 555, 44100 Guadalajara',5545678901,'1985-03-18','jorgealberto.soto@gmail.com'),(22,'Ver├│nica Cruz V├ízquez','Calle del Pino 666, 64000 Monterrey',5567890123,'1991-11-02','veronica.cruz@gmail.com'),(23,'Diego Garc├¡a Guti├⌐rrez','Av. Hidalgo 777, 72000 Puebla',5589012345,'1986-08-05','diego.garcia@gmail.com'),(24,'Ana Karen S├ínchez Romero','Calle de las Rosas 888, 22000 Tijuana',5512345678,'1997-04-24','anakaren.sanchez@gmail.com'),(25,'Javier Hern├índez Gonz├ílez','Calle del Sol 999, 76000 Quer├⌐taro',5534567890,'1990-01-14','javier.hernandez@gmail.com'),(26,'Mauricio Hern├índez Salgado','Calle del Bosque 301, 64000 Monterrey',8123456789,'1994-06-20','mauricio.hernandez@gmail.com'),(27,'Ana Karen Mendoza Gonz├ílez','Calle del Lago 102, 50000 Toluca',5551234567,'1997-03-15','ana.mendoza@gmail.com'),(28,'Jorge Garc├¡a Rojas','Avenida del Mar 423, 91900 Veracruz',2299876543,'1995-09-28','jorge.garcia@gmail.com'),(29,'Liliana Mart├¡nez Vargas','Calle de la Paz 456, 72000 Puebla',2225554321,'1993-12-07','liliana.martinez@gmail.com'),(30,'Gabriel D├¡az Rojas','Calle del Sol 67, 44100 Guadalajara',3312345678,'1992-07-30','gabriel.diaz@gmail.com'),(31,'David Fern├índez Herrera','Calle de la Luna 789, 03100 Ciudad de M├⌐xico',5512345678,'1990-11-12','david.fernandez@gmail.com'),(32,'Daniela Hern├índez Garc├¡a','Calle de la Sierra 123, 37250 Le├│n',4779876543,'1996-05-02','daniela.hernandez@gmail.com'),(33,'Fernando Vargas Hern├índez','Avenida del Bosque 456, 97000 M├⌐rida',9991234567,'1991-08-25','fernando.vargas@gmail.com'),(34,'Ricardo Gonz├ílez Cruz','Calle de la Fuente 234, 22100 Tijuana',6645554321,'1998-01-18','ricardo.gonzalez@gmail.com'),(35,'Sof├¡a S├ínchez Mart├¡nez','Calle del R├¡o 678, 64000 Monterrey',8189876543,'1999-04-11','sofia.sanchez@gmail.com'),(36,'Carla L├│pez Castro','Calle de la Monta├▒a 234, 44100 Guadalajara',3319876543,'1997-02-04','carla.lopez@gmail.com'),(37,'Mario Torres M├⌐ndez','Avenida del Mar 876, 91900 Veracruz',2291234567,'1993-10-27','mario.torres@gmail.com'),(38,'Esteban Mart├¡nez Hern├índez','Calle del Sol 456, 72000 Puebla',2229876543,'1994-09-21','esteban.martinez@gmail.com'),(39,'Mario Alberto Gonz├ílez Hern├índez','Av. 5 de Mayo 321, 72000 Puebla',2228765432,'1990-07-12','mario.gonzalez@gmail.com'),(40,'Luc├¡a Garc├¡a M├⌐ndez','Calle Ju├írez 235, 44100 Guadalajara',3331234567,'1985-02-18','lucia.garcia@gmail.com'),(41,'Sof├¡a Mart├¡nez S├ínchez','Calle Reforma 456, 64000 Monterrey',8117654321,'1993-11-30','sofia.martinez@gmail.com'),(42,'Luis S├ínchez Hern├índez','Av. Hidalgo 789, 22000 Tijuana',6649876543,'1982-06-05','luis.sanchez@gmail.com'),(43,'Javier Alejandro Flores P├⌐rez','Calle 20 de Noviembre 876, 06000 Ciudad de M├⌐xico',5543210987,'1996-04-23','javier.flores@gmail.com'),(44,'Mar├¡a Fernanda L├│pez Cervantes','Calle 16 de Septiembre 123, 42000 Pachuca',7712345678,'1992-09-05','maria.lopez@gmail.com'),(45,'Jos├⌐ Antonio Garc├¡a Flores','Av. Morelos 456, 50000 Toluca',7223456789,'1989-12-10','jose.garcia@gmail.com'),(46,'Ana Karen Mart├¡nez Garc├¡a','Calle Allende 234, 91000 Veracruz',2298765432,'1998-08-21','ana.martinez@gmail.com'),(47,'Adriana S├ínchez L├│pez','Calle Madero 987, 31000 Chihuahua',6145678901,'1991-03-15','adriana.sanchez@gmail.com'),(48,'Miguel ├üngel Gonz├ílez Hern├índez','Av. Independencia 432, 97000 M├⌐rida',9992345678,'1984-10-07','miguel.gonzalez@gmail.com'),(49,'Santiago Mart├¡nez S├ínchez','Calle Victoria 567, 62000 Cuernavaca',7776543210,'1997-07-01','santiago.martinez@gmail.com'),(50,'Karla Hern├índez Garc├¡a','Calle Hidalgo 321, 20000 Aguascalientes',4497890123,'1988-12-25','karla.hernandez@gmail.com'),(51,'Daniel S├ínchez Mart├¡nez','Av. Madero 765, 78000 San Luis Potos├¡',4445678901,'2000-01-15','daniel.sanchez@gmail.com'),(53,'Diego Mu├▒oz Santos L├│pez','Calle del Mar #1234, 77500 Canc├║n',9982368574,'1998-12-20','diegomunoz@gmail.com'),(54,'Ana Torres Mart├¡nez Castillo','Avenida de los ├ürboles #234, 50030 Toluca',7224396785,'1990-10-07','anatorres@gmail.com'),(55,'Jos├⌐ Gonz├ílez Ruiz Ortega','Calle de la Luna #777, 64000 Monterrey',8113214678,'1987-03-28','josegonzalez@gmail.com'),(56,'Samantha L├│pez S├ínchez Garc├¡a','Calle de la Playa #342, 39670 Acapulco',7448762915,'1993-08-18','samanthalopez@gmail.com'),(57,'Carlos Fern├índez G├│mez Gonz├ílez','Avenida del Sol #2345, 04500 Ciudad de M├⌐xico',5518762390,'1985-07-25','carlosfernandez@gmail.com'),(58,'Jorge P├⌐rez Ram├¡rez Hern├índez','Calle de las Flores #456, 72150 Puebla',2224387654,'1997-01-15','jorgeperez@gmail.com'),(59,'Jose Manuel Mejia Velazquez','Plutarco Elias Calles #703, 89820 Ciudad Mante',8769432154,'2002-11-23','mejiavelazquez@gmail.com'),(60,'Jaime Garza Bola├▒os','Calle del sol #45, 64800 Puebla',7328901822,'2000-07-19','jaimegonzalez@gmail.com'),(61,'Jaime Garza Bola├▒os','Calle del sol #45, 64800 Puebla',7328901822,'2000-07-19','jaimegonzalez@gmail.com'),(62,'Jaime Garza Bola├▒os','Calle del sol #45, 64800 Puebla',7328901822,'2000-07-19','jaimegonzalez@gmail.com'),(63,'Susana Herrero Gomez','Benito Juarez #15, 37680 Rio Verde',9382913432,'1998-05-11','susanaherrero@gmail.com'),(64,'Susana Herrero Gomez','Benito Juarez #15, 37680 Rio Verde',9382913432,'1998-05-11','susanaherrero@gmail.com'),(65,'Susana Herrero Gomez','Benito Juarez #15, 37680 Rio Verde',9382913432,'1998-05-11','susanaherrero@gmail.com'),(66,'Susana Herrero Gomez','Benito Juarez #15, 37680 Rio Verde',9382913432,'1998-05-11','susanaherrero@gmail.com'),(67,'Susana Herrero Gomez','Benito Juarez #15, 37680 Rio Verde',9382913432,'1998-05-11','susanaherrero@gmail.com'),(80,'Samuel Suarez','Calle del Pueblo #32, 28734 San Limon',2133467124,'1980-05-09','samuel@gmail.com'),(81,'Samuel Suarez','Calle del Pueblo #32, 28734 San Limon',2133467124,'1980-05-09','samuel@gmail.com'),(87,'Jose Manuel Mejia Velazquez','Calle de la Alegria #23, 23451 El Mante',1234567890,'2002-11-23','manuelmejia23@gmail.com');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_personas AFTER INSERT ON Persona

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Agrego', NEW.id, 'Persona', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_personas2 AFTER UPDATE ON Persona

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Actualizo', OLD.id, 'Persona', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_personas3 AFTER DELETE ON Persona

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Elimino', OLD.id, 'Persona', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `existencias` int(11) DEFAULT NULL,
  `categoria` varchar(25) DEFAULT NULL,
  `proveedor` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Croquetas premium','Croquetas para perros y gatos de alta calidad',10.99,100,'Alimentos','Petsy Foods'),(2,'Champ├║ antipulgas','Champ├║ especial para eliminar pulgas y garrapatas',8.5,20,'Higiene','PetGroom'),(3,'Jarabe multivitam├¡nico','Suplemento vitam├¡nico para mascotas',15.75,30,'Medicamentos','VetCare'),(4,'Juguete interactivo','Juguete interactivo para perros de todas las edades',12.99,75,'Entrenamiento','HappyPets'),(5,'Collar reflectante','Collar ajustable con material reflectante para mayor seguridad',6.99,100,'Ropa y accesorios','PetStyle'),(6,'Cama acolchada','Cama suave y c├│moda para perros y gatos',24.99,20,'Hogar','CozyPets'),(7,'Arena absorbente','Arena absorbente para bandejas de gatos',9.99,60,'Higiene','CleanPets'),(8,'Comedero autom├ítico','Comedero con temporizador para alimentaci├│n programada',29.99,15,'Hogar','PetFeeder'),(9,'Correa de entrenamiento','Correa resistente para entrenamiento de perros',14.5,40,'Entrenamiento','DogTrainer'),(10,'Shampoo acondicionador','Shampoo con acondicionador para un pelaje suave y brillante',7.99,80,'Higiene','GroomingSupplies'),(11,'Juguete de peluche','Juguete de peluche con sonido para perros peque├▒os',5.49,90,'Entrenamiento','PlayfulPets'),(12,'Calcetines antideslizantes','Calcetines antideslizantes para perros con patas resbaladizas',4.99,70,'Ropa y accesorios','PawStyle'),(13,'Cepillo para gatos','Cepillo suave para el cuidado del pelaje de gatos',9.75,25,'Higiene','PetGroom'),(14,'Arn├⌐s ajustable','Arn├⌐s ajustable para perros de todos los tama├▒os',11.99,60,'Ropa y accesorios','PetStyle'),(15,'Camiseta con estampado','Camiseta con estampado divertido para perros peque├▒os',8.49,50,'Ropa y accesorios','PetFashion'),(16,'Jaula plegable','Jaula plegable para transporte de mascotas',39.99,10,'Hogar','TravelPets'),(17,'Peine quitapulgas','Peine para eliminar pulgas y piojos del pelaje de mascotas',6.25,40,'Higiene','VetCare'),(18,'Rascador para gatos','Rascador con poste y juguete colgante para gatos',18.5,30,'Hogar','CatParadise'),(19,'Correa retr├íctil','Correa retr├íctil resistente para paseos c├│modos',16.99,45,'Entrenamiento','PetWalk'),(20,'Bolsas biodegradables','Bolsas biodegradables para recoger excrementos de perros',3.99,100,'Higiene','CleanPets'),(21,'Juguete mordedor','Juguete mordedor duradero para perros grandes',9.99,55,'Entrenamiento','StrongPaws'),(22,'Abrigo para invierno','Abrigo acolchado y t├⌐rmico para perros en invierno',22.99,35,'Ropa y accesorios','PetStyle'),(23,'Arena sanitaria','Arena sanitaria para bandejas de gatos con control de olores',11.49,65,'Higiene','FreshKitty'),(24,'Comedero de acero inoxidable','Comedero resistente de acero inoxidable para perros y gatos',9.75,80,'Hogar','PetFeeder'),(25,'Cepillo de dientes para perros','Cepillo de dientes y pasta para el cuidado dental de perros',7.99,60,'Higiene','VetCare'),(26,'Juguete interactivo para gatos','Juguete interactivo con plumas para gatos',4.99,70,'Entrenamiento','PlayfulPets'),(27,'Ropa para fiestas','Ropa elegante para perros en ocasiones especiales',12.49,25,'Ropa y accesorios','PetFashion'),(28,'Transportadora port├ítil','Transportadora port├ítil para perros y gatos',34.99,15,'Hogar','PetTraveler'),(29,'Cepillo para pelaje largo','Cepillo especial para desenredar el pelaje largo de perros y gatos',10.5,30,'Higiene','GroomingSupplies'),(30,'Chaleco de seguridad','Chaleco reflectante para perros en actividades al aire libre',14.99,40,'Ropa y accesorios','PetSafety'),(31,'Set de juguetes variados','Set de juguetes variados para perros de todas las edades',18.99,50,'Entrenamiento','HappyPets'),(32,'Pa├▒ales desechables','Pa├▒ales desechables para perros y gatos',12.75,35,'Higiene','CleanPets'),(33,'Dispensador de agua autom├ítico','Dispensador autom├ítico de agua para mascotas',19.99,20,'Hogar','WaterPets'),(34,'Shampoo para pelaje oscuro','Shampoo especial para realzar el pelaje oscuro de perros y gatos',8.99,45,'Higiene','GroomingSupplies'),(35,'Pelota resistente','Pelota resistente para perros grandes y juguetones',6.49,70,'Entrenamiento','PlayfulPets'),(36,'Collar de lujo','Collar de lujo con pedrer├¡a para perros peque├▒os',17.99,25,'Ropa y accesorios','PetFashion'),(37,'Transportadora de bicicleta','Transportadora de bicicleta para llevar perros peque├▒os',28.5,10,'Hogar','PetTraveler'),(38,'Limpiador de o├¡dos','Limpiador de o├¡dos suave y seguro para perros y gatos',6.75,55,'Higiene','VetCare'),(39,'Peluche con catnip','Peluche relleno de catnip para gatos',3.99,75,'Entrenamiento','CatParadise'),(40,'Sudadera con capucha','Sudadera con capucha para perros medianos',11.49,30,'Ropa y accesorios','PetStyle'),(41,'Bebedero autom├ítico','Bebedero autom├ítico con capacidad de agua filtrada',14.99,40,'Hogar','WaterPets'),(42,'Pa├▒uelo decorativo','Pa├▒uelo decorativo para perros de moda',5.25,60,'Ropa y accesorios','PetFashion'),(43,'Cama ortop├⌐dica','Cama ortop├⌐dica para perros mayores o con problemas de articulaciones',28.99,15,'Hogar','CozyPets'),(44,'Toallitas h├║medas','Toallitas h├║medas para limpieza r├ípida de mascotas',4.99,90,'Higiene','CleanPets'),(45,'Pelota chirriante','Pelota chirriante para perros de tama├▒o mediano',5.99,70,'Entrenamiento','HappyPets'),(46,'Vestido para perritas','Vestido elegante para perritas en ocasiones especiales',9.99,20,'Ropa y accesorios','PetFashion'),(47,'Comedero elevado','Comedero elevado para perros de razas grandes',17.5,30,'Hogar','PetFeeder'),(48,'Cepillo de dientes para gatos','Cepillo de dientes y pasta para el cuidado dental de gatos',6.99,55,'Higiene','VetCare'),(49,'Pelota de tenis','Pelota de tenis para perros con sonido squeaker',3.49,80,'Entrenamiento','PlayfulPets'),(50,'Chaqueta impermeable','Chaqueta impermeable para perros en d├¡as lluviosos',13.99,40,'Ropa y accesorios','PetStyle'),(51,'Transportadora para avi├│n','Transportadora apta para viajar en avi├│n con mascotas',32.5,10,'Hogar','TravelPets'),(53,'Juguete dispensador de premios','Juguete dispensador de premios para perros inteligentes',9.99,50,'Entrenamiento','SmartDogs'),(55,'Cefalexina','Antibi├│tico que se utiliza com├║nmente en medicina veterinaria para tratar infecciones bacterianas en perros',15.5,70,'Medicamentos','VetCare');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_productos AFTER INSERT ON Productos

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Agrego', NEW.id, 'Productos', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_productos2 AFTER UPDATE ON Productos

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Actualizo', OLD.id, 'Productos', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_productos3 AFTER DELETE ON Productos

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Elimino', OLD.id, 'Productos', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente` int(11) DEFAULT NULL,
  `producto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `cobrado` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente` (`cliente`),
  KEY `producto` (`producto`),
  CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`id`),
  CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`producto`) REFERENCES `productos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,1,1,5,'2020-01-10','1'),(2,1,2,3,'2020-02-15','1'),(3,2,3,2,'2020-03-20','1'),(4,2,4,1,'2020-04-25','1'),(5,3,5,4,'2020-05-30','1'),(6,3,6,2,'2020-06-05','1'),(7,4,5,1,'2020-07-10','1'),(8,4,8,2,'2020-08-15','1'),(9,5,9,1,'2020-09-20','1'),(10,5,10,4,'2020-10-25','1'),(11,6,11,3,'2020-11-30','1'),(12,6,12,2,'2020-12-05','1'),(13,7,13,5,'2021-01-10','1'),(14,7,14,3,'2021-02-15','1'),(15,8,15,2,'2021-03-20','1'),(16,8,16,1,'2021-04-25','1'),(17,9,17,4,'2021-05-30','1'),(18,9,18,2,'2021-06-05','1'),(19,10,19,3,'2021-07-10','1'),(20,10,20,2,'2021-08-15','1'),(21,11,21,1,'2021-09-20','1'),(22,11,22,4,'2021-10-25','1'),(23,12,23,3,'2021-11-30','1'),(24,12,24,2,'2021-12-05','1'),(25,13,25,5,'2022-01-10','1'),(26,13,26,3,'2022-02-15','1'),(27,14,27,2,'2022-03-20','1'),(28,14,28,1,'2022-04-25','1'),(29,15,29,4,'2022-05-30','1'),(30,15,30,2,'2022-06-05','1'),(31,16,31,3,'2022-07-10','1'),(32,16,32,2,'2022-08-15','1'),(33,17,33,1,'2022-09-20','1'),(34,17,34,4,'2022-10-25','1'),(35,18,35,3,'2022-11-30','1'),(36,18,36,2,'2022-12-05','1'),(37,19,37,5,'2023-01-10','1'),(38,19,38,3,'2023-02-15','1'),(39,20,39,2,'2023-03-20','1'),(40,20,40,1,'2023-04-25','1'),(41,21,41,4,'2023-05-30','1'),(42,21,42,2,'2023-06-05','1'),(43,22,43,3,'2023-07-10','1'),(44,22,44,2,'2023-08-15','1'),(45,23,45,1,'2023-09-20','1'),(46,23,46,4,'2023-10-25','1'),(47,24,47,3,'2023-11-30','1'),(48,24,48,2,'2023-12-05','1'),(49,25,49,5,'2024-01-10','1'),(50,25,50,3,'2024-02-15','1'),(52,4,5,2,'2023-06-01','1'),(54,4,3,4,'2023-06-02','0'),(55,2,3,5,'2023-06-02','1'),(58,4,4,2,'2023-06-03','0'),(59,3,4,3,'2023-06-03','0');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_ventas AFTER INSERT ON Ventas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Agrego', NEW.id, 'Ventas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_ventas2 AFTER UPDATE ON Ventas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Actualizo', OLD.id, 'Ventas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_ventas3 AFTER DELETE ON Ventas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Elimino', OLD.id, 'Ventas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `veterinarios`
--

DROP TABLE IF EXISTS `veterinarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veterinarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `persona` int(11) DEFAULT NULL,
  `contrasena` varchar(15) DEFAULT NULL,
  `turno` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `persona` (`persona`),
  CONSTRAINT `veterinarios_ibfk_1` FOREIGN KEY (`persona`) REFERENCES `persona` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veterinarios`
--

LOCK TABLES `veterinarios` WRITE;
/*!40000 ALTER TABLE `veterinarios` DISABLE KEYS */;
INSERT INTO `veterinarios` VALUES (1,1,'87654321','Matutino'),(2,2,'contrase├▒a','Vespertino'),(3,3,'12345678','Vespertino'),(4,4,'perrito123','Matutino'),(5,5,'drmascota','Vespertino'),(6,6,'soyveterinario','Vespertino'),(7,7,'fldsmdfr','Matutino'),(8,8,'drdeanimales','Matutino');
/*!40000 ALTER TABLE `veterinarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_veterinarios AFTER INSERT ON Veterinarios

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Agrego', NEW.id, 'Veterinarios', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_veterinarios2 AFTER UPDATE ON Veterinarios

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Actualizo', OLD.id, 'Veterinarios', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_veterinarios3 AFTER DELETE ON Veterinarios

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Elimino', OLD.id, 'Veterinarios', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `visitas`
--

DROP TABLE IF EXISTS `visitas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `visitas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `mascota` int(11) DEFAULT NULL,
  `veterinario` int(11) DEFAULT NULL,
  `diagnostico` varchar(200) DEFAULT NULL,
  `tratamiento` varchar(250) DEFAULT NULL,
  `receta` varchar(250) DEFAULT NULL,
  `costo` float DEFAULT NULL,
  `cobrado` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mascota` (`mascota`),
  KEY `veterinario` (`veterinario`),
  CONSTRAINT `visitas_ibfk_1` FOREIGN KEY (`mascota`) REFERENCES `mascotas` (`id`),
  CONSTRAINT `visitas_ibfk_2` FOREIGN KEY (`veterinario`) REFERENCES `veterinarios` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitas`
--

LOCK TABLES `visitas` WRITE;
/*!40000 ALTER TABLE `visitas` DISABLE KEYS */;
INSERT INTO `visitas` VALUES (1,'2018-01-01','09:00:00',110,1,'Gripe canina','Administraci├│n de antibi├│ticos','Amoxicilina, Paracetamol',50,'1'),(2,'2018-01-02','10:30:00',111,2,'Diarrea felina','Hidrataci├│n y dieta blanda','Suero, Comida h├║meda',30,'1'),(3,'2018-01-03','14:15:00',112,3,'Fractura en pata','Inmovilizaci├│n y analgesia','F├⌐rula, Tramadol',80,'1'),(4,'2018-01-04','16:45:00',113,4,'Problemas dentales','Extracci├│n de muelas','Amoxicilina, Ibuprofeno',60,'1'),(5,'2018-01-05','11:30:00',114,5,'Infecci├│n en caparaz├│n','Limpieza y aplicaci├│n de medicamentos','Betadine, Antibi├│tico t├│pico',40,'1'),(6,'2018-01-06','09:45:00',115,6,'Herida en ala','Sutura y vendaje','Hilo de sutura, Gasas',55,'1'),(7,'2018-01-07','13:00:00',116,7,'Problemas de piel','Ba├▒o medicado y tratamiento t├│pico','Champ├║ especial, Crema antibi├│tica',35,'1'),(8,'2018-01-08','15:30:00',117,8,'Problemas urinarios','An├ílisis de orina y administraci├│n de medicamentos','Antibi├│tico, Antiinflamatorio',70,'1'),(9,'2018-01-09','10:15:00',118,1,'Fractura en pata','Cirug├¡a y fijaci├│n con placas','Placas de titanio, Analg├⌐sicos',150,'1'),(10,'2018-01-10','12:45:00',119,2,'Diarrea en conejo','Cambio de alimentaci├│n y administraci├│n de probi├│ticos','Probi├│tico en polvo, Heno',25,'1'),(11,'2018-01-11','16:00:00',120,3,'Problemas de alimentaci├│n','Revisi├│n de dieta y suplementos','Comida balanceada, Vitaminas',20,'1'),(12,'2018-01-12','09:30:00',121,4,'Problemas respiratorios','Tratamiento con antibi├│ticos y nebulizaciones','Amoxicilina, Nebulizador',45,'1'),(13,'2018-01-13','11:45:00',122,5,'Infecci├│n en o├¡do','Limpieza y aplicaci├│n de medicamentos','Suero fisiol├│gico, Gotas ├│ticas',30,'1'),(14,'2018-01-14','14:00:00',123,6,'Fractura en pata','Inmovilizaci├│n y analgesia','F├⌐rula, Tramadol',80,'1'),(15,'2018-01-15','16:30:00',124,7,'Problemas dentales','Extracci├│n de muelas','Amoxicilina, Ibuprofeno',60,'1'),(16,'2018-01-16','10:00:00',125,8,'Infecci├│n en caparaz├│n','Limpieza y aplicaci├│n de medicamentos','Betadine, Antibi├│tico t├│pico',40,'1'),(17,'2018-01-17','12:15:00',111,1,'Herida en ala','Sutura y vendaje','Hilo de sutura, Gasas',55,'0'),(18,'2018-01-18','14:30:00',127,2,'Problemas de piel','Ba├▒o medicado y tratamiento t├│pico','Champ├║ especial, Crema antibi├│tica',35,'1'),(19,'2018-01-19','16:45:00',128,3,'Problemas urinarios','An├ílisis de orina y administraci├│n de medicamentos','Antibi├│tico, Antiinflamatorio',70,'1'),(20,'2018-01-20','10:30:00',129,4,'Fractura en pata','Cirug├¡a y fijaci├│n con placas','Placas de titanio, Analg├⌐sicos',150,'1'),(21,'2018-01-21','12:45:00',130,5,'Diarrea en conejo','Cambio de alimentaci├│n y administraci├│n de probi├│ticos','Probi├│tico en polvo, Heno',25,'1'),(22,'2018-01-22','15:00:00',131,6,'Problemas de alimentaci├│n','Revisi├│n de dieta y suplementos','Comida balanceada, Vitaminas',20,'1'),(23,'2018-01-23','09:15:00',132,7,'Problemas respiratorios','Tratamiento con antibi├│ticos y nebulizaciones','Amoxicilina, Nebulizador',45,'1'),(24,'2018-01-24','11:30:00',133,8,'Infecci├│n en o├¡do','Limpieza y aplicaci├│n de medicamentos','Suero fisiol├│gico, Gotas ├│ticas',30,'1'),(25,'2018-01-25','13:45:00',113,1,'Fractura en dos patas','Inmovilizaci├│n y analgesia','F├⌐rula, Tramadol',100,'0'),(26,'2018-01-26','16:00:00',135,2,'Problemas dentales','Extracci├│n de muelas','Amoxicilina, Ibuprofeno',60,'1'),(27,'2018-01-27','09:45:00',136,3,'Infecci├│n en caparaz├│n','Limpieza y aplicaci├│n de medicamentos','Betadine, Antibi├│tico t├│pico',40,'1'),(28,'2018-01-28','12:00:00',137,4,'Herida en ala','Sutura y vendaje','Hilo de sutura, Gasas',55,'1'),(29,'2018-01-29','14:15:00',138,5,'Problemas de piel','Ba├▒o medicado y tratamiento t├│pico','Champ├║ especial, Crema antibi├│tica',35,'1'),(30,'2018-01-30','16:30:00',139,6,'Problemas urinarios','An├ílisis de orina y administraci├│n de medicamentos','Antibi├│tico, Antiinflamatorio',70,'1'),(31,'2018-01-31','10:15:00',140,7,'Fractura en pata','Cirug├¡a y fijaci├│n con placas','Placas de titanio, Analg├⌐sicos',150,'1'),(32,'2018-02-01','12:30:00',141,8,'Diarrea en conejo','Cambio de alimentaci├│n y administraci├│n de probi├│ticos','Probi├│tico en polvo, Heno',25,'1'),(33,'2018-02-02','14:45:00',142,1,'Problemas de alimentaci├│n','Revisi├│n de dieta y suplementos','Comida balanceada, Vitaminas',20,'1'),(34,'2018-02-03','09:30:00',143,2,'Problemas respiratorios','Tratamiento con antibi├│ticos y nebulizaciones','Amoxicilina, Nebulizador',45,'1'),(35,'2018-02-04','11:45:00',144,3,'Infecci├│n en o├¡do','Limpieza y aplicaci├│n de medicamentos','Suero fisiol├│gico, Gotas ├│ticas',30,'1'),(36,'2018-02-05','14:00:00',145,4,'Fractura en pata','Inmovilizaci├│n y analgesia','F├⌐rula, Tramadol',80,'1'),(37,'2018-02-06','16:15:00',146,5,'Problemas dentales','Extracci├│n de muelas','Amoxicilina, Ibuprofeno',60,'1'),(38,'2018-02-07','10:00:00',147,6,'Infecci├│n en caparaz├│n','Limpieza y aplicaci├│n de medicamentos','Betadine, Antibi├│tico t├│pico',40,'1'),(39,'2018-02-08','12:15:00',148,7,'Herida en ala','Sutura y vendaje','Hilo de sutura, Gasas',55,'1'),(40,'2018-02-09','14:30:00',149,8,'Problemas de piel','Ba├▒o medicado y tratamiento t├│pico','Champ├║ especial, Crema antibi├│tica',35,'1'),(41,'2018-02-10','16:45:00',150,1,'Problemas urinarios','An├ílisis de orina y administraci├│n de medicamentos','Antibi├│tico, Antiinflamatorio',70,'1'),(42,'2018-02-11','10:30:00',151,2,'Fractura en pata','Cirug├¡a y fijaci├│n con placas','Placas de titanio, Analg├⌐sicos',150,'1'),(43,'2018-02-12','12:45:00',152,3,'Diarrea en conejo','Cambio de alimentaci├│n y administraci├│n de probi├│ticos','Probi├│tico en polvo, Heno',25,'1'),(44,'2018-02-13','15:00:00',153,4,'Problemas de alimentaci├│n','Revisi├│n de dieta y suplementos','Comida balanceada, Vitaminas',20,'1'),(45,'2018-02-14','09:15:00',154,5,'Problemas respiratorios','Tratamiento con antibi├│ticos y nebulizaciones','Amoxicilina, Nebulizador',45,'1'),(47,'2018-02-16','13:45:00',156,7,'Fractura en pata','Inmovilizaci├│n y analgesia','F├⌐rula, Tramadol',80,'1'),(48,'2018-02-17','16:00:00',157,8,'Problemas dentales','Extracci├│n de muelas','Amoxicilina, Ibuprofeno',60,'1'),(49,'2018-02-18','09:45:00',158,1,'Infecci├│n en caparaz├│n','Limpieza y aplicaci├│n de medicamentos','Betadine, Antibi├│tico t├│pico',40,'1'),(50,'2018-02-19','12:00:00',159,2,'Herida en ala','Sutura y vendaje','Hilo de sutura, Gasas',55,'1'),(51,'2018-02-20','14:15:00',160,3,'Problemas de piel','Ba├▒o medicado y tratamiento t├│pico','Champ├║ especial, Crema antibi├│tica',35,'1'),(52,'2018-01-10','13:45:00',112,3,'Fractura en pata','Inmovilizaci├│n','F├⌐rula, Tramadol, Gasas',90,'1'),(54,'2015-01-12','12:25:00',110,4,'Problemas digestivos','Desparasitar','Vitaminas, Desparasitante',50,'1');
/*!40000 ALTER TABLE `visitas` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_visitas AFTER INSERT ON Visitas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Agrego', NEW.id, 'Visitas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_visitas2 AFTER UPDATE ON Visitas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Actualizo', OLD.id, 'Visitas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER trigger_visitas3 AFTER DELETE ON Visitas

  FOR EACH ROW

  INSERT INTO bitacora_cambios (usuario, tipo_cambio, id_afectado, tabla_afectada, fecha_hora)

  VALUES (CURRENT_USER(), 'Elimino', OLD.id, 'Visitas', NOW()) */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Temporary table structure for view `vista_clientes`
--

DROP TABLE IF EXISTS `vista_clientes`;
/*!50001 DROP VIEW IF EXISTS `vista_clientes`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vista_clientes` AS SELECT
 1 AS `id`,
  1 AS `persona`,
  1 AS `nombre`,
  1 AS `direccion`,
  1 AS `telefono`,
  1 AS `fecha_nacimiento`,
  1 AS `correo`,
  1 AS `fecha_registro` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `vista_cobrar`
--

DROP TABLE IF EXISTS `vista_cobrar`;
/*!50001 DROP VIEW IF EXISTS `vista_cobrar`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vista_cobrar` AS SELECT
 1 AS `cliente_id`,
  1 AS `cliente`,
  1 AS `servicio`,
  1 AS `producto`,
  1 AS `cantidad`,
  1 AS `precio`,
  1 AS `cobrado` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `vista_mascotas`
--

DROP TABLE IF EXISTS `vista_mascotas`;
/*!50001 DROP VIEW IF EXISTS `vista_mascotas`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vista_mascotas` AS SELECT
 1 AS `id`,
  1 AS `nombre`,
  1 AS `especie`,
  1 AS `raza`,
  1 AS `fecha_nacimiento`,
  1 AS `sexo`,
  1 AS `longitud`,
  1 AS `peso`,
  1 AS `dueno_id`,
  1 AS `dueno` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `vista_ventas`
--

DROP TABLE IF EXISTS `vista_ventas`;
/*!50001 DROP VIEW IF EXISTS `vista_ventas`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vista_ventas` AS SELECT
 1 AS `id`,
  1 AS `idCliente`,
  1 AS `cliente`,
  1 AS `idProducto`,
  1 AS `producto`,
  1 AS `cantidad`,
  1 AS `fecha` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `vista_veterinarios`
--

DROP TABLE IF EXISTS `vista_veterinarios`;
/*!50001 DROP VIEW IF EXISTS `vista_veterinarios`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vista_veterinarios` AS SELECT
 1 AS `id`,
  1 AS `persona`,
  1 AS `nombre`,
  1 AS `direccion`,
  1 AS `telefono`,
  1 AS `fecha_nacimiento`,
  1 AS `correo`,
  1 AS `contrasena`,
  1 AS `turno` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `vista_visitas`
--

DROP TABLE IF EXISTS `vista_visitas`;
/*!50001 DROP VIEW IF EXISTS `vista_visitas`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vista_visitas` AS SELECT
 1 AS `id`,
  1 AS `fecha`,
  1 AS `hora`,
  1 AS `mascota`,
  1 AS `nombre_mascota`,
  1 AS `veterinario`,
  1 AS `nombre_veterinario`,
  1 AS `diagnostico`,
  1 AS `tratamiento`,
  1 AS `receta`,
  1 AS `costo`,
  1 AS `cobrado` */;
SET character_set_client = @saved_cs_client;

--
-- Temporary table structure for view `vistaservicios`
--

DROP TABLE IF EXISTS `vistaservicios`;
/*!50001 DROP VIEW IF EXISTS `vistaservicios`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `vistaservicios` AS SELECT
 1 AS `servicio`,
  1 AS `producto`,
  1 AS `cantidad`,
  1 AS `precio`,
  1 AS `cobrado` */;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `nocobrado`
--

/*!50001 DROP VIEW IF EXISTS `nocobrado`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `nocobrado` AS select `c`.`nombre` AS `cliente`,'Visita' AS `servicio`,`v`.`tratamiento` AS `producto`,1 AS `cantidad`,`v`.`costo` AS `precio`,0 AS `cobrado` from (((`visitas` `v` join `mascotas` `m` on(`v`.`mascota` = `m`.`id`)) join `clientes` `cl` on(`m`.`dueno` = `cl`.`id`)) join `persona` `c` on(`cl`.`persona` = `c`.`id`)) where `v`.`cobrado` = '0' union select `c`.`nombre` AS `cliente`,'Compra' AS `servicio`,`p`.`nombre` AS `producto`,`v`.`cantidad` AS `cantidad`,`p`.`precio` AS `precio`,0 AS `cobrado` from (((`ventas` `v` join `productos` `p` on(`v`.`producto` = `p`.`id`)) join `clientes` `cl` on(`v`.`cliente` = `cl`.`id`)) join `persona` `c` on(`cl`.`persona` = `c`.`id`)) where `v`.`cobrado` = '0' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `nombre_clientes`
--

/*!50001 DROP VIEW IF EXISTS `nombre_clientes`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `nombre_clientes` AS select `c`.`id` AS `cliente_id`,`p`.`nombre` AS `nombre_cliente` from (`clientes` `c` join `persona` `p` on(`c`.`persona` = `p`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `nombre_veterinarios`
--

/*!50001 DROP VIEW IF EXISTS `nombre_veterinarios`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `nombre_veterinarios` AS select `v`.`id` AS `veterinario_id`,`p`.`nombre` AS `nombre_veterinario` from (`veterinarios` `v` join `persona` `p` on(`v`.`persona` = `p`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_clientes`
--

/*!50001 DROP VIEW IF EXISTS `vista_clientes`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_clientes` AS select `c`.`id` AS `id`,`p`.`id` AS `persona`,`p`.`nombre` AS `nombre`,`p`.`direccion` AS `direccion`,`p`.`telefono` AS `telefono`,`p`.`fecha_nacimiento` AS `fecha_nacimiento`,`p`.`correo` AS `correo`,`c`.`fecha_registro` AS `fecha_registro` from (`persona` `p` join `clientes` `c` on(`p`.`id` = `c`.`persona`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_cobrar`
--

/*!50001 DROP VIEW IF EXISTS `vista_cobrar`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_cobrar` AS select `cl`.`id` AS `cliente_id`,`c`.`nombre` AS `cliente`,'Visita' AS `servicio`,`v`.`tratamiento` AS `producto`,1 AS `cantidad`,`v`.`costo` AS `precio`,0 AS `cobrado` from (((`visitas` `v` join `mascotas` `m` on(`v`.`mascota` = `m`.`id`)) join `clientes` `cl` on(`m`.`dueno` = `cl`.`id`)) join `persona` `c` on(`cl`.`persona` = `c`.`id`)) where `v`.`cobrado` = '0' union select `cl`.`id` AS `cliente_id`,`c`.`nombre` AS `cliente`,'Compra' AS `servicio`,`p`.`nombre` AS `producto`,`v`.`cantidad` AS `cantidad`,`p`.`precio` AS `precio`,0 AS `cobrado` from (((`ventas` `v` join `productos` `p` on(`v`.`producto` = `p`.`id`)) join `clientes` `cl` on(`v`.`cliente` = `cl`.`id`)) join `persona` `c` on(`cl`.`persona` = `c`.`id`)) where `v`.`cobrado` = '0' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_mascotas`
--

/*!50001 DROP VIEW IF EXISTS `vista_mascotas`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_mascotas` AS select `m`.`id` AS `id`,`m`.`nombre` AS `nombre`,`m`.`especie` AS `especie`,`m`.`raza` AS `raza`,`m`.`fecha_nacimiento` AS `fecha_nacimiento`,`m`.`sexo` AS `sexo`,`m`.`longitud` AS `longitud`,`m`.`peso` AS `peso`,`m`.`dueno` AS `dueno_id`,`p`.`nombre` AS `dueno` from ((`mascotas` `m` join `clientes` `c` on(`m`.`dueno` = `c`.`id`)) join `persona` `p` on(`c`.`persona` = `p`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_ventas`
--

/*!50001 DROP VIEW IF EXISTS `vista_ventas`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_ventas` AS select `v`.`id` AS `id`,`v`.`cliente` AS `idCliente`,`p`.`nombre` AS `cliente`,`v`.`producto` AS `idProducto`,`pr`.`nombre` AS `producto`,`v`.`cantidad` AS `cantidad`,`v`.`fecha` AS `fecha` from (((`ventas` `v` join `clientes` `c` on(`v`.`cliente` = `c`.`id`)) join `persona` `p` on(`c`.`persona` = `p`.`id`)) join `productos` `pr` on(`v`.`producto` = `pr`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_veterinarios`
--

/*!50001 DROP VIEW IF EXISTS `vista_veterinarios`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_veterinarios` AS select `v`.`id` AS `id`,`p`.`id` AS `persona`,`p`.`nombre` AS `nombre`,`p`.`direccion` AS `direccion`,`p`.`telefono` AS `telefono`,`p`.`fecha_nacimiento` AS `fecha_nacimiento`,`p`.`correo` AS `correo`,`v`.`contrasena` AS `contrasena`,`v`.`turno` AS `turno` from (`persona` `p` join `veterinarios` `v` on(`p`.`id` = `v`.`persona`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vista_visitas`
--

/*!50001 DROP VIEW IF EXISTS `vista_visitas`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vista_visitas` AS select `v`.`id` AS `id`,`v`.`fecha` AS `fecha`,`v`.`hora` AS `hora`,`v`.`mascota` AS `mascota`,`m`.`nombre` AS `nombre_mascota`,`v`.`veterinario` AS `veterinario`,`p`.`nombre` AS `nombre_veterinario`,`v`.`diagnostico` AS `diagnostico`,`v`.`tratamiento` AS `tratamiento`,`v`.`receta` AS `receta`,`v`.`costo` AS `costo`,`v`.`cobrado` AS `cobrado` from (((`visitas` `v` join `mascotas` `m` on(`v`.`mascota` = `m`.`id`)) join `veterinarios` `vet` on(`v`.`veterinario` = `vet`.`id`)) join `persona` `p` on(`vet`.`persona` = `p`.`id`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vistaservicios`
--

/*!50001 DROP VIEW IF EXISTS `vistaservicios`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_unicode_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vistaservicios` AS select 'Compra' AS `servicio`,`p`.`nombre` AS `producto`,`v`.`cantidad` AS `cantidad`,`p`.`precio` AS `precio`,`v`.`cobrado` AS `cobrado` from (`ventas` `v` join `productos` `p` on(`v`.`producto` = `p`.`id`)) where `v`.`cobrado` = '0' union all select 'Visita' AS `servicio`,`v`.`tratamiento` AS `producto`,1 AS `cantidad`,`v`.`costo` AS `precio`,`v`.`cobrado` AS `cobrado` from `visitas` `v` where `v`.`cobrado` = '0' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-03 21:54:10
