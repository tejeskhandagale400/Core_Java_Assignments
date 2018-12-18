
public class DistinctIndices {

	public boolean checkSimillerOrnot(int[] inputArray, int indexOne,int indexTwo, int atmostDiff) 
	{
		if(inputArray[indexOne]==inputArray[indexTwo])
		{
			if(atmostDiff>=(indexTwo-indexOne))
			{
				return true;
			}
		}
		return false;
	}

}
