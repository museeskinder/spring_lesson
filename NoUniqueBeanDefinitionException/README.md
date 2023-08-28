## NoUniqueBeanDefinitionException
- this exception arises when two or more than beans have same name and the context doesn't know which one
to refer.
- **@Primary** annotation can be used to make one of similar beans taken as
default when name is not specified while creating context.