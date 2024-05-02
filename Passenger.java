package object_Oriented_Package;

import java.util.Scanner;

public class Passenger {
	
	
	
	    private String name;
	    private int age;
	    private String passportNumber;

	    public Passenger(String name, int age, String passportNumber) {
	        this.name = name;
	        this.age = age;
	        this.passportNumber = passportNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getPassportNumber() {
	        return passportNumber;
	    }

	    public void setPassportNumber(String passportNumber) {
	        this.passportNumber = passportNumber;
	    }
	    
	    public static void passangerInfo()
		{
			Scanner input = new Scanner(System.in);
			
			String name = null;
			int age = 0;
			String passportNumber = null;
			
			System.out.println("Please enter your name:");
			name = input.nextLine();
			
			System.out.println("Please enter your age:");
			age = input.nextInt();
			
			System.out.println("Please enter your passport Number:");
			passportNumber = input.nextLine();
			
			Passenger passenger = new Passenger(name, age, passportNumber);
	        
		}

	}


