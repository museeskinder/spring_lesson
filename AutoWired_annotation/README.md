# Wiring beans using **@AutoWired** annotation
- ```@AutoWired ``` is the easiest way of creating dependency between beans.
- This annotation is written on the top of field, setter method and constructor.
- beans(Objets) are injected at runtime by dependency injection mechanism.
- Not advisable for production:
  - In a situation where you want to state dependent bean reference to final it throws compilation error saying that we can't 
  ssign final before initializing.
  - It is fine to use ```@AutoWired``` where you don't have to state final to field references.
- ```@AutoWired(required = true)``` if the bean is not available in auto-wiring process it will not throw ```NoSuchBeanDefinationException```.