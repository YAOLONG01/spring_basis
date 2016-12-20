/*
Navicat MySQL Data Transfer

Source Server         : 远程用于测试
Source Server Version : 50540
Source Host           : 122.97.128.106:3306
Source Database       : spring_basis

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-12-20 15:53:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book_stock
-- ----------------------------
DROP TABLE IF EXISTS `book_stock`;
CREATE TABLE `book_stock` (
  `isbn` varchar(25) NOT NULL COMMENT 'ISBN',
  `stock` int(10) DEFAULT NULL COMMENT '库存'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book_stock
-- ----------------------------
INSERT INTO `book_stock` VALUES ('1001', '10');
INSERT INTO `book_stock` VALUES ('1002', '10');
