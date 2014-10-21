package practicethree.javapractice;

public class ChildPractice{
	double width;
	double height;
	double depth;
	
	public static void main(String[] args){
		double vol;
		JavaPractice jp1 = new JavaPractice();
		
		ChildPractice cp = new ChildPractice();
		cp.width = 10;
		cp.height = 20;
		cp.depth = 30;
		vol = cp.width * cp.height * cp.depth;
		System.out.println(vol);
	}
}