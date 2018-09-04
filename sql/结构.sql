/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : uccn

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-08-29 23:59:33
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
