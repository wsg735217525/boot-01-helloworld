package com.atguigu.boot;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.OutputStreamWriter;

/**
 * 主程序类 主配置类
 * @SpringBootApplication：这是一个Springboot应用
 */
//@SpringBootApplication()
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.atguigu.boot")
public class MainApplication {

    public static void main(String[] args) {

        //1、返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2、查看容器里面的组件
//        String[] names = run.getBeanDefinitionNames();
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//        //3.从容器中获取组件
//
//        Pet tom1 = run.getBean("tom", Pet.class);
//        Pet tom2 = run.getBean("tom", Pet.class);
//        System.out.println("组件："+(tom1 == tom2));
//
//        //4、com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$62a23592@4e6d7365
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有
//        //保持组件单实例
//        User user = bean.user01();
//        User user1 = bean.user01();
//        System.out.println(user == user1);
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//        System.out.println("用户的宠物:"+(tom == user01.getPet()));
//
//        System.out.println("===========================");
//
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);


        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件:" + tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中User组件"+user01);

        System.out.println("版本2");


        System.out.println("版本3");

        System.out.println("版本4");

        System.out.println("2");

        System.out.println("1");

        System.out.println("push test");
        
        System.out.println("pull test");
        
        


    }
}
