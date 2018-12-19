package com.springboot.zqspringdatajpa.web;

import com.springboot.zqspringdatajpa.domain.Userweb;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ExampleController {

    @RequestMapping("/example")
    public String index(ModelMap map) {
        map.addAttribute("UserwebName", "neo");
        map.addAttribute("flag", "yes");
        map.addAttribute("Userwebs", getUserwebList());
        map.addAttribute("type", "link");
        map.addAttribute("pageId", "springcloud/2017/09/11");
        map.addAttribute("img", "http://www.ityouknow.com/assets/images/neo.jpg");
        map.addAttribute("count", 12);
        map.addAttribute("date", new Date());
        return "example";
    }


    private List<Userweb> getUserwebList(){
        List<Userweb> list=new ArrayList<Userweb>();
        Userweb Userweb1=new Userweb("大牛",12,"123456");
        Userweb Userweb2=new Userweb("小牛",6,"123563");
        Userweb Userweb3=new Userweb("纯洁的微笑",66,"666666");
        list.add(Userweb1);
        list.add(Userweb2);
        list.add(Userweb3);
        return  list;
    }

}