package aaa

object App{


  def main(args : Array[String]) : Unit = {
    val v = classOf[hoge.Sample]
    //v.getAnnotations.foreach(a => println(a))
    // There should be ScalaSig anno and MyAnnotation anno.
    // But in scala2.11.3 , MyAnnotation is made invisible after clean compile.
    println(v.getAnnotations.length + " annotations")
  }
}
