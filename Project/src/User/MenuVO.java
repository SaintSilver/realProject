package User;

public class MenuVO {
   int itemNumber;      //상품번호
   String itemName;   //상품이름
   int itemPrice;      //상품가격
   
   public MenuVO(int itemNumber, String itemName, int itemPrice) {
      this.itemNumber = itemNumber;
      this.itemName = itemName;
      this.itemPrice = itemPrice;
   }

   public int getItemNumber() {
      return itemNumber;
   }

   public void setItemNumber(int itemNumber) {
      this.itemNumber = itemNumber;
   }

   public String getItemName() {
      return itemName;
   }

   public void setItemName(String itemName) {
      this.itemName = itemName;
   }


   public int getItemPrice() {
      return itemPrice;
   }

   public void setItemPrice(int itemPrice) {
      this.itemPrice = itemPrice;
   }
   
   
   
   
   
   

}
