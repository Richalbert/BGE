CDC traiter un Formulaire (td: 05_Form)
---------------------------------------
- il existe une page d'index statique
- la navigation doit �tre g�r�e sur toutes les pages
- en get et post tout passe par la route: Register
- toutes les pages incluent une css
- la grille comporte nom/pr�nom/mdp (mdp bis)
- contraintes: lg nom/pr�nom/mdp > 3,3,6, mdpbis=mdp
- en cas d'erreur: 
----- l'erreur sp�cifique au champ doit s'afficher
----- les valeurs saisies doivent �tre r�affich�es (sauf mdp)
- si ok une page s'affiche avec les champs saisis

Variantes:
----------
- en cas de succ�s les infos sont g�n�r�es 
dans un fichier "users.out"

- dans un deuxi�me temps il faut encha�ner l'inscription avec une connexion
via la Session
- en �tant connect� on doit pouvoir acc�der au contenu d'une page priv�e

- la m�me op�ration peut �tre r�alis�e �galement avec des cookies
- rajouter au formulaire un champ email 
(et donc effectuer les contr�les ad�quats)
- rajouter un champ de type select (Homme/Femme)
- encoder le mot de passe


Bilan de ce projet:
-------------------
- gestion des formulaires
- utilisation JSTL (am�lioration codage JSPs)
- utilisation sessions/cookies (acc�s � des zones prot�g�es du site)
- interfa�age BDD
(cf tuto)