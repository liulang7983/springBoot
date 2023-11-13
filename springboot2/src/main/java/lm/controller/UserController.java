package lm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ming.li
 * @date 2023/11/13 17:11
 */
@RestController
@RequestMapping("sp2")
public class UserController {
    @RequestMapping("getName")
    public String getName(){
        return "张三";
    }
}
