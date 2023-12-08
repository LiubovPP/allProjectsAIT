package practice;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmail.com", "12345"); // создаем пользователя
        System.out.println(user); // печатаем пользователя
        user.setEmail("peter@d@sfkj.co");
        System.out.println(user);
        user.setPassword("1234");
        System.out.println(user);
        user.setPassword("156dFG!vndfl");
        System.out.println(user);
        user.setPassword("156dFG!");
        System.out.println(user);
    }
}
