package adaptorPattern;

public class Adaptor extends BeautifulGirl implements SingleDog {
	@Override
	public String getBeautifulGirlsPhonenumber() {
		return getMyPhonenumber();
	}
}
