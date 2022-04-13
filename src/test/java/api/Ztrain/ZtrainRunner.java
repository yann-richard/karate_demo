package api.Ztrain;

import com.intuit.karate.junit5.Karate;

class ZtrainRunner {

    @Karate.Test
    Karate testUsers() {
        return new Karate()
                .run("ZTrainFunctional").relativeTo(getClass())
                .run("userToken").relativeTo(getClass())
                .run("ZTrain_UserThreat").relativeTo(getClass());

    }


}

/*
    @Karate.Test
    Karate testUsers() {
        return new Karate()
                .feature("users").relativeTo(getClass())
                .feature("ZTrain").relativeTo(getClass())
                .feature("userToken").relativeTo(getClass())
                .feature("ZTrain_UserOperations").relativeTo(getClass());
    }
*/
