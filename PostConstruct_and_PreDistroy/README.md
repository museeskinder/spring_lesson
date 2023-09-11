## @PostConstruct
solves the problems of component stereotype annotation, where initializing values were not possible.
- we can have some control instruction while the bean is created.
- ```@PostConstruct``` is written on the top of any method that is to be executed after
bean creation.
-  this annotation is borrowed from "JAVAEE".
- this annotation is only applicable for methods doesn't work for constructors.

## @PreDestroy
``` @PreDestroy ``` written above a method which is invoked when we close instance object or bean.
when beans are removed from IoC container.

- both ```@postConstruct``` and ``` @PreDestroy ``` are kept inside pojo classes.
- inorder to use these annotations the following dependency has to kep inside **pom.xml**.
- 
 <!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
```agsl
<!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>

```