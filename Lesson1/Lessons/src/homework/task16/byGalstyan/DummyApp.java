package homework.task16.byGalstyan;

// Պատկերացրեք, որ ունեք տարրական համացանցով զանգ անելու ափփ, որով ուղղակի կարաք զանգեք խոսաք։
// Էկեք իրան անվանենք DummyApp։ Իրանով կարաս զանգ անես, զանգ վերցնես ու զանգն անջատես։
// Մեկ էլ ունի մեթոդ, որով կարաս վերջին զանգի տևողությունը get անես։ Ենթադրենք, որ տվյալ call-ը համարում ենք կայացած,
// երբ DummyApp-ը ստեղծվումա՝ որպես արգումենտ ընդունելով զանգի մասնակիցների ցուցակ, որը 2 հոգուց ավել չի կարա լինի։
// Ամեն մի հոգին դա String-ով նկարագրվող անուն-ազգանունա
class DummyApp {
    protected boolean inCall ;
    private int lastCallDuration = 0;
    private final int callParticipantList;
    String[] arrayOfParticipant;
    private String name;
    private String surname;
    private int limit = 2;
    DummyApp(String[] arrayOfParticipant, int callParticipantList) {
       this.callParticipantList = callParticipantList;

        if (callParticipantList > limit) {
            System.out.println("call participant must be 2");
           // System.exit(1);
        }

    }

    public void callRing() {
        if (!inCall) {
            inCall = true;
            System.out.println("is colling...");

        } else {
            System.out.println("user is already in call: " + name);
        }

    }

    public void pickUp() {

        if (!inCall) {
            inCall = true;
            System.out.println("hello");
        } else {
            System.out.println("user is already in call: " + name);
        }
    }

    public void endCall() {
        if (inCall) {
            lastCallDuration = 0;
            inCall = false;
            arrayOfParticipant = null;
        }
    }

    public int getLastCallDuration() {
        return lastCallDuration;
    }

    public int getCallParticipantList() {
        return callParticipantList;
    }
    public boolean isInCall(){
        return inCall;
    }


}
