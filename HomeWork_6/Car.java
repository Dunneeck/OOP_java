
// 5) Переписать код в соответствии с Dependency Inversion Principle:
// Разорвать зависимость классов Car и PetrolEngine. У машины же может быть
// DieselEngine.
public class Car {
    private IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

class PetrolEngine implements IEngine {
    public void start() {

    }
}

interface IEngine {
    public void start();
}
