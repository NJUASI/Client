package vo;

public class EvaluationVO {
	
	//	订单编号
	public String orderID;
	
	//	评分
	public double score;
	
	//	评价
	public String comment;
	
	public EvaluationVO(String orderID, double score, String comment) {
		this.orderID = orderID;
		this.score = score;
		this.comment = comment;
	}

}
