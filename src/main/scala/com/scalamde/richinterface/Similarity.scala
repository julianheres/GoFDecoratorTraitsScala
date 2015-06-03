package com.scalamde.richinterface

trait Similarity {
  def isSimilar(p: Any): Boolean // No implementado
  def isNotSimilar(p: Any): Boolean = !isSimilar(p) // Implementado
}

class PuntoAMedias(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc
  def isSimilar(obj: Any) = obj.isInstanceOf[PuntoAMedias] && obj.asInstanceOf[PuntoAMedias].x == x
}

class PuntoCompleto(xc: Int, yc: Int) extends Similarity {
  var x: Int = xc
  var y: Int = yc
  def isSimilar(obj: Any) = obj.isInstanceOf[PuntoCompleto] && obj.asInstanceOf[PuntoCompleto].x == x && obj.asInstanceOf[PuntoCompleto].y == y
}
