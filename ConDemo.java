package basicprograms;

class arun{
	int length; // Initial Variable
	int breath;
	int height;
	
	arun(int l, int b, int h){ // Construtor
		length = l;
		breath = b;
		height =h;
	}
	
	int volume() {
		return length*breath*height;
	}
	
}

public class ConDemo {
	public static void main(String args[]) {
		arun blackBox = new arun(5,5,6);
		//arun WhiteBox = new arun();
		//WhiteBox.height = 30;
		System.out.println("Show the length"+blackBox.volume()); // Invoke Method
		//System.out.println("Show the Height"+WhiteBox.height);
	}

}
