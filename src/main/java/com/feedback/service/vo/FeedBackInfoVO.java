package com.feedback.service.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Wangymeng
 * @date Created in 2022/12/18 12:04
 * @description 类描述
 */
@Data
public class FeedBackInfoVO {
    /**
     * 负责人
     */
    @ApiModelProperty(value = "负责人")
    private String userName;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "反馈邮箱")
    private String email;
    /**
     * 反馈类型
     */
    @ApiModelProperty(value = "反馈类型")
    private String type;
    /**
     * 反馈内容
     */
    @ApiModelProperty(value = "反馈内容")
    private String content;
    /**
     * 反馈时间
     */
    @ApiModelProperty(value = "反馈时间")
    private Timestamp time;
}
