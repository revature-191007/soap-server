package com.revature.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration

// Annotation enables application wide support for web services (SOAP)
@EnableWs
public class WebServiceConfig {

	/**
	 * Register a dispatcher servlet for this application which will operate using SOAP
	 * bindings.
	 * @param applicationContext
	 * @return
	 */
	@Bean
	public ServletRegistrationBean 
				messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}
	
	/**
	 * This method used to allow Spring to create a DefaultWsdl11Definition bean
	 * for it to manage. This bean is utilized to generate a WSDL document.
	 * @param superheroSchema
	 * @return
	 */
	@Bean(name="superheroes")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema superheroSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("SuperHeroesPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("www.example.org");
		wsdl11Definition.setSchema(superheroSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema superHeroSchema() {
		return new SimpleXsdSchema(new ClassPathResource("SuperHero.xsd"));
	}
}