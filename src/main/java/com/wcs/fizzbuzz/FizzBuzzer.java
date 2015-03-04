package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        if (number / 7 == 0) return "Wizz";else
         if (String.valueOf(number).contains("3")) return "Fizz";else
         if (String.valueOf(number).contains("5")) return "Buzz";else
         if (String.valueOf(number).contains("7")) return "Wizz";else
        return String.valueOf(number);
        }
    
     
    
    

    private boolean tartalmazSzamot(Integer number, char c) {
        //igen utólag rájöttem, hogy ez teljesen kihagyható lett volna, de már mindegy
        boolean vaneSzam = false;
        String intToString = String.valueOf(number);
        
        for (int i = 0; i < intToString.length(); i++) {
            if (intToString.charAt(i) == c) {
                vaneSzam = true;
            }
        }
        return vaneSzam;
    }
    
}

//
//if (number / 7 == 0) return "Wizz"; else
//        if (tartalmazSzamot(number, '3') == true) return "Fizz";else
//        if (tartalmazSzamot(number, '5') == true) return "Buzz";else
//        if (tartalmazSzamot(number, '7') == true) return "Wizz";else