package MemberChange;

public class UserVO {
   private int userNumber;      // ����� ��ȣ
   private String userType;   // ����� ����
   private String id;         // ����� ���̵�
   private String password;   // ��й�ȣ
   private String name;      // ����� �̸�
   private String contact;      // ����� ����ó
   private String gender;      // ����� ����
   
   
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