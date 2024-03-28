package AutomationCourse;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassExemple18 {
    public static void main(String[] args) {
        List<String> email = Arrays.asList("example@mail.ru", "sasha@gamil.com", "pet@gamil.com", "vasya@gamil.com", "sasha@gamil.com", "jonh@mail.ru");
        List<String> uniq = email.stream().distinct().collect(Collectors.toList());
        System.out.println(uniq);

        List<String> mail = email.stream().filter(x->x.endsWith("@mail.ru")).collect(Collectors.toList());
        System.out.println(mail);

        String firstMail = email.stream().filter(x->x.endsWith("@mail.ru")).findFirst().get();
        System.out.println(firstMail);

        boolean isAllMailEndsWithmail = email.stream().allMatch(x->x.endsWith("mail.ru"));
        System.out.println(isAllMailEndsWithmail);




    }
}
