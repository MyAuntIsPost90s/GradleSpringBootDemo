package demo.controller;

import demo.model.GoodsActive;
import demo.service.ActiveGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private ActiveGoodsService activeGoodsService;

    @ResponseBody
    @RequestMapping("/get")
    public List<GoodsActive> get() {
        System.out.println("get2");
        return activeGoodsService.get(1, 10);
    }

}
