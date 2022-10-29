import scala.collection.mutable.ListBuffer
import scala.io.Source

class FileReader {
  val source = Source.fromFile("./test.txt").getLines.toList
  println("Les instructions fournies sont :")
  for (line <- source) println(line)
      /* Récupération des coordonnées du coin supérieur droit de la pelouse, */
      var x_max = source(0).split(" ")(0).toInt
      var y_max = source(0).split(" ")(1).toInt

      /* Stockage des positions initiales des différentes tondeuses, ainsi que leurs orientations */
      var pos_initiales = new ListBuffer[String]()

      /* Stockage des listes d'instructions des différentes tondeuses */
      var commande = new ListBuffer[String]()

      commande.zipWithIndex.foreach { case (line, index) =>
        if (index % 2 != 0 && index != 0) pos_initiales += line
        if (index % 2 == 0 && index != 0) commande += line
  }
}