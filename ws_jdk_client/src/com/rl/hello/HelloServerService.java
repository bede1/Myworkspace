
package com.rl.hello;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "HelloServerService", targetNamespace = "http://server.rl.com/", wsdlLocation = "http://127.0.0.1:8080/hello?wsdl")
public class HelloServerService
    extends Service
{

    private final static URL HELLOSERVERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.rl.hello.HelloServerService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.rl.hello.HelloServerService.class.getResource(".");
            url = new URL(baseUrl, "http://127.0.0.1:8080/hello?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8080/hello?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        HELLOSERVERSERVICE_WSDL_LOCATION = url;
    }

    public HelloServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServerService() {
        super(HELLOSERVERSERVICE_WSDL_LOCATION, new QName("http://server.rl.com/", "HelloServerService"));
    }

    /**
     * 
     * @return
     *     returns HelloServer
     */
    @WebEndpoint(name = "HelloServerPort")
    public HelloServer getHelloServerPort() {
        return super.getPort(new QName("http://server.rl.com/", "HelloServerPort"), HelloServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloServer
     */
    @WebEndpoint(name = "HelloServerPort")
    public HelloServer getHelloServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.rl.com/", "HelloServerPort"), HelloServer.class, features);
    }

}