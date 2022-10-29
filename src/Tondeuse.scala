class Tondeuse (var x_max : Int, var y_max : Int, var x_courant : Int, var y_courant : Int, var orientation : String, var commande : List[String]
)
{


  /**
   * permet de lire les instructions de la tondeuse et de les éxecuter une à une
   */
  def VerifInstru(): Unit ={
    for (i <- commande){
      try{
        if( i == "A") this.avancer()
        else if ( i == "D") this.Droite()
        else if( i == "G") this.Gauche()
      }
      catch{
        case ex: Exception => println("La commande est invalide")
      }
    }
  }


  /**
   * permet d'avancer la tondeuse dans la pelouse sans changer d'orientation.
   */
  def avancer() = {
    if ("N" == orientation && y_courant < y_max) y_courant += 1
    else if ("S" == orientation && y_courant > 0) y_courant -= 1
    else if ("W" == orientation && x_courant > 0) x_courant -= 1
    else if ("E" == orientation && x_courant < x_max) x_courant += 1
    else orientation=orientation
    println(s"La tondeuse avance dans la direction : $orientation. La nouvelle position est : ($x_courant, $y_courant)")
  }


  /**
   * permet de tourner la tondeuse de 90° à gauche sans la déplacer.
   */
  def Gauche(): Unit = {
    if (orientation == "N") orientation = "W"
    else if (orientation == "S") orientation = "E"
    else if (orientation == "E") orientation = "N"
    else if (orientation == "W") orientation = "S"
    else orientation=orientation
  }

  /**
   * permet de tourner la tondeuse de 90° à droite sans la déplacer.
   */
  def Droite(): Unit = {
    if (orientation == "N") {orientation = "E"}
    else if (orientation == "S") {orientation = "W"}
    else if (orientation == "E") {orientation = "S"}
    else if (orientation == "W") {orientation = "N"}
    else orientation=orientation
  }
}

