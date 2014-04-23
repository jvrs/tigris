
package hu.jvrs.tigris.wsimport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hu.jvrs.tigris.wsimport package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAfakulcsById_QNAME = new QName("http://beans.services.ws.leo.jvrs.hu/", "getAfakulcsById");
    private final static QName _GetAfakulcsKodEsByIdResponse_QNAME = new QName("http://beans.services.ws.leo.jvrs.hu/", "getAfakulcsKodEsByIdResponse");
    private final static QName _GetAfakulcsKodEsById_QNAME = new QName("http://beans.services.ws.leo.jvrs.hu/", "getAfakulcsKodEsById");
    private final static QName _SetCrud_QNAME = new QName("http://beans.services.ws.leo.jvrs.hu/", "setCrud");
    private final static QName _SetCrudResponse_QNAME = new QName("http://beans.services.ws.leo.jvrs.hu/", "setCrudResponse");
    private final static QName _GetAfakulcsByIdResponse_QNAME = new QName("http://beans.services.ws.leo.jvrs.hu/", "getAfakulcsByIdResponse");
    private final static QName _GetAllAfakulcsKodEs_QNAME = new QName("http://beans.services.ws.leo.jvrs.hu/", "getAllAfakulcsKodEs");
    private final static QName _GetAllAfakulcsKodEsResponse_QNAME = new QName("http://beans.services.ws.leo.jvrs.hu/", "getAllAfakulcsKodEsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hu.jvrs.tigris.wsimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllAfakulcsKodEs }
     * 
     */
    public GetAllAfakulcsKodEs createGetAllAfakulcsKodEs() {
        return new GetAllAfakulcsKodEs();
    }

    /**
     * Create an instance of {@link AfakulcsAlap }
     * 
     */
    public AfakulcsAlap createAfakulcsAlap() {
        return new AfakulcsAlap();
    }

    /**
     * Create an instance of {@link AfakulcsValaszTipus }
     * 
     */
    public AfakulcsValaszTipus createAfakulcsValaszTipus() {
        return new AfakulcsValaszTipus();
    }

    /**
     * Create an instance of {@link GetAfakulcsKodEsById }
     * 
     */
    public GetAfakulcsKodEsById createGetAfakulcsKodEsById() {
        return new GetAfakulcsKodEsById();
    }

    /**
     * Create an instance of {@link GetAfakulcsByIdResponse }
     * 
     */
    public GetAfakulcsByIdResponse createGetAfakulcsByIdResponse() {
        return new GetAfakulcsByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllAfakulcsKodEsResponse }
     * 
     */
    public GetAllAfakulcsKodEsResponse createGetAllAfakulcsKodEsResponse() {
        return new GetAllAfakulcsKodEsResponse();
    }

    /**
     * Create an instance of {@link SetCrudResponse }
     * 
     */
    public SetCrudResponse createSetCrudResponse() {
        return new SetCrudResponse();
    }

    /**
     * Create an instance of {@link AfakulcsReszlet }
     * 
     */
    public AfakulcsReszlet createAfakulcsReszlet() {
        return new AfakulcsReszlet();
    }

    /**
     * Create an instance of {@link SetCrud }
     * 
     */
    public SetCrud createSetCrud() {
        return new SetCrud();
    }

    /**
     * Create an instance of {@link GetAfakulcsKodEsByIdResponse }
     * 
     */
    public GetAfakulcsKodEsByIdResponse createGetAfakulcsKodEsByIdResponse() {
        return new GetAfakulcsKodEsByIdResponse();
    }

    /**
     * Create an instance of {@link GetAfakulcsById }
     * 
     */
    public GetAfakulcsById createGetAfakulcsById() {
        return new GetAfakulcsById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAfakulcsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.services.ws.leo.jvrs.hu/", name = "getAfakulcsById")
    public JAXBElement<GetAfakulcsById> createGetAfakulcsById(GetAfakulcsById value) {
        return new JAXBElement<GetAfakulcsById>(_GetAfakulcsById_QNAME, GetAfakulcsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAfakulcsKodEsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.services.ws.leo.jvrs.hu/", name = "getAfakulcsKodEsByIdResponse")
    public JAXBElement<GetAfakulcsKodEsByIdResponse> createGetAfakulcsKodEsByIdResponse(GetAfakulcsKodEsByIdResponse value) {
        return new JAXBElement<GetAfakulcsKodEsByIdResponse>(_GetAfakulcsKodEsByIdResponse_QNAME, GetAfakulcsKodEsByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAfakulcsKodEsById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.services.ws.leo.jvrs.hu/", name = "getAfakulcsKodEsById")
    public JAXBElement<GetAfakulcsKodEsById> createGetAfakulcsKodEsById(GetAfakulcsKodEsById value) {
        return new JAXBElement<GetAfakulcsKodEsById>(_GetAfakulcsKodEsById_QNAME, GetAfakulcsKodEsById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCrud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.services.ws.leo.jvrs.hu/", name = "setCrud")
    public JAXBElement<SetCrud> createSetCrud(SetCrud value) {
        return new JAXBElement<SetCrud>(_SetCrud_QNAME, SetCrud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCrudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.services.ws.leo.jvrs.hu/", name = "setCrudResponse")
    public JAXBElement<SetCrudResponse> createSetCrudResponse(SetCrudResponse value) {
        return new JAXBElement<SetCrudResponse>(_SetCrudResponse_QNAME, SetCrudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAfakulcsByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.services.ws.leo.jvrs.hu/", name = "getAfakulcsByIdResponse")
    public JAXBElement<GetAfakulcsByIdResponse> createGetAfakulcsByIdResponse(GetAfakulcsByIdResponse value) {
        return new JAXBElement<GetAfakulcsByIdResponse>(_GetAfakulcsByIdResponse_QNAME, GetAfakulcsByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAfakulcsKodEs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.services.ws.leo.jvrs.hu/", name = "getAllAfakulcsKodEs")
    public JAXBElement<GetAllAfakulcsKodEs> createGetAllAfakulcsKodEs(GetAllAfakulcsKodEs value) {
        return new JAXBElement<GetAllAfakulcsKodEs>(_GetAllAfakulcsKodEs_QNAME, GetAllAfakulcsKodEs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAfakulcsKodEsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://beans.services.ws.leo.jvrs.hu/", name = "getAllAfakulcsKodEsResponse")
    public JAXBElement<GetAllAfakulcsKodEsResponse> createGetAllAfakulcsKodEsResponse(GetAllAfakulcsKodEsResponse value) {
        return new JAXBElement<GetAllAfakulcsKodEsResponse>(_GetAllAfakulcsKodEsResponse_QNAME, GetAllAfakulcsKodEsResponse.class, null, value);
    }

}
