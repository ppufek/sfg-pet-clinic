package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"}) //all gonna match to this request mapping
    public String index() {
        return "index";
    }

    @RequestMapping("/oups")
    public String oups() {
        return "notimplemented";
    }
}
