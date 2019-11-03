package cn.edu.scau.yuki.HighLevel;


public class main {
	public static void main(String[] args) throws Exception{
		Factory factory = new Factory();
		IFood bread = factory.getInstance("Bread");
		IFood milk = factory.getInstance("Milk");
		bread.eat();
		milk.eat();
	}
}
