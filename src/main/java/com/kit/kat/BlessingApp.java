package com.kit.kat;

import com.kit.kat.CustomService.CustomServiceImpl;
import com.kit.kat.CustomService.ICustomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BlessingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        ICustomService cService = context.getBean(CustomServiceImpl.class);

        System.out.println(cService);
        ICustomService cService2 = context.getBean(CustomServiceImpl.class);
        System.out.println(cService2);

        ICustomService cService3 = new CustomServiceImpl();
        System.out.println(cService3);

        cService.blessTheWorld();
    }
}
