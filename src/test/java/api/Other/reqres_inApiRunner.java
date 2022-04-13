package api.Other;

import com.intuit.karate.junit5.Karate;

class reqres_inApiRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate
                .run("userToken").relativeTo(getClass());
    }

}
