/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;

/**
 *
 * @author boss
 */
public class CloBo {
    CloDao c;
    public void add_clo(Clo clo){
        System.out.println("adding clo...");
        c.addClo(clo); 
        
    }

    public CloDao getC() {
        return c;
    }

    public void setC(CloDao c) {
        this.c = c;
    }
    
    
}
