import org.testng.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleCalculator {

    public int add(int a, int b){
        if(a == 5){
            return 999;
        }
        else {
            return a + b;
        }
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
    @BeforeMethod()
    void BeforeMethod(){
        System.out.println("Starting a test");
    }

    @Test (priority = 1)
    void divideTests (){
        Assert.assertEquals(divide(4,2), 2, "4 / 2 = 2, test failed");
        Assert.assertEquals(divide(2,2), 1, "2 / 2 = 2 test failed");
        Assert.assertEquals(divide(1,1), 1, "1 / 1= 1 test failed");
        Assert.assertEquals(divide(3,2), 1, "3 / 2 = 1 test failed");
    }
    @Test (priority = 2)
    void multiplicationTests (){

        Assert.assertEquals(multiply(1,1), 1, "1*1 = 1 test failed");
        Assert.assertEquals(multiply(1,0), 0, "1*0 = 0 test failed");
        Assert.assertEquals(multiply(2,2), 4, "2*2 = 4 test failed");
        Assert.assertEquals(multiply(9,5), 45, "9*5 = 45 test failed");
    }
    @Test (priority = 3)
    void additionTests (){


        Assert.assertEquals(add(1,0), 1, "1+0 = 1 test failed");
        Assert.assertEquals(add(1,1), 2, "1+1 = 2 test failed");
        Assert.assertEquals(add(1,5), 6, "1+5 = 6 test failed");
        Assert.assertEquals(add(5,3), 8, "5+3 = 8 test failed");
    }
    @Test (priority = 4)
    void subtractionTests (){
        Assert.assertEquals(subtract(9,5), 4, "9-5 = 4 test failed");
        Assert.assertEquals(subtract(1,0), 1, "1-0 = 1 test failed");
        Assert.assertEquals(subtract(0,0), 0, "0-0 = 0 test failed");
        Assert.assertEquals(subtract(0,1), (-1), "0-1 = -1 test failed");
    }
}
