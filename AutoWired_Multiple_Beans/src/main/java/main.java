import com.assignment.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person in application-context: " + person.getName());
        System.out.println("Pet this person owns: " + person.getPet());

    }
}
