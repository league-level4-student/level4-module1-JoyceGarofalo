package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday": 
			System.out.println("It's silly slug Sunday!");
			break;
		case "Monday": 
			System.out.println("It's magical mouse Monday!");
			break;
		case "Tuesday": 
			System.out.println("It's tactical toad Tuesday!");
			break;
		case "Wednesday": 
			System.out.println("It's wacky walrus Wednesday!");
			break;
		case "Thursday": 
			System.out.println("It's thermodynamic thylacine Thursday!");
			break;
		case "Friday": 
			System.out.println("It's fancy frog Friday!");
			break;
		case "Saturday": 
			System.out.println("It's sneaky snake Saturday!");
			break;
		default: 
			System.out.println("Something went wrong :(");
			break;
		}
	}
}
