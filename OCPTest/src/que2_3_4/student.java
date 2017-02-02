package que2_3_4;

public class student implements Comparable<student>{
	private String name;
	private String city;
	private String state;

	public student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
@Override
public boolean equals(Object obj) {
	if(obj == null){
		return false;
	}
	if(!(obj instanceof student)){
		return false;
	}
	student s=(student)obj;
	return this.getName().equals(s.getName()) && this.getCity().equals(s.getCity());
}

@Override
public String toString() {
	return "Student [name=" + name + ", city=" + city + ", state=" + state + "]";
}
@Override
public int compareTo(student o) {
	
	return this.getName().compareTo(o.getName());
}
}
