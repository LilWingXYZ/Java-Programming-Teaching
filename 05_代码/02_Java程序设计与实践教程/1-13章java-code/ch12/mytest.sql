/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : mytest
Target Host     : localhost:3306
Target Database : mytest
Date: 2017-06-15 09:33:51
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for package
-- ----------------------------
DROP TABLE IF EXISTS `package`;
CREATE TABLE `package` (
  `Name` varchar(32) default NULL,
  `ID` int(11) default NULL,
  `senderName` varchar(20) default NULL,
  `State` varchar(20) default NULL,
  `Fee` float default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of package
-- ----------------------------

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `gender` varchar(255) default NULL,
  `major` varchar(255) default NULL,
  `phone` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'zhangsan', 'dddd', 'eeee', '8665855443');

-- ----------------------------
-- Table structure for personnel
-- ----------------------------
DROP TABLE IF EXISTS `personnel`;
CREATE TABLE `personnel` (
  `Name` varchar(32) default NULL,
  `ID` int(11) default NULL,
  `Salary` float default NULL,
  `Gender` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of personnel
-- ----------------------------
