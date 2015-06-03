package com.scalamde.stackabletraits

class Pelota {
  def propiedades(): List[String] = List()
  override def toString() =  "La pelota es" + propiedades.mkString(" ", " y ", " ")
}