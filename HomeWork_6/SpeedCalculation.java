// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

// Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle),
// напишите метод calculateAllowedSpeed(). Использование этого метода позволит
// сделать класс SpeedCalculation соответствующим OCP

class App {
    public static void main(String[] args) {
        Car car = new Car(100, "Car");
        Bus bus = new Bus(100, "Bus");
        System.out.println(car.calculateAllowedSpeed());
        System.out.println(bus.calculateAllowedSpeed());
    }
}

public interface SpeedCalculation {
    public double calculateAllowedSpeed();
}

class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }
}

class Car extends Vehicle implements SpeedCalculation {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.8;
    }
}

class Bus extends Vehicle implements SpeedCalculation {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.6;
    }
}