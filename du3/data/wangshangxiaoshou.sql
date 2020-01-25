/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : 网上销售

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2020-01-15 14:33:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_card
-- ----------------------------
DROP TABLE IF EXISTS `t_card`;
CREATE TABLE `t_card` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(20) DEFAULT NULL,
  `c_price` int(11) DEFAULT NULL,
  `c_image` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_card
-- ----------------------------
INSERT INTO `t_card` VALUES ('1', '移动高配大流量卡Plus', '30', 'image/card/1.png');
INSERT INTO `t_card` VALUES ('2', '移动高配小流量卡', '30', 'image/card/2.png');
INSERT INTO `t_card` VALUES ('3', '移动普通钻石流量卡', '10', 'image/card/3.png');
INSERT INTO `t_card` VALUES ('4', '电信高配大流量卡Plus', '30', 'image/card/4.png');
INSERT INTO `t_card` VALUES ('5', '电信高配小流量卡', '40', 'image/card/5.png');
INSERT INTO `t_card` VALUES ('6', '电信普通牛牛流量卡', '10', 'image/card/6.png');
INSERT INTO `t_card` VALUES ('7', '联通高配大流量卡Plus', '30', 'image/card/7.png');
INSERT INTO `t_card` VALUES ('8', '联通高配小流量卡', '30', 'image/card/8.png');

-- ----------------------------
-- Table structure for t_fourenglish
-- ----------------------------
DROP TABLE IF EXISTS `t_fourenglish`;
CREATE TABLE `t_fourenglish` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT,
  `f_name` varchar(20) DEFAULT NULL,
  `f_price` int(11) DEFAULT NULL,
  `f_image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_fourenglish
-- ----------------------------
INSERT INTO `t_fourenglish` VALUES ('1', '星火英语四级通关练真题备考', '25', 'image/six/1.png');
INSERT INTO `t_fourenglish` VALUES ('2', '星火英语四级真题备考套卷练习题', '25', 'image/six/2.png');
INSERT INTO `t_fourenglish` VALUES ('3', '华研英语四级真题考试备考试题', '25', 'image/six/3.png');

-- ----------------------------
-- Table structure for t_qq
-- ----------------------------
DROP TABLE IF EXISTS `t_qq`;
CREATE TABLE `t_qq` (
  `q_id` int(11) NOT NULL AUTO_INCREMENT,
  `q_name` varchar(20) DEFAULT NULL,
  `q_price` decimal(10,0) DEFAULT NULL,
  `q_image` varchar(20) DEFAULT NULL,
  `q_time` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`q_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_qq
-- ----------------------------
INSERT INTO `t_qq` VALUES ('1', 'QQ会员', '11', 'image/qq/1.png', '1个月');
INSERT INTO `t_qq` VALUES ('2', 'QQ会员', '20', 'image/qq/1.png', '50天');
INSERT INTO `t_qq` VALUES ('3', 'QQ会员', '110', 'image/qq/1.png', '1年');
INSERT INTO `t_qq` VALUES ('4', 'QQ黄钻', '11', 'image/qq/2.png', '1个月');
INSERT INTO `t_qq` VALUES ('5', 'QQ黄钻', '20', 'image/qq/2.png', '50天');
INSERT INTO `t_qq` VALUES ('6', 'QQ黄钻', '109', 'image/qq/2.png', '1年');
INSERT INTO `t_qq` VALUES ('7', 'QQ绿钻', '12', 'image/qq/3.png', '25天');
INSERT INTO `t_qq` VALUES ('8', 'QQ绿钻', '25', 'image/qq/3.png', '50天');

-- ----------------------------
-- Table structure for t_sixenglish
-- ----------------------------
DROP TABLE IF EXISTS `t_sixenglish`;
CREATE TABLE `t_sixenglish` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(20) DEFAULT NULL,
  `s_price` int(11) DEFAULT NULL,
  `s_image` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sixenglish
-- ----------------------------
INSERT INTO `t_sixenglish` VALUES ('1', '星英语六级火通关练试题', '25', 'image/four/1.png');
INSERT INTO `t_sixenglish` VALUES ('2', '星火英语六级真题备考试卷真题', '25', 'image/four/2.png');
INSERT INTO `t_sixenglish` VALUES ('3', '华研英语六级真题试卷备考', '25', 'image/four/3.png');

-- ----------------------------
-- Table structure for t_vedio
-- ----------------------------
DROP TABLE IF EXISTS `t_vedio`;
CREATE TABLE `t_vedio` (
  `v_id` int(11) NOT NULL AUTO_INCREMENT,
  `v_name` varchar(20) DEFAULT NULL,
  `v_price` decimal(10,1) DEFAULT NULL,
  `v_image` varchar(255) DEFAULT NULL,
  `v_time` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`v_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_vedio
-- ----------------------------
INSERT INTO `t_vedio` VALUES ('1', '腾讯视频会员', '12.5', 'image/vedio/1.png', '1个月');
INSERT INTO `t_vedio` VALUES ('2', '腾讯视频会员', '11.0', 'image/vedio/1.png', '25天');
INSERT INTO `t_vedio` VALUES ('3', '腾讯视频会员', '20.0', 'image/vedio/1.png', '2个月');
INSERT INTO `t_vedio` VALUES ('4', '腾讯视频会员', '24.0', 'image/vedio/1.png', '75天');
INSERT INTO `t_vedio` VALUES ('5', '腾讯视频会员', '28.0', 'image/vedio/1.png', '3个月');
INSERT INTO `t_vedio` VALUES ('6', '爱奇艺会员', '5.0', 'image/vedio/2.png', '7天');
INSERT INTO `t_vedio` VALUES ('7', '爱奇艺会员', '13.8', 'image/vedio/2.png', '1个月');
INSERT INTO `t_vedio` VALUES ('8', '爱奇艺会员', '38.8', 'image/vedio/2.png', '3个月');
INSERT INTO `t_vedio` VALUES ('9', '爱奇艺会员', '72.3', 'image/vedio/2.png', '6个月');
INSERT INTO `t_vedio` VALUES ('10', '爱奇艺会员', '137.2', 'image/vedio/2.png', '一年');
INSERT INTO `t_vedio` VALUES ('11', '优酷会员', '6.0', 'image/vedio/3.png', '7天');
INSERT INTO `t_vedio` VALUES ('12', '优酷会员', '13.4', 'image/vedio/3.png', '1个月');
INSERT INTO `t_vedio` VALUES ('13', '优酷会员', '35.2', 'image/vedio/3.png', '3个月');
INSERT INTO `t_vedio` VALUES ('14', '优酷会员', '120.2', 'image/vedio/3.png', '1年');
INSERT INTO `t_vedio` VALUES ('15', '芒果会员', '10.5', 'image/vedio/4.png', '1个月');
INSERT INTO `t_vedio` VALUES ('16', '芒果会员', '4.4', 'image/vedio/4.png', '7天');
