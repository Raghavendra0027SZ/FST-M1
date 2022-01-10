package activities;

public class Car {

    String color="Magnetite Black";
    String transmission="Automatic";
    int make=2022;
    int tyre;
    int door;
    public Car(int tyre,int door)
    {
        this.tyre=tyre;
        this.door=door;
    }

    public void displayCharacteristics()
    {
        System.out.println("Color:"+color+",transmission:"+transmission+",make:"+make+",tyre:"+tyre+
                ",door:"+door);
    }
    public void accelarate()
    {
        System.out.println("Car is moving forward");
    }
    public void brake()
    {
        System.out.println("Car has stopped");
    }



}
