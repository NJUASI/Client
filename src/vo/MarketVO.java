package vo;

public class MarketVO {

	//	等级名称
	public String marketName;
	//	等级信用度
	public int marketCredit;
	//	等级优惠
	public double marketBenefit;

	
	public MarketVO(String marketName, int marketCredit, double d) {
		this.marketName = marketName;
		this.marketCredit = marketCredit;
		this.marketBenefit = d;
	}
}
