package com.spring;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer 
{

	@Override
	protected Class<?> @Nullable [] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?> @Nullable [] getServletConfigClasses() {
		Class config[] = {Config.class};
		return config;
	}

	@Override
	protected String[] getServletMappings() 
	{
		String[] mapping= {"/"};
		return mapping;
		
	}
	

}
