package com.yang.pojo;

public class ArticleWithBLOBs extends Article {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_content
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private String articleContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_content_md
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private String articleContentMd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_content
     *
     * @return the value of article.article_content
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_content
     *
     * @param articleContent the value for article.article_content
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_content_md
     *
     * @return the value of article.article_content_md
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public String getArticleContentMd() {
        return articleContentMd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_content_md
     *
     * @param articleContentMd the value for article.article_content_md
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setArticleContentMd(String articleContentMd) {
        this.articleContentMd = articleContentMd == null ? null : articleContentMd.trim();
    }
}