/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.entity.Content;

/**
 *
 * @author boss
 */
public class ContentBo {
    
        ContentDao c;
    public void update_clo(Content clo){
        System.out.println("updting clo...");
        c.updateContent(clo);
        
    }
    public void add_clo(Content clo){
        System.out.println("updting clo...");
        c.addContent(clo);    
    }
    
    public void graded_item(){
        
    }
}
