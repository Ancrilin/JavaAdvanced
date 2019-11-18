package work02;

public class Score {
	private int id;
	private String subject;
	private double score;
	
	public Score(int id, String subject, double score) {
		this.id = id;
		this.subject = subject;
		this.score = score;
	}
	
	public void showScore() {
		System.out.println(subject + ": " + score);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	
	
	
}
