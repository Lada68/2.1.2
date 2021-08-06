import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage() + ", " + bean1.getMessage());

        Cat bean11 = (Cat) applicationContext.getBean("cat");
        Cat bean12 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean12.getMessage() + ", " + bean11.getMessage());
        System.out.println(bean1 == bean);
        System.out.println(bean11 == bean12);
    }
}