package Encapsulamento;



public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

		
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println( "Esta ligado? R: " + this.getLigado());
		System.out.println("Esta Tocando? R: " + this.getTocando());
		System.out.println( "Volume:" + this.getVolume());
					for(int i = 0 ; i <= this.getVolume(); i+=10) {
						System.out.print("|||||");
						
					}
					System.out.println();
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu");
		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado() & this.getVolume() >= 50 ) {
			System.out.print("Volume está no máximo");
		}
		else if(this.getLigado() & this.getVolume() < 50 ) {
			System.out.println( "Volume:" + this.getVolume());
			for(int i = 0 ; i <= this.getVolume()+5; i+=10) {
				System.out.print("|||||");
				
			}
		
		}

		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado() & this.getVolume() <= 50 ) {
			
			System.out.println( "Volume:" + this.getVolume());
			for(int i = 0 ; i <= this.getVolume()-10; i+=10) {
				System.out.print("|||||");
				
			}
			
		}
		
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
			
		
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())){
			 	this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		if (this.getLigado() && (this.getTocando())){
		 	this.setTocando(false);
		}
		
	}
}
