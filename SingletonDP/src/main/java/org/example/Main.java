package org.example;

import org.example.config.ProjectConfig;
import org.example.controllers.DemoController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    /*
    * Java EE/ Jakarta EE
    * Stateful
    * Stateless
    * Singleton -> here this is actual singleton
    * i.e. one object per JVM unlike Spring where Singleton can have more than one instance as demonstrated
    * */
    public static void main(String[] args) {
//        example of singleton in jvm.
//        var r= Runtime.getRuntime(); // getInstance()
//        r.availableProcessors();
//        r.exec();

        /*
        * Example showing spring controller singleton is not truly singleton, one can create a bean and have many instance.
        * */

        try(var c= new AnnotationConfigApplicationContext(ProjectConfig.class)){
            var c1 = c.getBean("demoController", DemoController.class);
            var c2 = c.getBean("demoController",DemoController.class);
            var c3 = c.getBean("demoController1",DemoController.class);
            var c4 = c.getBean("demoController1",DemoController.class);

            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);
        }

    }
}