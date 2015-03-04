package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        double ideinglenes = number;  
         if (number % 15 == 0) return "fizzbuzz";else         
         if (number % 5 == 0) return "buzz";else
         if (number % 3 == 0) return "fizz"; else
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