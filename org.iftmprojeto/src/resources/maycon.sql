-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: library
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbaluno`
--

DROP TABLE IF EXISTS `tbaluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbaluno` (
  `matricula` int NOT NULL,
  `nome` varchar(45) NOT NULL,
  `cpf` int NOT NULL,
  `telefone` int NOT NULL,
  `curso` int NOT NULL,
  PRIMARY KEY (`matricula`),
  KEY `formacao` (`curso`),
  CONSTRAINT `formacao` FOREIGN KEY (`curso`) REFERENCES `tbcurso` (`idcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbaluno`
--

LOCK TABLES `tbaluno` WRITE;
/*!40000 ALTER TABLE `tbaluno` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbaluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbautor`
--

DROP TABLE IF EXISTS `tbautor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbautor` (
  `idautor` int NOT NULL,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`idautor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbautor`
--

LOCK TABLES `tbautor` WRITE;
/*!40000 ALTER TABLE `tbautor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbautor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbbibliotecario`
--

DROP TABLE IF EXISTS `tbbibliotecario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbbibliotecario` (
  `codigo` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbbibliotecario`
--

LOCK TABLES `tbbibliotecario` WRITE;
/*!40000 ALTER TABLE `tbbibliotecario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbbibliotecario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbcurso`
--

DROP TABLE IF EXISTS `tbcurso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbcurso` (
  `idcurso` int NOT NULL,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`idcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbcurso`
--

LOCK TABLES `tbcurso` WRITE;
/*!40000 ALTER TABLE `tbcurso` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbcurso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbemprestimo`
--

DROP TABLE IF EXISTS `tbemprestimo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbemprestimo` (
  `idemprestimo` int NOT NULL,
  `dretirada` date NOT NULL,
  `ddevolucao` date NOT NULL,
  `livro` varchar(45) NOT NULL,
  `aluno` int DEFAULT NULL,
  PRIMARY KEY (`idemprestimo`),
  KEY `fk_exemplar_idx` (`livro`),
  KEY `fk_aluno_idx` (`aluno`),
  CONSTRAINT `fk_aluno` FOREIGN KEY (`aluno`) REFERENCES `tbaluno` (`matricula`),
  CONSTRAINT `fk_exemplar` FOREIGN KEY (`livro`) REFERENCES `tbexemplar` (`livro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbemprestimo`
--

LOCK TABLES `tbemprestimo` WRITE;
/*!40000 ALTER TABLE `tbemprestimo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbemprestimo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbexemplar`
--

DROP TABLE IF EXISTS `tbexemplar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbexemplar` (
  `livro` varchar(45) NOT NULL,
  `codigo` int NOT NULL AUTO_INCREMENT,
  `status` int NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `fk_ex_lv` (`livro`),
  CONSTRAINT `fk_ex_lv` FOREIGN KEY (`livro`) REFERENCES `tblivro` (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbexemplar`
--

LOCK TABLES `tbexemplar` WRITE;
/*!40000 ALTER TABLE `tbexemplar` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbexemplar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblivro`
--

DROP TABLE IF EXISTS `tblivro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblivro` (
  `isbn` varchar(45) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `edicao` int NOT NULL,
  `volume` int NOT NULL,
  `genero` varchar(45) NOT NULL,
  `editora` varchar(45) NOT NULL,
  `autor` int NOT NULL,
  PRIMARY KEY (`isbn`),
  KEY `fk_autor_idx` (`autor`),
  CONSTRAINT `fk_autor` FOREIGN KEY (`autor`) REFERENCES `tbautor` (`idautor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblivro`
--

LOCK TABLES `tblivro` WRITE;
/*!40000 ALTER TABLE `tblivro` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblivro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-29 21:10:19
