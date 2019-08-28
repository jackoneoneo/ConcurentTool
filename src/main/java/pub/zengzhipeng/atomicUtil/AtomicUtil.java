package pub.zengzhipeng.atomicUtil;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description
 * @Author zzp
 * @Date 2019/8/28 10:14
 * @Version 1.0
 **/
public class AtomicUtil {

    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong();
        System.out.println(atomicLong.compareAndSet(0,2));
        System.out.println(atomicLong.getAndAdd(1));

        AtomicReference<Integer> atomicReference = new AtomicReference <>();
        atomicReference.set(9);
        System.out.println(atomicReference.get());

    }
}
