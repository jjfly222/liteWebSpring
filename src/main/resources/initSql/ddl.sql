CREATE TABLE `123`.`student`
(
    `id`    int(11) NOT NULL,
    `name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `sex`   varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `age`   int(11) NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

INSERT INTO `123`.`student`(`id`, `name`, `sex`, `email`, `age`) VALUES (1, '赵磊', '男', '10010', 10);
INSERT INTO `123`.`student`(`id`, `name`, `sex`, `email`, `age`) VALUES (2, '千点', '男', '10010', 20);
INSERT INTO `123`.`student`(`id`, `name`, `sex`, `email`, `age`) VALUES (3, '孙峰', '男', '10010', 30);
INSERT INTO `123`.`student`(`id`, `name`, `sex`, `email`, `age`) VALUES (4, '李云', '女', '10010', 40);
INSERT INTO `123`.`student`(`id`, `name`, `sex`, `email`, `age`) VALUES (5, '周妹', '女', '10010', 50);
