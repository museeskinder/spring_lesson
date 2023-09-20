## race condition
- race condition happens when two threads are accessing a shared bean variable.
- they race to see which variable has to perform operation, since last written value is maintained. 
## use case of singleton bean
- same singleton bean instance is shared between multiple threads, it s good practice to make beans immutable.
- singleton is more suitable for beans that handle.
  - service layer
  - repository layer business logic implementations.
- mutable singleton beans will result race condition in multi thread environment.
- synchronization is one of many ways to avoid synchronization.

### eager instantiation
- on the startup of your application bean instance is created even if there is no reference to it.
- this is the default behavior.
### lazy instantiation
- bean instances are created when the application is trying to refer the bean .
- the application first checks if bean instance is created.
- during lazy instantiation if an exception happened at run time, while the server is started, the user may see the exception in the application.
- in the case of eager instantiation if bean creation is failed server startup will also fail the user will not see the exception.
- ```@Lazy``` annotation is written on the top of bean class to create lazy instantiations.
