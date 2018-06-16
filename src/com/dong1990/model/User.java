package com.dong1990.model;

public class User {

    /*
     * CREATE TABLE `sys_user` (
      `user_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
      `user_code` varchar(32) NOT NULL COMMENT '用户账号',
      `user_name` varchar(64) NOT NULL COMMENT '用户名称',
      `user_password` varchar(32) NOT NULL COMMENT '用户密码',
      `user_state` char(1) NOT NULL COMMENT '1:正常,0:暂停',
      PRIMARY KEY (`user_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
     */
    private Long user_id;
    private String user_code;
    private String user_name;
    private String user_password;
    private Character user_state;
}
