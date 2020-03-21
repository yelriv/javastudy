package cn.yelriv.inherit;

/**
 * @Description TODO
 * @Date 2020/3/7 12:03
 * @Created by YR
 */
public class Tom extends People implements Eat {
    @Override
    public void eat(String food) {
        System.out.println("Tom" + food);
    }
}
