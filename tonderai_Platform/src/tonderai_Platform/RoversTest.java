package tonderai_Platform;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class RoversTest {
	private Rovers rov;
	
	@Before
	public void setup() {
		rov=new Rovers();
	}

	@Test
	//TEST CASE FROM CHALLENGE
	public void test() {
		String ans[]= {"1","3","N"};
		List<String> lis = new ArrayList<String>();
		String [] a= {"L","M","L","M","L","M","L","M","M"};
		lis.addAll(Arrays.asList(a));
		int cod[]= {1,2};
		String dir="N";
		int[] max= {5,5};
				
		assertArrayEquals(ans, rov.move(lis,cod, dir, max));
		
	}
	@Test
	//TEST CASE FROM CHALLENGE-2
	public void test2() {
		String ans[]= {"5","1","E"};
		List<String> lis = new ArrayList<String>();
		String [] a= {"M","M","R","M","M","R","M","R","R","M"};
						
		lis.addAll(Arrays.asList(a));
		int cod[]= {3,3};
		String dir="E";
		int[] max= {5,5};
				
		assertArrayEquals(ans, rov.move(lis,cod, dir, max));
	}
	@Test
	//DEFINED TEST CASE
	public void test3() {
		String ans[]= {"5","3","N"};
		List<String> lis = new ArrayList<String>();
		String [] a= {"M","M","L","M","M","R","M","L","M"};
						
		lis.addAll(Arrays.asList(a));
		int cod[]= {2,0};
		String dir="E";
		int[] max= {6,6};
				
		assertArrayEquals(ans, rov.move(lis,cod, dir, max));
	}


	@Test
	//DISTANCE TEST
	public void testDistance() {
		String ans[]= {"0","0","E"};
		List<String> lis = new ArrayList<String>();
		String [] a= {"M","M","R","M","M","R","M","R","R","M"};
						
		lis.addAll(Arrays.asList(a));
		int cod[]= {0,0};
		String dir="E";
		int[] max= {0,0};
				
		assertArrayEquals(ans, rov.move(lis,cod, dir, max));
	}

	
	
}
