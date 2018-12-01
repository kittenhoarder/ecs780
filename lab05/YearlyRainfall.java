/**
 * Complete the implementation of this class.
 * 
 */

class YearlyRainfall {

	// An (optional) display for the rainfall data.
	public RainfallDisplay display = new RainfallDisplay();

	private int[] rainfallAmountArray = {7, 8, 4, 3, 1, 0, 0, 1, 3, 5, 7, 8};

	public YearlyRainfall() {
	}

	public int getMonthAmount(int month) {
		if (month >= 0 && month <= 11) {
			return rainfallAmountArray[month];
		} else {
			return -1;
		}
	}

	public void setMonthAmount(int month, int amount) {
      rainfallAmountArray[month] = amount;
		display.setData(rainfallAmountArray);
	}

	public double getMean() {
		double sum = 0;

		for (int i = 0; i < rainfallAmountArray.length; i++) {
			sum = sum + rainfallAmountArray[i];
		}
		double mean = sum / rainfallAmountArray.length;
		return mean;
	}
}
