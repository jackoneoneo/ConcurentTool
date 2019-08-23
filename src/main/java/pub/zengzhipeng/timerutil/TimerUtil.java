package pub.zengzhipeng.timerutil;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description Timer 类的使用方法，
 * @Author zzp
 * @Date 2019/8/23 11:22
 * @Version 1.0
 **/
public class TimerUtil {
    public static void main(String[] args) {
        Timer timer = new Timer("timer 管理器");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        },1000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("zzzp");
            }
        },2000);


    }
}
