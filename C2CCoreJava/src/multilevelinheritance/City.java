package multilevelinheritance;

public class City extends State{
	private String cityName;
	private String cityArea;
	
	public City(String cityName,String cityArea,String stateName, String staeLanguage, String countryName, String capitalCity) {
		super(stateName, staeLanguage, countryName, capitalCity);
		// TODO Auto-generated constructor stub
		this.cityName=cityName;
		this.cityArea=cityArea;
		
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityArea() {
		return cityArea;
	}

	public void setCityArea(String cityArea) {
		this.cityArea = cityArea;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", cityArea=" + cityArea + ", getStateName()=" + getStateName()
				+ ", getStaeLanguage()=" + getStaeLanguage() + ", getCountryName()=" + getCountryName()
				+ ", getCapitalCity()=" + getCapitalCity() + "]";
	}

	
	
	
	

}
