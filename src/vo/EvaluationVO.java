package vo;

public class EvaluationVO {
	//	评分
	private int score;
	//	评价
	private String comment;
	
	
	public EvaluationVO(int score, String comment) {
		super();
		this.score = score;
		this.comment = comment;
	}
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
