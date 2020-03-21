package cn.yelriv;

import cn.yelriv.entity.TestEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Date 2020/1/11 11:54
 * @Created by YR
 */
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        TestEntity testEntity = (TestEntity) applicationContext.getBean("testEntity");
        TestEntity testEntity1 = applicationContext.getBean("testEntity", TestEntity.class);
        testEntity1.echo();
        testEntity.echo();
    }
}
