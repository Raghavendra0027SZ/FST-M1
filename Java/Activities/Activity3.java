package activities;

public class Activity3 {

    public void calculateAgeInAllPlanet(double ageinSeconds)
    {
        double ageOnEarth=(ageinSeconds)/31557600;
        System.out.println("Age on Earth:"+ageOnEarth);
        System.out.println("Age on Mercury:"+ageOnEarth*0.2408467);
        System.out.println("Age on Venus:"+ageOnEarth*0.61519726);
        System.out.println("Age on Mars:"+ageOnEarth*1.8808158);
        System.out.println("Age on Jupiter:"+ageOnEarth*11.862615);
        System.out.println("Age on Saturn:"+ageOnEarth*29.447498);
        System.out.println("Age on Uranus:"+ageOnEarth*84.016846);
        System.out.println("Age on Neptune:"+ageOnEarth*164.79132);

    }

    public static void main(String[]args)
    {
        Activity3 act3=new Activity3();
        act3.calculateAgeInAllPlanet(31557600);

    }

}
