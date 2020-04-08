package com.yang.controller;

import com.yang.pojo.Article;
import com.yang.pojo.ArticleWithBLOBs;
import com.yang.pojo.Category;
import com.yang.pojo.Tag;
import com.yang.service.ArticleService;
import com.yang.service.CategoryService;
import com.yang.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 张杨
 * @date 2020/4/2  1:20
 */
@Controller
public class ContentController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private TagService tagService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/content/{id}")
    public String content(@PathVariable("id") Integer id, Model model){
        ArticleWithBLOBs article = (ArticleWithBLOBs) articleService.findById(id);
        model.addAttribute("article",article);
        List<Article> articles = articleService.findAllByTime();
        model.addAttribute("articles",articles);
        List<Tag> tags = articleService.findTagByArticleId(id);
        model.addAttribute("tags",tags);
        List<Tag> allTags = tagService.findAllTag();
        model.addAttribute("allTags",allTags);
        List<Category> categories = categoryService.findAllCategory();
        model.addAttribute("categories",categories);
        return "text";
    }
}
