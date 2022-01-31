/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crossfire19
 */
public class NewHire {
    
    private String name;
    private String pos;
    private Name Fullname;
    private String title;
    
    
    public NewHire(String First, String Last){
        
        name = First + "" + Last;
        
    }
    
    public NewHire(Name FullName, String title){
        
        FullName = this.Fullname;
        title = this.title;
        
    }
    
    public NewHire(String title){
        
        pos = title;
        
    }
    
    	public String getName() {
		return name;
	}
	
	public String getPos() {
		return pos;
	}
    
}
