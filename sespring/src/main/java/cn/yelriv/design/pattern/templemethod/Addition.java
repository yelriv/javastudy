package cn.yelriv.design.pattern.templemethod;

/**
 * @Description TODO
 * @Date 2020/3/21 16:03
 * @Created by YR
 */
public class Addition extends AbstractFather {
    public Addition(int first, int third) {
        super(first, third);
    }

    @Override
    public void third() {
        int sum = this.first + this.third;
        System.out.println("两数的和为:" + sum);
    }
}
