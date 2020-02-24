import java.util.*;
public class Collections {

	public static void main(String[] args) {
	
	List<String> employeeNames = new ArrayList<String>();
	employeeNames.add("Sam");
	employeeNames.add("Tom");
	employeeNames.add("Mark");
	employeeNames.add("David");
	employeeNames.add("Alex");
	
	
	Set<Integer> ids = new HashSet<Integer>();
	ids.add(1);
	ids.add(2);
	ids.add(3);
	ids.add(4);
	ids.add(5);

	Map<Integer, String> employeeMap = new HashMap<Integer, String>();
	int i = 0;
	for (int id : ids) {
	employeeMap.put(id, employeeNames.get(i));
	i++;
	}
	System.out.println(employeeMap);
	
	for (int number : employeeMap.keySet()) {
	System.out.println(number + ":" + employeeMap.get(number));
	}
	
	StringBuilder idsBuilder = new StringBuilder();
	for (int id : ids) {
	idsBuilder.append(id + "-");
	}
	System.out.println(idsBuilder);
	
	StringBuilder namesBuilder = new StringBuilder();
	for (String employee : employeeNames) {
	namesBuilder.append(employee + " ");
	}
	System.out.println(namesBuilder);
	}
}
