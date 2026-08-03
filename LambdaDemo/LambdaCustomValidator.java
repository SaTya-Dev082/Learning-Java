package LambdaDemo;

/**
 *  
 */
@FunctionalInterface
interface Validator<T> {
    boolean validator(T value);

}

public class LambdaCustomValidator {
    public static void main(String[] agrs){
        Validator<String> emailValidator=email->email.contains("@");
        Validator<Integer> numValidator=num->num>=18;

        System.out.println(emailValidator.validator("test@gmail.com"));
        System.out.println(numValidator.validator(10));
    }
}
