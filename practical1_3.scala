var pi = 3.14

def calvolume(r: Double): Double = 4/3*pi*r*r*r

object main extends App {
    println(s"volume = ${calvolume(5)}")
}