package rebecca.test.aspect;

import org.aspectj.lang.annotation.*;

/**
 * Created by Taurus on 2018/8/17.
 * 将观众定义为一个切面
 */
@Aspect //该注解表明该类不仅仅时pojo 还是一个切面
public class Aduience {
    //定义命名的切点
    @Pointcut("execution(* rebecca.test.pointcat.Performance.perform(..))")
    public void performance() {}

    /**
     * 表演之前
     */
    @Before("performance()")
    //@Before("execution(**rebecca.test.pointcat.Performance.perform(..))")
    public void silenceCellPhones() { System.out.println("关闭手机");}

    @Before("performance()")
    //@Before("execution(**rebecca.test.pointcat.Performance.perform(..))")
    public void takeSeats() { System.out.println("可以聊天");}

    /**
     * 表演之后
     */
    @AfterReturning("performance()")
    //@AfterReturning("execution(**rebecca.test.pointcat.Performance.perform(..))")
    public void applause() { System.err.println("鼓掌");}

    /**
     * 表演失败之后
     */
    @AfterThrowing("performance()")
    //@AfterThrowing("execution(**rebecca.test.pointcat.Performance.perform(..))")
    public void demandRefund() { System.err.println("起哄");}




}
