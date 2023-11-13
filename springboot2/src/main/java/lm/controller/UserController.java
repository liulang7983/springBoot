package lm.controller;

import lm.condition.EncodingConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming.li
 * @date 2023/11/13 17:11
 */
@RestController
@RequestMapping("sp2")
public class UserController {
    @Autowired
    private EncodingConvert encodingConvert;
    @RequestMapping("getName")
    public String getName(){
        return "张三";
    }
    @RequestMapping("getEncodingConvert")
    public String getEncodingConvert(){
        System.out.println(encodingConvert);
        return "张三";
    }
}
