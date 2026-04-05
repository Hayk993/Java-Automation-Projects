package homework.task16.byGalstyan;

//Սրա հետ զուգահեռ ունեք նաև DummyApp-ի զարգացրած տեսակը՝ DummyAppPro-ն, որով կարողանում եք համ videocall անել,
// համ էլ մինչև 10 հոգի մասնակից ընդգրկել քոլի մեջ։ Կրկին call-ը դառնումա կայացած, եթե DummyAppPro օբյեկտը սարքվումա։
// Ընդ որում, երբ ասում եմ հնարավորություն կա վիդեոքոլ անելու, չի նշանակում, որ էս հենց պիտի վիդեոքոլ անես,
// բայց ձև պետքա լինի հենց սկզբից, կամ ընթացքում միացնելու։ Camera-ն կարա լինի կամ անջատած, կամ միացրած։
// Նենց որ դուք որոշեք ինչ տիպով ու ոնց եք պահում կամեռայի անջատած/միացրած լինելու ինֆոն։
// Մի հատ էլ ինֆո. երբ քոլը վերջանումա, տվյալ օբյեկտը պետքա ենթակա դարձնեք ոչնչացման։
// Թե ոնց անեք, էդ էլ դուք գիտեք։
public class DummyAppPro extends DummyApp {
    boolean camera = false;

    DummyAppPro( String [] callParticipant,int limit) {
        super( callParticipant, 10);
    }

    public void videoCall() {
        System.out.println("there are " + getCallParticipantList() + " participants");
    }

    public boolean switchCameraState() {

        if (camera) {
            camera = false;
            System.out.println("the camera is off");
        } else {
            camera = true;
            System.out.println("the camera is on");
        }
        return camera;
    }


}





