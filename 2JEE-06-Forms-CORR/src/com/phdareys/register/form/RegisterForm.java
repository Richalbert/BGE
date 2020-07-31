package com.phdareys.register.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.phdareys.register.bean.Register;

// le servlet s'appuie sur cette classe pour gérer les 
// saisies utilisateur
public class RegisterForm {
		// nom des items de formulaire html
    private static final String FIELD_NAME  = "name";
    private static final String FIELD_FIRSTNAME   = "firstname";
    private static final String FIELD_PASS   = "password";
    private static final String FIELD_PASS2   = "password2";
    	// erreurs éventuelles
    private static final String STRING_MIN_LENGTH   = " characters at least!";
    private static final String IDENTICAL_PASS   = "Passwords must be identical!";
    	// taille min requise
    private static final int FIELD_PASS_LG   = 6;
    private static final int FIELD_FIRST_LG   = 3;
    private static final int FIELD_NAME_LG   = 3;
    	
    private Register user; // user bean: data métier
    private Map<String, String> errors ; // pour gérer l'erreur par champ

    public RegisterForm(HttpServletRequest request) {
		super();		
				/* allocation bean & structure erreur */
		this.user = new Register();
		this.errors = new HashMap<String, String>();
		        /* Récupération des champs du formulaire */
		String name = this.getFieldValue( request, FIELD_NAME );
		String pass = this.getFieldValue( request, FIELD_PASS );
		String firstN = this.getFieldValue( request, FIELD_FIRSTNAME );
		String pass2 = this.getFieldValue( request, FIELD_PASS2 );
				/* traitement erreurs */
		this.checkAllValues(name, firstN, pass, pass2);
				/* maj bean */
		user.setName(name);
		user.setPassword(pass);	
		user.setFirstname(firstN);
	}
    
	public Register getUser() {
        return user;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    /*
     * Méthode utilitaire qui retourne "" si le champs n'est pas saisi
     */
    private String getFieldValue( HttpServletRequest request, String fName ) {
        String v = request.getParameter( fName );
        if ( v == null || v.trim().length() == 0 ) {
            return "";
        } else {
            return v;
        }
    }
    /*
     * verif de tous les champs un par un avec 2 contraintes: lg+mdp1=mdp2
     */
    private void checkAllValues(String n, String fN, String p1, String p2) {
		if (n == null || n.length() < FIELD_NAME_LG)
			this.errors.put(FIELD_NAME, FIELD_NAME_LG + STRING_MIN_LENGTH);
		if (p1 == null || p1.length() < FIELD_PASS_LG)
			this.errors.put(FIELD_PASS, FIELD_PASS_LG + STRING_MIN_LENGTH);
		if (fN == null || fN.length() < FIELD_FIRST_LG)
			this.errors.put(FIELD_FIRSTNAME, FIELD_FIRST_LG + STRING_MIN_LENGTH);
		if (p2 == null || p2.length() < FIELD_PASS_LG)
			this.errors.put(FIELD_PASS2, FIELD_PASS_LG + STRING_MIN_LENGTH);
		if (! p1.equals(p2))
			this.errors.put(FIELD_PASS2, IDENTICAL_PASS); 	
    }
}
