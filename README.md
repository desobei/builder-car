# builder-car
This project is about using Builder Design Pattern with a Car class.
It shows how to create objects step by step instead of long constructors.

How it works

Car is the product (id, brand, model, color).

Car.Builder helps to build a car using methods.

Main shows example of creating cars.

Example:
Car car = new Car.Builder()
        .withId(1)
        .withBrand("Toyota")
        .withModel("Corolla")
        .withColor("White")
        .build();

System.out.println(car);

Output:
Car{id=1, brand='Toyota', model='Corolla', color='White'}

Clean Code

Small methods in builder

Clear names (withBrand, withModel, etc.)

Readable object creation

Private constructor for safe creation
