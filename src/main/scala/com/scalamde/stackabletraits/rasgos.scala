package com.scalamde

import com.scalamde.stackabletraits.Pelota

package object rasgos {

  trait Roja extends Pelota {
    override def propiedades() = List("roja") ++ super.propiedades
  }

  trait DeColores extends Roja {
    override def propiedades() = List("de colores") ++ super.propiedades
  }

  trait Brillante extends Pelota {
    override def propiedades() = List("brillante") ++ super.propiedades
  }

  trait Rebota extends Pelota {
    override def propiedades() = List("rebota") ++ super.propiedades
  }

  trait Desinflada extends Pelota {
    override def propiedades() = List("desinflada") ++ super.propiedades
  }
}
