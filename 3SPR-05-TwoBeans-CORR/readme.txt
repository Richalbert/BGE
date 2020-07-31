SigmaWeb 2019-TD Java
------------------------------------------------------------------------------

1/ Th�me
-------------------
Spring+Maven+2 beans sont utilis�s (une classe appelle l'autre)

2/ Todo
-------------
- cr�er une classe m�tier Employee (name, age, address) avec un lien sur une autre classe :
Address (town, country)
- mod�liser le process (cr�er des employ�s et des adresses via le XML)
- afficher le r�sultat

3/ R�sultats attendus
-------------
- tout est param�tr� depuis le XML

4/ Notice d'install
-------------

5/ Autres solutions, cas d�grad�
-------------
- d�clarer d'autres beans

6/ Bilan
-------------

Plusieurs possibilit�s:

<!-- 1/ r�f�rence sur l'adresse pr�c�dente! -->

<constructor-arg><ref bean="a1"/></constructor-arg>

<!--  2/ on peut aussi imbriquer les beans -->

<bean id="e1" class="com.phdareys.Employee"> 
<constructor-arg value="3" type="int"></constructor-arg> 
<constructor-arg value="Dupont" type="String"></constructor-arg> 
<constructor-arg>
<bean class="com.phdareys.Address">

...

 <!--  3/ .. ou travailler par properties (inj. par setter/getter) -->

<property name="address" ref="a2"></property>