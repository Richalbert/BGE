package video13;

public class Chat {

	// Au niveau de la classe
		private static int tatouageCourant;		// "champ de le classe"; propre a l ensemble des chats
		
		public static int getDernierTatouageAttribue() { // methode propre a la classe
			return tatouageCourant;
		}
			
	// Au niveau de l'instance	
		private int tatouage; 					// champ d instance, propre a chaque objejet, 
												// a chaque instance de la classe public Chat() 

		public Chat() {
			tatouageCourant ++;					// incrementation du compteur generant les numeros de series (tatouages)
			this.tatouage = tatouageCourant;	// le tatouage du chat
		}
		
		
		
		@Override
		public String toString() {
			return "Je suis le chat (tatouage :" + this.tatouage + ")";
		}
		
}
