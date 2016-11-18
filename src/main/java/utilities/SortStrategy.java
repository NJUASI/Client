package utilities;

import java.util.ArrayList;
import java.util.List;

public class SortStrategy {

	List<SingleSortStrategy> singleSortStrategiesList;
	
	public SortStrategy() {
		singleSortStrategiesList = new ArrayList<SingleSortStrategy>();
	}
	
	public void add(SingleSortStrategy singleSortStrategy) {
		singleSortStrategiesList.add(singleSortStrategy);
	}
	
}
