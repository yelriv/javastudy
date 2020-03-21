package cn.yelriv.design.pattern.templemethod;

/**
 * @Description TODO
 * @Date 2020/3/21 15:51
 * @Created by YR
 */
public abstract class AbstractFather {
    int first;
    int third;

    public AbstractFather(int first, int third) {
        this.first = first;
        this.third = third;
    }

    public void first() {
        System.out.println("this first method :" + first);
    }

    public void second() {
        System.out.println("this second method: " + third);
    }

    public abstract void third();

    public void handle() {
        first();
        second();
        third();
    }
}
