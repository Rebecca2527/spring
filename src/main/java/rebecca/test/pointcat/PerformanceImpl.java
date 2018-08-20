package rebecca.test.pointcat;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Taurus on 2018/8/17.
 */
@Component
public class PerformanceImpl implements Performance {

    public void perform() {
        System.out.println("执行方法");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Performance bean = ctx.getBean(Performance.class);
        bean.perform();

    }
}
