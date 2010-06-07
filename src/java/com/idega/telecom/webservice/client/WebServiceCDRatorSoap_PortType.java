/**
 * WebServiceCDRatorSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.idega.telecom.webservice.client;

public interface WebServiceCDRatorSoap_PortType extends java.rmi.Remote {
    public java.lang.String testHelloWorld() throws java.rmi.RemoteException;
    public boolean testDbConnection() throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.User userFindByPersonalId(java.lang.String personalId) throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.User userGetByPersonalIdAndPassword(java.lang.String personalId, java.lang.String password) throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.User userGetByNumberAndPassword(java.lang.String number, java.lang.String password) throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.User[] userGetAll() throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.User userGetByNumber(java.lang.String number) throws java.rmi.RemoteException;
    public boolean userUpdatePassword(java.lang.String number, java.lang.String oldPassword, java.lang.String newPassword) throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.Phone phoneGetByNumber(java.lang.String number) throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.UsageEntry[] usageEntryGetByPersonalIdAndDate(java.lang.String personalId, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.UsageEntry[] usageEntryGetByNumberAndDate(java.lang.String mobileNumber, java.util.Calendar fromDate, java.util.Calendar toDate) throws java.rmi.RemoteException;
    public com.idega.telecom.webservice.client.FriendNumber[] friendsGetByNumber(java.lang.String number) throws java.rmi.RemoteException;
    public boolean terminateNumber(java.lang.String hookPointType, java.lang.String phoneNumber, java.lang.String operatorName) throws java.rmi.RemoteException;
    public boolean checkForLockOnPhone(java.lang.String phoneNumber, java.util.Calendar date) throws java.rmi.RemoteException;
}
