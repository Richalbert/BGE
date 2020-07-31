BGE 2020 Eval JSE/JEE
---------------------------------------
[] signifie en option
---------------------------------------
CDC:
Il s'agit de g�n�rer une page dynamique HTML contenant du SVG.
Un mini-formulaire propose de g�n�rer n lignes (1 <n<10) [n rectangles] dans un canevas svg.
Tous les param�tres de ces formes sont g�n�r�s al�atoirement [on peut les mettre en 'dur']
Il n'y a pas d'erreur possible sur le formulaire (choisir un champ de type 'number' en html)
Il y a donc redirection directe depuis le formulaire (cf form) vers la page d'affichage
(cf result.png)
---------------------------------------
TODO, Obligatoire: 
1/ l'h�ritage ***
On observe que tracer une ligne ou autre chose [un rectangle] �a se ressemble...
Il faut donc d�finir une forme de base qui contient:
- x,y, couleur [, �paisseur trait, couleur trait, opacit�]

Une ligne est une forme avec en plus le point d'arriv�e x2, y2.
[Un rectangle est une forme avec en plus width&height]
On ne peut g�n�rer le trac� d'une forme de base (utiliser classe abstraite ou interface donc)

2/ pr�parer une exception sp�cialis�e **
[par exemple: si le point g�n�r� est trop pr�t des bords]

3/ vue: 
- faire un formulaire de saisie d'un nombre de lignes [de rectangles]
- afficher les lignes [rectangles] en utilisant la JSTL (boucle)
- penser � faire une css et un minimum de navigation (lien retour)
- [faire une jsp d'erreur aussi]

---------------------------------------
Nota:
1/ svg:
code pour tracer une ligne en SVG:
https://www.w3schools.com/graphics/svg_line.asp
[pour le rectangle:
https://www.w3schools.com/graphics/svg_rect.asp ]

2/ g�n�rer un entier al�atoire entre 2 bornes:
	private int randomInt(int min, int max)	{
	     return (int) (Math.random()*(max-min+1))+min;
	}

3/ soigner particuli�rement le mod�le, s'assurer qu'avant de passer � la vue les data sont bien pr�sentes
4/ cf les screenshots (ce ne sont que des suggestions)

5/ bien tester avant de me livrer le projet sous la forme :
export eclipse/ArchiveFile/evalBGE-paulBismuth.zip

Bon courage!