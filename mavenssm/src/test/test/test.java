import com.stlf.dao.Dao;
import com.stlf.domain.Domain;
import com.stlf.service.Services;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 * This is a Java Class
 *
 * @author stylefeng
 * @create 2018-11-08 19:09
 */

public class test {

    @Test
    public void find(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dao bean = ac.getBean(Dao.class);
        Domain byId = bean.findById(2);
        System.out.println(byId);
    }

    @Test
    public void test(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Services service = ac.getBean(Services.class);
        Domain byId = service.findById(1);
        System.out.println(byId);
    }

}
