package com.training;


import javax.xml.ws.Endpoint;

import com.training.ifaces.Weatherserviceimpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Endpoint.publish("http://localhost:9000/weather",new  Weatherserviceimpl());
  System.out.println("service published");
	}

}
