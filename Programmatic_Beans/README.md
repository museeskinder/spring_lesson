## Adding beans programmatically
``` context.registerBean("vols", "Vehicle.class", "vehicleSupplier")```

using **registerBean** method we can add beans based on conditions, in programming way.
- the first parameter is the name given for the bean, used
to identify bean while fetching it later.
- second condition will be the POJO class where spring instantiates location.
- third one is a supplier method which returns the bean using lambda expressions.