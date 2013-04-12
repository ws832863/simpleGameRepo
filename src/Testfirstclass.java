
import java.util.UUID;
public class Testfirstclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testfirstclass tf=new Testfirstclass();
		tf.testTimestamp();
		
	}
	public void testTimestamp(){
		
		int i=100;
		while(i>0){
			System.out.println(System.currentTimeMillis());
			i--;
		}
	}
	
	public void testUUID(){
		System.out.println("test");
		int i=1000;
		String cut="---";
		boolean flag=true;
		
		while(i>0){
			
		if(flag=!flag){
	
			System.out.println(i+"   "+UUID.randomUUID().toString());
		}else{
			
			System.out.print(i+"    "+UUID.randomUUID().toString()+cut);
		}
	
			i--;
		
		}
	}

}
