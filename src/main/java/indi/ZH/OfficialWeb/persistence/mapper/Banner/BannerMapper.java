package indi.ZH.OfficialWeb.persistence.mapper.Banner;


import indi.ZH.OfficialWeb.entity.Banner.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BannerMapper {


    int deleteByPrimaryKey(Integer bannerId);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer bannerId);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);

    List<Banner> selectAll(@Param("is_validate") int is_validate);

}