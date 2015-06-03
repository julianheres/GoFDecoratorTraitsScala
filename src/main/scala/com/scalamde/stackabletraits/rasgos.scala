package com.scalamde

import com.scalamde.stackabletraits.Pelota

package object rasgos {

  trait Roja extends Pelota {
    override def propiedades() = super.propiedades ::: List("roja")
  }

  trait DeColores extends Roja {
    override def propiedades() = super.propiedades ::: List("de colores")
  }

  trait Brillante extends Pelota {
    override def propiedades() = super.propiedades ::: List("brillante")
  }

  trait Rebota extends Pelota {
    override def propiedades() = super.propiedades ::: List("rebota")
  }

  trait Desinflada extends Pelota {
    override def propiedades() = super.propiedades ::: List("desinflada")
  }

}
