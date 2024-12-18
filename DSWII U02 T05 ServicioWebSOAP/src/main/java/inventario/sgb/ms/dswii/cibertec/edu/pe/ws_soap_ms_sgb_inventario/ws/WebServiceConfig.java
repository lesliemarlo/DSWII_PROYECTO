package inventario.sgb.ms.dswii.cibertec.edu.pe.ws_soap_ms_sgb_inventario.ws;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;

@EnableWs
@Configuration
public class WebServiceConfig {

    private static final String NAMESPACE_URI_ESTADOCOPIA = "http://pe.edu.cibertec.dswii.ms.sgb.inventario/WS_SOAP_ms_sgb_inventario/estado-copia-service";
    private static final String NAMESPACE_URI_COPIA = "http://pe.edu.cibertec.dswii.ms.sgb.inventario/WS_SOAP_ms_sgb_inventario/copia-service";
    

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    //____________________________  CONTRATO para ESTADO COPIA _____________________________
    @Bean(name = "estadoCopia")
    public DefaultWsdl11Definition defaultWsdl11Definition(@Qualifier("estadoCopiaSchema") XsdSchema estadoCopiaSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("EstadoCopiaPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_ESTADOCOPIA);
        wsdl11Definition.setSchema(estadoCopiaSchema);
        return wsdl11Definition;
    }

    @Bean (name = "estadoCopiaSchema")
    public XsdSchema estadoCopiaSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/estado-copia-schema.xsd"));
    }

    //____________________________  CONTRATO para COPIA _____________________________
    @Bean(name = "copia")
    public DefaultWsdl11Definition defaultWsdl11DefinitionCopia(@Qualifier("copiaSchema") XsdSchema copiaSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CopiaPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(NAMESPACE_URI_COPIA);
        wsdl11Definition.setSchema(copiaSchema);
        return wsdl11Definition;
    }

    @Bean (name = "copiaSchema")
    public XsdSchema copiaSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/xsd/copia-schema.xsd"));
    }}