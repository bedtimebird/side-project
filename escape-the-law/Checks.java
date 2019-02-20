import java.lang.*;
import java.util.Scanner;
/**
 * @author A00964363
 * various checks used throughout program
 */
public class Checks {
  public static final int MIN_ACCOUNT = 4;
  public static final int MAX_ACCOUNT = 30; 
  public static final int MIN_STRING = 1;
  public static final int MAX_STRING = 40;  
  public static final int AMOUNT_GREATER_THAN = 0;
/**
 * method to format Strings to capitalize first letter of each word
 * @param word String 
 * @return st String
 */
 /*
	public static String formatName(String word) {
	   word = word.toLowerCase();
	   char[] charArray = word.toCharArray();
	   for (int i=0; i<charArray.length; i++){
	     if (i==0 && charArray[i] != ' ' || charArray[i] != ' ' && charArray[i-1] == ' ') {
	       charArray[i] = Character.toUpperCase(charArray[i]);
	     }
	   }
	   String st = new String(charArray);
	   return st;
	 }
   */
/**
 * method to format money to two decimal places
 * @param moeny double 
 * @return numberAsString String
 */
	 public static String formatMoney(double money) {
	     String numberAsString = String.format ("%.2f", money);
	     return numberAsString;
	 }
/**
 * method to check length of string 
 * throw illegalArgument if it does not conform 
 * @param name String 
 * @return name String
 */
	 public static String stringLength(String name) {
	 char[] stringToCharArray = name.trim().toCharArray();
	   if (stringToCharArray.length >= MIN_STRING && stringToCharArray.length <= MAX_STRING) {
	     return name;
	   } else {
	   throw new IllegalArgumentException("Must enter valid input between " + MIN_STRING + " and " + MAX_STRING + " characters.");
	 }
	}
/**
 * method to check account length  
 * throw illegalArgument if it does not conform 
 * @param name String 
 * @return name String
 */
  public static String accountLength(String name) {
	 char[] stringToCharArray = name.trim().toCharArray();
	   if (stringToCharArray.length >= MIN_ACCOUNT && stringToCharArray.length <= MAX_ACCOUNT) {
	     return name;
	   } else {
	   throw new IllegalArgumentException("Must enter valid input between " + MIN_ACCOUNT + " and " + MAX_ACCOUNT + " characters.");
	 }
	}
/**
 * method to check if input double is greater than AMOUNT_GREATER_THAN
 * throw illegalArgument if it does not conform 
 * @param value double 
 * @return value double 
 */
	public static Double doubleValue(double value) {
	 if (value > AMOUNT_GREATER_THAN) {
	   return value;
	 } else if (value == AMOUNT_GREATER_THAN) {
	   throw new IllegalArgumentException("Value of 0 cannot be processed.");
	 } else {
	   throw new IllegalArgumentException("Negative values cannot be used.");
	 }
	}
/**
 * method to check date input is null
 * throw illegalArgument if it does not conform 
 * @param date Date 
 * @return date Date 
 */
 /*
	public static Date dateNotNull(Date date){
	 if (date != null) {
	   return date;
	 } else {
	   throw new IllegalArgumentException("Date can not be null");
	 }
	}
  */
/**
 * method to check transactionType
 * throw illegalArgument if it does not conform 
 * @param input String 
 * @return input String 
 */
	public static String transactionType(String input){
	 input = input.toLowerCase();
	 if (input.equals("withdraw") || input.equals("deposit")) {
	   return input;
	 } else {
	   throw new IllegalArgumentException("Valid transaction type input is 'withdaw' or 'deposit'");
	 }
	}
/**
 * method process Scanner input that is a String
 * use nextLine() to input names with space
 * apply stringLength check
 * @return stringInput String 
 */
  public static String scanInputString() {
    Scanner sc = new Scanner(System.in);
    String stringInput = stringLength(sc.nextLine());
    return stringInput;
  }
/**
 * method process Scanner input that is a int
 * @return intInput int 
 */
  public static int scanInputInt(){
    Scanner sc = new Scanner(System.in);
    int intInput= 0;
    if (sc.hasNextInt()) {
      intInput = sc.nextInt();
    } else {
      throw new IllegalArgumentException("Value entered must be a integer.");
    }
    return intInput;
  }
/**
 * method process Scanner input that is a double 
 * apply doubleValue() check
 * @return doubleInput double 
 */
  public static double scanInputDouble(){
    Scanner sc = new Scanner(System.in);
    double doubleInput = 0;
    if (sc.hasNextDouble()) {
      doubleInput = doubleValue(sc.nextDouble());
    } else {
      throw new IllegalArgumentException("Value entered must be a double.");
    }
    return doubleInput;
  }

	}
