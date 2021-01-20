package br.com.correios.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import br.com.correios.gen.ConsultaCEP;
import br.com.correios.gen.ConsultaCEPResponse;

public class CorreiosClient extends WebServiceGatewaySupport {

	public ConsultaCEPResponse consultaCep(String cep) {
		ConsultaCEP requestCep = new ConsultaCEP();
		
		requestCep.setCep(cep);
		System.out.println("Obtendo dados do CEP: " + cep);
		
		return (ConsultaCEPResponse) getWebServiceTemplate().marshalSendAndReceive(requestCep);
	}
	
}
