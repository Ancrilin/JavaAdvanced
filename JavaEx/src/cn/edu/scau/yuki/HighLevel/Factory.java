package cn.edu.scau.yuki.HighLevel;

public class Factory {
	public Factory() {
		
	}
	
	public IFood getInstance(String Food) {
		IFood food;
		if(Food.equals("Bread")) {
			food = new Bread();
		}
		else {
			food = new Milk();
		}
		return food;
	}
}
