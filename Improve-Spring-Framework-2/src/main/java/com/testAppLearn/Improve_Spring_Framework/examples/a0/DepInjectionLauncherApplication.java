package com.testAppLearn.Improve_Spring_Framework.examples.a0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//YourBusinessClass
//Dependency1
//Dependency2

@Component
class YourBusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired
    public YourBusinessClass(Dependency2 dependency2, Dependency1 dependency1) {
        super();
        System.out.println("Inside YourBusinessClass");
        this.dependency2 = dependency2;
        this.dependency1 = dependency1;
    }

    public Dependency1 getDependency1() {
        return dependency1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

    public void setDependency2(Dependency2 dependency2) {
        System.out.println("setDependency2");
        this.dependency2 = dependency2;
    }
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("setDependency1");
        this.dependency1 = dependency1;
    }

    public String toString(){
        return dependency1 + " et " + dependency2;
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan //("com.testAppLearn.Improve_Spring_Framework.examples.a0")
public class DepInjectionLauncherApplication {

    // Beans automatiquement importés et par ComponentScan
    public static void main (String[] args) {
        try(AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}