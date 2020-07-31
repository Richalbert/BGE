CDC traiter un Formulaire (td: 05_Form)
---------------------------------------
- il existe une page d'index statique
- la navigation doit être gérée sur toutes les pages
- en get et post tout passe par la route: Register
- toutes les pages incluent une css
- la grille comporte nom/prénom/mdp (mdp bis)
- contraintes: lg nom/prénom/mdp > 3,3,6, mdpbis=mdp
- en cas d'erreur: 
----- l'erreur spécifique au champ doit s'afficher
----- les valeurs saisies doivent être réaffichées (sauf mdp)
- si ok une page s'affiche avec les champs saisis

Variantes:
----------
- en cas de succès les infos sont générées 
dans un fichier "users.out"

- dans un deuxième temps il faut enchaîner l'inscription avec une connexion
via la Session
- en étant connecté on doit pouvoir accèder au contenu d'une page privée

- la même opération peut être réalisée également avec des cookies
- rajouter au formulaire un champ email 
(et donc effectuer les contrôles adéquats)
- rajouter un champ de type select (Homme/Femme)
- encoder le mot de passe


Bilan de ce projet:
-------------------
- gestion des formulaires
- utilisation JSTL (amélioration codage JSPs)
- utilisation sessions/cookies (accès à des zones protégées du site)
- interfaçage BDD
(cf tuto)