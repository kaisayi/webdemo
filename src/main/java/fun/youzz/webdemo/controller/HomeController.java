package fun.youzz.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : kaisayi
 * @Project: webdemo
 * @date Date : 2020年04月03日 22:58
 *
 * 在 templates 下面的所有页面，只能通过 controller 跳转
 *
 */
@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Daitu");
        return "hello";
    }
}
