package com.ws;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public HelloWorldPublisher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7779/wsdocument/hello", new HelloWorldImpl());
	}

}
