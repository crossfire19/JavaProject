/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crossfire19
 */
public class Name {
    
    
	private String first;
	private String last;
	
        private NewHire newHire;
                
	public Name(String first, String last) {
		if(first == null)
			throw new IllegalArgumentException("first name cannot be null");
		if(last == null)
			throw new IllegalArgumentException("last name cannot be null");
		this.first = first;
		this.last = last;
                
                newHire = new NewHire(first, last);
                
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}

	@Override
	public String toString() {
		return first + " " + last;
	}
    
}
