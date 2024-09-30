package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehiculo, primero tiene que estar detenido");
        }
    }

    public boolean isTachometerGreaterThanZero(){
        if (this.tachometer > 0) {
            System.out.println("Valor del tacómetro: " + this.tachometer);
            return true;
        } else {
            return false;
        }
    }

    public boolean isTachometerEqualToZero(){
        if (this.tachometer == 0){
            System.out.println("Tacómetro = 0.");
            return true;
        } else{
            return false;
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
        } else {
            System.out.println("Has alcanzado la velocidad máxima de 120km/h.");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle >= -45 && angle <= 45) {
            this.wheelsAngle = angle;
        } else if (angle < -45) {
            this.wheelsAngle = -45;
        } else {
            this.wheelsAngle = 45;
        }
        System.out.println("El ángulo de las ruedas es de " + this.wheelsAngle);
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer == 0) {
            this.reverse = reverse;
            this.gear= "R";
            System.out.println("Marcha atrás metida.");
        } else {
            System.out.println("No se puede meter marcha atrás si el vehiculo está en movimiento.");
        }
    }
}
