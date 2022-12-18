package com.feedback.service.data;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Wangymeng
 * @date Created in 2022/12/18 10:53
 * @description 类描述
 */
@Data
@TableName("feedback_101")
public class FeedBackEntity {
    /**
     * 用户id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 用户名
     */
    @TableField("username")
    private String userName;
    /**
     * 邮箱
     */
    @TableField("email")
    private String email;
    /**
     * 电话号码
     */
    @TableField("phone")
    private String phone;
    /**
     * 反馈类型
     */
    @TableField("feedback_type")
    private String type;
    /**
     * 反馈内容
     */
    @TableField("feedback_content")
    private String content;
    /**
     * 是否解决
     */
    @TableField("slove")
    private int slove;
    /**
     * 当前时间
     */
    @TableField("feedback_time")
    private Timestamp time;
}