package pub.zengzhipeng.timerutil;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Description Timer 类的使用方法，
 * @Author zzp
 * @Date 2019/8/23 11:22
 * @Version 1.0
 **/
public class TimerUtil {
    public static void main(String[] args) {

        disp(TimeUnit.DAYS);
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
    public static void disp(TimeUnit unit){

        System.out.println(unit.toHours(2));
    }
}
