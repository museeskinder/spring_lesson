## Spring Beans
- a class instantiated based on the configuration we supply with "xml configs" or "annotations" beans are created.
- spring context is a memory location to store beans in our application.
- at runtime object properties and information from objects are manipulated and querying takes place by SpEL - spring expression language.

## Spring IoC container 
- component of core spring
- capable of generation spring beans and managing dependency

```
    org.springframework.beans.factory.BeanFactory
```

This is the root interface for accessing a Spring bean container.
It provides basic functionality for managing beans, such as getting beans by micColor or type, checking if a bean exists, and registering bean aliases.

```
    org.springframework.context.ApplicationContext
```
This sub interface adds more advanced features that **BeanFactory**.