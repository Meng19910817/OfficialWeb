package indi.ZH.OfficialWeb.persistence.mapper.Recommond;

import indi.ZH.OfficialWeb.entity.Recommond.Recommond;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecommondMapper {
    int deleteByPrimaryKey(Integer recommonId);

    int insert(Recommond record);

    int insertSelective(Recommond record);

    Recommond selectByPrimaryKey(Integer recommonId);

    int updateByPrimaryKeySelective(Recommond record);

    int updateByPrimaryKey(Recommond record);

    List<Recommond> selectAllRecommonds();


}