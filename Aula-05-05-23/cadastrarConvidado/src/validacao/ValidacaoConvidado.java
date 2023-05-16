package validacao;

import javax.mail.internet.InternetAddress;

public class ValidacaoConvidado {

	public boolean validaEmail (String email) {
		
		boolean retornaEmail = true;
		
		try {
			
			InternetAddress enderecoEmail = new InternetAddress(email);
			enderecoEmail.validate();
			
			
		} catch (Exception e) {
			retornaEmail = false;
		}

		return retornaEmail;
		
	}
	
}
