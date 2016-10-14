package testInterface;

public interface UneInterface {
	
	default public void methode1()
	{
		System.out.println("Je suis une methode par defaut !");
	};
	
	public void methode2();
}
