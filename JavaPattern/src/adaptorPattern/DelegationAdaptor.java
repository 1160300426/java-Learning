package adaptorPattern;

public class DelegationAdaptor implements SingleDog {
	BeautifulGirl beautifulGirl = new BeautifulGirl();
	@Override
	public String getBeautifulGirlsPhonenumber() {
		return beautifulGirl.getMyPhonenumber();
	}
}
