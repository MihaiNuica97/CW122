
public class User {
	protected String giveName;
	protected String famName;
	protected int userID;
	protected String userPwd;
	
	public User(String giveName, String famName,
			int userID, String userPwd)
	{
		this.giveName = giveName;
		this.famName = famName;
		this.userID = userID;
		this.userPwd = userPwd;
	}
	
	public String getGiveName() {
		return giveName;
	}
	public void setGiveName(String giveName) {
		this.giveName = giveName;
	}
	public String getFamName() {
		return famName;
	}
	public void setFamName(String famName) {
		this.famName = famName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

}
