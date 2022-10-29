import java.io.Reader

object execution extends App {

  var Reader = new FileReader()
  println(s"Le jardin est de la taille suivante : ${Reader.x_max},${Reader.y_max}.")
  var positions_depart = Reader.pos_initiales.toList
  var instructions = Reader.commande.toList
  /* Compteur pour but d'affichage du numéro de tondeuse */
  var comptage = 1

  for ((i, j) <- positions_depart zip instructions) {
    println(s"Tondeuse numéro : $comptage")
    var Tondeuse = new Tondeuse(Reader.x_max, Reader.y_max, i.split(" ")(0).toInt, i.split(" ")(1).toInt, i.split(" ")(2), j.split("").toList)
    Tondeuse.VerifInstru()
    var x_finale = Tondeuse.x_courant
    var y_finale = Tondeuse.y_courant
    var orientation_finale = Tondeuse.orientation
    println(s"Position finale de la tondeuse $comptage: $x_finale $y_finale $orientation_finale")
    comptage += 1
  }
}





