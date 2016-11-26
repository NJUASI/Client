package businessLogic.hotelBL.hotelScan;

import java.util.List;

import po.HotelGeneralPO;

public interface ScanStrategy {
	public List<HotelGeneralPO> operation(List<HotelGeneralPO> list);

}
