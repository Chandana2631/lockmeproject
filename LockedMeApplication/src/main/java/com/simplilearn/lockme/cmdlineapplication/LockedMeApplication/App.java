package com.simplilearn.lockme.cmdlineapplication.LockedMeApplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;


/**
 * Code for LockedMe.com Command Line Application
 *
 */
public class App 
{
	//input data
	private static Scanner keyboard;
	
    public static void main( String[] args ) throws IOException
    {
    	try {
    	initApp(); // Initialization method
    	welcomeScreen(); //Welcome method
    	loginInOptions(); //Login In options
    	} catch (IOException e) {
    		System.out.println("IO Exception Occurred; Need to debug the code ");
    	}
    	
    }
    
    public static void loginInOptions() throws IOException {
    	try {
		System.out.println("==========================================");
		System.out.println("1 . List all the files existing in the Locker directory");
		System.out.println("2 . Need to perform more Actions on the Locker directory ");
		System.out.println("3 . Exit/Close the Application ");
    	System.out.println("Please Select One of the Above Options to proceed further: (Type the number 1,2 or 3): ");
		System.out.println("==========================================");
		int option = keyboard.nextInt();
		switch(option) {
			case 1 : 
				fileList();
				break;
			case 2 :
				moreActions();
				break;
			case 3 :
				closeApp();
				break;
			default :
				System.out.println("Please select 1,2 or 3");
				loginInOptions();
				break;
		}
		keyboard.close();
    	} catch (IOException e) {
    		System.out.println("IO Exception Occurred; Need to debug the code ");
    	}
		
	}
	
    public static void closeApp() {
		System.out.println("=========================================================");
		System.out.println("*					                *");
		System.out.println("* Thank you for using LockMe.com Prototype Application  *");
		System.out.println("*				                	*");
		System.out.println("=========================================================");
    	
    }
    public static void moreActions() throws IOException {
		try {
    	System.out.println("==========================================");
		System.out.println("1 . ADD A NEW FILE to existing Locker directory ");
		System.out.println("2 . DELETE existing FILE from Locker directory ");
		System.out.println("3 . SEARCH A FILE in the Locker directory ");
		System.out.println("4 . RETURN to Previous MENU ");
    	System.out.println("Please Select One of the Above Options to proceed further: (Type the number 1,2,3,4 etc.): ");
		System.out.println("==========================================");
		
		int option = keyboard.nextInt();
		switch(option) {
			case 1 : 
				addFile();
				break;
			case 2 :
				deleteFile();
				break;
			case 3 :
				searchFile();
				break;
			case 4 :
				returnMenu();
				break;
			default :
				System.out.println("Please select 1,2,3 or 4");
				moreActions();
				break;
		}
		keyboard.close();
		} catch (IOException e) {
    		System.out.println("IO Exception Occurred; Need to debug the code ");
    	}
		
	}
    public static void addFile() throws IOException {
    	try {
		System.out.println("==========================================");
		System.out.println("ENTER A NEW FILENAME to ADD to Existing Locker directory: ");
	
		String fileName = keyboard.next();
		String upperCaseFileName = fileName.toUpperCase();
		
		System.out.println("==========================================");

        String fileWithPath = "/home/18491a0432qisce/Desktop/LockmeFirstProject/LockedMeApplication/src/main/java/com/simplilearn/lockme/cmdlineapplication/LockedMeApplication/Locker/" + upperCaseFileName;

		// creates a file object
        File newFile = new File(fileWithPath);
        boolean newFileCreatedOrNot = newFile.createNewFile();
        
        if (newFileCreatedOrNot){
    		System.out.println(fileName + " is added to Existing Locker directory ");
        }else {
    		System.out.println(fileName + " is already Existing in Locker directory and hence not added again");	
        }
        loginInOptions();
    	} catch (IOException e) {
    		System.out.println("IO Exception Occurred; Need to debug the code ");
    	}
    }
    public static void deleteFile() throws IOException {
    	
    	try {
    	
    	System.out.println("==========================================");
		System.out.println("ENTER A NEW FILENAME to be deleted in Existing Locker directory: ");
	
		String fileName = keyboard.next();
		String upperCaseFileName = fileName.toUpperCase();
		
		System.out.println("==========================================");

        String fileWithPath = "/home/18491a0432qisce/Desktop/LockmeFirstProject/LockedMeApplication/src/main/java/com/simplilearn/lockme/cmdlineapplication/LockedMeApplication/Locker/" + upperCaseFileName;

		// creates a file object
        File fileToBeDeleted = new File(fileWithPath);
        boolean fileDeletedOrNot = fileToBeDeleted.delete();
    	
        if (fileDeletedOrNot){
    		System.out.println(fileName + " is successfully deleted from Existing Locker directory ");
        }else {
    		System.out.println(fileName + " is not deleted since it is not Existing in Locker directory ");	
        }
        loginInOptions();
        
    	} catch (IOException e) {
    		System.out.println("IO Exception Occurred; Need to debug the code ");
    	}
    }
    public static void searchFile() throws IOException {
    	
    	try {
    	
    	System.out.println("==========================================");
		System.out.println("ENTER A NEW FILENAME to be searched in Existing Locker directory: ");
	
		String fileName = keyboard.next();
		String upperCaseFileName = fileName.toUpperCase();
		
		System.out.println("==========================================");

        String fileWithPath = "/home/18491a0432qisce/Desktop/LockmeFirstProject/LockedMeApplication/src/main/java/com/simplilearn/lockme/cmdlineapplication/LockedMeApplication/Locker/" + upperCaseFileName;

		// creates a file object
        File fileToBeSearched = new File(fileWithPath);
        boolean fileExistsOrNot = fileToBeSearched.exists();
    	
        if (fileExistsOrNot){
    		System.out.println(fileName + " is already in the Existing Locker directory ");
        }else {
    		System.out.println(fileName + " is not Existing in the Locker directory ");	
        }
        loginInOptions();
        
    	} catch (IOException e) {
    		System.out.println("IO Exception Occurred; Need to debug the code ");
    	}
    	
    }
    public static void returnMenu() throws IOException {
    	
    	try {
    	loginInOptions();
    	} catch (IOException e) {
    		System.out.println("IO Exception Occurred; Need to debug the code ");
    	}
    }
	public static void fileList() throws IOException {
		
		try {
		
		System.out.println("==========================================");
		System.out.println("*					*");
		System.out.println("*   LIST OF ALL OBJECTS EXISTING in LOCKER DIRECTORY  *");
		System.out.println("*					*");
		System.out.println("==========================================");
		
		// creates a file object
        File file = new File("/home/18491a0432qisce/Desktop/LockmeFirstProject/LockedMeApplication/src/main/java/com/simplilearn/lockme/cmdlineapplication/LockedMeApplication/Locker");
        // returns an array of all files
        String[] fileList = file.list();
        //Sort the files
        Arrays.sort(fileList);

        for(String str : fileList) {
          System.out.println(str);
        }
        
		loginInOptions();
		
		} catch (IOException e) {
    		System.out.println("IO Exception Occurred; Need to debug the code ");
    	}
	}

    public static void welcomeScreen() {
		System.out.println("=========================================================");
		System.out.println("*					                *");
		System.out.println("*   Welcome To Chandana's LockMe.com Prototype Application		*");
		System.out.println("*   Your Personal Digital Locker 	                *");
		System.out.println("*				                	*");
		System.out.println("=========================================================");
		
	}
    
	public static void initApp() {

		//read data from keyboard
		keyboard = new Scanner(System.in);
		
	}
}
