package indi.ZH.OfficialWeb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import indi.ZH.OfficialWeb.entity.Article.Article;
import indi.ZH.OfficialWeb.persistence.mapper.Article.ArticleMapper;
import indi.ZH.OfficialWeb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;


    private static final String POPULAR = "is_popular";//热门

    private static final String IMPORTANT = "is_important";//精选

    @Override
    public PageInfo<Article> getTopNumber(int pageNo, String type) {
        List artcileList = null;
        PageHelper.startPage(pageNo, pageSize);
        if ("pop".equals(type)){
            artcileList = articleMapper.getTopDataByTypePopular(type, pageSize);
        } else if("important".equals(type)){
            artcileList = articleMapper.getTopDataByImportant(type, pageSize);
        } else {
            artcileList = articleMapper.getTopDataByNewest(type, pageSize);
        }

        PageInfo<Article> pageInfo = new PageInfo<>(artcileList);
        return pageInfo;
    }
}
