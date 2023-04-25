package DataBaseConnector;
class Employee {
	String eid;
	String ename;
	String eaddr;
	public void getEmpDetails() {
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee name:"+ename);
		System.out.println("Employee Address:"+eaddr);
	}
	
}

class Manager extends Employee {
	Manager(String eid, String ename, String eaddr) {
		super.eid = eid;
		super.ename = ename;
		super.eaddr = eaddr;
	}
	
	public void getManagerDetails() {
		System.out.println("Manager Details");
		System.out.println("---------------");
		getEmpDetails();
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		Manager m = new Manager("E-110", "Sai", "Bangalore");
		m.getManagerDetails();
		}

}
