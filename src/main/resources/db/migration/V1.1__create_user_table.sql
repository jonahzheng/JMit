-- ----------------------------
-- Table structure for user
-- ----------------------------
CREATE TABLE `test`.`user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL,
  `intro` varchar(255) DEFAULT NULL
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
