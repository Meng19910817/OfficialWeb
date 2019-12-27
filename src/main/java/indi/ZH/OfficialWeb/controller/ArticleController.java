package indi.ZH.OfficialWeb.controller;

import com.github.pagehelper.PageInfo;
import indi.ZH.OfficialWeb.entity.Article.Article;
import indi.ZH.OfficialWeb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/top", method = RequestMethod.GET)
    public PageInfo<Article> getTopData(@RequestParam("pageNo") int pageNo, @RequestParam("type") String type){
        return articleService.getTopNumber(pageNo, type);
    }

}
