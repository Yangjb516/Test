/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 07/04/2022 16:36:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pub_book_evaluation
-- ----------------------------
DROP TABLE IF EXISTS `pub_book_evaluation`;
CREATE TABLE `pub_book_evaluation`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `BOOK_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书id',
  `SCORE` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CONTENT` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `UPDATE_DATE` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图书评价' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pub_book_evaluation
-- ----------------------------

-- ----------------------------
-- Table structure for pub_books
-- ----------------------------
DROP TABLE IF EXISTS `pub_books`;
CREATE TABLE `pub_books`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `BOOK_CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BOOK_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `AUTHOR` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `DESCRI` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BOOK_TYPE` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PRESS` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CUR_NUM` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `TOTAL_NUM` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `UPDATE_DATE` datetime(0) NULL DEFAULT NULL,
  `QY_FLAG` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BOR_NUM` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '借阅次数',
  `RE_BOR_NUM` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '续借次数',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图书' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pub_books
-- ----------------------------
INSERT INTO `pub_books` VALUES ('1', '1', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for pub_data_lib
-- ----------------------------
DROP TABLE IF EXISTS `pub_data_lib`;
CREATE TABLE `pub_data_lib`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TYPE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '编码',
  `VALUE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '值',
  `DESCRI` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `IS_USE` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否启用',
  `CREATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `UPDATE_DATE` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '数据字典' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pub_data_lib
-- ----------------------------

-- ----------------------------
-- Table structure for pub_e_books
-- ----------------------------
DROP TABLE IF EXISTS `pub_e_books`;
CREATE TABLE `pub_e_books`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `TYPE` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `DOWNLOAD_NUM` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `UPDATE_DATE` datetime(0) NULL DEFAULT NULL,
  `QY_FLAG` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `SC_FLAG` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '电子书' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pub_e_books
-- ----------------------------

-- ----------------------------
-- Table structure for pub_menu
-- ----------------------------
DROP TABLE IF EXISTS `pub_menu`;
CREATE TABLE `pub_menu`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `P_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `URL` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ROLE_CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `QY_FLAG` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ORDER_NUM` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `UPDATE_DATE` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pub_menu
-- ----------------------------

-- ----------------------------
-- Table structure for pub_users
-- ----------------------------
DROP TABLE IF EXISTS `pub_users`;
CREATE TABLE `pub_users`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `LOGIN_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PASSWORD` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ROLE_CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `NJ_CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BJ_CODE` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `UPDATE_DATE` datetime(0) NULL DEFAULT NULL,
  `CREDIT_LEV` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pub_users
-- ----------------------------
INSERT INTO `pub_users` VALUES ('4028810657218e400157218fd34f0002', 'gj', '111111', '贡健', '3', '1', '60', '2016-09-19 16:10:12', '2018-04-11 13:05:47', '3');
INSERT INTO `pub_users` VALUES ('402881ed573c769d01573c790a450003', 'ts_admin1', '111111', '图书管理员1', '2', '1', '60', '2016-09-20 16:05:23', '2016-12-02 15:26:21', '3');
INSERT INTO `pub_users` VALUES ('402881ed573c769d01573c791a4f0004', 'ts_admin2', '111111', '图书管理员2', '2', '2', '70', '2016-09-20 16:05:23', '2016-11-16 15:19:29', '3');
INSERT INTO `pub_users` VALUES ('402881f955e8b7b20155e8deeeca0001', 'yjb', '111111', '杨建波', '3', '3', '80', '2016-09-19 16:10:12', '2016-11-07 14:01:27', '3');
INSERT INTO `pub_users` VALUES ('402881f955e91cb90155e93203d60001', 'wmf', '111111', '王梦飞', '3', '3', '80', '2016-09-19 16:10:12', '2016-11-07 14:01:23', '3');
INSERT INTO `pub_users` VALUES ('402881f955e91cb90155e93264540002', 'gy', '111111', '耿悦', '3', '4', '90', '2016-09-19 16:10:12', '2016-11-07 14:01:16', '3');
INSERT INTO `pub_users` VALUES ('402881f9574163720157416a1d6b0001', 'gwb', '111111', '郭万博', '3', '4', '90', '2016-09-19 16:10:12', '2018-04-11 14:42:27', '3');
INSERT INTO `pub_users` VALUES ('70723624-a4af-11e6-9ac2-54ee7544ff22', 'admin', 'admin', '系统管理员', '1', '1', '1', '2016-11-07 14:00:09', '2016-11-09 11:19:23', '3');

-- ----------------------------
-- Table structure for pub_users_books
-- ----------------------------
DROP TABLE IF EXISTS `pub_users_books`;
CREATE TABLE `pub_users_books`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `USER_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `BOOK_ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书id',
  `CREATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `UPDATE_BY` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CREATE_DATE` datetime(0) NULL DEFAULT NULL,
  `UPDATE_DATE` datetime(0) NULL DEFAULT NULL,
  `BOR_DATE` datetime(0) NULL DEFAULT NULL COMMENT '借阅日期',
  `RET_DATE` datetime(0) NULL DEFAULT NULL COMMENT '归还日期',
  `RET_DATE_REL` datetime(0) NULL DEFAULT NULL COMMENT '实际归还日期',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户的借阅' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pub_users_books
-- ----------------------------

-- ----------------------------
-- Table structure for tbl_dept
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dept`;
CREATE TABLE `tbl_dept`  (
  `ID` int(0) NOT NULL AUTO_INCREMENT,
  `DEPT_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `DEPT_CODE` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 103 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '测试-部门' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_dept
-- ----------------------------
INSERT INTO `tbl_dept` VALUES (1, '2', '3');
INSERT INTO `tbl_dept` VALUES (2, 'name', '1');
INSERT INTO `tbl_dept` VALUES (3, 'name', '1');
INSERT INTO `tbl_dept` VALUES (4, 'name0', '1');
INSERT INTO `tbl_dept` VALUES (5, 'name1', '1');
INSERT INTO `tbl_dept` VALUES (6, 'name2', '1');
INSERT INTO `tbl_dept` VALUES (7, 'name3', '1');
INSERT INTO `tbl_dept` VALUES (8, 'name4', '1');
INSERT INTO `tbl_dept` VALUES (9, 'name5', '1');
INSERT INTO `tbl_dept` VALUES (10, 'name6', '1');
INSERT INTO `tbl_dept` VALUES (11, 'name7', '1');
INSERT INTO `tbl_dept` VALUES (12, 'name8', '1');
INSERT INTO `tbl_dept` VALUES (13, 'name9', '1');
INSERT INTO `tbl_dept` VALUES (14, 'name10', '1');
INSERT INTO `tbl_dept` VALUES (15, 'name11', '1');
INSERT INTO `tbl_dept` VALUES (16, 'name12', '1');
INSERT INTO `tbl_dept` VALUES (17, 'name13', '1');
INSERT INTO `tbl_dept` VALUES (18, 'name14', '1');
INSERT INTO `tbl_dept` VALUES (19, 'name15', '1');
INSERT INTO `tbl_dept` VALUES (20, 'name16', '1');
INSERT INTO `tbl_dept` VALUES (21, 'name17', '1');
INSERT INTO `tbl_dept` VALUES (22, 'name18', '1');
INSERT INTO `tbl_dept` VALUES (23, 'name19', '1');
INSERT INTO `tbl_dept` VALUES (24, 'name20', '1');
INSERT INTO `tbl_dept` VALUES (25, 'name21', '1');
INSERT INTO `tbl_dept` VALUES (26, 'name22', '1');
INSERT INTO `tbl_dept` VALUES (27, 'name23', '1');
INSERT INTO `tbl_dept` VALUES (28, 'name24', '1');
INSERT INTO `tbl_dept` VALUES (29, 'name25', '1');
INSERT INTO `tbl_dept` VALUES (30, 'name26', '1');
INSERT INTO `tbl_dept` VALUES (31, 'name27', '1');
INSERT INTO `tbl_dept` VALUES (32, 'name28', '1');
INSERT INTO `tbl_dept` VALUES (33, 'name29', '1');
INSERT INTO `tbl_dept` VALUES (34, 'name30', '1');
INSERT INTO `tbl_dept` VALUES (35, 'name31', '1');
INSERT INTO `tbl_dept` VALUES (36, 'name32', '1');
INSERT INTO `tbl_dept` VALUES (37, 'name33', '1');
INSERT INTO `tbl_dept` VALUES (38, 'name34', '1');
INSERT INTO `tbl_dept` VALUES (39, 'name35', '1');
INSERT INTO `tbl_dept` VALUES (40, 'name36', '1');
INSERT INTO `tbl_dept` VALUES (41, 'name37', '1');
INSERT INTO `tbl_dept` VALUES (42, 'name38', '1');
INSERT INTO `tbl_dept` VALUES (43, 'name39', '1');
INSERT INTO `tbl_dept` VALUES (44, 'name40', '1');
INSERT INTO `tbl_dept` VALUES (45, 'name41', '1');
INSERT INTO `tbl_dept` VALUES (46, 'name42', '1');
INSERT INTO `tbl_dept` VALUES (47, 'name43', '1');
INSERT INTO `tbl_dept` VALUES (48, 'name44', '1');
INSERT INTO `tbl_dept` VALUES (49, 'name45', '1');
INSERT INTO `tbl_dept` VALUES (50, 'name46', '1');
INSERT INTO `tbl_dept` VALUES (51, 'name47', '1');
INSERT INTO `tbl_dept` VALUES (52, 'name48', '1');
INSERT INTO `tbl_dept` VALUES (53, 'name49', '1');
INSERT INTO `tbl_dept` VALUES (54, 'name50', '1');
INSERT INTO `tbl_dept` VALUES (55, 'name51', '1');
INSERT INTO `tbl_dept` VALUES (56, 'name52', '1');
INSERT INTO `tbl_dept` VALUES (57, 'name53', '1');
INSERT INTO `tbl_dept` VALUES (58, 'name54', '1');
INSERT INTO `tbl_dept` VALUES (59, 'name55', '1');
INSERT INTO `tbl_dept` VALUES (60, 'name56', '1');
INSERT INTO `tbl_dept` VALUES (61, 'name57', '1');
INSERT INTO `tbl_dept` VALUES (62, 'name58', '1');
INSERT INTO `tbl_dept` VALUES (63, 'name59', '1');
INSERT INTO `tbl_dept` VALUES (64, 'name60', '1');
INSERT INTO `tbl_dept` VALUES (65, 'name61', '1');
INSERT INTO `tbl_dept` VALUES (66, 'name62', '1');
INSERT INTO `tbl_dept` VALUES (67, 'name63', '1');
INSERT INTO `tbl_dept` VALUES (68, 'name64', '1');
INSERT INTO `tbl_dept` VALUES (69, 'name65', '1');
INSERT INTO `tbl_dept` VALUES (70, 'name66', '1');
INSERT INTO `tbl_dept` VALUES (71, 'name67', '1');
INSERT INTO `tbl_dept` VALUES (72, 'name68', '1');
INSERT INTO `tbl_dept` VALUES (73, 'name69', '1');
INSERT INTO `tbl_dept` VALUES (74, 'name70', '1');
INSERT INTO `tbl_dept` VALUES (75, 'name71', '1');
INSERT INTO `tbl_dept` VALUES (76, 'name72', '1');
INSERT INTO `tbl_dept` VALUES (77, 'name73', '1');
INSERT INTO `tbl_dept` VALUES (78, 'name74', '1');
INSERT INTO `tbl_dept` VALUES (79, 'name75', '1');
INSERT INTO `tbl_dept` VALUES (80, 'name76', '1');
INSERT INTO `tbl_dept` VALUES (81, 'name77', '1');
INSERT INTO `tbl_dept` VALUES (82, 'name78', '1');
INSERT INTO `tbl_dept` VALUES (83, 'name79', '1');
INSERT INTO `tbl_dept` VALUES (84, 'name80', '1');
INSERT INTO `tbl_dept` VALUES (85, 'name81', '1');
INSERT INTO `tbl_dept` VALUES (86, 'name82', '1');
INSERT INTO `tbl_dept` VALUES (87, 'name83', '1');
INSERT INTO `tbl_dept` VALUES (88, 'name84', '1');
INSERT INTO `tbl_dept` VALUES (89, 'name85', '1');
INSERT INTO `tbl_dept` VALUES (90, 'name86', '1');
INSERT INTO `tbl_dept` VALUES (91, 'name87', '1');
INSERT INTO `tbl_dept` VALUES (92, 'name88', '1');
INSERT INTO `tbl_dept` VALUES (93, 'name89', '1');
INSERT INTO `tbl_dept` VALUES (94, 'name90', '1');
INSERT INTO `tbl_dept` VALUES (95, 'name91', '1');
INSERT INTO `tbl_dept` VALUES (96, 'name92', '1');
INSERT INTO `tbl_dept` VALUES (97, 'name93', '1');
INSERT INTO `tbl_dept` VALUES (98, 'name94', '1');
INSERT INTO `tbl_dept` VALUES (99, 'name95', '1');
INSERT INTO `tbl_dept` VALUES (100, 'name96', '1');
INSERT INTO `tbl_dept` VALUES (101, 'name97', '1');
INSERT INTO `tbl_dept` VALUES (102, 'name98', '1');
INSERT INTO `tbl_dept` VALUES (103, 'name99', '1');

-- ----------------------------
-- Table structure for tbl_employee
-- ----------------------------
DROP TABLE IF EXISTS `tbl_employee`;
CREATE TABLE `tbl_employee`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '测试-员工' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_employee
-- ----------------------------
INSERT INTO `tbl_employee` VALUES (1, 'Tom', 'tom@qq.com', '1', 11);
INSERT INTO `tbl_employee` VALUES (2, 'Jerry', 'jerry@qq.com', '0', 25);
INSERT INTO `tbl_employee` VALUES (3, 'Black', 'black@qq.com', '1', 30);
INSERT INTO `tbl_employee` VALUES (4, 'White', 'white@qq.com', '0', 35);
INSERT INTO `tbl_employee` VALUES (5, 'gaokun', 'gaokun@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (8, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (9, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (10, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (11, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (12, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (13, 'yjb', 'yjb@163.com', '1', 40);
INSERT INTO `tbl_employee` VALUES (17, 'gss', 'gss@qq.com', '0', 30);
INSERT INTO `tbl_employee` VALUES (18, 'gss', 'gss@qq.com', '0', 30);
INSERT INTO `tbl_employee` VALUES (19, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (20, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (21, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (22, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (23, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (24, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (25, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (26, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (27, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (28, 'yjb', 'yjb@163.com', '1', 31);
INSERT INTO `tbl_employee` VALUES (29, 'gss', 'gss@qq.com', NULL, NULL);

-- ----------------------------
-- Table structure for tbl_test
-- ----------------------------
DROP TABLE IF EXISTS `tbl_test`;
CREATE TABLE `tbl_test`  (
  `ID` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '测试-测试' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_test
-- ----------------------------
INSERT INTO `tbl_test` VALUES ('1', 'yjb');
INSERT INTO `tbl_test` VALUES ('2', 'gk');

SET FOREIGN_KEY_CHECKS = 1;
