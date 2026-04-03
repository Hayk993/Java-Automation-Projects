package homework.task16.byGalstyan;

//Ու վերջապես ունենք համ էլ DummyAppProMax տարբերակը, որով կարում ենք դաժԸ էկրան share անենք։
// Էկրան շեյր անելը կարող ենք միայն քոլի առկայության դեպքում, այսինքն հենց սկզբից չենք կարա share անենք։
// Էկրանը շեյրա արած թե չէ, էդ ինֆոն դուք մտածեք ոնց պահեք, բայց մեթոդ պետքա ունենա Ձեր DummyAppProMax կլասը,
// որով անջատում միացնում եք sharing-ը
public class DummyAppProMax extends DummyApp {
    private boolean isSharing;

    public DummyAppProMax(String[] arrayOfParticipant, int callParticipantList) {
        super(arrayOfParticipant, callParticipantList);
        this.isSharing = false;
    }

    public void switchSharingState() {
        if (!inCall) {
            System.out.println("Call not active!");
            return;
        }
        isSharing = !isSharing;
        System.out.println("you can do sharing");

    }

}
