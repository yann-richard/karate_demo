package api.Ztrain;

import com.intuit.karate.junit5.Karate;

class ZtrainApiRunner {

    @Karate.Test
    Karate testUsers() {
        return new Karate()
                .run("ZTrainFunctional").relativeTo(getClass())
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
