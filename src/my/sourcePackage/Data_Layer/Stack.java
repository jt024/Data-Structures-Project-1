/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.sourcePackage.Data_Layer;

/**
 *
 * @author jt024
 */
public class Stack {
    
    private Link lastIn;
    
    
/** Method: getLastIn()
 *  Purpose: replaces lastIn Link object with 
 * @param newLink
 *  Author: jt024
 */  
    public void setLastIn(Link newLink){
        
        lastIn = newLink;
    }
/** Method: getLastIn()
 *  Purpose: returns lastIn Link object
 *  Author: jt024
 * @return lastIn
 */    
    public Link getLastIn(){
        
        return lastIn;
    }
/**
 *
 * 
 */    
    public void addLink(int value){
        
        if(lastIn==null){
            
        }
        
    }
    
    
    
    
}
