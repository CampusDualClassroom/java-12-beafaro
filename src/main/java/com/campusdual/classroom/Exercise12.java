package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise12 {
    public static void main(String[] args) {
        Car car = new Car();

        //Un metodo booleano que verifique si el valor del tacómetro es cero
        car.isTachometerEqualToZero();

        //Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        car.start();
        car.isTachometerGreaterThanZero();

        //Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        car.start();

        //Apagar el coche comprobando que el valor del tacómetro es correcto
        car.stop();
        car.isTachometerEqualToZero();

        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        car.start();
        car.accelerate();
        car.stop();

        //Acelerar el coche
        car.start();
        car.accelerate();

        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        car.start();
        for (int i = 1; i < 12; i++) {
            car.accelerate();
        }

        //Frenar la velocidad
        car.brake();

        //Frenar hasta un valor negativo (y comprobar que no se puede)
        car.start();
        car.accelerate();
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(2, 6); i++) {
            car.brake();
        }

        //Girar el volante 20 grados
        car.turnAngleOfWheels(20);

        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        car.turnAngleOfWheels(200);
        car.turnAngleOfWheels(-200);

        //Detener el coche y poner marcha atrás
        while (car.speedometer > 0) {
            car.brake();
        }
        car.stop();
        car.setReverse(true);

        //Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        car.start();
        for (int i = 0; i < ThreadLocalRandom.current().nextInt(1, 25); i++) {
            car.accelerate();
        }
        car.setReverse(true);
    }
}