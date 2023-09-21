package basicprograms;

class Box{
	int length; // Initial Variable
	int breath;
	int height;
	
	int volume() {
		return length*breath*height;
	}
	
}

public class ClassDemo {
	public static void main(String args[]) {
		Box blackBox = new Box();
		blackBox.length = 10;
		blackBox.breath = 20;
		blackBox.height = 5;
		Box WhiteBox = new Box();
		WhiteBox.height = 30;
		System.out.println("Show the length"+blackBox.volume()); // Invoke Method
		System.out.println("Show the Height"+WhiteBox.height);
	}
}
