package wow.kons.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wow.kons.bean.Menu;
import wow.kons.bean.User;
import wow.kons.service.SysConfigService;
import wow.kons.service.TestService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private SysConfigService sysConfigService;

    @RequestMapping("/test")
    @ResponseBody
    public String obtainTest(){
        User user = testService.obtainUser(1);
        return JSON.toJSONString(user);
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public String register(@RequestBody User user){

        //testService.register(user);
        return JSON.toJSONString(user);
    }

    @RequestMapping(value = "/menus",method = RequestMethod.GET)
    @ResponseBody
    public String obtainMenus(@RequestParam("code") String code){
        List<Menu> menus=sysConfigService.obtainMenuData(code);
        return JSON.toJSONString(menus);
    }
}
