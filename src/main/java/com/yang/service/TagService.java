package com.yang.service;

import com.yang.mapper.TagMapper;
import com.yang.pojo.Tag;
import com.yang.pojo.TagExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张杨
 * @date 2020/4/2  17:40
 */
@Service
public class TagService {
    @Autowired
    private TagMapper tagMapper;
    public List<Tag> findAllTag(){
        TagExample example = new TagExample();
        List<Tag> tags = tagMapper.selectByExample(example);
        return tags;
    }
}
