/*
 Navicat Premium Data Transfer

 Source Server         : W_Fish_Dragon
 Source Server Type    : MySQL
 Source Server Version : 80030 (8.0.30)
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 80030 (8.0.30)
 File Encoding         : 65001

 Date: 12/05/2024 02:01:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employ
-- ----------------------------
DROP TABLE IF EXISTS `employ`;
CREATE TABLE `employ`  (
  `cid` int NOT NULL,
  `cname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employ
-- ----------------------------
INSERT INTO `employ` VALUES (0, '撒达娃', '男');
INSERT INTO `employ` VALUES (1, '死亡操', '男');
INSERT INTO `employ` VALUES (2, '相反的', '男');
INSERT INTO `employ` VALUES (3, '顺德府', '女');
INSERT INTO `employ` VALUES (4, '十五日', '女');
INSERT INTO `employ` VALUES (5, '撒的佤', '男');
INSERT INTO `employ` VALUES (6, '今天又', '女');
INSERT INTO `employ` VALUES (7, '重写的', '女');
INSERT INTO `employ` VALUES (8, '部分的', '女');
INSERT INTO `employ` VALUES (9, '收东西', '男');
INSERT INTO `employ` VALUES (10, '张阿瓦达', '男');
INSERT INTO `employ` VALUES (11, '张升到', '女');
INSERT INTO `employ` VALUES (12, '张打完', '男');
INSERT INTO `employ` VALUES (13, '张个人', '女');
INSERT INTO `employ` VALUES (100, 'asdasdw', '男');

SET FOREIGN_KEY_CHECKS = 1;
