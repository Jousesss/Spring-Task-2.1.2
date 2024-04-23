import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstHW =
                (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(firstHW.getMessage());
        System.out.println("\n");

        // Создание объектов
        HelloWorld secondHW = applicationContext.getBean("helloWorld",HelloWorld.class);

        Cat firstCat = applicationContext.getBean("cat",Cat.class);
        Cat secondCat = applicationContext.getBean("cat",Cat.class);

        System.out.println("firstHW == secondHW   (" + (firstHW == secondHW) + ")");
        System.out.println("firstCat == secondCat   (" + (firstCat == secondCat) + ")");
    }
}