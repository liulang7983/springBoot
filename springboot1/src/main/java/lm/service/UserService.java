package lm.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author ming.li
 * @date 2023/11/13 15:51
 */
@Component
@Async
public class UserService {
    public void init(){
        try {
            for (int i = 0; i <3 ; i++) {
                Thread.sleep(100);
                System.out.println("我在初始化");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
