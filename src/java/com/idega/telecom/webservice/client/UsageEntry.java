/**
 * UsageEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.idega.telecom.webservice.client;

public class UsageEntry  implements java.io.Serializable {
    private java.lang.String usageDate;

    private java.lang.String entryType;

    private java.lang.String number;

    private java.lang.String description;

    private java.lang.String originPhoneNumber;

    private java.lang.String countryOfOrigin;

    private java.lang.String recipientCountry;

    private float amount;

    private float duration;

    public UsageEntry() {
    }

    public UsageEntry(
           java.lang.String usageDate,
           java.lang.String entryType,
           java.lang.String number,
           java.lang.String description,
           java.lang.String originPhoneNumber,
           java.lang.String countryOfOrigin,
           java.lang.String recipientCountry,
           float amount,
           float duration) {
           this.usageDate = usageDate;
           this.entryType = entryType;
           this.number = number;
           this.description = description;
           this.originPhoneNumber = originPhoneNumber;
           this.countryOfOrigin = countryOfOrigin;
           this.recipientCountry = recipientCountry;
           this.amount = amount;
           this.duration = duration;
    }


    /**
     * Gets the usageDate value for this UsageEntry.
     * 
     * @return usageDate
     */
    public java.lang.String getUsageDate() {
        return usageDate;
    }


    /**
     * Sets the usageDate value for this UsageEntry.
     * 
     * @param usageDate
     */
    public void setUsageDate(java.lang.String usageDate) {
        this.usageDate = usageDate;
    }


    /**
     * Gets the entryType value for this UsageEntry.
     * 
     * @return entryType
     */
    public java.lang.String getEntryType() {
        return entryType;
    }


    /**
     * Sets the entryType value for this UsageEntry.
     * 
     * @param entryType
     */
    public void setEntryType(java.lang.String entryType) {
        this.entryType = entryType;
    }


    /**
     * Gets the number value for this UsageEntry.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this UsageEntry.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the description value for this UsageEntry.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UsageEntry.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the originPhoneNumber value for this UsageEntry.
     * 
     * @return originPhoneNumber
     */
    public java.lang.String getOriginPhoneNumber() {
        return originPhoneNumber;
    }


    /**
     * Sets the originPhoneNumber value for this UsageEntry.
     * 
     * @param originPhoneNumber
     */
    public void setOriginPhoneNumber(java.lang.String originPhoneNumber) {
        this.originPhoneNumber = originPhoneNumber;
    }


    /**
     * Gets the countryOfOrigin value for this UsageEntry.
     * 
     * @return countryOfOrigin
     */
    public java.lang.String getCountryOfOrigin() {
        return countryOfOrigin;
    }


    /**
     * Sets the countryOfOrigin value for this UsageEntry.
     * 
     * @param countryOfOrigin
     */
    public void setCountryOfOrigin(java.lang.String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    /**
     * Gets the recipientCountry value for this UsageEntry.
     * 
     * @return recipientCountry
     */
    public java.lang.String getRecipientCountry() {
        return recipientCountry;
    }


    /**
     * Sets the recipientCountry value for this UsageEntry.
     * 
     * @param recipientCountry
     */
    public void setRecipientCountry(java.lang.String recipientCountry) {
        this.recipientCountry = recipientCountry;
    }


    /**
     * Gets the amount value for this UsageEntry.
     * 
     * @return amount
     */
    public float getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this UsageEntry.
     * 
     * @param amount
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }


    /**
     * Gets the duration value for this UsageEntry.
     * 
     * @return duration
     */
    public float getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this UsageEntry.
     * 
     * @param duration
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsageEntry)) return false;
        UsageEntry other = (UsageEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usageDate==null && other.getUsageDate()==null) || 
             (this.usageDate!=null &&
              this.usageDate.equals(other.getUsageDate()))) &&
            ((this.entryType==null && other.getEntryType()==null) || 
             (this.entryType!=null &&
              this.entryType.equals(other.getEntryType()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.originPhoneNumber==null && other.getOriginPhoneNumber()==null) || 
             (this.originPhoneNumber!=null &&
              this.originPhoneNumber.equals(other.getOriginPhoneNumber()))) &&
            ((this.countryOfOrigin==null && other.getCountryOfOrigin()==null) || 
             (this.countryOfOrigin!=null &&
              this.countryOfOrigin.equals(other.getCountryOfOrigin()))) &&
            ((this.recipientCountry==null && other.getRecipientCountry()==null) || 
             (this.recipientCountry!=null &&
              this.recipientCountry.equals(other.getRecipientCountry()))) &&
            this.amount == other.getAmount() &&
            this.duration == other.getDuration();
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
        if (getUsageDate() != null) {
            _hashCode += getUsageDate().hashCode();
        }
        if (getEntryType() != null) {
            _hashCode += getEntryType().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOriginPhoneNumber() != null) {
            _hashCode += getOriginPhoneNumber().hashCode();
        }
        if (getCountryOfOrigin() != null) {
            _hashCode += getCountryOfOrigin().hashCode();
        }
        if (getRecipientCountry() != null) {
            _hashCode += getRecipientCountry().hashCode();
        }
        _hashCode += new Float(getAmount()).hashCode();
        _hashCode += new Float(getDuration()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsageEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "UsageEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UsageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EntryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OriginPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CountryOfOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RecipientCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
