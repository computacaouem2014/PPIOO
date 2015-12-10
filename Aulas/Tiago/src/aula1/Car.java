/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author guest-rEwJYe
 */
public class Car {

    private String model;
    private String color;
    private float speed;
    private float engineCapacity;
    private float maxVelocity;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = Math.max(1f, engineCapacity);
        this.maxVelocity = engineCapacity * 110f;
    }

    public Car(String model, String color, float speed, float engineCapacity) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.engineCapacity = engineCapacity;
        this.maxVelocity = engineCapacity * 110f;
    }

    public Car() {
        this(null, null, 0, 1);
    }

    public void accelerate(float amount) {
        if (amount > 0) {
            this.speed += amount;
            if (this.speed > this.maxVelocity) {
                this.speed = this.maxVelocity;
                System.out.println("Este carro não consegue acelerar além de " + this.maxVelocity + " km/h!");
            } else {
                System.out.println("O carro agora está a " + this.speed + " km/h.");
            }
        } else {
            System.out.println("Não é possível acelerar negativamente!");
        }
    }

    public void brake(float amount) {
        this.speed = Math.max(this.speed - amount, 0);
        if (this.speed > 0 && amount > 60f) {
            System.out.println("Freada brusca! O airbag foi ativado.");
        }
    }

    public void getState() {
        if (this.speed > 0) {
            System.out.println("O carro está se movendo a " + speed + " km/h.");
        } else {
            System.out.println("O carro está parado.");
        }
    }

    @Override
    public String toString() {
        return "Carro: " + model + " " + color + " com velocidade máxima de " + maxVelocity + " km/h.";
    }

}
