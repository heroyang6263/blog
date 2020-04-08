package com.yang.pojo;

import java.util.Date;

public class Article {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.user_id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_put_time
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private Date articlePutTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_status
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private Integer articleStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_summary
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private String articleSummary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_img
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private String articleImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_title
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private String articleTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_update_time
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private Date articleUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_view_count
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private Integer articleViewCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.user_id
     *
     * @return the value of article.user_id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.user_id
     *
     * @param userId the value for article.user_id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_put_time
     *
     * @return the value of article.article_put_time
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public Date getArticlePutTime() {
        return articlePutTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_put_time
     *
     * @param articlePutTime the value for article.article_put_time
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticlePutTime(Date articlePutTime) {
        this.articlePutTime = articlePutTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_status
     *
     * @return the value of article.article_status
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public Integer getArticleStatus() {
        return articleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_status
     *
     * @param articleStatus the value for article.article_status
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_summary
     *
     * @return the value of article.article_summary
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public String getArticleSummary() {
        return articleSummary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_summary
     *
     * @param articleSummary the value for article.article_summary
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary == null ? null : articleSummary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_img
     *
     * @return the value of article.article_img
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public String getArticleImg() {
        return articleImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_img
     *
     * @param articleImg the value for article.article_img
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg == null ? null : articleImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_title
     *
     * @return the value of article.article_title
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_title
     *
     * @param articleTitle the value for article.article_title
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_update_time
     *
     * @return the value of article.article_update_time
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public Date getArticleUpdateTime() {
        return articleUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_update_time
     *
     * @param articleUpdateTime the value for article.article_update_time
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticleUpdateTime(Date articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_view_count
     *
     * @return the value of article.article_view_count
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public Integer getArticleViewCount() {
        return articleViewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_view_count
     *
     * @param articleViewCount the value for article.article_view_count
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticleViewCount(Integer articleViewCount) {
        this.articleViewCount = articleViewCount;
    }
}