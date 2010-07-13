/**
 * Phone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.idega.telecom.webservice.client;

public class Phone  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String ownerPersonalID;

    private java.lang.String userPersonalID;

    private java.lang.String billReceiverPersonalID;

    private java.lang.String pin1;

    private java.lang.String puk1;

    private float balance;

    private java.lang.String[] friendNumbers;

    private boolean foreignNumberLockEnabled;

    private boolean foreignServiceNumberLockEnabled;

    private java.lang.String serviceType;

    private boolean paymentType;

    private java.lang.String creditCardNumber;

    private java.lang.String creditCardExpiryMonth;

    private java.lang.String creditCardExpiryYear;

    private java.lang.String creditCardCVC;

    private java.lang.String autoRefill;

    private java.lang.String autoRefillAmount;

    private java.lang.String startDate;

    private boolean isGoldNumber;

    public Phone() {
    }

    public Phone(
           java.lang.String number,
           java.lang.String ownerPersonalID,
           java.lang.String userPersonalID,
           java.lang.String billReceiverPersonalID,
           java.lang.String pin1,
           java.lang.String puk1,
           float balance,
           java.lang.String[] friendNumbers,
           boolean foreignNumberLockEnabled,
           boolean foreignServiceNumberLockEnabled,
           java.lang.String serviceType,
           boolean paymentType,
           java.lang.String creditCardNumber,
           java.lang.String creditCardExpiryMonth,
           java.lang.String creditCardExpiryYear,
           java.lang.String creditCardCVC,
           java.lang.String autoRefill,
           java.lang.String autoRefillAmount,
           java.lang.String startDate,
           boolean isGoldNumber) {
           this.number = number;
           this.ownerPersonalID = ownerPersonalID;
           this.userPersonalID = userPersonalID;
           this.billReceiverPersonalID = billReceiverPersonalID;
           this.pin1 = pin1;
           this.puk1 = puk1;
           this.balance = balance;
           this.friendNumbers = friendNumbers;
           this.foreignNumberLockEnabled = foreignNumberLockEnabled;
           this.foreignServiceNumberLockEnabled = foreignServiceNumberLockEnabled;
           this.serviceType = serviceType;
           this.paymentType = paymentType;
           this.creditCardNumber = creditCardNumber;
           this.creditCardExpiryMonth = creditCardExpiryMonth;
           this.creditCardExpiryYear = creditCardExpiryYear;
           this.creditCardCVC = creditCardCVC;
           this.autoRefill = autoRefill;
           this.autoRefillAmount = autoRefillAmount;
           this.startDate = startDate;
           this.isGoldNumber = isGoldNumber;
    }


    /**
     * Gets the number value for this Phone.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Phone.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the ownerPersonalID value for this Phone.
     * 
     * @return ownerPersonalID
     */
    public java.lang.String getOwnerPersonalID() {
        return ownerPersonalID;
    }


    /**
     * Sets the ownerPersonalID value for this Phone.
     * 
     * @param ownerPersonalID
     */
    public void setOwnerPersonalID(java.lang.String ownerPersonalID) {
        this.ownerPersonalID = ownerPersonalID;
    }


    /**
     * Gets the userPersonalID value for this Phone.
     * 
     * @return userPersonalID
     */
    public java.lang.String getUserPersonalID() {
        return userPersonalID;
    }


    /**
     * Sets the userPersonalID value for this Phone.
     * 
     * @param userPersonalID
     */
    public void setUserPersonalID(java.lang.String userPersonalID) {
        this.userPersonalID = userPersonalID;
    }


    /**
     * Gets the billReceiverPersonalID value for this Phone.
     * 
     * @return billReceiverPersonalID
     */
    public java.lang.String getBillReceiverPersonalID() {
        return billReceiverPersonalID;
    }


    /**
     * Sets the billReceiverPersonalID value for this Phone.
     * 
     * @param billReceiverPersonalID
     */
    public void setBillReceiverPersonalID(java.lang.String billReceiverPersonalID) {
        this.billReceiverPersonalID = billReceiverPersonalID;
    }


    /**
     * Gets the pin1 value for this Phone.
     * 
     * @return pin1
     */
    public java.lang.String getPin1() {
        return pin1;
    }


    /**
     * Sets the pin1 value for this Phone.
     * 
     * @param pin1
     */
    public void setPin1(java.lang.String pin1) {
        this.pin1 = pin1;
    }


    /**
     * Gets the puk1 value for this Phone.
     * 
     * @return puk1
     */
    public java.lang.String getPuk1() {
        return puk1;
    }


    /**
     * Sets the puk1 value for this Phone.
     * 
     * @param puk1
     */
    public void setPuk1(java.lang.String puk1) {
        this.puk1 = puk1;
    }


    /**
     * Gets the balance value for this Phone.
     * 
     * @return balance
     */
    public float getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this Phone.
     * 
     * @param balance
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }


    /**
     * Gets the friendNumbers value for this Phone.
     * 
     * @return friendNumbers
     */
    public java.lang.String[] getFriendNumbers() {
        return friendNumbers;
    }


    /**
     * Sets the friendNumbers value for this Phone.
     * 
     * @param friendNumbers
     */
    public void setFriendNumbers(java.lang.String[] friendNumbers) {
        this.friendNumbers = friendNumbers;
    }


    /**
     * Gets the foreignNumberLockEnabled value for this Phone.
     * 
     * @return foreignNumberLockEnabled
     */
    public boolean isForeignNumberLockEnabled() {
        return foreignNumberLockEnabled;
    }


    /**
     * Sets the foreignNumberLockEnabled value for this Phone.
     * 
     * @param foreignNumberLockEnabled
     */
    public void setForeignNumberLockEnabled(boolean foreignNumberLockEnabled) {
        this.foreignNumberLockEnabled = foreignNumberLockEnabled;
    }


    /**
     * Gets the foreignServiceNumberLockEnabled value for this Phone.
     * 
     * @return foreignServiceNumberLockEnabled
     */
    public boolean isForeignServiceNumberLockEnabled() {
        return foreignServiceNumberLockEnabled;
    }


    /**
     * Sets the foreignServiceNumberLockEnabled value for this Phone.
     * 
     * @param foreignServiceNumberLockEnabled
     */
    public void setForeignServiceNumberLockEnabled(boolean foreignServiceNumberLockEnabled) {
        this.foreignServiceNumberLockEnabled = foreignServiceNumberLockEnabled;
    }


    /**
     * Gets the serviceType value for this Phone.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this Phone.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the paymentType value for this Phone.
     * 
     * @return paymentType
     */
    public boolean isPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this Phone.
     * 
     * @param paymentType
     */
    public void setPaymentType(boolean paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the creditCardNumber value for this Phone.
     * 
     * @return creditCardNumber
     */
    public java.lang.String getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this Phone.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(java.lang.String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the creditCardExpiryMonth value for this Phone.
     * 
     * @return creditCardExpiryMonth
     */
    public java.lang.String getCreditCardExpiryMonth() {
        return creditCardExpiryMonth;
    }


    /**
     * Sets the creditCardExpiryMonth value for this Phone.
     * 
     * @param creditCardExpiryMonth
     */
    public void setCreditCardExpiryMonth(java.lang.String creditCardExpiryMonth) {
        this.creditCardExpiryMonth = creditCardExpiryMonth;
    }


    /**
     * Gets the creditCardExpiryYear value for this Phone.
     * 
     * @return creditCardExpiryYear
     */
    public java.lang.String getCreditCardExpiryYear() {
        return creditCardExpiryYear;
    }


    /**
     * Sets the creditCardExpiryYear value for this Phone.
     * 
     * @param creditCardExpiryYear
     */
    public void setCreditCardExpiryYear(java.lang.String creditCardExpiryYear) {
        this.creditCardExpiryYear = creditCardExpiryYear;
    }


    /**
     * Gets the creditCardCVC value for this Phone.
     * 
     * @return creditCardCVC
     */
    public java.lang.String getCreditCardCVC() {
        return creditCardCVC;
    }


    /**
     * Sets the creditCardCVC value for this Phone.
     * 
     * @param creditCardCVC
     */
    public void setCreditCardCVC(java.lang.String creditCardCVC) {
        this.creditCardCVC = creditCardCVC;
    }


    /**
     * Gets the autoRefill value for this Phone.
     * 
     * @return autoRefill
     */
    public java.lang.String getAutoRefill() {
        return autoRefill;
    }


    /**
     * Sets the autoRefill value for this Phone.
     * 
     * @param autoRefill
     */
    public void setAutoRefill(java.lang.String autoRefill) {
        this.autoRefill = autoRefill;
    }


    /**
     * Gets the autoRefillAmount value for this Phone.
     * 
     * @return autoRefillAmount
     */
    public java.lang.String getAutoRefillAmount() {
        return autoRefillAmount;
    }


    /**
     * Sets the autoRefillAmount value for this Phone.
     * 
     * @param autoRefillAmount
     */
    public void setAutoRefillAmount(java.lang.String autoRefillAmount) {
        this.autoRefillAmount = autoRefillAmount;
    }


    /**
     * Gets the startDate value for this Phone.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Phone.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the isGoldNumber value for this Phone.
     * 
     * @return isGoldNumber
     */
    public boolean isIsGoldNumber() {
        return isGoldNumber;
    }


    /**
     * Sets the isGoldNumber value for this Phone.
     * 
     * @param isGoldNumber
     */
    public void setIsGoldNumber(boolean isGoldNumber) {
        this.isGoldNumber = isGoldNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Phone)) return false;
        Phone other = (Phone) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.ownerPersonalID==null && other.getOwnerPersonalID()==null) || 
             (this.ownerPersonalID!=null &&
              this.ownerPersonalID.equals(other.getOwnerPersonalID()))) &&
            ((this.userPersonalID==null && other.getUserPersonalID()==null) || 
             (this.userPersonalID!=null &&
              this.userPersonalID.equals(other.getUserPersonalID()))) &&
            ((this.billReceiverPersonalID==null && other.getBillReceiverPersonalID()==null) || 
             (this.billReceiverPersonalID!=null &&
              this.billReceiverPersonalID.equals(other.getBillReceiverPersonalID()))) &&
            ((this.pin1==null && other.getPin1()==null) || 
             (this.pin1!=null &&
              this.pin1.equals(other.getPin1()))) &&
            ((this.puk1==null && other.getPuk1()==null) || 
             (this.puk1!=null &&
              this.puk1.equals(other.getPuk1()))) &&
            this.balance == other.getBalance() &&
            ((this.friendNumbers==null && other.getFriendNumbers()==null) || 
             (this.friendNumbers!=null &&
              java.util.Arrays.equals(this.friendNumbers, other.getFriendNumbers()))) &&
            this.foreignNumberLockEnabled == other.isForeignNumberLockEnabled() &&
            this.foreignServiceNumberLockEnabled == other.isForeignServiceNumberLockEnabled() &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            this.paymentType == other.isPaymentType() &&
            ((this.creditCardNumber==null && other.getCreditCardNumber()==null) || 
             (this.creditCardNumber!=null &&
              this.creditCardNumber.equals(other.getCreditCardNumber()))) &&
            ((this.creditCardExpiryMonth==null && other.getCreditCardExpiryMonth()==null) || 
             (this.creditCardExpiryMonth!=null &&
              this.creditCardExpiryMonth.equals(other.getCreditCardExpiryMonth()))) &&
            ((this.creditCardExpiryYear==null && other.getCreditCardExpiryYear()==null) || 
             (this.creditCardExpiryYear!=null &&
              this.creditCardExpiryYear.equals(other.getCreditCardExpiryYear()))) &&
            ((this.creditCardCVC==null && other.getCreditCardCVC()==null) || 
             (this.creditCardCVC!=null &&
              this.creditCardCVC.equals(other.getCreditCardCVC()))) &&
            ((this.autoRefill==null && other.getAutoRefill()==null) || 
             (this.autoRefill!=null &&
              this.autoRefill.equals(other.getAutoRefill()))) &&
            ((this.autoRefillAmount==null && other.getAutoRefillAmount()==null) || 
             (this.autoRefillAmount!=null &&
              this.autoRefillAmount.equals(other.getAutoRefillAmount()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            this.isGoldNumber == other.isIsGoldNumber();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOwnerPersonalID() != null) {
            _hashCode += getOwnerPersonalID().hashCode();
        }
        if (getUserPersonalID() != null) {
            _hashCode += getUserPersonalID().hashCode();
        }
        if (getBillReceiverPersonalID() != null) {
            _hashCode += getBillReceiverPersonalID().hashCode();
        }
        if (getPin1() != null) {
            _hashCode += getPin1().hashCode();
        }
        if (getPuk1() != null) {
            _hashCode += getPuk1().hashCode();
        }
        _hashCode += new Float(getBalance()).hashCode();
        if (getFriendNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFriendNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFriendNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isForeignNumberLockEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isForeignServiceNumberLockEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        _hashCode += (isPaymentType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreditCardNumber() != null) {
            _hashCode += getCreditCardNumber().hashCode();
        }
        if (getCreditCardExpiryMonth() != null) {
            _hashCode += getCreditCardExpiryMonth().hashCode();
        }
        if (getCreditCardExpiryYear() != null) {
            _hashCode += getCreditCardExpiryYear().hashCode();
        }
        if (getCreditCardCVC() != null) {
            _hashCode += getCreditCardCVC().hashCode();
        }
        if (getAutoRefill() != null) {
            _hashCode += getAutoRefill().hashCode();
        }
        if (getAutoRefillAmount() != null) {
            _hashCode += getAutoRefillAmount().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        _hashCode += (isIsGoldNumber() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Phone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Phone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerPersonalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OwnerPersonalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPersonalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UserPersonalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billReceiverPersonalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BillReceiverPersonalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Pin1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puk1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Puk1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FriendNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignNumberLockEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ForeignNumberLockEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignServiceNumberLockEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ForeignServiceNumberLockEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CreditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardExpiryMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CreditCardExpiryMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardExpiryYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CreditCardExpiryYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardCVC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CreditCardCVC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRefill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AutoRefill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRefillAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AutoRefillAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGoldNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsGoldNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
