package fr.richard.controller.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import fr.richard.convert.bean.Convert;

public class ConvertForm {
	
	// nom des items de formulaire html
    private static final String FIELD_IN_AMOUNT    	  = "inAmount";
    private static final String FIELD_EURO_TO_DOLLAR  = "euroToDollar";
    
  	// erreurs éventuelles
    private static final String STRING_MAX_CHANGE   = " doit etre inferieur a 1000 ";
  
    
	private Convert convert; 					// convert bean: data métier
    private Map<String, String> errors ; 		// pour gérer l'erreur par champ

    public ConvertForm(HttpServletRequest request) {
		super();		
				/* allocation bean & structure erreur */
		this.convert = new Convert();
		this.errors  = new HashMap<String, String>();
		
		        /* Récupération des champs du formulaire */
		int inAmount         = Integer.parseInt(     request.getParameter( FIELD_IN_AMOUNT ) );
		boolean euroToDollar = Boolean.parseBoolean( request.getParameter( FIELD_EURO_TO_DOLLAR ) );
		
				/* traitement erreurs */
		if ( inAmount > 1000  ) {	
			this.errors.put(FIELD_IN_AMOUNT, STRING_MAX_CHANGE);
		}
		
				/* maj bean */
		convert.setInAmount(inAmount);
		convert.setEuroToDollar(euroToDollar);
		convert.setOutAmount(convert.run(inAmount, euroToDollar));
	}

	public Convert getConvert() {
		return convert;
	}

	public Map<String, String> getErrors() {
		return errors;
	}
    
    
    
}
