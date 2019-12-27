package indi.ZH.OfficialWeb.service;

import com.github.pagehelper.PageInfo;
import indi.ZH.OfficialWeb.entity.Article.Article;

import java.util.List;

public interface RecommondService extends BaseService{
    /**
     * 获得首页推荐类别
     * @return
     */
    List getAllData();

    /**
     * 根据类别获取推荐文章列表
     * L-听力 S-口语 R-读 W-写
     * @param category
     * @param pageNo
     * @return
     */
    PageInfo<Article> getRecommondArticle(String category, int pageNo);
}
