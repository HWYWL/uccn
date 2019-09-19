/*
 Navicat Premium Data Transfer

 Source Server         : 一丁点
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : uccn

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 19/09/2019 09:42:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '文章',
  `img_options` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '文章图片视频url，JSON 结构',
  `status` tinyint(11) NOT NULL DEFAULT 0 COMMENT '0 下线，1 上线',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '文章详情' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (1, '我们的服务', '有效的供应链管理可以帮助实现四项目标：缩短现金周转时间；降低企业面临的风险；实现盈利增长；提供可预测收入。\n\n供应链管理的目标是在满足客户需要的前提下，对整个供应链（从供货商，制造商，分销商到消费者）的各个环节进行综合管理，例如从采购、物料管理、生产、配送、营销到消费者的整个供应链的货物流、信息流和资金流，把物流与库存成本降到最小。\n\n供应链管理就是指对整个供应链系统进行计划、协调、操作、控制和优化的各种活动和过程，其目标是要将顾客所需的正确的产品（Right Product）能够在正确的时间（Right Time）、按照正确的数量（Right Quantity）、正确的质量（Right Quality）和正确的状态（Right Status）送到正确的地点（Right Place），并使总成本达到最佳化。', 'https://i.loli.net/2019/09/10/vrRkLbqx38pc9QX.jpg', 0, '2019-09-10 18:08:31', '2019-09-10 18:08:31');
INSERT INTO `article` VALUES (2, '我们的理念', '有效的供应链管理可以帮助实现四项目标：缩短现金周转时间；降低企业面临的风险；实现盈利增长；提供可预测收入。\n\n供应链管理的目标是在满足客户需要的前提下，对整个供应链（从供货商，制造商，分销商到消费者）的各个环节进行综合管理，例如从采购、物料管理、生产、配送、营销到消费者的整个供应链的货物流、信息流和资金流，把物流与库存成本降到最小。\n\n供应链管理就是指对整个供应链系统进行计划、协调、操作、控制和优化的各种活动和过程，其目标是要将顾客所需的正确的产品（Right Product）能够在正确的时间（Right Time）、按照正确的数量（Right Quantity）、正确的质量（Right Quality）和正确的状态（Right Status）送到正确的地点（Right Place），并使总成本达到最佳化。', 'https://i.loli.net/2019/09/10/564LzuRHem3nXGt.jpg', 0, '2019-09-10 18:19:19', '2019-09-10 18:19:19');
INSERT INTO `article` VALUES (3, '我们的实力', '反正很厉害', 'https://i.loli.net/2019/09/10/564LzuRHem3nXGt.jpg,https://i.loli.net/2019/09/10/vrRkLbqx38pc9QX.jpg,https://i.loli.net/2019/09/10/t916mnc7ev3HBJV.jpg,https://i.loli.net/2019/09/10/zEkVeowrxAml6Fy.jpg', 0, '2019-09-10 18:22:49', '2019-09-10 18:22:49');
INSERT INTO `article` VALUES (4, '我们的品牌', '品牌的力量', 'https://i.loli.net/2019/09/10/564LzuRHem3nXGt.jpg,https://i.loli.net/2019/09/10/vrRkLbqx38pc9QX.jpg,https://i.loli.net/2019/09/10/t916mnc7ev3HBJV.jpg,https://i.loli.net/2019/09/10/zEkVeowrxAml6Fy.jpg,https://i.loli.net/2019/09/10/iSVcFUpga2GA5xt.jpg', 0, '2019-09-10 18:24:39', '2019-09-10 18:24:39');

-- ----------------------------
-- Table structure for banner
-- ----------------------------
DROP TABLE IF EXISTS `banner`;
CREATE TABLE `banner`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `img_options` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '文章图片url，JSON 结构',
  `status` tinyint(11) NOT NULL DEFAULT 0 COMMENT '0 下线，1 上线',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '首页banner' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of banner
-- ----------------------------
INSERT INTO `banner` VALUES (1, 'http://192.168.99.100:8888/group1/M00/00/00/wKhjZFuGncmAIAYmAAJsB-861jY878.jpg', 0, '2018-08-29 21:20:54');
INSERT INTO `banner` VALUES (2, 'http://192.168.99.100:8888/group1/M00/00/00/wKhjZFuGncmANef0AACkKLuZjkA705.jpg', 0, '2018-08-29 21:20:54');
INSERT INTO `banner` VALUES (3, 'http://192.168.99.100:8888/group1/M00/00/00/wKhjZFuGpaKAcZM6AAUO-685wQA488.jpg', 0, '2018-08-29 21:54:23');
INSERT INTO `banner` VALUES (4, 'http://192.168.99.100:8888/group1/M00/00/00/wKhjZFuGpaKAGYBrAAUCJkHsshU384.jpg', 0, '2018-08-29 21:54:23');
INSERT INTO `banner` VALUES (5, 'https://i.loli.net/2019/01/11/5c37ffeea3fa9.jpg', 0, '2019-01-11 10:31:09');
INSERT INTO `banner` VALUES (6, 'https://i.loli.net/2019/01/11/5c37ffeea4f28.jpg', 0, '2019-01-11 10:31:09');
INSERT INTO `banner` VALUES (7, 'https://i.loli.net/2019/01/11/5c380184c3452.jpg', 0, '2019-01-11 10:37:55');
INSERT INTO `banner` VALUES (8, 'https://i.loli.net/2019/01/11/5c380184d5743.jpg', 0, '2019-01-11 10:37:55');

-- ----------------------------
-- Table structure for contact
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '办公地址',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '手机号码',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '邮箱',
  `qq` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'qq',
  `wx` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '微信',
  `ownership` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '版权所有者，公司名称',
  `crateDate` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '联系方式表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES (1, '广州市天河区东圃镇', '18815926336', '1111665@qq.com', '1111665', 'wx2132112', '未来科技', '2018-08-29 21:14:49');
INSERT INTO `contact` VALUES (2, '广州市南沙区TIT创意园', '18616850866', 'cydong@eding.vip', '1111665', 'wx2132112', '广州一丁点科技有限公司', '2019-09-10 18:26:45');

-- ----------------------------
-- Table structure for presentation
-- ----------------------------
DROP TABLE IF EXISTS `presentation`;
CREATE TABLE `presentation`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '标题',
  `brief` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '简介',
  `trademark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '品牌',
  `marketing` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '营销',
  `trademark_small_label_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '品牌小便签1',
  `trademark_small_label_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '品牌小便签5',
  `trademark_small_label_3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '品牌小便签3',
  `trademark_small_label_4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '品牌小便签4',
  `marketing_small_label_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '营销小便签1',
  `marketing_small_label_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '营销小便签2',
  `marketing_small_label_3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '营销小便签3',
  `marketing_small_label_4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '营销小便签4',
  `status` tinyint(11) NOT NULL DEFAULT 1 COMMENT '1 为有效 2 为禁用',
  `crateDate` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公司简介表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of presentation
-- ----------------------------
INSERT INTO `presentation` VALUES (1, '我们是中国的品牌和设计机构。', '近年来，随着微商市场份额的逐渐扩大，越来越多的企业开始进入微商渠道，但微商究竟怎么玩，怎么做品牌策划方面的工作，大部分的企业仍然一头雾水，鹰九营销策划公司就微商层面，分析了部分微商案例为大家提供更多思考。', '品牌体验', '媒体营销', '', '', '', '', '', '', '', '', 1, '2018-08-29 23:47:27');
INSERT INTO `presentation` VALUES (2, '我们是中国的品牌和设计机构。', '近年来，随着微商市场份额的逐渐扩大，越来越多的企业开始进入微商渠道，但微商究竟怎么玩，怎么做品牌策划方面的工作，大部分的企业仍然一头雾水，鹰九营销策划公司就微商层面，分析了部分微商案例为大家提供更多思考。', '品牌体验', '媒体营销', '', '', '', '', '', '', '', '', 1, '2018-08-29 23:55:17');
INSERT INTO `presentation` VALUES (3, '我们是中国的品牌和设计机构。', '近年来，随着微商市场份额的逐渐扩大，越来越多的企业开始进入微商渠道，但微商究竟怎么玩，怎么做品牌策划方面的工作，大部分的企业仍然一头雾水，鹰九营销策划公司就微商层面，分析了部分微商案例为大家提供更多思考。', '品牌体验', '媒体营销', '彰显个性', '追求互动', '蕴含情感', '创造快乐', '社会化媒体', '新媒体', '跨媒体', '移动媒体', 1, '2018-08-29 23:56:15');
INSERT INTO `presentation` VALUES (4, '我们是中国的品牌和设计机构。', '近年来，随着微商市场份额的逐渐扩大，越来越多的企业开始进入微商渠道，但微商究竟怎么玩，怎么做品牌策划方面的工作，大部分的企业仍然一头雾水，鹰九营销策划公司就微商层面，分析了部分微商案例为大家提供更多思考。', '品牌体验', '媒体营销', '彰显个性', '追求互动', '蕴含情感', '创造快乐', '社会化媒体', '新媒体', '跨媒体', '移动媒体', 1, '2019-09-10 17:44:13');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '密码',
  `type` tinyint(11) NOT NULL DEFAULT 1 COMMENT '1 为管理员  2 为编辑',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `status` tinyint(11) NOT NULL DEFAULT 1 COMMENT '1 为有效 2 为禁用',
  `crateDate` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'e10adc3949ba59abbe56e057f20f883e', 1, '104514555@qq.com', 1, '2018-08-29 21:09:37');

SET FOREIGN_KEY_CHECKS = 1;
