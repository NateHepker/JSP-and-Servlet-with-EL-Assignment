
package com.hepker;

/**
 * This class gets and sets 2 numbers and finds their sum. If either are left
 * blank, SumModel will validate the blank to 0, and state "Not a number" if
 * something that is not a number is entered.
 * 
 * @author Nate_Hepker
 */
public class SumModel {
    private String firstNum = "0";
    private String secondNum = "0";
    private String sum = "0";

    /**
     * Gets the first number.
     * @return firstNum
     */
    public String getFirstNum() {
        return firstNum;
    }

    /**
     * Sets the first number. 
     * @param firstNum 
     */
    public void setFirstNum(String firstNum) {
        validateNum(firstNum);
        this.firstNum = blankIsZero(firstNum);
    }

    /**
     * Gets the second number
     * @return secondNum
     */
    public String getSecondNum() {
        return secondNum;
    }

    /**
     * Sets the second number.
     * @param secondNum 
     */
    public void setSecondNum(String secondNum) {
        validateNum(secondNum);
        this.secondNum = blankIsZero(secondNum);
    }

    /**
     * Gets the sum of both numbers
     * @return sum
     */
    public String getSum() {
        return sum;
    }

    /**
     * Sets the sum of firstNum and secondNum to sum.
     * @param sum 
     */
    public void setSum(String sum) {
        sum = sumNums(firstNum, secondNum);
        validateNum(sum);
        this.sum = sum;
    }
    
    
    /**
     * Validates the numbers by checking if a number is a number and is not 
     * left blank.
     * @param str
     */
    public void validateNum(String str){
        if (!isNumber(str) && !str.isBlank()) {
            throw new IllegalArgumentException("First number enterd is not"
                    + " a valid number.");
        }
    }
    
    /**
     * Finds the sum of 2 numbers
     * @param firstNum
     * @param secondNum
     * @return the sum of 2 numbers in a String format.
     */
    public String sumNums(String firstNum, String secondNum){
        double first = 0.0;
        double second = 0.0;
        double total;
        if (isNumber(firstNum)) {
            first = Double.parseDouble(firstNum);
        }
        if (isNumber(secondNum)) {
            second = Double.parseDouble(secondNum);
        }
        total = first + second;
        return Double.toString(total);
    }
    
    /**
     * Sets a blank number field to zero.
     * @param str
     * @return 
     */
    public String blankIsZero(String str){
        if(str == null || str.trim().isEmpty()){
            return str = "0";
        } else {
            return str;
        }
    }
    
    /**
     * Helper method checks if a string is a number or is not.
     * @param str
     * @return true|false
     */
    public boolean isNumber(String str){
        try{
            str = blankIsZero(str);
            //parseDouble will fail to parse if not a number
            double parseDouble = Double.parseDouble(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

    private void addTwo() {
        
        firstNum = blankIsZero(getFirstNum());
        secondNum = blankIsZero(getSecondNum());
        sum = getSum();
        validateNum(firstNum);
        validateNum(secondNum);
        
        if (!isNumber(firstNum)) {
            throw new IllegalArgumentException("First number must be a valid number");
        }else if (!isNumber(secondNum)) {
            throw new IllegalArgumentException("Second number must be a valid number");
        }else{
            sumNums(firstNum, secondNum);
        }
    }
    
}
