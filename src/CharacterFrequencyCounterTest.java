import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    public void testLAppearsThreeTimesInHelloWorld(){
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello world");

        //act
        int actualCount = counter.getFrequency('l');
        //assert
        assertEquals(3, actualCount);


    }
    @Test
    public void testNoneOccuringCharachterPercentagezero(){
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");

        //act
        double actualPercentage = counter.getRelativePercentage('z');

        //assert
        assertEquals(0.0, actualPercentage, 0.0001);
    }
}