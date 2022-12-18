package com.feedback.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feedback.service.data.FeedBackEntity;

import java.util.List;

/**
 * @author Wangymeng
 * @date Created in 2022/12/18 10:53
 * @description 类描述
 */
public interface FeedBackMapper extends BaseMapper<FeedBackEntity> {
    /**
     * 获取用户列表
     *
     * @return List<FeedBackEntity>
     */
    List<FeedBackEntity> feedList();
}

