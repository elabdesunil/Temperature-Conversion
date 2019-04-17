
public class Temperature {
	private float temperature;
	private char scale;

	Temperature(float temperature) {// only accepts temperature, scale is set to C by default
		this.temperature = temperature;
		this.scale = 'C';
	}

	Temperature(char scale) {// only accepts scale, temperature is set to 0 by default
		this.scale = scale;
		this.temperature = 0;
	}

	Temperature(float temperature, char scale) {// accepts both temperature and scale
		this.temperature = temperature;
		this.scale = scale;
	}

	Temperature() {// default constructor
		temperature = 0;
		scale = 'C';
	}

	public void convertToCelsius() {// converts both temperature and scale to Celsius
		temperature = (((temperature - 32) * 5) / 9);
		scale = 'C';
	}

	public void convertToFahrenheit() {// converts both temperature and scale to Fahrenheit
		temperature = (((temperature * 9) / 5) + 32);
		scale = 'F';
	}

	public String toString() {// Returns Temperature in nearest tenth and Scale
		return String.format("Temperature: %.1f degree %c\n", temperature, scale);
	}

	public void setTemperature(int temperature) {// Only sets Temperature
		this.temperature = temperature;
	}

	public void setScale(char scale) {// only sets the scale
		this.scale = scale;
	}

	public void setBoth(int temperature, char scale) {// sets both temperature and scale
		this.temperature = temperature;
		this.scale = scale;
	}

	public boolean isEqual(Temperature testTemp) {// checks two objects for equality
		if (testTemp.scale != this.scale) {// sets testTemp to appropriate scale
			if (testTemp.scale == 'F') {
				testTemp.convertToCelsius();
			} else {
				testTemp.convertToFahrenheit();
			}
		}

		if (this.temperature == testTemp.temperature) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isGreater(Temperature testTemp) {// checks which object is greater
		if (testTemp.scale != this.scale) {// sets testTemp to appropriate scale
			if (testTemp.scale == 'F') {
				testTemp.convertToCelsius();
			} else {
				testTemp.convertToFahrenheit();
			}
		}

		if (testTemp.temperature < this.temperature) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isLess(Temperature testTemp) {// which which object is less than

		if (testTemp.scale != this.scale) {// sets testTemp to appropriate scale
			if (testTemp.scale == 'F') {
				testTemp.convertToCelsius();
			} else {
				testTemp.convertToFahrenheit();
			}
		}

		if (testTemp.temperature > this.temperature) {
			return true;
		} else {
			return false;
		}
	}

}
