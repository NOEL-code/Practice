package scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class PrototypeTest {

    @Test
    void testPrototype() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            PrototypeBean.class);

        PrototypeBean bean = context.getBean(PrototypeBean.class);
        PrototypeBean bean2 = context.getBean(PrototypeBean.class);

        System.out.println(bean);
        System.out.println(bean2);

        Assertions.assertThat(bean).isNotSameAs(bean2);
    }

    @Scope("prototype")
    static class PrototypeBean {


        @PostConstruct
        void postConstruct() {
            System.out.println("PrototypeBean.postConstruct");
        }

        @PreDestroy
        void preDestroy() {
            System.out.println("PrototypeBean.preDestroy");
        }
    }

}
