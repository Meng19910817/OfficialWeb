package indi.ZH.OfficialWeb.service.impl;

import indi.ZH.OfficialWeb.persistence.mapper.Banner.BannerMapper;
import indi.ZH.OfficialWeb.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bannerService")
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;


    private static int is_validate = 1;

    @Override
    public List getAllData() {
        return bannerMapper.selectAll(is_validate);
    }
}
