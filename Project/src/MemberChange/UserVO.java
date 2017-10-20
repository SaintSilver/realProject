package MemberChange;

public class UserVO {
   private int userNumber;      // 사용자 번호
   private String userType;   // 사용자 종류
   private String id;         // 사용자 아이디
   private String password;   // 비밀번호
   private String name;      // 사용자 이름
   private String contact;      // 사용자 연락처
   private String gender;      // 사용자 성별
   
   
   public UserVO() {
	   
}


public UserVO(int userNumber, String userType, String id, String name, String contact, String gender) {
	this(userNumber, userType, id, "", name, contact, gender);
}


public UserVO(int userNumber, String userType, String id, String password, String name, String contact,
         String gender) {
      this.userNumber = userNumber;
      this.userType = userType;
      this.id = id;
      this.password = password;
      this.name = name;
      this.contact = contact;
      this.gender = gender;
   }


public int getUserNumber() {
      return userNumber;
   }


   public void setUserNumber(int userNumber) {
      this.userNumber = userNumber;
   }


   public String getUserType() {
      return userType;
   }


   public void setUserType(String userType) {
      this.userType = userType;
   }


   public String getId() {
      return id;
   }


   public void setId(String id) {
      this.id = id;
   }


   public String getPassword() {
      return password;
   }


   public void setPassword(String password) {
      this.password = password;
   }


   public String getName() {
      return name;
   }


   public void setName(String name) {
      this.name = name;
   }


   public String getContact() {
      return contact;
   }


   public void setContact(String contact) {
      this.contact = contact;
   }


   public String getGender() {
      return gender;
   }


   public void setGender(String gender) {
      this.gender = gender;
   }
   
   
   
   
}