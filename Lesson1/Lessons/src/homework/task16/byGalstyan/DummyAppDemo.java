package homework.task16.byGalstyan;

import javax.print.attribute.HashAttributeSet;

public class DummyAppDemo {
    public static void main(String[] args) {
        DummyAppPro d1 = new DummyAppPro(new String[]{"Hayk Mkrtchyan", "Gor"}, 2);
        d1.switchCameraState();
        d1.switchCameraState();
        d1.videoCall();
        DummyAppPro d2 = new DummyAppPro(new String[]{"Ani", "Aram", "Anush"}, 3);
        System.out.println(d2.getCallParticipantList());
        DummyAppProMax dm1 = new DummyAppProMax(new String[]{"Anush", "Aram", "Armine"}, 3);

        dm1.switchSharingState();
        dm1.callRing();
        dm1.switchSharingState();

    }
}
