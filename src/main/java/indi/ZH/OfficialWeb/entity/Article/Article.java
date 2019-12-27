package indi.ZH.OfficialWeb.entity.Article;

import lombok.Data;

import java.util.Date;

@Data
public class Article {
    private Integer articleId;

    private String title;

    private String content;

    private String imgUrl;

    private Integer likeCount;

    private String category;

    private String label;

    private String creator;

    private String updator;

    private Date createTime;

    private Date updateTime;

    private Integer isImportant;

    private String pool;

}