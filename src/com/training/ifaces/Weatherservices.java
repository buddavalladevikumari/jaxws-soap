package com.training.ifaces;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style=Style.RPC)
public interface Weatherservices {
	
	@WebMethod(operationName="getweather")
	public String[] getWheather(@WebParam(name = "city")String city);

	String getWeather(String city);

}
