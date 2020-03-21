package cn.yelriv.inherit;

/**
 * @Description TODO
 * @Date 2020/3/7 12:00
 * @Created by YR
 */
public class People implements Eat {
    @Override
    public void eat(String food) {
        System.out.println("People" + food);
    }
}
