package Predmety;

public class BPIS implements Predmety{
	private boolean zapocet = false;
	
	public void ZapocetUdelen() {
		zapocet = true;
	}
	@Override
	public String nazevPredmetu() {
		return "BPIS";
	}

	@Override
	public int bodyPredmetu() {
		return 0;
	}

	@Override
	public boolean udeleniZapoctu() {
		return false;
	}

}
