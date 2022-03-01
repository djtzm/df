/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : lvyoujsps2599

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-11-18 14:34:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `chanpin`
-- ----------------------------
DROP TABLE IF EXISTS `chanpin`;
CREATE TABLE `chanpin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '特色产品',
  `biaoti` varchar(50) DEFAULT NULL COMMENT '标题',
  `neirong` varchar(3000) DEFAULT NULL COMMENT '内容',
  `dizhi` varchar(50) DEFAULT NULL COMMENT '地址',
  `image` varchar(255) DEFAULT NULL COMMENT '图片',
  `shijian` varchar(50) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chanpin
-- ----------------------------
INSERT INTO `chanpin` VALUES ('5', '特色产品信息', '内容介绍', '北京中关村', 'upload/1587639225511.jpg', '2020-11-18 14:18:13');
INSERT INTO `chanpin` VALUES ('6', '特色产品信息', '内容介绍', '北京中关村', 'upload/1587639258887.jpg', '2020-11-18 14:18:13');
INSERT INTO `chanpin` VALUES ('7', '特色产品信息', '内容介绍', '北京中关村', 'upload/1587639272859.jpg', '2020-11-18 14:18:13');
INSERT INTO `chanpin` VALUES ('8', '特色产品信息', '内容介绍', '北京中关村', 'upload/1587639300562.png', '2020-11-18 14:18:13');

-- ----------------------------
-- Table structure for `dx`
-- ----------------------------
DROP TABLE IF EXISTS `dx`;
CREATE TABLE `dx` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '信息介绍',
  `leibie` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '类别',
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '内容',
  `addtime` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of dx
-- ----------------------------
INSERT INTO `dx` VALUES ('1', '系统简介', '内容介绍', '2020-11-18 14:18:13');
INSERT INTO `dx` VALUES ('2', '关于我们', '内容介绍', '2020-11-18 14:18:13');
INSERT INTO `dx` VALUES ('3', '系统公告', '内容介绍', '2020-11-18 14:18:13');
INSERT INTO `dx` VALUES ('4', '网站简介', '内容介绍', '2020-11-18 14:18:13');

-- ----------------------------
-- Table structure for `gonggao`
-- ----------------------------
DROP TABLE IF EXISTS `gonggao`;
CREATE TABLE `gonggao` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公告新闻',
  `biaoti` varchar(50) DEFAULT NULL COMMENT '标题',
  `neirong` varchar(5000) DEFAULT NULL COMMENT '内容',
  `tupian` varchar(50) DEFAULT NULL COMMENT '图片',
  `shijian` varchar(50) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gonggao
-- ----------------------------
INSERT INTO `gonggao` VALUES ('1', '系统公告', '内容介绍', 'upload/1587639159514.png', '2020-11-18 14:18:13');
INSERT INTO `gonggao` VALUES ('2', '系统公告', '内容介绍', 'upload/1587639173774.png', '2020-11-18 14:18:13');
INSERT INTO `gonggao` VALUES ('3', '系统公告', '内容介绍', 'upload/1587639187744.png', '2020-11-18 14:18:13');
INSERT INTO `gonggao` VALUES ('10', '系统公告', '内容介绍', 'upload/1587639200583.png', '2020-11-18 14:18:13');

-- ----------------------------
-- Table structure for `jingdian`
-- ----------------------------
DROP TABLE IF EXISTS `jingdian`;
CREATE TABLE `jingdian` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '景点',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `neirong` varchar(3000) DEFAULT NULL COMMENT '内容',
  `leibieid` int(11) DEFAULT NULL COMMENT '类别id',
  `image` varchar(255) DEFAULT NULL COMMENT '图片',
  `jiage` int(11) DEFAULT NULL COMMENT '价格',
  `shijian` varchar(50) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jingdian
-- ----------------------------
INSERT INTO `jingdian` VALUES ('5', '旅游景点信息z', '内容介绍', '1', 'upload/1587639159514.png', '30', '2020-11-18 14:18:13');
INSERT INTO `jingdian` VALUES ('6', '旅游景点信息', '内容介绍', '2', 'upload/1587639173774.png', '30', '2020-11-18 14:18:13');
INSERT INTO `jingdian` VALUES ('7', '旅游景点信息', '内容介绍', '3', 'upload/1587639187744.png', '30', '2020-11-18 14:18:13');
INSERT INTO `jingdian` VALUES ('8', '旅游景点信息', '内容介绍', '1', 'upload/1587639200583.png', '30', '2020-11-18 14:18:13');
INSERT INTO `jingdian` VALUES ('9', '旅游景点信息', '内容介绍', '1', 'upload/1587639159514.png', '30', '2020-11-18 14:18:13');
INSERT INTO `jingdian` VALUES ('11', '旅游景点信息', '内容介绍', '1', 'upload/1587639173774.png', '30', '2020-11-18 14:18:13');
INSERT INTO `jingdian` VALUES ('12', '旅游景点信息', '内容介绍', '1', 'upload/1587639187744.png', '30', '2020-11-18 14:18:13');
INSERT INTO `jingdian` VALUES ('13', '旅游景点信息', '内容介绍', '2', 'upload/1587639200583.png', '30', '2020-11-18 14:18:13');

-- ----------------------------
-- Table structure for `jiudian`
-- ----------------------------
DROP TABLE IF EXISTS `jiudian`;
CREATE TABLE `jiudian` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '酒店',
  `biaoti` varchar(50) DEFAULT NULL COMMENT '标题',
  `neirong` varchar(3000) DEFAULT NULL COMMENT '内容',
  `dizhi` varchar(50) DEFAULT NULL COMMENT '地址',
  `image` varchar(255) DEFAULT NULL COMMENT '图片',
  `shijian` varchar(50) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jiudian
-- ----------------------------
INSERT INTO `jiudian` VALUES ('5', '海湖大酒店', '内容介绍', '北京中关村', 'upload/1587639089854.png', '2020-11-18 14:18:14');
INSERT INTO `jiudian` VALUES ('6', '海湖大酒店', '内容介绍', '北京中关村', 'upload/1587639107095.png', '2020-11-18 14:18:14');
INSERT INTO `jiudian` VALUES ('7', '海湖大酒店', '内容介绍', '北京中关村', 'upload/1587639120980.png', '2020-11-18 14:18:14');
INSERT INTO `jiudian` VALUES ('8', '海湖大酒店', '内容介绍', '北京中关村', 'upload/1587639136344.png', '2020-11-18 14:18:14');

-- ----------------------------
-- Table structure for `leibie`
-- ----------------------------
DROP TABLE IF EXISTS `leibie`;
CREATE TABLE `leibie` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别',
  `mingcheng` varchar(255) DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of leibie
-- ----------------------------
INSERT INTO `leibie` VALUES ('1', '盆地');
INSERT INTO `leibie` VALUES ('2', '高原');
INSERT INTO `leibie` VALUES ('3', '平原');

-- ----------------------------
-- Table structure for `lianjie`
-- ----------------------------
DROP TABLE IF EXISTS `lianjie`;
CREATE TABLE `lianjie` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '友情链接',
  `name` varchar(200) DEFAULT NULL COMMENT '名称',
  `url` varchar(200) DEFAULT NULL COMMENT '链接地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lianjie
-- ----------------------------
INSERT INTO `lianjie` VALUES ('2', '中华姓氏网', 'http://www.10000xing.cn/x010/wjx.html');
INSERT INTO `lianjie` VALUES ('3', '百度', 'https://www.baidu.com/');

-- ----------------------------
-- Table structure for `liuyan`
-- ----------------------------
DROP TABLE IF EXISTS `liuyan`;
CREATE TABLE `liuyan` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言',
  `biaoti` varchar(255) DEFAULT NULL COMMENT '标题',
  `neirong` varchar(4000) DEFAULT NULL COMMENT '内容',
  `liuyanshijian` varchar(55) DEFAULT NULL COMMENT '时间',
  `usersid` int(11) DEFAULT NULL COMMENT '用户id',
  `huifu` varchar(4000) DEFAULT NULL COMMENT '回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of liuyan
-- ----------------------------
INSERT INTO `liuyan` VALUES ('1', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', '222');
INSERT INTO `liuyan` VALUES ('2', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', 'h');
INSERT INTO `liuyan` VALUES ('3', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', 'hh');
INSERT INTO `liuyan` VALUES ('4', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', 'test');
INSERT INTO `liuyan` VALUES ('5', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', '');
INSERT INTO `liuyan` VALUES ('6', '留言信息', '内容介绍', '2020-11-18 14:18:14', '6', '');
INSERT INTO `liuyan` VALUES ('7', '留言信息', '内容介绍', '2020-11-18 14:18:14', '5', '');
INSERT INTO `liuyan` VALUES ('8', '留言信息', '内容介绍', '2020-11-18 14:18:14', '5', '');
INSERT INTO `liuyan` VALUES ('9', '留言信息', '内容介绍', '2020-11-18 14:18:14', '5', '22');
INSERT INTO `liuyan` VALUES ('10', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', ' ');
INSERT INTO `liuyan` VALUES ('11', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', null);
INSERT INTO `liuyan` VALUES ('12', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', null);
INSERT INTO `liuyan` VALUES ('13', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', 'sfds');
INSERT INTO `liuyan` VALUES ('14', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', 'sfds');
INSERT INTO `liuyan` VALUES ('15', '留言信息', '内容介绍', '2020-11-18 14:18:14', '2', 'sfds');

-- ----------------------------
-- Table structure for `lunbo`
-- ----------------------------
DROP TABLE IF EXISTS `lunbo`;
CREATE TABLE `lunbo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '轮播图',
  `biaoti` varchar(50) DEFAULT NULL COMMENT '标题',
  `image` varchar(255) DEFAULT NULL COMMENT '附件',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lunbo
-- ----------------------------
INSERT INTO `lunbo` VALUES ('13', 'ssd', 'upload/1587639035596.jpg');
INSERT INTO `lunbo` VALUES ('15', 'dfds', 'upload/1587639048508.jpg');
INSERT INTO `lunbo` VALUES ('16', 'fdsf', 'upload/1587639067347.jpg');

-- ----------------------------
-- Table structure for `meishi`
-- ----------------------------
DROP TABLE IF EXISTS `meishi`;
CREATE TABLE `meishi` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '美食',
  `biaoti` varchar(50) DEFAULT NULL COMMENT '标题',
  `neirong` varchar(3000) DEFAULT NULL COMMENT '内容',
  `dizhi` varchar(50) DEFAULT NULL COMMENT '地址',
  `image` varchar(255) DEFAULT NULL COMMENT '图片',
  `shijian` varchar(50) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of meishi
-- ----------------------------
INSERT INTO `meishi` VALUES ('5', '香酥鸡米花', '内容介绍', '北京中关村', 'upload/1587639225511.jpg', '2020-11-18 14:18:14');
INSERT INTO `meishi` VALUES ('6', '香酥鸡米花', '内容介绍', '北京中关村', 'upload/1587639258887.jpg', '2020-11-18 14:18:14');
INSERT INTO `meishi` VALUES ('7', '香酥鸡米花', '内容介绍', '北京中关村', 'upload/1587639272859.jpg', '2020-11-18 14:18:14');
INSERT INTO `meishi` VALUES ('8', '无壳鸡蛋', '内容介绍', '北京中关村', 'upload/1587639300562.png', '2020-11-18 14:18:14');

-- ----------------------------
-- Table structure for `pinglun`
-- ----------------------------
DROP TABLE IF EXISTS `pinglun`;
CREATE TABLE `pinglun` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论',
  `biaoti` varchar(50) DEFAULT NULL COMMENT '标题',
  `neirong` varchar(5000) DEFAULT NULL COMMENT '内容',
  `shijian` varchar(50) DEFAULT NULL COMMENT '时间',
  `jingdianid` int(11) DEFAULT NULL COMMENT '景点id',
  `usersid` int(255) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pinglun
-- ----------------------------
INSERT INTO `pinglun` VALUES ('1', '美丽漂亮', '内容介绍', '2020-11-18 14:18:14', '6', '5');
INSERT INTO `pinglun` VALUES ('2', '美丽漂亮', '内容介绍', '2020-11-18 14:18:14', '5', '5');

-- ----------------------------
-- Table structure for `shoucang`
-- ----------------------------
DROP TABLE IF EXISTS `shoucang`;
CREATE TABLE `shoucang` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收藏',
  `shijian` varchar(50) DEFAULT NULL COMMENT '时间',
  `jingdianid` int(11) DEFAULT NULL COMMENT '景点id',
  `usersid` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shoucang
-- ----------------------------
INSERT INTO `shoucang` VALUES ('18', '2020-11-18 14:18:14', '9', '5');
INSERT INTO `shoucang` VALUES ('19', '2020-11-18 14:18:14', '9', '5');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户',
  `loginname` varchar(50) DEFAULT NULL COMMENT '用户名称',
  `loginpw` varchar(50) DEFAULT NULL COMMENT '密码',
  `xingming` varchar(50) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(50) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(50) DEFAULT NULL COMMENT '年龄',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `dianhua` varchar(255) DEFAULT NULL COMMENT '电话',
  `shenhe` varchar(50) DEFAULT NULL COMMENT '审核',
  `type` varchar(50) DEFAULT NULL COMMENT '类型',
  `typename` varchar(50) DEFAULT NULL COMMENT '类型名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'laoshi', '000000', '刘三', '男', '24', '北京路', '13777777777', 'yes', '2', '用户');
INSERT INTO `users` VALUES ('2', 'a', 'a', '刘三', '男', '24', '北京路', '13777777777', 'yes', '0', '管理');
INSERT INTO `users` VALUES ('5', 'liusan', '000000', '刘三', '男', '24', '上海路', '13777777777', 'yes', '2', '用户');
INSERT INTO `users` VALUES ('6', 'hsg', 'hsg', '刘三', '男', '24', '26441186', '13777777777', 'yes', '0', '管理');
INSERT INTO `users` VALUES ('7', 'zzz', 'zzz', '刘三', '男', '24', 'zzz', '13777777777', 'yes', '2', '用户');
INSERT INTO `users` VALUES ('8', 'ggg', 'ggg', '刘三', '男', '24', 'ggg', '13777777777', 'yes', '2', '用户');
INSERT INTO `users` VALUES ('12', '55', '55', '刘三', '男', '24', '55', '13777777777', 'yes', '2', '用户');
INSERT INTO `users` VALUES ('13', '5566', '55', '刘三', '男', '24', '55', '13777777777', 'yes', '2', '用户');
INSERT INTO `users` VALUES ('14', 'ztest', '123456', '刘三', '男', '24', '22', '13777777777', 'yes', '2', '用户');

-- ----------------------------
-- Table structure for `xianlu`
-- ----------------------------
DROP TABLE IF EXISTS `xianlu`;
CREATE TABLE `xianlu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '旅游路线',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `neirong` varchar(3000) DEFAULT NULL COMMENT '内容',
  `leibieid` int(11) DEFAULT NULL COMMENT '类别id',
  `image` varchar(255) DEFAULT NULL COMMENT '附件',
  `shijian` varchar(50) DEFAULT NULL COMMENT '时间',
  `usersid` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xianlu
-- ----------------------------
INSERT INTO `xianlu` VALUES ('5', '景点线路', '内容介绍', '1', 'upload/1587639159514.png', '2020-11-18 14:18:15', '2');
INSERT INTO `xianlu` VALUES ('6', '景点线路', '内容介绍', '1', 'upload/1587639173774.png', '2020-11-18 14:18:15', '2');
INSERT INTO `xianlu` VALUES ('7', '景点线路', '内容介绍', '1', 'upload/1587639187744.png', '2020-11-18 14:18:15', '2');
INSERT INTO `xianlu` VALUES ('8', '景点线路', '内容介绍', '1', 'upload/1587639200583.png', '2020-11-18 14:18:15', '2');

-- ----------------------------
-- Table structure for `yuding`
-- ----------------------------
DROP TABLE IF EXISTS `yuding`;
CREATE TABLE `yuding` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '预定',
  `biaoti` varchar(50) DEFAULT NULL COMMENT '标题',
  `jiudianid` int(11) DEFAULT NULL COMMENT '酒店id',
  `usersid` int(11) DEFAULT NULL COMMENT '用户id',
  `riqi` varchar(50) DEFAULT NULL COMMENT '日期',
  `xingming` varchar(50) DEFAULT NULL COMMENT '姓名',
  `dianhua` varchar(50) DEFAULT NULL COMMENT '电话',
  `beizhu` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yuding
-- ----------------------------
INSERT INTO `yuding` VALUES ('1', '预订', '5', '5', '2020-11-18', '刘三', '13777777777', '无');
INSERT INTO `yuding` VALUES ('2', '预订', '5', '5', '2020-11-18', '刘三', '13777777777', '无');

-- ----------------------------
-- Table structure for `yuyue`
-- ----------------------------
DROP TABLE IF EXISTS `yuyue`;
CREATE TABLE `yuyue` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '预约',
  `biaoti` varchar(50) DEFAULT NULL COMMENT '标题',
  `xianluid` int(11) DEFAULT NULL COMMENT '线路id',
  `usersid` int(11) DEFAULT NULL COMMENT '用户id',
  `riqi` varchar(50) DEFAULT NULL COMMENT '日期',
  `xingming` varchar(50) DEFAULT NULL COMMENT '姓名',
  `dianhua` varchar(50) DEFAULT NULL COMMENT '电话',
  `beizhu` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yuyue
-- ----------------------------
INSERT INTO `yuyue` VALUES ('1', '预订', '5', '5', '2020-11-18', '刘三', '13777777777', '无');
INSERT INTO `yuyue` VALUES ('2', '预订', '5', '5', '2020-11-18', '刘三', '13777777777', '无');
