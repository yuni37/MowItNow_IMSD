package Application
class Pelouse {  // Creation d'une instance pelouse qui va contenir les infos sur les frontieres de chaque pelouse
  var xBorder = -1
  var yBorder = -1 //initialisation des variables x et y du coin haut droite de la pelouse

  /**
   * définie les limites de la pelouse
   * @param coordonnees : une chaine de caractère contenant les deux coordonnées séparées à l'aide d'un espace
   */
  def AddPelouse(coordonnees: String): Unit ={

    val t1 = coordonnees.split(" ")
    (
      t1(0),
      t1(1)
    )
    this.xBorder= t1(0).toInt
    this.yBorder = t1(1).toInt
  }

  /**
   * Retourne la limite de la pelouse sur l'axe X (la largeur de la pelouse-1)
   * @return Int
   */
  def SelectXMax : Int = xBorder

  /**
   * Retourne la limite de la pelouse sur l'axe Y (la longeur de la pelouse-1)
   * @return Int
   */
  def SelectYMax : Int = yBorder

}
