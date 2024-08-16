package TEST;

import FUN.AddCandidate;
import FUN.CompareNumberOfCandidates;
import FUN.LogIn;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class AddCandidateTest extends BeforeAfterTest {

    @Test
    public void addCandidateTest() throws InterruptedException, IOException, AWTException {

        LogIn.logIn(driver, wait);
        CompareNumberOfCandidates.compareNumberOfCandidates(driver, wait);

    }



}
