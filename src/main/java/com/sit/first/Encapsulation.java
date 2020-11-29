package com.sit.first;
class Student {
	
	public int r3;
	public int getR3() {
		return r3;
	}
	public void setR3(int r3) {
		this.r3 = r3;
	}
	public String name;
	
	public int getRollno() {
		return r3;
	}
	public void setRollno(int rollno) {
		this.r3 = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}

public class Encapsulation {

public static void main(String[] args)
{
	Student S1 = new Student();
	S1.setRollno(8);
	S1.setName("sushanth");
	System.out.println(S1.getRollno());
	System.out.println(S1.getName());

}
}
