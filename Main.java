import java.util.*; 
public class Main{ 
public static void main(String[] args){ 
ArrayList<Person> personlist = new ArrayList<Person>();

Person p = new Person("Person",25); 
Teacher t = new Teacher("Teacher",40,"ENG"); 
Employee e = new Employee("Employee",35,"EM001"); 
PermanentEmployee pe = new PermanentEmployee("Permanent Employee",35,"EM002",15000); 
ContractEmployee ce = new ContractEmployee("Contract Employee",40,"EM003",9000);
		personlist.add(p);
		personlist.add(t);
		personlist.add(e);
		personlist.add(pe);
		personlist.add(ce);
		for (int i = 0;i < personlist.size();i++ ) {
			personlist.get(i).printDetails();} 
		}

	}
