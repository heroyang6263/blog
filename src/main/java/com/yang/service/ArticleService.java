package com.yang.service;

import com.github.pagehelper.PageHelper;
import com.yang.dto.ArticleTagDto;
import com.yang.mapper.ArticleMapper;
import com.yang.pojo.Article;
import com.yang.pojo.ArticleExample;
import com.yang.pojo.ArticleWithBLOBs;
import com.yang.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

/**
 * @author Administrator
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    public Article findById(Integer id){
        ArticleWithBLOBs article = articleMapper.selectByPrimaryKey(id);
        return article;
    }
    public List<Article> findAll(){
        ArticleExample example = new ArticleExample();
        List<Article> articles = articleMapper.selectByExample(example);
        return  articles;
    }
    public List<Article> findAllByView(){
        ArticleExample example = new ArticleExample();
        List<Article> articles = articleMapper.selectByExample(example);
        List<Integer> counts = new ArrayList<>();

        for (Article article : articles){
            counts.add(article.getArticleViewCount());
        }
        Collections.sort(counts);
        Collections.reverse(counts);
        List<Article> articles2 = new ArrayList<>();

        ArticleExample example1 = new ArticleExample();
        example1.createCriteria()
                .andArticleViewCountEqualTo(counts.get(0));
        List<Article> articles1 = articleMapper.selectByExample(example1);
        articles2.add(articles1.get(0));

        ArticleExample example2 = new ArticleExample();
        example2.createCriteria()
                .andArticleViewCountEqualTo(counts.get(1));
        List<Article> articles3 = articleMapper.selectByExample(example2);
        articles2.add(articles3.get(0));

        ArticleExample example3 = new ArticleExample();
        example3.createCriteria()
                .andArticleViewCountEqualTo(counts.get(2));
        List<Article> articles4 = articleMapper.selectByExample(example3);
        articles2.add(articles4.get(0));

        ArticleExample example4 = new ArticleExample();
        example4.createCriteria()
                .andArticleViewCountEqualTo(counts.get(3));
        List<Article> articles5 = articleMapper.selectByExample(example4);
        articles2.add(articles5.get(0));

        return articles2;
    }

    public List<Article> findAllByTime() {
        ArticleExample example = new ArticleExample();
        List<Integer> ids = new ArrayList<>();
        List<Article> articles = articleMapper.selectByExample(example);
        for (Article article : articles){
            ids.add(article.getId());
        }
        Collections.reverse(ids);

        Article articles1 = articleMapper.selectByPrimaryKey(ids.get(0));
        Article articles2 =  articleMapper.selectByPrimaryKey(ids.get(1));
        Article articles3 =  articleMapper.selectByPrimaryKey(ids.get(2));

        List<Article> newArticles = new ArrayList<>();
        newArticles.add(articles1);
        newArticles.add(articles2);
        newArticles.add(articles3);

        return newArticles;

    }

    public List<Article> findAll(int page, int size) {
        ArticleExample example = new ArticleExample();
        PageHelper.startPage(page,size);
        return articleMapper.selectByExample(example);
    }
    public List<Tag> findTagByArticleId(Integer id){
        ArticleTagDto articleTagDto = articleMapper.findTagByArticleId(id);
        List<Tag> tags = articleTagDto.getTags();
        return tags;
    }

    public List<Article> findArticleByCategoryId(Integer id,int page,int size){
        PageHelper.startPage(page,size);
        List<Article> articles = articleMapper.findArticleByCategoryId(id);
        return articles;
    }
    public List<Article> findArticleByCategoryId(Integer id){

        List<Article> articles = articleMapper.findArticleByCategoryId(id);
        return articles;
    }
    public List<Article> findArticleByTagId(Integer id){
        List<Article> articles = articleMapper.findArticleByCategoryId(id);
        return articles;
    }



    public List<Article> findArticleByTagId(Integer id, int page, int size) {
        PageHelper.startPage(page,size);
        List<Article> articles = articleMapper.findArticleByCategoryId(id);
        return articles;
    }
}
