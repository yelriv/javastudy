package cn.yelriv;

import cn.yelriv.entity.TestEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Date 2020/1/11 11:15
 * @Created by YR
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        TestEntity testEntity = (TestEntity) applicationContext.getBean("testEntity");
        testEntity.echo();
    }
}
