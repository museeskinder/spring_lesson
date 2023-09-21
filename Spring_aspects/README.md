## Aspect oriented programming(AOP)
- aspect oriented programming is a piece of code that gets executed when you call a specific method.
- aspects helps to separate business logic from non-functional requirement logics like:
  - logging 
  - audition 
  - security
  - transaction management

- These logics refered to us cross-cutting concerns.
- spring AOP is the module that enables aspect-oriented programming.

## AOP Jargons
 when aspect is getting defined inside the application. there are three steps taking place 
- WHAT: identifying aspect is the step which spring will execute code or logic upon method call.
- WHEN: when will be the aspect getting executed.
- WHICH: identifying which method to intercept and execute a give aspect, known as **point cut**.
- **Join point:** what triggers aspect execution, usually this even is a method call.
- **Target object:** it is an object which contains a method to intercept for aspect.