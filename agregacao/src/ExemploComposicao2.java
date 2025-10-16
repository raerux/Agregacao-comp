class Motor {
    private final int cilindradas;

    Motor(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}

class Carro {
    private final Motor motor;

    Carro(int cilindradas) {
        this.motor = new Motor(cilindradas);
    }

    public Motor getMotor() {
        return motor;
    }
}

public class ExemploComposicao2 {
    public static void main(String[] args) {
        Carro carro = new Carro(2000);
    }
}