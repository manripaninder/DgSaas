package com.dataguise.saas.util;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Harinder Singh Bedi
 *
 */
public class ApplicationContextProvider implements ApplicationContextAware{

    private static ApplicationContext context;

    public static ApplicationContext getApplicationContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext ac)
            throws BeansException {
        context = ac;
    }
}