/**
 * WebServiceCDRatorLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.idega.telecom.webservice.client;

public class WebServiceCDRatorLocator extends org.apache.axis.client.Service implements com.idega.telecom.webservice.client.WebServiceCDRator {

    public WebServiceCDRatorLocator() {
    }


    public WebServiceCDRatorLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceCDRatorLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceCDRatorSoap12
    private java.lang.String WebServiceCDRatorSoap12_address = "http://217.151.180.23/CDRatorTemp/WebServiceCDRator.asmx";

    public java.lang.String getWebServiceCDRatorSoap12Address() {
        return WebServiceCDRatorSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceCDRatorSoap12WSDDServiceName = "WebServiceCDRatorSoap12";

    public java.lang.String getWebServiceCDRatorSoap12WSDDServiceName() {
        return WebServiceCDRatorSoap12WSDDServiceName;
    }

    public void setWebServiceCDRatorSoap12WSDDServiceName(java.lang.String name) {
        WebServiceCDRatorSoap12WSDDServiceName = name;
    }

    public com.idega.telecom.webservice.client.WebServiceCDRatorSoap_PortType getWebServiceCDRatorSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceCDRatorSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceCDRatorSoap12(endpoint);
    }

    public com.idega.telecom.webservice.client.WebServiceCDRatorSoap_PortType getWebServiceCDRatorSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.idega.telecom.webservice.client.WebServiceCDRatorSoap12Stub _stub = new com.idega.telecom.webservice.client.WebServiceCDRatorSoap12Stub(portAddress, this);
            _stub.setPortName(getWebServiceCDRatorSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceCDRatorSoap12EndpointAddress(java.lang.String address) {
        WebServiceCDRatorSoap12_address = address;
    }


    // Use to get a proxy class for WebServiceCDRatorSoap
    private java.lang.String WebServiceCDRatorSoap_address = "http://217.151.180.23/CDRatorTemp/WebServiceCDRator.asmx";

    public java.lang.String getWebServiceCDRatorSoapAddress() {
        return WebServiceCDRatorSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceCDRatorSoapWSDDServiceName = "WebServiceCDRatorSoap";

    public java.lang.String getWebServiceCDRatorSoapWSDDServiceName() {
        return WebServiceCDRatorSoapWSDDServiceName;
    }

    public void setWebServiceCDRatorSoapWSDDServiceName(java.lang.String name) {
        WebServiceCDRatorSoapWSDDServiceName = name;
    }

    public com.idega.telecom.webservice.client.WebServiceCDRatorSoap_PortType getWebServiceCDRatorSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceCDRatorSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceCDRatorSoap(endpoint);
    }

    public com.idega.telecom.webservice.client.WebServiceCDRatorSoap_PortType getWebServiceCDRatorSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.idega.telecom.webservice.client.WebServiceCDRatorSoap_BindingStub _stub = new com.idega.telecom.webservice.client.WebServiceCDRatorSoap_BindingStub(portAddress, this);
            _stub.setPortName(getWebServiceCDRatorSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceCDRatorSoapEndpointAddress(java.lang.String address) {
        WebServiceCDRatorSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.idega.telecom.webservice.client.WebServiceCDRatorSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.idega.telecom.webservice.client.WebServiceCDRatorSoap12Stub _stub = new com.idega.telecom.webservice.client.WebServiceCDRatorSoap12Stub(new java.net.URL(WebServiceCDRatorSoap12_address), this);
                _stub.setPortName(getWebServiceCDRatorSoap12WSDDServiceName());
                return _stub;
            }
            if (com.idega.telecom.webservice.client.WebServiceCDRatorSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.idega.telecom.webservice.client.WebServiceCDRatorSoap_BindingStub _stub = new com.idega.telecom.webservice.client.WebServiceCDRatorSoap_BindingStub(new java.net.URL(WebServiceCDRatorSoap_address), this);
                _stub.setPortName(getWebServiceCDRatorSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceCDRatorSoap12".equals(inputPortName)) {
            return getWebServiceCDRatorSoap12();
        }
        else if ("WebServiceCDRatorSoap".equals(inputPortName)) {
            return getWebServiceCDRatorSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceCDRator");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceCDRatorSoap12"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceCDRatorSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceCDRatorSoap12".equals(portName)) {
            setWebServiceCDRatorSoap12EndpointAddress(address);
        }
        else 
if ("WebServiceCDRatorSoap".equals(portName)) {
            setWebServiceCDRatorSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
