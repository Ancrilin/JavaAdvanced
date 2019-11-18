package work02;

public class Student {
	private int id;
	private String name;
	private String sex;
	private int grade;
	private Score Chinese;
	private Score Math;
	private Score English;
	
	public Student(int id, String name, String sex, int grade, double Chinese, double Math, double English) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.grade = grade;
		this.Chinese = new Score(id, "Chinese", Chinese);
		this.Math = new Score(id, "Math", Math);
		this.English = new Score(id, "Englisth", English);
	}
	
	public void show() {
		
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("sex: " + sex);
		System.out.println("grade: " + grade);
		Chinese.showScore();
		Math.showScore();
		English.showScore();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Score getChinese() {
		return Chinese;
	}

	public void setChinese(Score chinese) {
		Chinese = chinese;
	}

	public Score getMath() {
		return Math;
	}

	public void setMath(Score math) {
		Math = math;
	}

	public Score getEnglish() {
		return English;
	}

	public void setEnglish(Score english) {
		English = english;
	}

	
}
