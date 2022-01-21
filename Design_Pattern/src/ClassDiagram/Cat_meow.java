package ClassDiagram;

public class Cat_meow {
	
	private String name;
	
	public static void main(String[] args) {
		Cat_meow cat1 = new Cat_meow();
		Cat_meow cat2 = new Cat_meow();
		
		cat1.name = "냥냥이";
		cat2.name = "야옹이";
		
		cat1.meow();
		cat2.meow();
	}

	public void meow() {
		System.out.println(name+"~~~~~~"+"웁니다");
	}
}
