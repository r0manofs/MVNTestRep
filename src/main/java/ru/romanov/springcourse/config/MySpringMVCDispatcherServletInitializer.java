package ru.romanov.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //указываем где находится config
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //послылка всех запросов на dispatcherServlet
        return new String[] {"/"};
    }
    //конфигурация эквивалентна web.xml
}
