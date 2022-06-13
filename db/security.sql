-- Adminer 4.8.1 MySQL 5.5.5-10.6.7-MariaDB-3 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP DATABASE IF EXISTS `security`;
CREATE DATABASE `security` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `security`;

DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
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
  `imagepixely2` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `register` (`name`, `email`, `account`, `l1pwd`, `l1rgd`, `l1ver`, `l2pwd`, `l2rgd`, `l2ver`, `status`, `amount`, `ques`, `ans`, `image`, `imagepixelx`, `imagepixely`, `imagepixelx1`, `imagepixely1`, `imagepixelx2`, `imagepixely2`) VALUES
('',	'',	'd18jbazjgCqEMwZ6Fly3HA==',	'w6UfLVbezBD2q+tlNQ+1UA==',	'LP0WbYmQmhzPSVcQ5yKgag==',	'XVFjRV2PS0HfcLxq+N1dsQ==',	'kCMhywyDa/jKdicZvtKiVg==',	'FRPPLee/GLVJxeEUfGET4Q==',	'w8nJPwzKwrMBuwj7fw+kWA==',	'AZcjpnW1sMDOY+lJVwjfew==',	'Ts4cuy3GCQwP5qrXrMWYaA==',	'sWkEgSmj4lGvwTTnC0YhCg==',	'Dmsu/PGmVoGSvz1OKBkJRg==',	'4',	'62',	'344',	'244',	'335',	'',	''),
('',	'',	'tmbgNETAnxaELdJGtop4yw==',	'w6UfLVbezBD2q+tlNQ+1UA==',	'LpxtcQYILoxH/uGssvxMCQ==',	'XVFjRV2PS0HfcLxq+N1dsQ==',	'kCMhywyDa/jKdicZvtKiVg==',	'dcuRtXow/0G8zHQlneIJtg==',	'w8nJPwzKwrMBuwj7fw+kWA==',	'AZcjpnW1sMDOY+lJVwjfew==',	'oKC7PFKo7dfblB5FiYHeWw==',	'sWkEgSmj4lGvwTTnC0YhCg==',	'Dmsu/PGmVoGSvz1OKBkJRg==',	'5',	'177',	'63',	'94',	'158',	'',	''),
('smk',	'k.dhanajayan1999@gmail.com',	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'U2mNZ5YZUg1p7gF4rcnQ9A==',	'XVFjRV2PS0HfcLxq+N1dsQ==',	'XVFjRV2PS0HfcLxq+N1dsQ==',	'U2mNZ5YZUg1p7gF4rcnQ9A==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'AZcjpnW1sMDOY+lJVwjfew==',	'K+SQ6TKkiYeqrMNpMNm3xg==',	'G9zzMO3R+bVzE0VZhx+Cmw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'5',	'178',	'74',	'322',	'25',	'444',	'418');

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
(999,	NULL,	NULL,	NULL,	NULL,	NULL),
(1000,	'2+gFiobusEGu5jzK6P6glg==',	'd18jbazjgCqEMwZ6Fly3HA==',	'mw+CoUqD65yBb5zdAJ4e2g==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-08'),
(1001,	'2+gFiobusEGu5jzK6P6glg==',	'd18jbazjgCqEMwZ6Fly3HA==',	'GDk+nYrysfQ06aWHnbVlbg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-08'),
(1002,	'2+gFiobusEGu5jzK6P6glg==',	'tmbgNETAnxaELdJGtop4yw==',	'6gr0lkT3MnfDhMgPjI6ENg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-08'),
(1003,	'IMn8IksPB3oIQSMeUn6UwA==',	'tmbgNETAnxaELdJGtop4yw==',	'J4TJ+xxJibYE6LxDKXm7Yw==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-08'),
(1004,	'IMn8IksPB3oIQSMeUn6UwA==',	'IMn8IksPB3oIQSMeUn6UwA==',	'e4bbK1IpvYohmnyVgQjA7w==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-08'),
(1005,	'OUULeQJBdi66Il5hUlo3pQ==',	'IMn8IksPB3oIQSMeUn6UwA==',	'XkWhFkDuZwfcQOXavPhOag==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-08'),
(1006,	'PCuh+w92AueH0uYUBTz5Cw==',	'IMn8IksPB3oIQSMeUn6UwA==',	'sdSiOrXJRBHMIhnaE2dzlw==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-08'),
(1007,	'XbhjUOWiyzfci6IAeQW1Fg==',	'IMn8IksPB3oIQSMeUn6UwA==',	'K+SQ6TKkiYeqrMNpMNm3xg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-09'),
(1008,	'PCuh+w92AueH0uYUBTz5Cw==',	'IMn8IksPB3oIQSMeUn6UwA==',	'K+SQ6TKkiYeqrMNpMNm3xg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-09'),
(1009,	'PCuh+w92AueH0uYUBTz5Cw==',	'PCuh+w92AueH0uYUBTz5Cw==',	'Mr+Ld7Mv57wi2yh5Y07cvg==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-09'),
(1010,	'PCuh+w92AueH0uYUBTz5Cw==',	'PCuh+w92AueH0uYUBTz5Cw==',	'K+SQ6TKkiYeqrMNpMNm3xg==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-09'),
(1011,	'cUJp9wkkEET93OH3w02DAw==',	'IMn8IksPB3oIQSMeUn6UwA==',	'K+SQ6TKkiYeqrMNpMNm3xg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-09'),
(1012,	'PCuh+w92AueH0uYUBTz5Cw==',	'IMn8IksPB3oIQSMeUn6UwA==',	'K+SQ6TKkiYeqrMNpMNm3xg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-09'),
(1013,	'PCuh+w92AueH0uYUBTz5Cw==',	'IMn8IksPB3oIQSMeUn6UwA==',	'K+SQ6TKkiYeqrMNpMNm3xg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-10'),
(1014,	'PCuh+w92AueH0uYUBTz5Cw==',	'IMn8IksPB3oIQSMeUn6UwA==',	'K+SQ6TKkiYeqrMNpMNm3xg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-10'),
(1015,	'PCuh+w92AueH0uYUBTz5Cw==',	'IMn8IksPB3oIQSMeUn6UwA==',	'vaQvY72z4mDfqoPdpNBgtg==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-10'),
(1016,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'QTM8/4ij0GYIpSdnZBmS6w==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-11'),
(1017,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'LQqqwNDRsRyPdgK7GvdsXQ==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-12'),
(1018,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'gQj/Mn6S2HgfoRjsgYC7fQ==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-12'),
(1019,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'gQj/Mn6S2HgfoRjsgYC7fQ==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-12'),
(1020,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'LQqqwNDRsRyPdgK7GvdsXQ==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-12'),
(1021,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'gQj/Mn6S2HgfoRjsgYC7fQ==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-12'),
(1022,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'QysAHNQEpplCQ/HNEvEjbA==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1023,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'QypS33IijRSZajOuWXEJPw==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1024,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'jR7Av66a/c9TE1oTOKaF8A==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1025,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'c5znyULi2TSzHtiCfOU2Ww==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1026,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'LQqqwNDRsRyPdgK7GvdsXQ==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1027,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'jR7Av66a/c9TE1oTOKaF8A==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1028,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'c5znyULi2TSzHtiCfOU2Ww==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1029,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'c5znyULi2TSzHtiCfOU2Ww==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1030,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'c5znyULi2TSzHtiCfOU2Ww==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1031,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'jR7Av66a/c9TE1oTOKaF8A==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1032,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'U2mNZ5YZUg1p7gF4rcnQ9A==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1033,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'SIZEjPH/vtDesZnARqcpPg==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1034,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'EYVVs/NwYM1JzFvXDalCgw==',	'+/Ke/mKJqSL20kx6XWIrsg==',	'2022-06-13'),
(1035,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'BJu/HvHOLeNjUsKZGU4rog==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1036,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'c5znyULi2TSzHtiCfOU2Ww==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13'),
(1037,	'Qn9m4I6gmzY3jZalBoEiaw==',	'Qn9m4I6gmzY3jZalBoEiaw==',	'BJu/HvHOLeNjUsKZGU4rog==',	'2niM/z9URP4PKns7E/qMHA==',	'2022-06-13');

-- 2022-06-13 04:51:22
