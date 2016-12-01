package po;

import java.io.Serializable;

import vo.AddressVO;

public class AddressPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3626389844005279945L;

	//	酒店所属城市
	private String city;
	
	//	酒店商圈
	private String circle;
	
	// 折扣
	private Double discout;
	
	public AddressPO(String city, String circle,Double discout) {
		this.city = city;
		this.circle = circle;
		this.discout = discout;
	}

	public AddressPO(AddressVO addressVO) {
		this.city = addressVO.city;
		this.circle = addressVO.circle;
		this.discout = addressVO.discout;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getcircle() {
		return circle;
	}

	public void setcircle(String circle) {
		this.circle = circle;
	}

	public Double getDiscout() {
		return discout;
	}

	public void setDiscout(Double discout) {
		this.discout = discout;
	}

	public String getCircle() {
		return circle;
	}
}