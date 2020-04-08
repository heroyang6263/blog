package com.yang.service;


import com.yang.mapper.CategoryMapper;
import com.yang.pojo.Category;
import com.yang.pojo.CategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张杨
 * @date 2020/4/2  17:44
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ArticleService articleService;
    public List<Category> findAllCategory(){
        CategoryExample example = new CategoryExample();
        List<Category> categories = categoryMapper.selectByExample(example);
        for (Category category : categories){
            category.setArticles(articleService.findArticleByCategoryId(category.getCategoryId()));
        }
        return categories;
    }
}
