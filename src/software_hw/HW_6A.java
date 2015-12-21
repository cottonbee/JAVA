package software_hw;


abstract class test{
	abstract void print();
}
class Question extends test{
	String description;
	public Question(String desc){
		this.description = desc;
	}
	public void print(){
		description = "follow";
		System.out.println(description);
	}
}
public class HW_6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

}
