package com.test.jersey.DemoJersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {
	
	private String name;
	private int dots;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dots
	 */
	public int getDots() {
		return dots;
	}
	/**
	 * @param dots the dots to set
	 */
	public void setDots(int dots) {
		this.dots = dots;
	}
	
	

}
