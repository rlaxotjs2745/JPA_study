CREATE TABLE IF NOT EXISTS `tb_page_data` (
    `idx_page_data` int(11) NOT NULL AUTO_INCREMENT COMMENT '인덱스',
    `enter_time` datetime NOT NULL COMMENT '페이지 입장 시간',
    `exit_time` datetime NOT NULL COMMENT '페이지 이탈 시간',
    `age_group` int(3) NOT NULL COMMENT '연령대',
    `gender` int(1) NOT NULL COMMENT '성별',
    `user_grade` int(3) NOT NULL COMMENT '유저 등급',
    PRIMARY KEY (`idx_page_data`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='사용자 페이지 이용 데이터';