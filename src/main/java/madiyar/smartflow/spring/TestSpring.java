package madiyar.smartflow.spring;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml"
        );

        UserService userService = context.getBean("userService", UserService.class);
//        userService.registerUser("Madiyar Kenzh");
        String fullName = userService.getUserFullName();
        System.out.println("Registered user's full name: " + fullName);


        context.close();
    }
}
