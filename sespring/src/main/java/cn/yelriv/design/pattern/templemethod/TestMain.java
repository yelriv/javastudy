package cn.yelriv.design.pattern.templemethod;

/**
 * @Description TODO
 * @Date 2020/3/21 15:58
 * @Created by YR
 */
public class TestMain {
    public static void main(String[] args) {
        AbstractFather af = new Addition(2,4);
        af.handle();
    }
}
