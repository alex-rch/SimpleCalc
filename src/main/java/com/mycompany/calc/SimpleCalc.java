/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calc;

/**
 *
 * @author Алексей
 */
public class SimpleCalc {
    private String operand1;
    private String operand2;
    private String operation;
    private String ans;

    public SimpleCalc() {
        operand1="";
        operand2="";
        operation="";
        ans="";
    }

    /**
     * @return the operand1
     */
    public String getOperand1() {
        return operand1;
    }

    /**
     * @param operand1 the operand1 to set
     */
    public void setOperand1(String operand1) {
        this.operand1 = operand1;
    }

    /**
     * @return the operand2
     */
    public String getOperand2() {
        return operand2;
    }

    /**
     * @param operand2 the operand2 to set
     */
    public void setOperand2(String operand2) {
        this.operand2 = operand2;
    }

    /**
     * @return the operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return the ans
     */
    public String getAns() {
        ans="";
        float value1, value2;
        try {
            value1 = Float.parseFloat(operand1);
            value2 = Float.parseFloat(operand2);
        } catch(NumberFormatException e) {
            ans="Number format error.";
            return ans;
        }
        if(operation.charAt(0)=='3' && value2==0) {
            ans="Error: Dividing by zero.";
            return ans;
        }
        float intAns=0;
        switch(operation.charAt(0)) {
            case '0': intAns=value1+value2; break;
            case '1': intAns=value1-value2; break;
            case '2': intAns=value1*value2; break;
            case '3': intAns=value1/value2; break;            
        }
        ans=Float.toString(intAns);
        return ans;
    }

    /**
     * @param ans the ans to set
     */
    public void setAns(String ans) {
        this.ans = ans;
    }
    
}
