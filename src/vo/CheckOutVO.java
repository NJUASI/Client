package vo;

public class CheckOutVO {
	//	退房时间
	private String checkOutTime;
	

	public CheckOutVO(String checkOutTime) {
		super();
		this.checkOutTime = checkOutTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

}
