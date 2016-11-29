package vo;

public class AddressVO {

	//	酒店所属城市
	public String city;
	
	//	酒店商圈
	public String cycle;
	
	// 折扣
	public double discout;
	
	public AddressVO(String city, String cycle,double discout) {
		this.city = city;
		this.cycle = cycle;
		this.discout = discout;
	}
}
