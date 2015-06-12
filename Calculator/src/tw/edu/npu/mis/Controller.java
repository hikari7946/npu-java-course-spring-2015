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
    Calculator mcul;
    aaa mnewjframe;
    
     public Controller(Calculator cal)
    {
        mcul = cal;
    }
     public void setData(String da)
    {
        mcul.appendDigit(Integer.parseInt(da));
        
    }
     public void setOperator(String oper)
    {
        mcul.sign(oper);
    }
    
    public void addView(aaa jframe){
		mnewjframe = jframe;
                mcul.getDisplay();
   
    }
    
}

