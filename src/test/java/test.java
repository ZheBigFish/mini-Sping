import com.ziyu.minispring.model.service.Example;
import com.ziyu.minispring.spring.factory.BeanFactory;
import com.ziyu.minispring.spring.scanner.Scanner;
import org.junit.Test;

/**
 * @ClassName test
 * @Date
 * @Author
 * @Description TODO
 **/
public class test {

    @Test
    public void test() throws Exception {
//        BeanFactory.createBean(Bean.class.getName(), new Bean(new Example("ff")));
//        Example example = (Example) BeanFactory.getBean(Bean.class.getName()).getObj();
//        Service service = (Service) example.getClass().getAnnotations()[0];
//        System.out.println(service.beanName());

        Scanner.scanner(Example.class.getName());
        Example example = (Example) BeanFactory.getBean(Example.class.getName()).getObj();
        System.out.println(example);

    }

}
