package com.llf.spring.day5_15_1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by lenovo on 2016/5/15.
 * //通过添加 @Aspect 注解声明一个 bean 是一个切面!
 * * 5. 配置切面
 * 5.1 切面必须是 IOC 中的 bean: 实际添加了 @Component 注解
 * 5.2 声明是一个切面: 添加 @Aspect
 * 5.3 声明通知: 即额外加入功能对应的方法.
 * 5.3.1 前置通知: @Before("execution(public int com.atguigu.spring.aop.ArithmeticCalculator.*(int, int))")
 *
 * @Before 表示在目标方法执行之前执行 @Before 标记的方法的方法体.
 * @Before 里面的是切入点表达式:
 * <p/>
 * 6. 在通知中访问连接细节: 可以在通知方法中添加 JoinPoint 类型的参数, 从中可以访问到方法的签名和方法的参数.
 */
//可以使用@order来指定切面的优先级，值越高优先级月高（当有多个切面时）
@Order(1)
@Aspect
@Component
public class LoggingAspect {

//前置通知: @Before  在那个方法开始前执行
//    @Before("execution(public int com.llf.spring.day5_15_1.aop.ArithmeticCalculatorImp.add(int ,int))")
//
//    @Before("execution(public int com.llf.spring.day5_15_1.aop.ArithmeticCalculatorImp.*(int ,int))")  //可以返回通知
//    public  void BeforeMethod(JoinPoint joinPoint){
//        String methodName=joinPoint.getSignature().getName();//得到方法名
//        Object [] args=joinPoint.getArgs();//得到参数名
//        System.out.println("this " + methodName + " begin with " + Arrays.asList(args));
//    }
//
//    /**
//     * 在方法执行之后执行的代码，无论是否出现异常
//     * @param joinPoint
//     */
//    @After( "execution(* com.llf.spring.day5_15_1.aop.*.*(..))")
//    public void AfterMethod(JoinPoint joinPoint)
//    {
//        String methodName = joinPoint.getSignature().getName();//得到方法名
//        Object[] args = joinPoint.getArgs();//得到参数名
//        System.out.println("this " + methodName + " 方法结束 " + Arrays.asList(args));
//    }
//
//    /**
//     * 在方法执行正常结束后执行的代码
//     * 返回通知是可以访问方法的返回值
//     * @param joinPoint
//     * @param result
//     */
//    @AfterReturning(value ="execution(* com.llf.spring.day5_15_1.aop.*.*(..))",returning = "result")
//    public void AfterRunning(JoinPoint joinPoint, Object result) {
//        String methodName = joinPoint.getSignature().getName();//得到方法名
//        System.out.println("this " + methodName + " over with " + result);
//    }
//
//    /**
//     * 在目标方法执行出现异常时执行的代码
//     * 可以访问到异常的对象，且可以指定在出现特定异常执行通知代码
//     *异常通知，可以返回异常
//     * @param joinPoint
//     * @param ex
//     */
//    @AfterThrowing(value = "execution(* com.llf.spring.day5_15_1.aop.*.*(..))" ,throwing= "ex")
//    public void AfterException(JoinPoint joinPoint, Exception ex) {
//        String methodName = joinPoint.getSignature().getName();//得到方法名
//        System.out.println("this " + methodName + " throw exception with " + ex);
//    }

    /**
     * 环绕通知  类似于动态代理全过程！
     * 必须要有返回值
     * @param pjp
     * @return
     */
    @Around("execution(* com.llf.spring.day5_15_1.aop.*.*(..))")
    public Object ArroundMethod(ProceedingJoinPoint pjp) {
        String methodName = pjp.getSignature().getName();
        Object result = null;
        try {
            //前置通知
            System.out.println("this method " + methodName + " begin with" + Arrays.asList(pjp.getArgs()));
            //执行目标方法
            result = pjp.proceed();
            //返回后置通知
            System.out.println("the method end with " + result);
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("this method " + methodName + " throw exception " + throwable);
            throw new RuntimeException(throwable);
        }
        //后置通知
        System.out.println("this method " + methodName + " ends");
        return result;
    }

}
