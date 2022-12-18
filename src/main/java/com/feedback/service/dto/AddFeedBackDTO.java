package com.feedback.service.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * @author Wangymeng
 * @date Created in 2022/12/18 10:59
 * @description 类描述
 */
@Data
public class AddFeedBackDTO {
    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    //@NotNull(message = "用户名不可为空！")
    private String userName;
    /**
     * 邮箱
     */
    @Email
    @ApiModelProperty("邮箱")
    private String email;
    /**
     * 电话号码
     */
    @TableField("phone")
    private String phone;
    /**
     * 反馈类型
     */
    @ApiModelProperty("反馈类型")
    private String type;
    /**
     * 反馈内容
     */
    @ApiModelProperty("反馈内容")
    private String content;
    /**
     * 反馈时间
     */
    @ApiModelProperty("反馈时间")
    private Timestamp time;
}