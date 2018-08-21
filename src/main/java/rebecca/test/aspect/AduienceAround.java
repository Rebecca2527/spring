package rebecca.test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Taurus on 2018/8/20.
 */
@Aspect
public class AduienceAround {

    //定义命名的切点
    @Pointcut("execution(* rebecca.test.pointcat.Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("关闭手机~~~~~");
            System.out.println("停止走动~~~~");
            /**
             * 通过该方法来调用被通知的方法
             * 通知方法中可以做任何事情
             * 当控制权交给被通知方时，即需要调用该方法
             * 如果不调用该方法 那么通知会阻塞被通知方法的调用
             */
         //   proceedingJoinPoint.proceed();
            System.out.println("鼓掌~~~~~");
        } catch (Throwable throwable) {
            System.out.println("这是演的啥啊 退款！！~~~");
        }
    }

}
