/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : 127.0.0.1:3306
 Source Schema         : PeanutVideo

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 04/01/2021 18:41:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_complain
-- ----------------------------
DROP TABLE IF EXISTS `sys_complain`;
CREATE TABLE `sys_complain` (
  `id` int(11) NOT NULL COMMENT '被举报信息的id',
  `type` int(255) DEFAULT NULL COMMENT '举报类型：0用户 1评论 2视频',
  `create_time` datetime(1) DEFAULT NULL COMMENT '举报时间',
  `update_time` datetime DEFAULT NULL COMMENT '处理时间',
  `mark` int(1) DEFAULT NULL COMMENT '有效标志：0未处理 1已处理',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='举报信息表';

-- ----------------------------
-- Records of sys_complain
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `account` varchar(255) DEFAULT NULL COMMENT '用户名',
  `mark` varchar(255) DEFAULT NULL COMMENT '有效标志：0有效 1失效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for sys_user_pwd
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_pwd`;
CREATE TABLE `sys_user_pwd` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户密码';

-- ----------------------------
-- Records of sys_user_pwd
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `account` varchar(255) DEFAULT NULL COMMENT '账号',
  `type` int(1) DEFAULT NULL COMMENT '账户类型：0手机号 1QQ号 2微信号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user_fans
-- ----------------------------
DROP TABLE IF EXISTS `user_fans`;
CREATE TABLE `user_fans` (
  `user_id` int(255) DEFAULT NULL COMMENT '用户id',
  `fans_id` int(255) DEFAULT NULL COMMENT '粉丝id',
  `mark` int(1) DEFAULT NULL COMMENT '有效标志：0关注 1未关注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户粉丝表';

-- ----------------------------
-- Records of user_fans
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `profile` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `nickname` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `telephone` varchar(255) DEFAULT NULL COMMENT '电话号码',
  `gender` int(1) DEFAULT NULL COMMENT '性别：0女 1男',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `location` varchar(255) DEFAULT NULL COMMENT '所在地',
  `description` varchar(255) DEFAULT NULL COMMENT '个人简介',
  `cover_url` varchar(255) DEFAULT NULL COMMENT '封面地址',
  `mark` int(1) DEFAULT NULL COMMENT '有效标志：0有效 1禁用 2删除',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of user_info
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user_pwd
-- ----------------------------
DROP TABLE IF EXISTS `user_pwd`;
CREATE TABLE `user_pwd` (
  `user_id` int(11) NOT NULL COMMENT '用户id，参考User_Info',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户密码表';

-- ----------------------------
-- Records of user_pwd
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_id` int(255) DEFAULT NULL COMMENT '视频发布人id',
  `music_id` int(11) DEFAULT NULL COMMENT '背景音乐id',
  `topic_id` int(255) DEFAULT NULL COMMENT '话题id',
  `disc_id` int(11) DEFAULT NULL COMMENT '评论id',
  `title` varchar(255) DEFAULT NULL COMMENT '视频标题',
  `intro` varchar(255) DEFAULT NULL COMMENT '视频简介',
  `video_url` varchar(255) DEFAULT NULL COMMENT '视频播放地址',
  `cover_url` varchar(255) DEFAULT NULL COMMENT '封面地址',
  `status` int(1) DEFAULT NULL COMMENT '视频的播放状态：0公开 1私密',
  `mark` int(1) DEFAULT NULL COMMENT '有效标志：0待审核 1已发布 2已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频信息表';

-- ----------------------------
-- Records of video
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for video_disc
-- ----------------------------
DROP TABLE IF EXISTS `video_disc`;
CREATE TABLE `video_disc` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `father_id` int(11) DEFAULT NULL COMMENT '上级评论',
  `content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `user_id` int(11) DEFAULT NULL COMMENT '评论用户',
  `create_time` datetime DEFAULT NULL COMMENT '评论时间',
  `mark` varchar(255) DEFAULT NULL COMMENT '有效标志',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论表';

-- ----------------------------
-- Records of video_disc
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for video_disc_praised
-- ----------------------------
DROP TABLE IF EXISTS `video_disc_praised`;
CREATE TABLE `video_disc_praised` (
  `disc_id` int(11) DEFAULT NULL COMMENT '评论id',
  `user_id` int(11) DEFAULT NULL COMMENT '点赞用户',
  `mark` int(1) DEFAULT NULL COMMENT '有效标志：0点赞 1取消点赞'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论获赞统计表';

-- ----------------------------
-- Records of video_disc_praised
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for video_praised
-- ----------------------------
DROP TABLE IF EXISTS `video_praised`;
CREATE TABLE `video_praised` (
  `video_id` int(11) DEFAULT NULL COMMENT '视频id',
  `user_id` int(11) DEFAULT NULL COMMENT '点赞人的id',
  `mark` int(11) DEFAULT NULL COMMENT '有效标志：0点赞 1取消点赞'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频获赞表';

-- ----------------------------
-- Records of video_praised
-- ----------------------------
BEGIN;
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
