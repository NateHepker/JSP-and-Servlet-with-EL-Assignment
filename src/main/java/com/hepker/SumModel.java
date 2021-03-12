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

    public SumModel(String firstNum, String secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public SumModel() {
        this.firstNum = "0";
        this.secondNum = "0";
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
     * @param num1or2
     */
    public void validateNum(String num, int num1or2) {
        if (num1or2 == 1 && num == null || num.trim().isEmpty()) {
            num = "0";
            setFirstNum(num);
        }
        if (num1or2 == 2 && num == null || num.trim().isEmpty()) {
            num = "0";
            setSecondNum(num);
        }

        try {
            if (num1or2 == 1) {
                setValue1(new BigDecimal(firstNum));
            }
        } catch (Exception e) {
            setError1("First number entered was not a valid number.");
            setMessage("invalid input");
        }

        try {
            if (num1or2 == 2) {
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
        validateNum(this.firstNum, 1);
        validateNum(this.secondNum, 2);
        if (this.message.equals("")) {
            BigDecimal num1 = new BigDecimal(this.firstNum);
            BigDecimal num2 = new BigDecimal(this.secondNum);
            BigDecimal sum = num1.add(num2);
            setMessage(this.message = num1 + " + " + num2 + " = " + sum);
        }
    }
}
