package oop.assignment2.ex27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {


    static String firstN;
    static String lastN;
    static String zipCode;
    static String empID;
    static String response;

    Validation(String fn, String ln, String zip, String id)
    {
        firstN=fn;
        lastN=ln;
        zipCode=zip;
        empID=id;
    }
    public static void validateInput()
    {
        int errors = 0;
        char firstNC[] = firstN.toCharArray();
        char lastNC[] = lastN.toCharArray();
        char zipCodeC[] = zipCode.toCharArray();
        char empIDC[] = empID.toCharArray();

        errors =emptyfCheck(firstN);
        errors =emptylCheck(lastN, lastNC);
        errors =shortfCheck(firstN, firstNC);
        errors =shortlCheck(lastN, lastNC);
        errors = zipCheck(zipCode, zipCodeC);
        errors = formatCheck(empID);

        if(errors==0)
        {
            response = "There were no errors found.";
            printResult(response);
        }


    }

    public static int emptyfCheck(String givenString)
    {
        char givenCharacter[] = givenString.toCharArray();
        int characterCheck= 0;
        for(int i=0;i<givenString.length();i++){
            if(Character.isAlphabetic(givenCharacter[i])){
                characterCheck++;

            }
        }
        if(characterCheck>0){
            return 0;
        }
        else{

            response = "The first name must be filled in.";
            printResult(response);
            return 1;
        }
    }
    public static int emptylCheck(String givenString, char givenCharacter[])
    {
        int characterCheck= 0;
        for(int i=0;i<givenString.length();i++){
            if(Character.isAlphabetic(givenCharacter[i])){
                characterCheck++;

            }
        }
        if(characterCheck>0){
            return 0;
        }
        else{

            response = "The last name must be filled in.";
            printResult(response);
            return 1;
        }
    }

    public static int shortfCheck(String givenString, char givenCharacter[])
    {
        int characterCheck= 0;
        for(int i=0;i<givenString.length();i++){
            if(Character.isAlphabetic(givenCharacter[i])){
                characterCheck++;

            }
        }
        if(characterCheck>2){
            return 0;
        }
        else{

            response = "The first name must be at least 2 characters long.";
            printResult(response);
            return 1;
        }
    }

    public static int shortlCheck(String givenString, char givenCharacter[])
    {
        int characterCheck= 0;
        for(int i=0;i<givenString.length();i++){
            if(Character.isAlphabetic(givenCharacter[i])){
                characterCheck++;

            }
        }
        if(characterCheck>2){
            return 0;
        }
        else{

            response = "The last name must be at least 2 characters long.";
            printResult(response);
            return 1;
        }
    }

    public static int zipCheck(String givenString, char givenCharacter[])
    {
        int numCheck= 0;
        int charCheck = 0;
        for(int i=0;i<givenString.length();i++){
            if(Character.isDigit(givenCharacter[i])){
                numCheck++;

            }
        }
        for(int i=0;i<givenString.length();i++){
            if(Character.isAlphabetic(givenCharacter[i])){
                charCheck++;

            }
        }
        if(numCheck>0&&charCheck==0){
            return 0;
        }
        else{

            response = "The ZIP code must be a number.";
            printResult(response);
            return 1;
        }
    }

    public static int formatCheck(String givenString)
    {
        Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z][-][0-9][0-9][0-9][0-9]");
        Matcher match = pattern.matcher(givenString);

        if(!match.matches()){
            response = "The employee ID must be in the format of AA-1234.";
            printResult(response);
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void printResult(String givenString){
        System.out.println(response);
    }

}
