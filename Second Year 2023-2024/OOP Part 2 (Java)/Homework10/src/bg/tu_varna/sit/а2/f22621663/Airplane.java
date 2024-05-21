package bg.tu_varna.sit.а2.f22621663;

import java.util.List;

interface Airplane {
    String getIdentifier();

    boolean requestTakeoff();

    boolean requestLanding();

    void receiveMessage(String message);

    List<String> getBlackBox();
}
