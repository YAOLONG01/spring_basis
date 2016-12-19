/*
Navicat MySQL Data Transfer

Source Server         : 远程用于测试
Source Server Version : 50540
Source Host           : 122.97.128.106:3306
Source Database       : spring_basis

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-12-19 16:25:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `NAME` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `id` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '教授');
INSERT INTO `department` VALUES ('2', '研发部');
