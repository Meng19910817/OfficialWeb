package indi.ZH.OfficialWeb.controller;

import com.github.pagehelper.PageInfo;
import indi.ZH.OfficialWeb.entity.Article.Article;
import indi.ZH.OfficialWeb.service.RecommondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recommond")
public class RecommondController {

    @Autowired
    private RecommondService recommondService;

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public PageInfo<Article> getRecommondList(@RequestParam("category") String category, @RequestParam("pageNo")int pageNo){
        return recommondService.getRecommondArticle(category, pageNo);
    }
}
