package javademos.overriding;

public class UniversiteKrediManager extends BaseKrediManager {
	
	@Override
	public double hesapla(double tutar) {
		return tutar*1.10;
	}

}
