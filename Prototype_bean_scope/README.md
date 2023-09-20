## Prototype bean scope
- every time your application references bean new bean instances are created.
- this will overcome the problem of race condition giving new bean reference to each different bean.
- prototype bean creation is rarely used and used in environment where beans change there state of data, which will result a race condition.
- ```@Scope(BeanDefination.SCOPE_PROTOTYPE)``` is the annotation on top of bean class used to create prototype beans.
- lazy instantiation takes place because bean reference is created at the time of request from the container. 