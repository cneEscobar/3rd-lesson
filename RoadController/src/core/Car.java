package core;

public class Car
{


    public String number; //Создание переменной
    public int height; //Создание переменной
    public double weight; //Создание переменной
    public boolean hasVehicle; //Создание переменной
    public boolean isSpecial; //Создание переменной

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    public boolean getHasVehicle() {
        return hasVehicle;
    }

    public void setIsSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    public boolean getIsSpecial() {
        return isSpecial;
    }

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}