/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 * The model class of the calculator application.
 */
public class Calculator extends java.util.Observable{
 int x,y;
 
    String number = "";
    String Access = "";
    String Determine = "";
    
    /**
     * The available operators of the calculator.
     */
    public enum Operator {
        CLEAR,       // C
        CLEAR_ENTRY, // CE
        BACKSPACE,   // ⌫
        EQUAL,       // =
        PLUS,        // +
        MINUS,       // -
        TIMES,       // ×
        OVER,        // ⁄
        PLUS_MINUS,  // ±
        RECIPROCAL,  // 1/x
        PERCENT,     // %
        SQRT,        // √
        MEM_CLEAR,   // MC
        MEM_SET,     // MS
        MEM_PLUS,    // M+
        MEM_MINUS,   // M-
        MEM_RECALL   // MR
    }
    
    public void appendDigit(int digit) {
        // TODO code application logic here
         number += String.valueOf(digit);
      getDisplay();
    }
    
    public void appendDot() {
        // TODO code application logic here
    }
    
    public void performOperation(Operator operator) {
        // TODO code application logic here
         switch(operator){
            case CLEAR:
                number = "0";
                getDisplay();
                number = "";
                
                break;
            case CLEAR_ENTRY:
                break;
            case BACKSPACE:
                break;
            case EQUAL:
               switch(Determine){
                    case "+":
                        y= Integer.parseInt(number);
                        number = String.valueOf(x+y);
                        getDisplay();
                        number ="";
                        break;
                    case "-":
                       y= Integer.parseInt(number);
                        number = String.valueOf(x-y);
                        getDisplay();
                        number ="";
                         break;
                    case "*":
                       y= Integer.parseInt(number);
                        number = String.valueOf(x*y);
                        getDisplay();
                        number ="";
                         break;
                    case "/":
                       y= Integer.parseInt(number);
                        number = String.valueOf(x/y);
                        getDisplay();
                        number ="";
                         break;
               }
              
                break;
            case PLUS:
                x= Integer.parseInt(number);
                number = "";
                getDisplay();
                Determine = "+";
                break;
            case MINUS:
                x= Integer.parseInt(number);
                number = "";
                getDisplay();
                Determine = "-";
                break;
            case TIMES:
                x= Integer.parseInt(number);
                number = "";
                getDisplay();
                Determine = "*";
                break;
            case OVER:
                x= Integer.parseInt(number);
                number = "";
                getDisplay();
                Determine = "/";
                break;
            case PLUS_MINUS:
                break;
            case RECIPROCAL:
                break;
            case PERCENT:
                break;
            case SQRT:
                break;
            case MEM_CLEAR:
                break;
            case MEM_SET:
                break;
            case MEM_PLUS:
                break;
            case MEM_MINUS:
                break;
            case MEM_RECALL:
                break;
            
                
        
        }
    
    }
    
    public String getDisplay() {
        // TODO code application logic here
       setChanged();
        notifyObservers(number);
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public  void notation(String tnt)
        // TODO code application logic here
    {
        if(tnt == "+") performOperation(Operator.PLUS);
        if(tnt == "=") performOperation(Operator.EQUAL);
        if(tnt == "C") performOperation(Operator.CLEAR);
        if(tnt == "-") performOperation(Operator.MINUS);
        if(tnt == "*") performOperation(Operator.TIMES);
        if(tnt == "/") performOperation(Operator.OVER);
    }
    

}
