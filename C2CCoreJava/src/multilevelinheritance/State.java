package multilevelinheritance;

public class State extends Country{
	private String stateName;
	private String staeLanguage;
	
	public State(String stateName,String staeLanguage , String countryName, String capitalCity) {
		super(countryName, capitalCity);
		// TODO Auto-generated constructor stub
		this.stateName=stateName;
		this.staeLanguage=staeLanguage;
		
		
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStaeLanguage() {
		return staeLanguage;
	}

	public void setStaeLanguage(String staeLanguage) {
		this.staeLanguage = staeLanguage;
	}
	
	

}
