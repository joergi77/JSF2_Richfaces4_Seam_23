package de.joergi;

import java.io.Serializable;
import java.util.Date;

import org.jboss.seam.annotations.AutoCreate;
import org.jboss.seam.annotations.Name;

@Name("hallo")
@AutoCreate
public class Hallo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String input;
	
	private String color;
	
	private Date testDate;
	
	public void showA4JonConsole(){
		System.out.println("input " + input +  "testDate" + testDate );
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	
	

}
