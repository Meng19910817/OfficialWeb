package indi.ZH.OfficialWeb.controller;

import indi.ZH.OfficialWeb.entity.User;
import indi.ZH.OfficialWeb.entity.common.Result;
import indi.ZH.OfficialWeb.entity.common.Status;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    public Result register(@RequestBody() User user){
        return new Result(true, Status.SUCCESS);
    }
}
