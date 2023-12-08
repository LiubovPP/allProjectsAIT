package practice;

import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class User {
    /* k_l_b_1963@hotmail.com
1) @ exists and only one (done) - @ только одна
2) dot after @ (done) - должна быть точка после @ как минимум одна
3) after last dot minimum 2 symbols (done) - домен состоит не меньше, чем из одной буквы
4) alphabetic, digits, _ , - , . , @ - разрешены буквы алфавита, цифры и некоторые символы
 */
    // поля класса
    private String email;
    protected String password;

    public User(String email, String password) {
        setEmail(email);
       setPassword(password);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid.");
        }
    }
private boolean validateEmail(String email){
    //   k_l_b_1963@hotmail.com
    int indexAt = email.indexOf('@'); // ищем индекс собаки
    if (indexAt<= 0 || indexAt !=email.lastIndexOf('@')){ // проверяем наличие собаки и что она одна
        return false; //   тогда вернем false
    }
    if (email.indexOf('.', indexAt)== -1){ // не нашлась точка и начиная с позиции собаки
        return false;
    }
    if (email.indexOf('.')>= email.length()-2){ // более одного символа после точки
        return false;
    }
    for (int i = 0; i < email.length(); i++) { // проверка на допустимые символы
        char c = email.charAt(i);
       if( !((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                || c == '_' || c == '-' || c == '.' || c == '@')){
           return false;
       }
    }
    return true;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password is not valid");
        }
    }
    /*
    1) min 8 symbols
    2) min one symbol of uppercase
    3) min one symbol of lowercase
    4) min one digit
    5) min one special symbol (!%@*&)
     */
//Задача 1. В классе User, который делали в классной работе, реализовать метод валидации пароля. В классе UserAppl, в
//методе main, проверить правильность работы валидатора.
//Помните, что подход к валидации пароля, отличается от подхода к валидации емейла. Валиден пароль или нет, мы можем
//сообщить только после того, как проверим все символы в пароле. Поэтому в цикле, в котором мы проверяем поочередно
//каждый символ пароля, надо где-то сохранить информацию о каждой проверке. И после цикла, проанализировать эту информацию.
    private boolean validatePassword(String password) {
        //TODO
        if (password.length()<8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if( !((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                           || c == '!' || c == '%' || c == '*' || c == '@'|| c == '&')){ // можно дописать еще ^&*()-_+=<>?[]{}", принцип понятен
                      return false;
                 }
        }
        return true;
    }
    //Задача 1. В классе User, который делали в классной работе, реализовать метод валидации пароля. В классе UserAppl,
    // в методе main, проверить правильность работы валидатора.
    //
    //Помните, что подход к валидации пароля, отличается от подхода к валидации емейла. Валиден пароль или нет, мы можем
    // сообщить только после того, как проверим все символы в пароле. Поэтому в цикле, в котором мы проверяем поочередно
    // каждый символ пароля, надо где-то сохранить информацию о каждой проверке (массив типа boolean). И после цикла,
    // проанализировать эту информацию.
    //еще способ решения через массив типа boolean

    /*

     */

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}
