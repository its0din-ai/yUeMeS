package car;

public class Car {
    int cadence;
    int speed;
    int gear;

    void changeCadence(int valueCadence){
        cadence = valueCadence;
    }

    void changeGear(int valueGear){
        gear = valueGear;
    }

    void speedUp(int valueGear){
        gear = valueGear;
    }

    void printInfo(){
        System.out.println("Cadence: " + cadence + "\n" +
                            "Speed: " + speed + "\n" +
                            "Gear: " + gear);
    }
}


