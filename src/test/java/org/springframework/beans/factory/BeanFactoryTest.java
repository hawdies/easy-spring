package org.springframework.beans.factory;

import org.junit.Before;
import org.junit.Test;

/**
 * @author hawdies
 * @date 2021/5/30
 **/
public class BeanFactoryTest {
    private BeanFactory beanFactory = null;

    @Before
    public void init() {
        beanFactory = new BeanFactory();
    }

    @Test
    public void testRegisterAndGetBean() {
        beanFactory.register("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }

    static class HelloService {
        public void sayHello() {
            System.out.println("hello service!");
        }
    }

}