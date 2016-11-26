package businessLogic.hotelBL.hotel;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dataService.hotelDataService.HotelDataService;
import po.EvaluationPO;
import utilities.ResultMessage;
import vo.EvaluationVO;

public class Evaluations {

	private String hotelID;
	private HotelDataService hotelDataService;
	private List<EvaluationPO> evaluationList;
	
	public Evaluations(String hotelID, HotelDataService hotelDataService) {
		this.hotelID = hotelID;
		this.hotelDataService = hotelDataService;
		initEvaluations();
	}

	private void initEvaluations() {
		try {
			evaluationList = hotelDataService.getEvaluations(hotelID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	public Iterator<EvaluationVO> getEvaluations(){
		List<EvaluationVO> evaluationsVOList = new ArrayList<EvaluationVO>();
		
		for(EvaluationPO evaluationPO:evaluationList){
			evaluationsVOList.add(new EvaluationVO(evaluationPO));
		}
		
		return evaluationsVOList.iterator();
	}
	
	public ResultMessage addEvaluation(EvaluationVO evaluationVO) {
		
		EvaluationPO evaluationPO = new EvaluationPO(evaluationVO);
		evaluationList.add(evaluationPO);
		try {
			return hotelDataService.updateEvaluation(evaluationPO);
		} catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAIL;
		}
	}
	

}
