package lm.bean;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author ming.li
 * @date 2023/11/13 15:46
 */
@Component
@Async
public class Jeep implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
                System.out.println("输出:"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
