package com.idega.telecom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TelecomConstants {
	
	public static final String IW_BUNDLE_IDENTIFIER = "com.idega.telecom";
	
	public static final String RATOR_SERVICES_SPRING_BEAN_IDENTIFIER = "ratorServicesSpringBean";

	public static final List<String> ALL_TELECOM_SERVICES_PROVIDERS = Collections.unmodifiableList(Arrays.asList(new String[] {RATOR_SERVICES_SPRING_BEAN_IDENTIFIER}));
	
	public static final String SERVICE_TYPE_PREPAID = "prepaid";
	public static final String SERVICE_TYPE_POSTPAID = "postpaid";
	
	public static final String PAYMENT_TYPE_CREDIT_CARD = "creditcard";
	public static final String PAYMENT_TYPE_INVOICE = "invoice";
	public static final String PAYMENT_TYPE_INTERNET_BANK = "internetbank";
}
