# Spring Stereotype Annotations
stereotype annotations are simple ways of creating automatic beans inside the application
context.
- ``` @Component ``` is written on the top of **POJOS**(plain old java objects) which are taken creating object instances.
- ``` @ComponentScan ``` written on the top of config class takes ```basePackage``` parameter specifying pojo class package path.
- ``` @Service ``` is a place where business logic resides.
- ``` @Repository ``` written on the top of classes to access database, perform crud operations.
- ``` @Controller ``` written on the top of controller classes.

## @Bean vs @Component
| ``` @Bean```                                       | ``` @Component ```                                 |
|-----------------------------------------------------|----------------------------------------------------|
| object creation or bean creation takes by developer | Spring is responsible for creating object instances |
|more than one object instances(beans) can be created|only one instance is created|
|needs more code, writeing separate methods for bean creation|bean creation needs less code, ```@Component``` annotation is used on the top of classes|
