import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. positive happy
    // if (start <= end) {
    // return array;

    //start< end
    @Test
    public void testStartLessThanEnd_HappyPath() {

        ///AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
        "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };

        //act
        //first option
        //FizzBuzz fizzBuzz = new FizzBuzz();
        //String[] actualResult = fizzBuzz.fizzBuzz()

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }



            //Start == end

    @Test
    public void testStartEqualsEnd_HappyPath() {

        ///AAA
        //arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        //act
        //first option
        //FizzBuzz fizzBuzz = new FizzBuzz();
        //String[] actualResult = fizzBuzz.fizzBuzz()

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);




    }

    // 2. negative testing
    // if (start > end)
    // return new String[0];
    @Test
    public void testStarGreaterThanEnd_NegativeTest() {

        ///AAA
        //arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        //act
        //first option
        //FizzBuzz fizzBuzz = new FizzBuzz();
        //String[] actualResult = fizzBuzz.fizzBuzz()

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);




    }


}
