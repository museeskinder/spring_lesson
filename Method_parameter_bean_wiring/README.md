## Wiring beans using method parameters
- Establishing relationship between Person and Vehicle, by passing the vehicle as a method parameter to the 
person() bean method. Now inside Spring Context, person owns the vehicle.
- Spring injects the vehicle bean to the person bean using Dependency injection.
- Spring will make sure to have only 1 vehicle bean is created and also vehicle bean will be created 
first always as person bean has dependency on it.
``` agsl
@Bean
public Vehicle vehicle() {
Vehicle vehicle = new Vehicle();
vehicle.setName("Toyota");
return vehicle;
}

@Bean
public Person person(Vehicle vehicle) {
Person person = new Person();
person.setName("Lucy");
person.setVehicle(vehicle);
return person;
}
```