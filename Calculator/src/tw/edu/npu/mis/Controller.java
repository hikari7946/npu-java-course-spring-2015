/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;
import tw.edu.npu.mis.Calculator.Operator;

/**
 *
 * @author STP
 */
public class Controller {
    /**
     * 宣告變數
     */
    Calculator mcul;
    aaa mnewjframe;
    /**
     * 給Controller 知道 cal 辦法
     * @param cal 
     */
    
     public Controller(Calculator cal)
    {
        mcul = cal;
    }
     /**
      * setData = 運算符號,傳到aaa 
      * @param da 
      */
     public void setData(String da)
    {
        mcul.appendDigit(Integer.parseInt(da));
        
    }
     /**
      * setOperator = 數字 ,傳到aaa
      * @param oper 
      */
     public void setOperator(String oper)
    {
        mcul.sign(oper);
    }
     
     /**
      * Controller中,新加jframe
      * @param jframe 
      */
    
    public void addView(aaa jframe){
		mnewjframe = jframe;
                mcul.getDisplay();
   
    }
    
}

