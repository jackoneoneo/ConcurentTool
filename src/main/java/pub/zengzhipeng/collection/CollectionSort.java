package pub.zengzhipeng.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 集合类的使用方法,给指定集合排序 Collections
 * @Author zzp
 * @Date 2019/8/23 9:12
 * @Version 1.0
 **/
public class CollectionSort {

    public static void main(String[] args) {

        List <Integer> list = new ArrayList <Integer>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(28);
        //排序
        Collections.sort(list);
        System.out.println(list);

        //二分查找
       int index =  Collections.binarySearch(list,2);
       //反转元素
        Collections.reverse(list);
        System.out.println(list);

        //打乱元素
        Collections.shuffle(list);
        System.out.println(list);
        //交换元素
        Collections.swap(list,0,1);
        System.out.println(list);

        //填充元素
        Collections.fill(list,34);
        System.out.println(list);

        //拷贝数组
        //copyList 的长度必须>=list 的长度
        List<Integer> copyList = new ArrayList <>(4);
        copyList.add(1);
        copyList.add(1);
        copyList.add(1);
        copyList.add(1);
        Collections.copy(copyList,list);
        System.out.println(copyList);

        //最小值
        System.out.println(Collections.min(list));


        //最大值
        System.out.println(Collections.max(list));

    }
}
