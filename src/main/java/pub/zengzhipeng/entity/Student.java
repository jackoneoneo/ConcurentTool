package pub.zengzhipeng.entity;


import java.io.Serializable;

/**
 * @Description Comparable 的示例，实现Comparable 接口的compareTo方法
 * 该方法返回3个值，整数、零、负数
 * @Author zzp
 * @Date 2019/8/20 10:56
 * @Version 1.0
 **/
public class Student implements Serializable ,Comparable<Student>{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Student student) {
        if(this.age == student.getAge()){
            return 0;
        }else if(this.age > student.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}
