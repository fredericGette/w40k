package com.w40k2.servlet;

import com.google.inject.servlet.ServletModule;

public class MyServletModule extends ServletModule {

	@Override
	protected void configureServlets() {
		serve("/figurine").with(FigurineServlet.class);
	}
	
}
