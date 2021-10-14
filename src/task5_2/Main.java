package task5_2;

public class Main {
	public static void main(String[] args){
		StrongBox<String> s = new StrongBox<String>(KeyType.PADLOCK);
		s.get();
		s.get();

	}
}
