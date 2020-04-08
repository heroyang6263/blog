package com.yang.controller;

import com.yang.pojo.Article;

import com.yang.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 张杨
 */
@Controller
public class IndexController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String main(Model model){
        List<Article> articlesByView = articleService.findAllByView();
        List<Article> articlesByTime = articleService.findAllByTime();

        model.addAttribute("articlesByView",articlesByView);
        model.addAttribute("articlesByTime",articlesByTime);
        return "index";
    }
}
