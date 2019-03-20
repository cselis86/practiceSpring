package springBoot;

import com.elis.spring.practice.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.elis.spring.practice")
public class PracticeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(PracticeApplication.class, args);

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");

        controller.sayHello();
    }

}
