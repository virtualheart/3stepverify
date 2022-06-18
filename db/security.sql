-- Adminer 4.8.1 MySQL 5.5.5-10.6.7-MariaDB-3 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP DATABASE IF EXISTS `security_1`;
CREATE DATABASE `security_1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `security_1`;

DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `account` varchar(255) DEFAULT NULL,
  `l1pwd` varchar(255) DEFAULT NULL,
  `l1rgd` varchar(255) DEFAULT NULL,
  `l1ver` varchar(255) DEFAULT NULL,
  `l2pwd` varchar(255) DEFAULT NULL,
  `l2rgd` varchar(255) DEFAULT NULL,
  `l2ver` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `amount` varchar(255) DEFAULT NULL,
  `ques` varchar(255) DEFAULT NULL,
  `ans` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `imagepixelx` varchar(255) DEFAULT NULL,
  `imagepixely` varchar(255) DEFAULT NULL,
  `imagepixelx1` varchar(255) DEFAULT NULL,
  `imagepixely1` varchar(255) DEFAULT NULL,
  `imagepixelx2` varchar(255) DEFAULT NULL,
  `imagepixely2` varchar(255) DEFAULT NULL,
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `register` (`name`, `email`, `account`, `l1pwd`, `l1rgd`, `l1ver`, `l2pwd`, `l2rgd`, `l2ver`, `status`, `amount`, `ques`, `ans`, `image`, `imagepixelx`, `imagepixely`, `imagepixelx1`, `imagepixely1`, `imagepixelx2`, `imagepixely2`) VALUES
('smk',	'computersearch4@gmail.com',	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'U2mNZ5YZUg1p7gF4rcnQ9A==',	'XVFjRV2PS0HfcLxq+N1dsQ==',	'XVFjRV2PS0HfcLxq+N1dsQ==',	'U2mNZ5YZUg1p7gF4rcnQ9A==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'AZcjpnW1sMDOY+lJVwjfew==',	'Ecfdkxx0QPIuWytS7Y45ag==',	'G9zzMO3R+bVzE0VZhx+Cmw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'4',	'77',	'375',	'297',	'419',	'513',	'377'),
('dhana',	'k.dhanajayan1999@gmail.com',	'anJKYHEss4LtMxS1aJUsUg==',	'anJKYHEss4LtMxS1aJUsUg==',	'4RZ9qPrhzo4V4lVSxwgeHg==',	'XVFjRV2PS0HfcLxq+N1dsQ==',	'XVFjRV2PS0HfcLxq+N1dsQ==',	'4RZ9qPrhzo4V4lVSxwgeHg==',	'anJKYHEss4LtMxS1aJUsUg==',	'AZcjpnW1sMDOY+lJVwjfew==',	'mJ7hQwSJ6w/Jm+XtWiSmcg==',	'G9zzMO3R+bVzE0VZhx+Cmw==',	'anJKYHEss4LtMxS1aJUsUg==',	'13',	'478',	'353',	'474',	'354',	'474',	'354');

DROP TABLE IF EXISTS `secure`;
CREATE TABLE `secure` (
  `account` varchar(50) DEFAULT NULL,
  `level1` varchar(50) DEFAULT NULL,
  `level2` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `transaction`;
CREATE TABLE `transaction` (
  `tid` int(10) DEFAULT NULL,
  `faccount` varchar(100) DEFAULT NULL,
  `taccount` varchar(100) DEFAULT NULL,
  `cost` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `date` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `transaction` (`tid`, `faccount`, `taccount`, `cost`, `type`, `date`) VALUES
(999,	'null',	'null',	'null',	'null',	'null');

-- 2022-06-18 18:36:18
