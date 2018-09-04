/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : uccn

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-08-29 23:59:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '文章',
  `img_options` text COMMENT '文章图片视频url，JSON 结构',
  `status` tinyint(11) NOT NULL DEFAULT '0' COMMENT '0 下线，1 上线',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章详情';

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for banner
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `img_options` text COMMENT '文章图片url，JSON 结构',
  `status` tinyint(11) NOT NULL DEFAULT '0' COMMENT '0 下线，1 上线',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `create_time` (`create_time`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='首页banner';

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES ('1', 'http://192.168.99.100:8888/group1/M00/00/00/wKhjZFuGncmAIAYmAAJsB-861jY878.jpg', '0', '2018-08-29 21:20:54');
INSERT INTO `banner` VALUES ('2', 'http://192.168.99.100:8888/group1/M00/00/00/wKhjZFuGncmANef0AACkKLuZjkA705.jpg', '0', '2018-08-29 21:20:54');
INSERT INTO `banner` VALUES ('3', 'http://192.168.99.100:8888/group1/M00/00/00/wKhjZFuGpaKAcZM6AAUO-685wQA488.jpg', '0', '2018-08-29 21:54:23');
INSERT INTO `banner` VALUES ('4', 'http://192.168.99.100:8888/group1/M00/00/00/wKhjZFuGpaKAGYBrAAUCJkHsshU384.jpg', '0', '2018-08-29 21:54:23');

-- ----------------------------
-- Table structure for contact
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `address` varchar(255) NOT NULL DEFAULT '' COMMENT '办公地址',
  `phone` varchar(255) NOT NULL DEFAULT '' COMMENT '手机号码',
  `email` varchar(255) NOT NULL DEFAULT '' COMMENT '邮箱',
  `qq` varchar(255) NOT NULL DEFAULT '' COMMENT 'qq',
  `wx` varchar(255) NOT NULL DEFAULT '' COMMENT '微信',
  `ownership` varchar(255) NOT NULL DEFAULT '' COMMENT '版权所有者，公司名称',
  `crateDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='联系方式表';

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES ('1', '广州市天河区东圃镇', '18815926336', '1111665@qq.com', '1111665', 'wx2132112', '未来科技', '2018-08-29 21:14:49');

-- ----------------------------
-- Table structure for presentation
-- ----------------------------
DROP TABLE IF EXISTS `presentation`;
CREATE TABLE `presentation` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
  `brief` text COMMENT '简介',
  `trademark` varchar(255) NOT NULL DEFAULT '' COMMENT '品牌',
  `marketing` varchar(255) NOT NULL DEFAULT '' COMMENT '营销',
  `trademark_small_label_1` varchar(255) NOT NULL DEFAULT '' COMMENT '品牌小便签1',
  `trademark_small_label_2` varchar(255) NOT NULL DEFAULT '' COMMENT '品牌小便签5',
  `trademark_small_label_3` varchar(255) NOT NULL DEFAULT '' COMMENT '品牌小便签3',
  `trademark_small_label_4` varchar(255) NOT NULL DEFAULT '' COMMENT '品牌小便签4',
  `marketing_small_label_1` varchar(255) NOT NULL DEFAULT '' COMMENT '营销小便签1',
  `marketing_small_label_2` varchar(255) NOT NULL DEFAULT '' COMMENT '营销小便签2',
  `marketing_small_label_3` varchar(255) NOT NULL DEFAULT '' COMMENT '营销小便签3',
  `marketing_small_label_4` varchar(255) NOT NULL DEFAULT '' COMMENT '营销小便签4',
  `status` tinyint(11) NOT NULL DEFAULT '1' COMMENT '1 为有效 2 为禁用',
  `crateDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='公司简介表';

-- ----------------------------
-- Records of presentation
-- ----------------------------
INSERT INTO `presentation` VALUES ('1', '我们是中国的品牌和设计机构。', '近年来，随着微商市场份额的逐渐扩大，越来越多的企业开始进入微商渠道，但微商究竟怎么玩，怎么做品牌策划方面的工作，大部分的企业仍然一头雾水，鹰九营销策划公司就微商层面，分析了部分微商案例为大家提供更多思考。', '品牌体验', '媒体营销', '', '', '', '', '', '', '', '', '1', '2018-08-29 23:47:27');
INSERT INTO `presentation` VALUES ('2', '我们是中国的品牌和设计机构。', '近年来，随着微商市场份额的逐渐扩大，越来越多的企业开始进入微商渠道，但微商究竟怎么玩，怎么做品牌策划方面的工作，大部分的企业仍然一头雾水，鹰九营销策划公司就微商层面，分析了部分微商案例为大家提供更多思考。', '品牌体验', '媒体营销', '', '', '', '', '', '', '', '', '1', '2018-08-29 23:55:17');
INSERT INTO `presentation` VALUES ('3', '我们是中国的品牌和设计机构。', '近年来，随着微商市场份额的逐渐扩大，越来越多的企业开始进入微商渠道，但微商究竟怎么玩，怎么做品牌策划方面的工作，大部分的企业仍然一头雾水，鹰九营销策划公司就微商层面，分析了部分微商案例为大家提供更多思考。', '品牌体验', '媒体营销', '彰显个性', '追求互动', '蕴含情感', '创造快乐', '社会化媒体', '新媒体', '跨媒体', '移动媒体', '1', '2018-08-29 23:56:15');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(255) NOT NULL DEFAULT '' COMMENT '密码',
  `type` tinyint(11) NOT NULL DEFAULT '1' COMMENT '1 为管理员  2 为编辑',
  `email` varchar(255) NOT NULL DEFAULT '',
  `status` tinyint(11) NOT NULL DEFAULT '1' COMMENT '1 为有效 2 为禁用',
  `crateDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '1', '104514555@qq.com', '1', '2018-08-29 21:09:37');
