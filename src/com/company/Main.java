package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Cybertrack", "Tesla", "Grey", 2020, 200000, 2);
        System.out.println(car1.toString());
        car1.selling(2);
        System.out.println(car1.toString());
    }

    public static class Car {
        private String model, brand, color;
        private int year, price, amount;

        public Car(String model, String brand, String color, int year, int price, int amount) {
            this.model = model;
            this.brand = brand;
            this.color = color;
            this.year = year;
            this.price = price;
            this.amount = amount;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", brand='" + brand + '\'' +
                    ", color='" + color + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    ", amount=" + amount +
                    '}';
        }

        public void delivery(int a) {
            amount += a;
        }

        public void selling(int a) {
            amount -= a;
        }
    }
}
