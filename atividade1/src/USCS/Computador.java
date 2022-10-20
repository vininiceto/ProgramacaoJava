package USCS;

public class Computador {


	private String numero_SerieTeclado;
	private String numero_SerieMouse;
	private String numero_SerieMonitor;
	private String numero_SerieGabinete;
	private String numero_SerieComputador;

	public Computador(String Numero_SerieTeclado, String Numero_SerieMouse, String Numero_SerieMonitor, String Numero_SerieGabinete ) {
		
		numero_SerieTeclado = Numero_SerieTeclado;
		numero_SerieMouse = Numero_SerieMouse;
		numero_SerieMonitor = Numero_SerieMonitor;
		numero_SerieGabinete = Numero_SerieGabinete;
		
	}
	
	
	public void setnumero_SerieTeclado(String Teclado) {
        this.numero_SerieTeclado = Teclado;
    }
    
    public String getnumero_serieTeclado() {
      return numero_SerieTeclado;
    }
    public void setnumero_serieMouse(String numero_serieMouse) {
        this.numero_SerieMouse = numero_serieMouse;
    }
    
    public String getnumero_serieMouse() {
      return numero_SerieMouse;
    }
    public void setnumero_serieMonitor(String numero_serieMonitor) {
        this.numero_SerieMonitor = numero_serieMonitor;
    }
    
    public String getnumero_serieMonitor() {
      return numero_SerieMonitor;
    }
    public void setnumero_serieGabinete(String numero_serieGabinete) {
        this.numero_SerieGabinete = numero_serieGabinete;
    }
    
    public String getnumero_serieGabinete() {
      return numero_SerieGabinete;
    }
    public void setnumero_serieComputador(String numero_serieComputador) {
        this.numero_SerieComputador = numero_serieComputador;
    }
    
    public String getnumero_serieComputador() {
      return numero_SerieComputador;
    }
    
    public void ImprimeComputador()
    {
        System.out.println("O número de serie do Teclado é: " + numero_SerieTeclado);
        System.out.println("O número de serie do Mouse é: " + numero_SerieMouse);
        System.out.println("O número de serie do Monitor é: " + numero_SerieMonitor);
        System.out.println("O número de serie do Gabinete é: " + numero_SerieGabinete);
        System.out.println("O número de serie do Computador é: " + numero_SerieComputador);
    }


	
    

    
	
	
}
