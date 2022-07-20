
public class ObjetoFilaThread {
	
	private String nomeString;
	private String emailString;
	public String getNomeString() {
		return nomeString;
	}
	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailString == null) ? 0 : emailString.hashCode());
		result = prime * result + ((nomeString == null) ? 0 : nomeString.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoFilaThread other = (ObjetoFilaThread) obj;
		if (emailString == null) {
			if (other.emailString != null)
				return false;
		} else if (!emailString.equals(other.emailString))
			return false;
		if (nomeString == null) {
			if (other.nomeString != null)
				return false;
		} else if (!nomeString.equals(other.nomeString))
			return false;
		return true;
	}
	
	

}
