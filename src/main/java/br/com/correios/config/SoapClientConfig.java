package br.com.correios.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller jaxb = new Jaxb2Marshaller();
		
	}
	
}
