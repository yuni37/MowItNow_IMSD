class Tondeuse( var x: Int, var y: Int, var orientation: Char) {  //creation d'une class tondeuse qui va contenir les infos relatives à chaque tondeuse
  /**
   * Modification des coordonnées pour un avancement de la tondeuse sur une pelouse
   */
  def moveForward(pelouse: Pelouse): Unit = {
    orientation match {
      case 'N' => if (y + 1 <= pelouse.SelectYMax) y += 1 else y
      case 'E' => if (x + 1 <= pelouse.SelectXMax) x += 1 else x
      case 'W' => if (x - 1 >= 0) x -= 1 else x
      case 'S' => if (y - 1 >= 0) y -= 1 else y
    }
  }
  /**
   * Methode pour l'orienter à droite
   */
  def turnRight(): Unit = {
    orientation = orientation match {
      case 'N' => 'E'
      case 'E' => 'S'
      case 'W' => 'N'
      case 'S' => 'W'
    }
  }

  /**
   * Methode pour orientation vers la gauche
   */
  def turnLeft(): Unit = {
    orientation = orientation match {
      case 'N' => 'W'
      case 'E' => 'N'
      case 'W' => 'S'
      case 'S' => 'E'
    }
  }

  /**
   * Retourne la position sur l'axe X de la tondeuse
   * @return Int
   */
  def getX : Int = x

  /**
   * Retourne la position sur l'axe Y de la tondeuse
   * @return Int
   */
  def getY : Int = y

  /**
   * Retourne l'orientation de la tondeuse
   * @return Char
   */
  def getOrientation :Char = orientation

}
