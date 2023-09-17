import com.example.beans.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class Config {
    @Bean
    Pet firstPet() {
        Pet pet = new Pet();
        pet.setName("cat");
        return pet;
    }
    @Primary
    @Bean
    Pet myPet() {
        Pet pet = new Pet();
        pet.setName("dog");
        return pet;
    }
}
