package spring.core.beanfind;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.AppConfig;

public class ApplicationContextInfoTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean(){
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object been = context.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + "object" + been.toString());
        }
    }

    @Test
    @DisplayName("모든 빈 출력하기")
    void findApplicationBean(){
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beenDefinition = context.getBeanDefinition(beanDefinitionName);

            if(beenDefinition.getRole() == BeanDefinition.ROLE_INFRASTRUCTURE){
                System.out.println("name = " + beanDefinitionName + "object" + beenDefinition);

            }
        }
    }
}
