package homework.task17;

public class BuildingDemo {
    public static void turnOffAllLights(ResidentialBuilding[] arr){
        for (ResidentialBuilding residentialBuilding : arr) {
           residentialBuilding.turnOffLights();
            System.out.println(residentialBuilding.isLightsOn());
        }

    }
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(4, 90, 5);
        Apartment apartment2 = new Apartment(3, 70, 3);

        Home home1 = new Home(6,200);
        Home home2 = new Home(8,300);

        apartment1.switchLights();
        apartment2.switchLights();
        System.out.println(apartment1.isLightsOn());
        System.out.println(apartment2.isLightsOn());


        home1.switchLights();
        home2.switchLights();
        System.out.println(home1.isLightsOn());
        System.out.println(home2.isLightsOn());
        turnOffAllLights(new ResidentialBuilding[]{apartment1,apartment2,home1,home2});






    }
}
