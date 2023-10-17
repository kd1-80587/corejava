package tester;
import  point2d.Point2D;

import java.util.Scanner;

public class TestPointArray1 {
	public static void main(String[] args) {
    double x;
    double y;
    String s;
    int choice;
    int size;
    
    
    Scanner sc=new Scanner(System.in);
	System.out.println("*****************************************");

    System.out.print("enter the size of an array=");
    size=sc.nextInt();
	Point2D []point=new Point2D[size];
	System.out.println("*****************************************");

	for(int i=0;i<size;i++)
	{
		System.out.println("Enter x and y for index at="+i);
		System.out.print("enter the x-coordinate=");
	    x=sc.nextDouble();
        System.out.print("enter the y-coordinate=");
	    y=sc.nextDouble();
	   point[i]=new Point2D(x,y);
	}
	do {
	System.out.println("*****************************************");
    System.out.println("1.Display details of a spacific index");
    System.out.println("2.Display x,y co-ordinate of all points");
    System.out.println("3. 2-indices for the point,validate the indices");
    System.out.println("4.Exit");
    System.out.println("enter your choice");
    choice=sc.nextInt();
	System.out.println("*****************************************");

  
    	switch(choice)
    	{
    	case 1:
    		
  		  System.out.println("Enter index you want=");
          int index;
          index=sc.nextInt();
          if(index<size) {
           point[index].display();
          }else 
          {
        	System.out.println("Invalid index,pls retry!!!!!!");  
          }
          
    		 
    		break;
    	case 2:
    		for(int i=0;i<size;i++)
    		{
    		System.out.println("----------------------------------");
    		  System.out.println("x and y for index at="+i);
              point[i].display();	
    		}
    		break;
    	case 3:
    		System.out.println("enter two index you want to calculate distance");
    		int index1=sc.nextInt();
    		int index2=sc.nextInt();
    		if((0<=index1)&&(index1<=size-1) && (0<=index2)&&(index1<=size-1)) 
    		{
    		if(point[index1].isEqual(point[index2])) {
    			System.out.println("they are loccate at same position");
    		}
    		else {
    		double d=point[index1].calculateDistance(point[index2]);
    		System.out.println("distance between index "+index1+" and "+index2+"="+d);
    		}
    		}else 
    		{
    		System.out.println("array out of bound please enter vaalid inex");	
    		}
    		break;
    	
    	}
      
	}while(choice<4);
  System.out.println("THANK YOU FOR USING APP....:-)");
}
}
