package indi.ZH.OfficialWeb.persistence.mapper.Article;

import indi.ZH.OfficialWeb.entity.Article.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer articleId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    List getRecommondArticleListByCategory(@Param("category") String category);

    List getTopDataByTypePopular(@Param("type") String type, @Param("pageSize") int pageSize);

    List getTopDataByImportant(@Param("type") String type, @Param("pageSize") int pageSize);

    List getTopDataByNewest(@Param("type") String type, @Param("pageSize") int pageSize);
}