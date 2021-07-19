package com.training.ifaces;

import java.util.HashMap;
import java.util.*;

public  class Weatherserviceimpl implements Weatherservices {
	@Override
	public String getWeather(String city) {
		Map<String, String> defavalue =  new HashMap<String,String>();
		
		defavalue.put("sun rise","5.30am");
		defavalue.put("sunset","6.30pm");
		defavalue.put("max-temp","39c");
		defavalue.put("min-temp","27c");
		
		if(city.equals("chennai"));
		{
			defavalue.put("sun rise","5.30am");
			defavalue.put("sunset","6.30pm");
			defavalue.put("max-temp","39c");
			defavalue.put("min-temp","27c");
			
		}
		
		return defavalue.toString();
	}

	@Override
	public String[] getWheather(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	}

