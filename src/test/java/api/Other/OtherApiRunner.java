package api.Other;

import com.intuit.karate.junit5.Karate;

class OtherApiRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate
                .run("usersOtherApi").relativeTo(getClass());
    }

}
