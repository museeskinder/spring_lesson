# Wiring beans using method call
- to establish a dependency b/n two beans wiring is needed.
-  the way method call wiring works is whenever the method is called which is defined inside the dependent clas it instantiates
the object and store it inside the bean.

```agsl
    @Bean
    public Pet pet() {
        Pet pet = new Pet();
        pet.setName("max_dogi");
        return pet;
    }
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Muse");
        person.setPet(pet());
        return person;
    }
```

- Here as you can see pet bean is created first since it is dependent for person bean and right after that person bean uses
```setPet()``` method to wire the to beans.
  - ```setPet()``` takes ```pet()``` as argument and spring makes sure only one pet bean is created even if ```pet()``` method is envoked.