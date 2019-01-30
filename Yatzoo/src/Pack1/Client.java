package Pack1;


public class Client {
/**
@param
args skal ta inn et tall (antallSpillere<=5)
*/	
	public static void main(String args[]) {
		if(args.length==0) {
		Yatzoo yatz = new Yatzoo(5);
		yatz.start();
		}else if (args.length==1&&Integer.parseInt((args[0]))<=5) {
			Yatzoo yatz = new Yatzoo(Integer.parseInt((args[0])));
			yatz.start();	
		}else {
		System.out.println("Ugyldige argumenter");	
		}
		
	}

}
