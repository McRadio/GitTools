/**
 * 
 */
package tools;

/**
 * @author Steffen
 *
 */
public class PrimZahlTest {

	/**
	 * @param args
	 */
	public static boolean primZahlTest(int x){
		boolean ret = false;
		if(x/x==1 && x/1 ==x){
			loop: for(int teiler=2;teiler<x; teiler++){
				if(x%teiler == 0){
					ret = false;
					break loop;
				}else{
					
					ret = true;
				}
			}
		}
	return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(primZahlTest(31)== true){
			System.out.println("Die Zahl ist eine Primzahl");
		}else{
			System.out.println("Die Zahl ist keine Primzahl");
		}
	}

}
