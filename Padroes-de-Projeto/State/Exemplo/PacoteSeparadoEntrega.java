package State.Exemplo;

public class PacoteSeparadoEntrega implements EstadoPacote {
    public void previousState(Pacote pacote) {
      pacote.setState(new PacoteParaEntrega());
    }
    
    public void nextState(Pacote pacote) {
      System.out.println("Pronto já recebido.");
    }
  
    public void printStatus() {
      System.out.println("Pronto separado para entrega.");
    }
  }