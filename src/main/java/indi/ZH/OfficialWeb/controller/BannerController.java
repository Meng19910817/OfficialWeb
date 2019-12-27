package indi.ZH.OfficialWeb.controller;
import indi.ZH.OfficialWeb.service.BannerService;
import indi.ZH.OfficialWeb.service.RecommondService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @Autowired
    private RecommondService recommondService;

    @RequestMapping("/home/multidata")
    public Map<String, Object> getMultiData(){
        List bannerList = bannerService.getAllData();
        List recommondList = recommondService.getAllData();
        Map<String, Object> map = new HashedMap();
        map.put("banners", bannerList);
        map.put("recommonds", recommondList);
        return map;
    }
}
