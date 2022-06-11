package CoreJavaTaskException1;

public class Pojo {
	
	int id;
	String name;
	String address;
	
	Pojo(int id , String name , String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
