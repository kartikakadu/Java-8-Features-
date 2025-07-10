package Consumer.student;

public class Student {
	private int id;
	private String name;
	private int percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	public Student(int id, String name, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	

}
