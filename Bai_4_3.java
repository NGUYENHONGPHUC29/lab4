package lab4;

class Person{
	private String name;
	private int age;
	private char gender;
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname(String name) {
		return name;
	}
	
	public void setage(int age) {
		this.age= age;
	}
	public int getage(int age) {
		return age;
	}

	public void setgender(char gender) {
		this.gender = gender;
	}
	public char getgender(char gender) {
		return gender;
	}
	
	public String toString() {
		return "Name : " + name + "\nAge : " + age + "\nGender : " + gender;
	}
}

class Employee extends Person {
	private String employerName;
	private String dateHired;
	
	public Employee(String name, int age, char gender, String employerName, String dateHired) {
		super(name,age,gender);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}
	
	public void setemployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getemployerName(String employerName) {
		return employerName;
	}
	
	public void setdateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public String getdateHire(String dateHire) {
		return dateHire;
	}
	
	public String toString() {
		return super.toString() + "\nEmployer Name : " + employerName + "\nDate Hired : " + dateHired;
	}
}

class PartTimeEmployee extends Employee{
	private int hoursPerWeek;
	
	public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired,int hoursPerWeek) {
		super(name,age,gender,employerName,dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public void sethoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public int gethoursPerWeek(int hoursPerWeek) {
		return hoursPerWeek;
	}
	
	public String toString() {
		return super.toString() + "\nHours PerWeek : " + hoursPerWeek;
	}
}

public class Bai_4_3 {
	public static void main(String[] args) {
		PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Nguyễn A", 29, '1', "Jack", "20/8/2004", 7);
		PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Nguyễn H", 29, '0', "Kevin", "7/2/2009", 8);
		
		System.out.println(partTimeEmployee1.toString());
		System.out.println("\n\n" + partTimeEmployee2.toString());
	}
}