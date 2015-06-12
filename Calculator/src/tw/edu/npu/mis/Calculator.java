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
    
    String digital = "";
    String store = "";
    String decide = "";
    
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
         digital += String.valueOf(digit);
      getDisplay();
    }
    
    public void appendDot() {
        // TODO code application logic here
    }
    
    public void performOperation(Operator operator) {
        // TODO code application logic here
         switch(operator){
            case CLEAR:
                digital = "0";
                getDisplay();
                digital = "";
                break;
            case CLEAR_ENTRY:
                break;
            case BACKSPACE:
                break;
            case EQUAL:
                
               if(decide == "+"){
                        y= Integer.parseInt(digital);
                        digital = String.valueOf(x+y);
                        getDisplay();
                        digital ="";
               }
             if(decide == "-"){
                        y= Integer.parseInt(digital);
                        digital = String.valueOf(x-y);
                        getDisplay();
                        digital ="";
               }
             if(decide == "*"){
                        y= Integer.parseInt(digital);
                        digital = String.valueOf(x*y);
                        getDisplay();
                        digital ="";
               }
             if(decide == "/"){
                        y= Integer.parseInt(digital);
                        digital = String.valueOf(x/y);
                        getDisplay();
                        digital ="";
               }
            case PLUS:
                x= Integer.parseInt(digital);
                digital = "";
                getDisplay();
                decide = "+";
                break;
            case MINUS:
                x= Integer.parseInt(digital);
                digital = "";
                getDisplay();
                decide = "-";
                break;
            case TIMES:
                x= Integer.parseInt(digital);
                digital = "";
                getDisplay();
                decide = "*";
                break;
            case OVER:
                x= Integer.parseInt(digital);
                digital = "";
                getDisplay();
                decide = "/";
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
        notifyObservers(digital);
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public  void sign(String pop)
        // TODO code application logic here
    {
        if(pop == "+") performOperation(Operator.PLUS);
        if(pop == "=") performOperation(Operator.EQUAL);
        if(pop == "c") performOperation(Operator.CLEAR);
        if(pop == "-") performOperation(Operator.MINUS);
        if(pop == "*") performOperation(Operator.TIMES);
        if(pop == "/") performOperation(Operator.OVER);
    }
    

}
