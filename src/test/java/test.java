import com.ziyu.minispring.annotation.Service;
import com.ziyu.minispring.bean.Bean;
import com.ziyu.minispring.factory.BeanFactory;
import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * @ClassName test
 * @Date
 * @Author
 * @Description TODO
 **/
public class test {

    @Test
    public void test(){
        BeanFactory.createBean(Bean.class.getName(), new Bean(new Example("ff")));
        Example example = (Example) BeanFactory.getBean(Bean.class.getName()).getObj();
        Service service = (Service) example.getClass().getAnnotations()[0];
        System.out.println(service.beanName());
    }

}
