import com.ziyu.minispring.bean.Bean;
import com.ziyu.minispring.factory.BeanFactory;
import org.junit.Test;

/**
 * @ClassName test
 * @Date
 * @Author
 * @Description TODO
 **/
public class test {

    @Test
    public void test(){
        BeanFactory.add(Bean.class.getName(), new Bean(new Example("ff")));
        Example example = (Example) BeanFactory.get(Bean.class.getName()).getObj();
        example.example();
    }

}
