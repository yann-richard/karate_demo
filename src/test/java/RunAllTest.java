import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.json.support.Status;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.intuit.karate.junit5.Karate;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class RunAllTest {

//    @Test
//    public void testAll() {
//        System.setProperty("karate.env", "test");
//        Results results = Runner.parallel(getClass(), 2, "target/surefire-reports");
//        Assertions.assertTrue(results.getFailCount() == 0, results.getErrorMessages());
//    }
        @Karate.Test
        Karate RunAllTest() {
            return Karate.run().relativeTo(getClass()); }


    @AfterAll
    public static void makeCucumberReport() {
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(System.getProperty("user.dir")+"\\target\\surefire-reports\\ui.web.web.json");
        jsonFiles.add(System.getProperty("user.dir")+"\\target\\surefire-reports\\ui.web.zenityIntranet.json");
      /*  jsonFiles.add(System.getProperty("user.dir")+"\\target\\surefire-reports\\ui.mobile.android.zenityIntranetAndroid.json");*/
        jsonFiles.add(System.getProperty("user.dir")+"\\target\\surefire-reports\\api.Ztrain.ZTrain_UserThreat.json");
        jsonFiles.add(System.getProperty("user.dir")+"\\target\\surefire-reports\\api.Ztrain.ZTrainFunctional.json");
        jsonFiles.add(System.getProperty("user.dir")+"\\target\\surefire-reports\\api.Other.usersOtherApi.json");
        jsonFiles.add(System.getProperty("user.dir")+"\\target\\surefire-reports\\api.Other.userToken.json");

        String projectName = "Karate_demo";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
    }

}
