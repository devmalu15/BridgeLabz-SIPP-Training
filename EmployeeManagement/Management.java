
public class Management {
	ArrayList<Employee> employeeList = new ArrayList<>();
	Set<Employee> employeeSet = new HashSet<>();
	
	@Override
	public void add(int id, String name, String departemnt) {
		Employee employee = new Employee(id, name, departemnt);
		employeeList.add(employee);
	}
	
	
	@Override
	public void sortByName() {
		
	};
	
	
}
