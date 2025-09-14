public class builder {
    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .withId(1)
                .withBrand("Toyota")
                .withModel("Corolla")
                .withColor("White")
                .build();

        Car car2 = new Car.Builder()
                .withId(2)
                .withBrand("BMW")
                .withModel("M3")
                .withColor("Black")
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}

// Product
class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final String color;

    private Car(Builder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // Static Builder
    public static class Builder {
        private int id;
        private String brand;
        private String model;
        private String color;

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
