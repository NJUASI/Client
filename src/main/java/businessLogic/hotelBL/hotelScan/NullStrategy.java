package businessLogic.hotelBL.hotelScan;

import java.util.List;

import po.HotelGeneralPO;

public class NullStrategy implements ScanStrategy {

	
	//为防止上层出现较多if else判断
	public List<HotelGeneralPO> operation(List<HotelGeneralPO> list) {
		// TODO 自动生成的方法存根
		return null;
	}

}
