## Beans scope inside spring
- Bean scope refers how the beans are crated and when they are created.
- Answers the question like is there only one bean is used or a log of bean instance has to bea created as reference.
## singleton bean scope
- the default bean scope in spring 
- It gives one instance of unique bean to refer when we use auto wire beans.
- ```@Scope(BeanDefination.SCOPE_SINGLETON)``` can be added on the top of bean class for clarifying singlton bean is creted
whenever fetching the context for bean.