-- ----------------------------
-- Table structure for user
-- ----------------------------
CREATE TABLE `test`.`user` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT 'user name',
  `phoneNum` varchar(255) DEFAULT NULL COMMENT 'phone',
  `sex` int(255) DEFAULT NULL COMMENT 'sex',
  `password` varchar(255) DEFAULT NULL,
  `status` int(255) DEFAULT NULL,
  `headimgurl` varchar(255) DEFAULT NULL COMMENT 'icon'
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;