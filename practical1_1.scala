var pi = 3.14

def calarea(r: Double): Double = pi*r*r

object main extends App {
  println(s"area = ${calarea(5)}")
}