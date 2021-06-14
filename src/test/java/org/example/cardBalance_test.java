package org.example;

public class cardBalance_test {
    /* we have three things in a password
    digits, symbols and letters.
    variables to store the count of each
     */
    int digits=0;
    int symbols=0;
    int letters=0;
    private String password;
    // result string store the final result in the given format in the question

    String result="The password '"+password+"' is a ";
    /*store the count of each character in their respective type
    the increment each counter
     */

        for(int i=0;i<password.length();i++){
        if(Character.isDigit(password.charAt(i))){
            digits++;
        }
        else if(Character.isLetter(password.charAt(i))){
            letters++;
        }
        else{
            symbols++;
        }
    }

    /* if the password length is  >8 then it
    automatically falls in weak password category
    and if the password length is < or = 8
    then it falls in strong password category
     */
        if(password.length()<8){
        /* count of digits is equal to password length
        then the password contains only digits
        and if count of letters is equal to password length
        then the password contains only letters
         */
        CharSequence password;
        if(digits==password.length()){
            result+="very weak password";
        }
        else if(letters==password.length()){
            result+="weak password";
        }
    }
        else{
        // if counter of each variable is < 0,
        // then the password is the strongest
        if(letters!=0 && digits!=0 && symbols!=0){
            result+="very strong password";
        }
        else if(letters!=0 && digits!=0){
            result+="strong password";
        }

    }
        return result;
}

