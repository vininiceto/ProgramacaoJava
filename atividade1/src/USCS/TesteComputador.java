package USCS;

public class TesteComputador {

	public static void main(String[] args) {
		

		Teclado t = new Teclado();
		
		t.setnumero_Serie("1232");
		t.setcor("Preto");
		t.setfabricante("Logitech");
		
		t.ImprimeTeclado();
		
		Mouse m = new Mouse();
		
		m.setnumero_Serie("HGY6654");
		m.setcor("Preto");
		m.setfabricante("Microsoft");
		
		m.ImprimeMouse();
		
        Monitor mon = new Monitor();
		
		mon.setnumero_Serie("AFB876");
		mon.setcor("Preto");
		mon.setfabricante("Samsung");
		
		mon.ImprimeMonitor();
		
        Gabinete g = new Gabinete();
		
		g.setnumero_Serie("4587HHY");
		g.setcor("Preto");
		g.setfabricante("Logitech");
		g.ImprimeGabinete();
		
        Computador cp = new Computador(t.getnumero_Serie(),m.getnumero_Serie(), mon.getnumero_Serie(), g.getnumero_Serie());
        
        cp.setnumero_serieComputador("76TRDE35");
		
	
        cp.ImprimeComputador();
       
		
		
		
		
		
		
		
		
	}
	  
	

}
