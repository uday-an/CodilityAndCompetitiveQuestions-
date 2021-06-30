package lesson01.binarygaptest;

import org.testng.Assert;
import org.testng.annotations.*;
import lesson01.iterations.*;
public class BinaryTest {
	BinaryGap sol;
	
	@BeforeTest
	public void setUp() {
		sol=new BinaryGap();
	}
	
	@DataProvider(name = "test1")
	public Object[][] generateTestData(){
		return new Object[][] {
			new Object[] {0,0},
			new Object[] {1041,5},
			new Object [] {      65536,  0 },
		      new Object [] {      65537, 15 },
		      new Object [] {     100000,  4 },
		      new Object [] { 2147483637,  1 },
		      new Object [] { 2147483647,  0 }
		};
	}
	
	@Test(dataProvider="test1")
	 public void verifyTheSolution(int inputData, int expectedBinaryGap){  
		 Assert.assertEquals(sol.solution(inputData),expectedBinaryGap);
        Assert.assertEquals(BinaryGap.solution(529),4);  
        //assertEquals();  
    }  
	
	/*@AfterTest
	public void getup() {
		System.out.println("Testing done");
	}*/
	public static void main(String[] args) {
		
	}
}
