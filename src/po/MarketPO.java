package po;

public class MarketPO {

	//	等级名称
	private String marketName;
	//	等级信用度
	private int marketCredit;
	//	等级优惠
	private double marketBenefit;

	
	public MarketPO(String marketName, int marketCredit, Double marketBenefit) {
		super();
		this.marketName = marketName;
		this.marketCredit = marketCredit;
		this.marketBenefit = marketBenefit;
	}
	
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public int getMarketCredit() {
		return marketCredit;
	}
	public void setMarketCredit(int marketCredit) {
		this.marketCredit = marketCredit;
	}
	public double getMarketBenefit() {
		return marketBenefit;
	}
	public void setMarketBenefit(double marketBenefit) {
		this.marketBenefit = marketBenefit;
	}
	
}
