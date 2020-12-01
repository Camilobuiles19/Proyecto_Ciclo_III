/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package mintic.unal.redflix;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//Permite acceder al mundo de Spring desde "afuera". 
//Spring crea su propio mundo y con SpringContext se accede a él
@Component
public class SpringContext implements ApplicationContextAware {
     
    private static ApplicationContext context;
     
    /**
     * Returns the Spring managed bean instance of the given class type if it exists.
     * Returns null otherwise.
     * @param beanClass
     * @return
     */
    public static <T extends Object> T getBean(Class<T> beanClass) {
        return context.getBean(beanClass);
    }
     
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
         
        // store ApplicationContext reference to access required beans later on
        SpringContext.context = context;
    }
}