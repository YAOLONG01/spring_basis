/*
Navicat MySQL Data Transfer

Source Server         : 远程用于测试
Source Server Version : 50540
Source Host           : 122.97.128.106:3306
Source Database       : spring_basis

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-12-20 15:54:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `username` varchar(25) NOT NULL COMMENT '用户名',
  `balance` int(100) DEFAULT NULL COMMENT '账目'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('AA', '300');
