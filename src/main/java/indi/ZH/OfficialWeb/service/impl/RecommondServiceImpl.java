package indi.ZH.OfficialWeb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import indi.ZH.OfficialWeb.entity.Article.Article;
import indi.ZH.OfficialWeb.persistence.mapper.Article.ArticleMapper;
import indi.ZH.OfficialWeb.persistence.mapper.Recommond.RecommondMapper;
import indi.ZH.OfficialWeb.service.RecommondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("recommondService")
public class RecommondServiceImpl implements RecommondService {


    @Autowired
    private RecommondMapper recommondMapper;

    @Autowired
    private ArticleMapper articleMapper;

    public List getAllData(){
        return recommondMapper.selectAllRecommonds();
    }

    @Override
    public PageInfo<Article> getRecommondArticle(String category, int pageNo) {
        PageHelper.startPage(pageNo, pageSize);
        List articleList = articleMapper.getRecommondArticleListByCategory(category);
        PageInfo<Article> pageInfo = new PageInfo(articleList);
        return pageInfo;
    }


}
