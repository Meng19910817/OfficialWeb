package indi.ZH.OfficialWeb.controller;

import indi.ZH.OfficialWeb.service.WXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private WXService wxService;

    @RequestMapping(value="/wxm", method = RequestMethod.POST)
    @ResponseBody
    public String wmLogin(@RequestBody String code){
        String openid = wxService.getMiniOpenid(code);
        if(openid != null){
            return openid;
        }
        return "空的openid";
    }


}
