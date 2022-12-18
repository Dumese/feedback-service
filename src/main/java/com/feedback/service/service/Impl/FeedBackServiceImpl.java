package com.feedback.service.service.Impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feedback.service.data.FeedBackEntity;
import com.feedback.service.dto.AddFeedBackDTO;
import com.feedback.service.mapper.FeedBackMapper;
import com.feedback.service.service.FeedBackService;
import com.feedback.service.vo.FeedBackInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Wangymeng
 * @date Created in 2022/12/18 11:11
 * @description 类描述
 */
@Service
public class FeedBackServiceImpl extends ServiceImpl<FeedBackMapper, FeedBackEntity> implements FeedBackService {
    @Autowired
    protected FeedBackMapper feedBackMapper;

    @Override
    public FeedBackEntity getFeedBack(@RequestParam Long id) {
        FeedBackEntity feedBackEntity = feedBackMapper.selectById(id);
        if (null == feedBackEntity) {
            return new FeedBackEntity();
        }
        return feedBackEntity;
    }

    @Override
    public List<FeedBackInfoVO> feedList() {
        LambdaQueryWrapper<FeedBackEntity> wrapper = new LambdaQueryWrapper<>();
        List<FeedBackEntity> userEntityList = baseMapper.selectList(wrapper);
        return BeanUtil.copyToList(userEntityList, FeedBackInfoVO.class);
    }


    @Override
    public Long addFeedBack(AddFeedBackDTO addFeedBackDTO) {
        FeedBackEntity feedBackEntity = new FeedBackEntity();
        feedBackEntity.setUserName(addFeedBackDTO.getUserName());
        feedBackEntity.setEmail(addFeedBackDTO.getEmail());
        feedBackEntity.setType(addFeedBackDTO.getType());
        feedBackEntity.setPhone(addFeedBackDTO.getPhone());
        feedBackEntity.setContent(addFeedBackDTO.getContent());
        feedBackMapper.insert(feedBackEntity);
        return feedBackEntity.getId();
    }
}
