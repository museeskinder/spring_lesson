# Wiring beans using **@AutoWired** annotation
- ```@AutoWired ``` is the easiest way of creating dependency between beans.
- This annotation is written on the top of field, setter method and constructor.
  - If we are working with spring version 4.3 and above, with one constructor in our pojo defining ```@AutoWired``` annotation is optional.
- beans(Objects) are injected at runtime by dependency injection mechanism.
- Not advisable for production:
  - In a situation where you want to state dependent bean reference to final it throws compilation error saying that we can't 
  assign final before initializing.
  - It is fine to use ```@AutoWired``` where you don't have to state final to field references.
- ```@AutoWired(required = true)``` if the bean is not available in auto-wiring process it will not throw ```NoSuchBeanDefinationException```.
- using this annotation on the top of constructors in advisable and we can assign dependency reference as final since the reference variable will be initialized when objects are injected at runtime.