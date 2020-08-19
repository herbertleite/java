package interfaces;

public interface SqlDCL {
	void grant(String access);
	void remoke(String access);
}
