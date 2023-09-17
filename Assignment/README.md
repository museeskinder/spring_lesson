# Assignment related to Beans, Autowiring and DI
Your application should play music from one of the Speakers implementations and move using one of the Tyres implementation.
It should also give flexibility to switch between the implementations easily.
- Your program should have two interfaces:
    - Speaker interface with makeSound() method, there should be SonySpeakers and BoseSpeakers Bean implementation of Speakers.
    - Tyres interface with rotate() method, there should be BridgeStoneTyres and MichelinTyres Bean implementation of Tyres.
- VehicleService bean should depend on the implementations of Speakers and Tyres to serve vehicle bean requests.
- Vehicle Bean should have a dependency on VehicleServices Bean, to play music and move the vehicle.
- Finally, Person Bean should have dependency on Vehicle Bean.
