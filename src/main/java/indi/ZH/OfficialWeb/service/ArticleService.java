package indi.ZH.OfficialWeb.service;

import com.github.pagehelper.PageInfo;
import indi.ZH.OfficialWeb.entity.Article.Article;

public interface ArticleService extends BaseService {
    /**
     * 获取最热门的前i篇文章
     * pageNo 页数
     * type 类型
     * @param pageNo
     * @return
     */
    PageInfo<Article> getTopNumber(int pageNo, String type);
}
