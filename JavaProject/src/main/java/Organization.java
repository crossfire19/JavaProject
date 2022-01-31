
import java.util.Optional;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author crossfire19
 */
public abstract class Organization {
    
    	private static Position root;
        private static NewHire newHire;
	
	public Organization() {
		root = createOrganization();
	}
	
	protected abstract Position createOrganization();
	
	/**
	 * hire the given person as an employee in the position that has that title
	 * 
	 * @param person
	 * @param title
	 * @return the newly filled position or empty if no position has that title
	 */
	public static Optional<NewHire> hire(Name person, String title) {
            
            newHire = new NewHire(person, title);
           
            Optional<NewHire> pos = Optional.ofNullable(newHire);
            
            if(pos.isPresent())
            {
                return pos;
            }
            else
            {
                return Optional.empty();
            }
		
	}

	@Override
	public String toString() {
		return printOrganization(root, "");
	}
	
	private String printOrganization(Position pos, String prefix) {
		StringBuilder sb = new StringBuilder(prefix + "+-" + pos.toString() + "\n");
		for(Position p : pos.getDirectReports()) {
			sb.append(printOrganization(p, prefix + "\t"));
		}
		return sb.toString();
	}
    
}
