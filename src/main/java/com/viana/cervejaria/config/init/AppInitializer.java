/**
 * 
 */
package com.viana.cervejaria.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.viana.cervejaria.config.WebConfig;

/**
 * @author marcelo
 *
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Retorna quais os controller devem ser mapeados
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	/*
	 * Padrão da URL que será delegada para o DispatcherServlet
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
