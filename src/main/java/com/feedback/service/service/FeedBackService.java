package com.feedback.service.service;

import com.feedback.service.data.FeedBackEntity;
import com.feedback.service.dto.AddFeedBackDTO;
import com.feedback.service.vo.FeedBackInfoVO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Wangymeng
 * @date Created in 2022/12/18 11:00
 * @description 类描述
 */
public interface FeedBackService {
    /**
     * 获取反馈信息列表
     *
     * @return 返回的参数  接口的命名 feedList
     */
    //List<FeedBackEntity> feedList();
     List<FeedBackInfoVO> feedList();
    /**
     * 根据id查询反馈信息
     * @param id 用户id
     * @return
     */
    FeedBackEntity getFeedBack(@RequestParam Long id);

    /**
     * 新增反馈信息
     * @param addFeedBackDTO 反馈实体
     * @return 新增成功数量
     */
    Long addFeedBack(AddFeedBackDTO addFeedBackDTO);
}