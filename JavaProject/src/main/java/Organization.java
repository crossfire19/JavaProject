
package com.aa.act.interview.org;
import java.util.Optional;
import java.util.ArrayList;

public abstract class Organization {

	private Position root;
	private Employee employee;
	public static int count = 0;
	public static ArrayList<Optional<Position>> employ;

	
	
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
	public ArrayList<Optional<Position>> hire(Name person, String title) {
		
		if(title == "CEO") {
			employ = new ArrayList<>();
		}
		
		employee = new Employee(count++, person);
		
		root = new Position(title, employee);

		if(title == "CEO") {
			Optional<Position> CEO = Optional.of(root); 
			employ.add(CEO);
		}
		else if(title == "President") {
			Optional<Position> President = Optional.of(root);
			employ.add(President);
		}
		else if(title == "Director Enterprise Architecture") {
			Optional<Position> DEA = Optional.of(root);
			employ.add(DEA);
		}
		else if(title == "Director Customer Technology") {
			Optional<Position> DCT = Optional.of(root);
			employ.add(DCT);
		}
		else if(title == "VP Marketing") {
			Optional<Position> VPM = Optional.of(root);
			employ.add(VPM);
		}
		else if(title == "VP Sales") {
			Optional<Position> VPS = Optional.of(root);
			employ.add(VPS);
		}
		else if(title == "VP Finance") {
			Optional<Position> VPF = Optional.of(root);
			employ.add(VPF);
		}
		else if(title == "CIO") {
			Optional<Position> CIO = Optional.of(root);
			employ.add(CIO);
		}
		else if(title == "VP Technology") {
			Optional<Position> VPT = Optional.of(root);
			employ.add(VPT);
		}
		else if(title == "VP Infrastructure") {
			Optional<Position> VPI = Optional.of(root);
			employ.add(VPI);
		}
		else if(title == "Salesperson") {
			Optional<Position> Sales = Optional.of(root);
			employ.add(Sales);
		}

		
		if(person == null && title == null) {
			return null;
		}
		else {
			return employ;
		}
	}

	@Override
	public String toString() {
		return printOrganization(root, "");
	}
	
	private String printOrganization(Position pos, String prefix) {
		StringBuffer sb = new StringBuffer(prefix + "+-" + pos.toString() + "\n");
		for(Position p : pos.getDirectReports()) {
			sb.append(printOrganization(p, prefix + "\t"));
		}
		return sb.toString();
	}
}
