package businessLogic.hotelBL;

import java.util.List;

import vo.HotelGeneralVO;

public class PriceReverseOrder implements HotelListStrategy{

	@Override
	public List<HotelGeneralVO> list(List<HotelGeneralVO> currentHotelGeneralList) {
		for(int i = 0;i < currentHotelGeneralList.size() ; i++){
			for(int j = i+1;j < currentHotelGeneralList.size() ; j++){
				HotelGeneralVO vo1 = currentHotelGeneralList.get(i);
				HotelGeneralVO vo2 = currentHotelGeneralList.get(j);
				double minPrice1 = vo1.minPrice;
				double minPrice2 = vo2.minPrice;
				if(minPrice1<minPrice2){
					HotelGeneralVO temp = vo1;
					currentHotelGeneralList.set(i, vo2);
					currentHotelGeneralList.set(j, temp);
				}
			}
		}
		return currentHotelGeneralList;
	}

}
