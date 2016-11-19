package businessLogic.hotelBL;

import java.util.List;

import vo.HotelGeneralVO;

public interface HotelListStrategy {

	public List<HotelGeneralVO> list(List<HotelGeneralVO> currentHotelGeneralList); 
	
}
