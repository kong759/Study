package chap1.main;

import org.springframework.context.support.GenericXmlApplicationContext;


//id���� �����ش�.
public class MainByXmlWithoutId {
public static void main(String[] args) {
 GenericXmlApplicationContext ctx
 = new GenericXmlApplicationContext("classpath:chap1/main/config-without-id.xml");
 String[] beanNames = ctx.getBeanDefinitionNames();
 for(String bn : beanNames) 
    System.out.println(bn);
 ctx.close();
}
}