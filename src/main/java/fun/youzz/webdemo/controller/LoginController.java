package fun.youzz.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : kaisayi
 * @Project: webdemo
 * @date Date : 2020年04月05日 23:04
 */
@Controller
public class LoginController {

    @RequestMapping("/user/login")
    @ResponseBody
    public String login() {
        return "OK";
    }

}
