object Main extends App {

  /*
  Ouverture du fichier
   */
  val instructions = io.Source.fromFile("./instructions.txt").getLines()


  val coordonneesBorder = instructions.next() // extraction des coordonnées du point haut droit de la pelouse. La methode next permet de naviguer entre les lignes du document. ici on selectionne la premiere ligne

  /*
  Création d'une instance de la classe pelouse
 */
  val pelouse = new Pelouse()
  pelouse.AddPelouse(coordonneesBorder) //definition des coordonnées du coin haut droit de la pelouse

  /*
  Initialisation des tondeuses une après l'autre
   */
var  n = 1 //iterateur servant à répeter la boucle en fonction du nombre d'instructions et donc le nombre de tondeuses
while (instructions.hasNext) {
  val tondeuseInstructions = instructions.next().split(" ") // Extraction de la ligne contenant les infos sur la position initiale de la tondeuse
  val tondeuse: Tondeuse = new Tondeuse(tondeuseInstructions(0).toInt, tondeuseInstructions(1).toInt, tondeuseInstructions(2).charAt(0)) // Creation de la tondeuse avec les coordonnées et position de depart
  val sequenceArray = instructions.next().toCharArray // creation d'un tableau d'instructions
  for (i <- 0 until sequenceArray.length) {
    sequenceArray(i) match {
      case 'G' => tondeuse.turnLeft()
      case 'D' => tondeuse.turnRight()
      case 'A' => tondeuse.moveForward(pelouse)
      case _ => println(sequenceArray(i)," : instruction non reconnue (Skipped)")
    }
  }
  println("Tondeuse " +n+" : "+tondeuse.getX+" "+tondeuse.getY+" "+tondeuse.getOrientation)
  n+=1
}


}
