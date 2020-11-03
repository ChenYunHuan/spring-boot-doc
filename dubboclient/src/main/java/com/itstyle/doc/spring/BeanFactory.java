package com.itstyle.doc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/**
 * <Description> <br>
 * 
 * @author tang.yun <br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016-1-18 <br>
 * @since R8.1 <br>
 */
public final class BeanFactory {

    /** logger */
    private static Logger logger = Logger.getLogger("BeanFactory");

    /** ApplicationContext */
    private static ApplicationContext context = null;

    static {
        try {
            context = new ClassPathXmlApplicationContext("classpath*:config/dubbo-consume.xml");
        }
        catch (Exception e) {
            logger.info(e.toString());
        }
    }

    /**
     * Description: getBean<br>
     * 
     * @author tang.yun <br>
     * @taskId <br>
     * @param name name
     * @return Object<br>
     */
    public static Object getBean(String name) {
        if (context == null) {
            context = new ClassPathXmlApplicationContext("classpath*:config/dubbo-consume.xml");
        }
        return context.getBean(name);
    }

    /**
     * BeanFactory
     */
    private BeanFactory() {
    }

}
