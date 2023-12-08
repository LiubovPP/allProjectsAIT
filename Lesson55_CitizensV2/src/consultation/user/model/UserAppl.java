package consultation.user.model;

import java.time.LocalDate;

public class UserAppl {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        User user = new User("email", "Password", "FName", "SName", 1,
                now.minusYears(30));
        int hashCode = user.hashCode();
        System.out.println("HashCode of id "+ hashCode);
    }

}
