package scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.stream.IntStream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class SingletonTest {


    @Test
    void testSingleton() {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(
            SingletonTest.class);

        SingletonTest singleton1 = context1.getBean(SingletonTest.class);
        SingletonTest singleton2 = context1.getBean(SingletonTest.class);

        System.out.println(singleton1);
        System.out.println(singleton2);

        Assertions.assertThat(singleton1).isSameAs(singleton2);


    }

    @Scope("singleton")
    static class SingletonBean {
        @PostConstruct
        public void postConstruct() {
            System.out.println("postConstruct");
        }

        @PreDestroy
        public void preDestroy() {
            System.out.println("preDestroy");
        }
    }

}
