package Menu;

public class TESTMAIN {

	public static void main(String[] args) {
		
		MenuVO menu = new MenuVO(99,"����",4000);
		MenuDAO dao = new MenuDAO();
		
		dao.addMenu(menu);
		
		
		
		

	}

}
