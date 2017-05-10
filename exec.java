/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook;

import pk.edu.nust.seecs.gradebook.bo.CloBo;
import pk.edu.nust.seecs.gradebook.entity.Clo;
/**
 *
 * @author boss
 */
public class exec {
    CloBo clobo=new CloBo();
    Clo clo = new Clo();
    public exec(){
        
    }
    public void add(){
        clo.setName("CLO 3");
        clo.setDescription("Design efficient solutions for algorithmic problems 3");
        clo.setPlo("2");
        clobo.add_clo(clo);        
    }     

    public CloBo getClobo() {
        return clobo;
    }

    public Clo getClo() {
        return clo;
    }

    public void setClobo(CloBo clobo) {
        this.clobo = clobo;
    }

    public void setClo(Clo clo) {
        this.clo = clo;
    }
    
}
