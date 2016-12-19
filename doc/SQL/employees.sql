/*
Navicat MySQL Data Transfer

Source Server         : 远程用于测试
Source Server Version : 50540
Source Host           : 122.97.128.106:3306
Source Database       : spring_basis

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-12-19 16:25:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `LAST_NAME` varchar(25) DEFAULT NULL COMMENT '名',
  `EMAIL` varchar(100) CHARACTER SET utf8 COLLATE utf8_icelandic_ci DEFAULT NULL COMMENT '邮箱',
  `DEPT_ID` int(20) NOT NULL COMMENT 'department_id',
  PRIMARY KEY (`ID`),
  KEY `id` (`ID`) USING HASH,
  KEY `外键` (`DEPT_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('1', 'Roy', 'yaolong551@163.com', '1');
INSERT INTO `employees` VALUES ('2', 'long', '503537312@qq.com', '2');
