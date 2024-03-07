package bg.tu_varna.sit.а2.f22621663.Functionality;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    private static Agency singletonInstance;
    private List<RealEstate> realEstates;

    private Agency() {
        realEstates = new ArrayList<>();
    }

    public static Agency getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Agency();
        }
        return singletonInstance;
    }


    public void addRealEstate(RealEstate realEstate) {
        realEstates.add(realEstate);
    }

    public void removeRealEstate(RealEstate realEstate) {
        realEstates.remove(realEstate);
    }
}

