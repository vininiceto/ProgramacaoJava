package USCS;

public class Teclado {


		private String numero_Serie;
		private String cor;
		private String fabricante;
		
		public Teclado() {
			
		}
		
		public void setnumero_Serie(String numero_Serie) {
	        this.numero_Serie = numero_Serie;
	    }
	    
	    public String getnumero_Serie()
	    {
	      return numero_Serie;
	    }
	  
	    public void setcor(String cor) {
	        this.cor = cor;
	    }
	    
	    public String getcor() {
	      return cor;
	    }
	    public void getcor(String cor) {
		      this.cor = cor;
		    }
		
	    public String getfabricante() {
		      return fabricante;
		    }
		    public void setfabricante(String fabricante) {
			      this.fabricante = fabricante;
			    }
		    
		    
		    
		    
		    public void ImprimeTeclado()
		    {
		        System.out.println("O número de serie do Teclado é: " + getnumero_Serie());
		        System.out.println("A cor do Teclado é: " + getcor());
		        System.out.println("O fabricante do Teclado é: " + getfabricante());
		    }

}

