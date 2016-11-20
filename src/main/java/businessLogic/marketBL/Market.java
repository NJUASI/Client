package businessLogic.marketBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import dataService.marketDataService.MarketDataService;
import dataService.marketDataService.MarketDataService_Stub;
import po.MarketPO;
import utilities.ResultMessage;
import vo.MarketVO;

public class Market {
	private MarketDataService marketDataService;
	
	public Market(){
		 marketDataService = new MarketDataService_Stub();
	}
	
	public List<MarketVO> getMemberFormulation() {
		 List<MarketVO> marketVOList =new ArrayList<MarketVO>();
		try {
			
			List<MarketPO> marketPOList =  marketDataService.getMemberFormulation();
			for(int i=0;i< marketPOList.size();i++){
				marketVOList.add(new MarketVO(marketPOList.get(i)));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return marketVOList;
	}


	public ResultMessage setMemberFormulation(List<MarketVO> marketVOList) {
	
		try {
			List<MarketPO> marketPOList = new ArrayList<MarketPO>();
			for(int i=0;i< marketVOList.size();i++){
				marketPOList.add(new MarketPO(marketVOList.get(i)));
			}
			return marketDataService.setMemberFormulation(marketPOList);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
			return null;
	}
}

