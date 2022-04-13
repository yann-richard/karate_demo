package api.Ztrain;

import com.intuit.karate.junit5.Karate;

class ZtrainApiRunner2 {

    @Karate.Test
    Karate testUsers() {
        return new Karate()
                .run("ZTrain_UserThreat").relativeTo(getClass());

    }


}

//    @Karate.Test
//    Karate testUsers() {
//        return new Karate()
//                .feature("ZTrainFunctional").relativeTo(getClass())
//                .feature("ZTrain_UserThreat").relativeTo(getClass());
//
//    }
