package pk.edu.nust.seecs.gradebook;



import java.io.IOException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * My main App. 
 * <p>
 This executes everything.
 */

public class App {
    public static exec e;
    public static void main(String[] args) throws IOException {
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        exec e = (exec) context.getBean("exec");
//
//        e.add();
//        System.out.println(e.toString());
        

//        CloDao clodao = new CloDao();
//
//        // Add new clo
//        Clo clo = new Clo();
//        clo.setName("CLO 1");
//        clo.setDescription("Design efficient solutions for algorithmic problems");
//        clo.setPlo("2");
//        clodao.addClo(clo);
//
//        clodao.updateClo(clo);
//
//        // Delete an existing clo
//        clodao.deleteClo(1);
//
//        // Get all clos
//        for (Clo iter : clodao.getAllClos()) {
//            System.out.println(iter);
//        }
        
        DbToCSV.dbtocsv();
//       
//
//        // Get clo by id
//        System.out.println(clodao.getCloById(1));

//        GradeBo gb = new GradeBo();                
//        gb.get_grade();
        
        
    }

}