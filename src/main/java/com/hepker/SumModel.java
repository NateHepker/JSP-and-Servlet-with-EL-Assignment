package com.hepker;

import java.math.BigDecimal;

/**
 * This class gets and sets 2 numbers and finds their sum. If either are left
 * blank, SumModel will validate the blank to 0, and state "Not a number" if
 * something that is not a number is entered.
 *
 * @author Nate_Hepker
 */
public class SumModel {

    private String firstNum;
    private String secondNum;
    private String message;
    private BigDecimal value1;
    private String error1;
    private BigDecimal value2;
    private String error2;
    private BigDecimal sum;

    public SumModel() {
        this.firstNum = "0";
        this.secondNum = "0";
    }
    
    public SumModel(String firstNum, String secondNum) {
        setFirstNum(firstNum);
        setSecondNum(secondNum);
        this.firstNum = getFirstNum();
        this.secondNum = getSecondNum();
        
    }

    public String getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(String firstNum) {
        this.firstNum = firstNum;
    }

    public String getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(String secondNum) {
        this.secondNum = secondNum;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public String getError1() {
        return error1;
    }

    public void setError1(String error1) {
        this.error1 = error1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public String getError2() {
        return error2;
    }

    public void setError2(String error2) {
        this.error2 = error2;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    /**
     * Validates the numbers by checking if a number is a number and is not left
     * blank.
     *
     * @param num
     * @param temp
     */
    public void validateNum(String num, int temp) {
        // sets firstNum to 0 if set to blank, empty, or null
        if (temp == 1 && (num == null || num.isBlank())) {
            num = "0";
            setFirstNum(num);
        }
        // sets secondNum to 0 if set to blank, empty, or null
        if (temp == 2 && (num == null || num.isBlank())) {
            num = "0";
            setSecondNum(num);
        }

        try {
            if (temp == 1 ) {
                setValue1(new BigDecimal(firstNum));
            }
        } catch (Exception e) {
            setError1("First number entered was not a valid number.");
            setMessage("invalid input");
        }

        try {
            if (temp == 2) {
                setValue2(new BigDecimal(secondNum));
            }
        } catch (Exception e) {
            setError2("Second number entered was not a valid number.");
            setMessage("invalid input");
        }
    }

    /**
     * Finds the sum of 2 numbers
     */
    public void sumNums() {
        // if statement to resolve message throwing null exeption
        if (this.message == null || this.message.isBlank() || this.message.isEmpty()) {
            setMessage("");
        }
        
        validateNum(this.firstNum, 1);
        
        validateNum(this.secondNum, 2);
        if (this.message.equals("")) {
            value1 = new BigDecimal(this.firstNum);
            value2 = new BigDecimal(this.secondNum);
            sum = value1.add(value2);
            setSum(sum);
            setMessage(this.message = value1 + " + " + value2 + " = " + sum);
        }
    }
}
