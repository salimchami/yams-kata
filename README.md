# Sujet

Le Yam's est un est jeu qui se joue avec 5 dés.
Le résultat de ces 5 dés permet d'obtenir des combinaisons.
Chaque combinaison vaut un nombre de points :
aucune combinaison        = 1 point2 dés identiques (paire)    = 3 points
3 dés identiques (brelan)  = 5 points4 dés identiques (carré)    = 10 points5 dés identiques (yam)     = 20 points
Le programme devra implémenter une méthode qui prend en paramètre une liste de valeurs de dés et qui retourne le score de la combinaison.
 
Exemples :
aucune combinaison : 4, 2, 1, 3, 6 donne 1 point

paire :               2, 2, 1, 3, 5 donne 3 points

brelan :              2, 2, 2, 3, 5 donne 5 points

carré :               2, 2, 2, 2, 5 donne 10 points

yam :                 2, 2, 2, 2, 2 donne 20 points

double paire :                5, 5, 3, 3, 2 donne 4 points

full (1 brelan + 1 paire):    5, 5, 5, 6, 6 donne 8 points

suite(5 dés qui se suivent):  4, 5, 3, 2, 1 ou 2,3,4,5,6 donne 7 points