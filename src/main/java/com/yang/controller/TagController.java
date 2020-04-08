package com.yang.controller;

import com.github.pagehelper.PageInfo;
import com.yang.pojo.Article;
import com.yang.pojo.Category;
import com.yang.pojo.Tag;
import com.yang.service.ArticleService;
import com.yang.service.CategoryService;
import com.yang.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 张杨
 * @date 2020/4/8  16:04
 */
@Controller
public class TagController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private TagService tagService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/tag")
    public String blog(Model model,
                       @RequestParam(name = "page",required = true,defaultValue = "1")int page,
                       @RequestParam(name = "size",required = true,defaultValue = "4")int size,
                       @RequestParam(name = "id",required = true) Integer id){

        List<Article> articles = articleService.findArticleByTagId(id,page,size);
        PageInfo pageInfo = new PageInfo<>(articles);
        List<Tag> tags = tagService.findAllTag();
        List<Category> categories = categoryService.findAllCategory();
        List<Article> articlesByTime = articleService.findAllByTime();
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("tags",tags);
        model.addAttribute("categories",categories);
        model.addAttribute("articlesByTime",articlesByTime);
        return "tagblog";
    }
}
