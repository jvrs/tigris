package hu.jvrs.lion.wsimport.tests;

import hu.jvrs.lion.wsimport.AfakulcsServiceBean;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebServiceTest {
	private static final Logger SLF4JLOGGER = LoggerFactory.getLogger(WebServiceTest.class.getSimpleName());
	private AfakulcsServiceBean asb;
	
	@Before
	public void setUp() throws MalformedURLException {
		URL url = new URL("http://localhost:7001/AfakulcsServiceBean/AfakulcsServiceBeanService?WSDL");
        QName qname = new QName("http://beans.services.ws.lion.jvrs.hu/", "AfakulcsServiceBeanService"); 
        Service service = Service.create(url, qname); 
        asb = service.getPort(AfakulcsServiceBean.class);
	}
	
	@Test
//	@Ignore
	public void test() throws MalformedURLException {	
		String response = asb.getAfakulcsKodEsById(1);
		Assert.assertNotNull(response);
		SLF4JLOGGER.info("The method {getAfakulcsKodEsById} returned: " + response);
	}
}
