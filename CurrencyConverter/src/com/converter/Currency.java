package com.converter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a Currency
	public void defaultValues() {
		String Currency = this.name;
		
		switch (Currency) {	
			case "US Dollar":
				this.exchangeValues.put("US Dollar", 1.00);
				this.exchangeValues.put("Euro", 0.93);
				this.exchangeValues.put("British Pound", 0.66);
				this.exchangeValues.put("Swiss Franc", 1.01);
				this.exchangeValues.put("Chinese Yuan Renminbi", 6.36);
				this.exchangeValues.put("Japanese Yen", 123.54);
				break;
			case "Euro":
				this.exchangeValues.put("US Dollar", 1.073);
				this.exchangeValues.put("Euro", 1.00);
				this.exchangeValues.put("British Pound", 0.71);
				this.exchangeValues.put("Swiss Franc", 1.08);
				this.exchangeValues.put("Chinese Yuan Renminbi", 6.83);
				this.exchangeValues.put("Japanese Yen", 132.57);
				break;
			case "British Pound":
				this.exchangeValues.put("US Dollar", 1.51);
				this.exchangeValues.put("Euro", 1.41);
				this.exchangeValues.put("British Pound", 1.00);
				this.exchangeValues.put("Swiss Franc", 1.52);
				this.exchangeValues.put("Chinese Yuan Renminbi", 9.60);
				this.exchangeValues.put("Japanese Yen", 186.41);
				break;
			case "Swiss Franc":
				this.exchangeValues.put("US Dollar", 0.99);
				this.exchangeValues.put("Euro", 0.93);
				this.exchangeValues.put("British Pound", 0.66);
				this.exchangeValues.put("Swiss Franc", 1.00);
				this.exchangeValues.put("Chinese Yuan Renminbi", 6.33);
				this.exchangeValues.put("Japanese Yen", 122.84);
				break;
			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("US Dollar", 0.16);
				this.exchangeValues.put("Euro", 0.15);
				this.exchangeValues.put("British Pound", 0.11);
				this.exchangeValues.put("Swiss Franc", 0.16);
				this.exchangeValues.put("Chinese Yuan Renminbi", 1.00);
				this.exchangeValues.put("Japanese Yen", 19.41);
				break;
			case "Japanese Yen":
				this.exchangeValues.put("US Dollar", 0.008);
				this.exchangeValues.put("Euro", 0.007);
				this.exchangeValues.put("British Pound", 0.005);
				this.exchangeValues.put("Swiss Franc", 0.008);
				this.exchangeValues.put("Chinese Yuan Renminbi", 0.051);
				this.exchangeValues.put("Japanese Yen", 1.000);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "US Dollar") );
		currencies.add( new Currency("Euro", "Euro") );
		currencies.add( new Currency("British Pound", "British Pound") );
		currencies.add( new Currency("Swiss Franc", "Swiss Franc") );
		currencies.add( new Currency("Chinese Yuan Renminbi", "Chinese Yuan Renminbi") );
		currencies.add( new Currency("Japanese Yen", "Japanese Yen") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a Currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}