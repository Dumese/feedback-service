package com.feedback.service.controller;

import com.feedback.service.data.FeedBackEntity;
import com.feedback.service.dto.AddFeedBackDTO;
import com.feedback.service.service.FeedBackService;
import com.feedback.service.vo.FeedBackInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Wangymeng
 * @date Created in 2022/12/18 10:59
 * @description 类描述
 */
@RestController
@RequestMapping("/api/user")
@Api(tags = "用户管理接口")
public class FeedBackController {

    @Autowired
    private FeedBackService feedBackService;

    /**
     * 查询用户列表（从数据库）
     */
    // RequestMapping 请求类型  value = "/list" 请求路径（自定义） method = RequestMethod.GET 请求类型，GET post 请求
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    // 接口的注解
    @ApiOperation(value = "根据id查询")

    public FeedBackEntity getFeedBack(@RequestParam Long id) {
        return feedBackService.getFeedBack(id);
    }

    /**
     * 新增反馈信息
     *
     * @param addFeedBackDTO 新增实体
     * @return
     */

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ApiOperation(value = "新增反馈")
    public Map<String, String> addUser(@RequestBody @Validated AddFeedBackDTO addFeedBackDTO) {
        Map<String, String> result = new HashMap<>();
        Long count = feedBackService.addFeedBack(addFeedBackDTO);
        // 插入的数据总数
        result.put("id", count.toString());
        result.put("status", "成功");
        return result;
    }


    /**
     * 获取反馈列表（从数据库）
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value = "反馈记录列表")
    public  List<FeedBackInfoVO> feedList(){
        return feedBackService.feedList();
    }
}