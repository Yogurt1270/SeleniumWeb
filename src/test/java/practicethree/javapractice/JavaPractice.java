package practicethree.javapractice;

public class JavaPractice {
	
	public JavaPractice(){
		
		System.out.println("without parameters");
	}
	
	public JavaPractice(String a){
		System.out.println("with parameters "+ a);
	}
	
	public JavaPractice(int b1, int b2){
		System.out.println(b1+b2);
	}
	
	public static void main(String[] args){
		JavaPractice jp1 = new JavaPractice();
		JavaPractice jp2 = new JavaPractice("Test");
		JavaPractice jp3 = new JavaPractice(1,2);
	}
}