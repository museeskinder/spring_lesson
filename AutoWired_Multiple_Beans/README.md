# How Autowiring works with multiple beans

There are 3 steps spring conducts auto-wiring between beans:
1. if there are beans defined inside the config class and one of the beans are mentioned as parameter inside constructor,
spring wires that bean with constructors object. 
``` 
@Configuration
public class Config{
    @Bean
    public Pet firstPet() {
        Pet pet = new Pet();
        pet.setName("dog");
        return pet;
    }
    @Bean
    public Pet secondPet() {
        Pet pet = new Pet();
        pet.setName("dog");
        return pet;
    }
}
```
```
@Component 
public class Person {
    private String name;
    private final Pet pet;
    
    @AutoWired
    public Person(Pet firstPet) {
        this.pet = pet;
    }
}
```
if spring is unable to find ```firstPet ``` bean second step takes place.
2. In this step a bean annotated with primary annotation will be used as default bean for unclearly defined bean.

``` 
@Configuration
public class Config{
    @Bean
    @Primary
    public Pet firstPet() {
        Pet pet = new Pet();
        pet.setName("dog");
        return pet;
    }
    @Bean
    public Pet secondPet() {
        Pet pet = new Pet();
        pet.setName("dog");
        return pet;
    }
}
```
```
@Component 
public class Person {
    private String name;
    private final Pet pet;
    
    @AutoWired
    public Person(Pet pet) {
        this.pet = pet;
    }
}
```
from the above code we can see there is no bean named ```pet``` in the Config class, case of this ambiguity default bean 
with ```@Primary ``` annotation is used.
3. The parameter name specified while configuring Autowired annotation is not matching and if there is no default bean the
third option will be using ```@Qualifier("bean_name") ``` annotation inside constructor parameter.
```
   @Configuration
   public class Config {
      @Bean
      public Pet firstPet() {
      Pet pet = new Pet();
      pet.setName("dog");
      return pet;
   }
   @Bean
      public Pet secondPet() {
      Pet pet = new Pet();
      pet.setName("dog");
      return pet;
      }
   }
```
```
@Component
public class Person {
    private String name;
    private final Pet pet;

    @AutoWired
    public Person(@Qualifier("secondPet") Pet pet) {
        this.pet = pet;
    }
}
