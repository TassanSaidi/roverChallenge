package tonderai_Platform;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rovers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ASSUMPTIONS
		
		/*
		 * Object remains in position if asked to go beyond defined border limits
		 * 
		 * */
		
		String[] arrDirection = {"N","S","E","W"};
		int[] coordinates = {0,0};
		String currDirection ="";
		int[] maxCoordinate= {0,0};
		List<String> instructions = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount of rovers as digit:");
		int rovAmount =Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter Top right-hand coordinates:");
		String[] cord=scan.nextLine().split(" ");
		maxCoordinate[0]=Integer.parseInt(cord[0]);
		maxCoordinate[1]=Integer.parseInt(cord[1]);
		
		for(int j=0;j<rovAmount;j++) {
			System.out.println("Enter starting position and direction all seperated by space");
			String[] tempArr = scan.nextLine().split(" ");
			coordinates[0]=Integer.parseInt(tempArr[0]);
			coordinates[1]=Integer.parseInt(tempArr[1]);
			currDirection=tempArr[2].toUpperCase();
			
			System.out.println("Enter Rover Instructions:");
			String temp=scan.nextLine().toUpperCase();
			
			
			for(int i=0;i<temp.length();i++) {
				instructions.add(""+temp.charAt(i));
			}
			String results[] = move(instructions,coordinates,currDirection,maxCoordinate);
			
			System.out.println("Destination for Rover:"+j+" is:");
			System.out.println(results[0]+" "+results[1]+" "+ results[2]+"\n");
			
	}
		System.out.println("Program Finished");
	}
	
	
	public static String[] move(List<String> instr,int[] curr,String dir, int[] max){
		int current[]= {curr[0],curr[1]};
		String[] output= {"","",""};
		
		for(String d:instr){
			
			if(d.equals("M")) {
				
				current= moveDir(dir,current, max);
			}
			else {
				
				dir=ori(dir,d);
			}
			
		}
		output[0]=""+current[0];
		output[1]=""+current[1];
		output[2]=dir;
		return output;
	}
	
	public static int[] moveDir(String dir,int c[], int[] max) {
		int[] cord= {c[0],c[1]};
			switch(dir){
				
				case"N":
					if(cord[1]<max[1]) {cord[1]++;}
					
					return cord;
					
				case("S"):
					if(cord[1]>0) {cord[1]--;}
					
					return cord;
				
				case "W":
					if(cord[0]>0) {cord[0]--;}
					
					return cord;
				case "E":
					if(cord[0]<max[0]) {cord[0]++;}
					
					return cord;
				
				default:
					return cord;
					
			}
		
		
	}
	
	public static String ori(String curr,String inst) {
		String output =curr;
		
		switch(inst) {
		case "L":
			if(curr.equals("N")) {
				return "W";
			}
			if(curr.equals("S")) {
				return "E";
			}if(curr.equals("W")) {
				return "S";
			}if(curr.equals("E")) {
				return "N";
			}
			 
		case "R":
			if(curr.equals("N")) {
				return "E";
			}
			if(curr.equals("S")) {
				return "W";
			}if(curr.equals("W")) {
				return "N";
			}if(curr.equals("E")) {
				return "S";
			}
			
			
			
		default:
			return output;
		
		}
		
	}

}
