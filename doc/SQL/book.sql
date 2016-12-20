/*
Navicat MySQL Data Transfer

Source Server         : 远程用于测试
Source Server Version : 50540
Source Host           : 122.97.128.106:3306
Source Database       : spring_basis

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-12-20 15:54:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `isbn` varchar(25) NOT NULL COMMENT 'ISBN',
  `book_name` varchar(25) DEFAULT NULL COMMENT '书名',
  `price` int(10) DEFAULT NULL COMMENT '价格'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1001', 'java教学', '100');
INSERT INTO `book` VALUES ('1002', 'Oracle书籍', '70');
