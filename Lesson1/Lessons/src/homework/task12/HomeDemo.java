package homework.task12;

public class HomeDemo {
    public static void main(String[] args) {
      Home myhome1 =new Home(4,true,2,3,120,"Verishen 12 tun 27");
      Home myhome2 = new Home(myhome1);
      myhome1.printInfo();
        System.out.println("-----------");
        myhome2.printInfo();

    }

}
