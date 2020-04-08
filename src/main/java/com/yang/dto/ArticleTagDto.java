package com.yang.dto;

import com.yang.pojo.Tag;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author 张杨
 * @date 2020/4/7  1:24
 */
@Data
public class ArticleTagDto {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private Integer id;


    private List<Tag> tags;

}
