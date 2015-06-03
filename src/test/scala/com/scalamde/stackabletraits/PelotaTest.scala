package com.scalamde.stackabletraits

import com.scalamde.rasgos._
import org.scalatest.FunSuite

class PelotaTest extends FunSuite {

  test( " Pelota roja y brillante " ) {
    val pelota1 = new Pelota with Roja with Brillante
    println(s"1 ---> $pelota1")
  }

  test( " Pelota brillante y roja " ) {
    val pelota2 = new Pelota with Brillante with Roja
    println(s"2 ---> $pelota2")
  }

  test( " Pelota brillante y de colores " ) {
    val pelota3 = new Pelota with Brillante with DeColores
    println(s"3 ---> $pelota3")
  }

  test( " Pelota de colores y rebota " ) {
    val pelota4 = new Pelota with DeColores with Rebota
    println(s"4 ---> $pelota4")
  }

  test( " Pelota brillante y roja y desinflada " ) {
    val pelota5 = new Pelota with Brillante with Roja with Desinflada
    println(s"5 ---> $pelota5")
  }

  test( " Pelota de colores y roja y rebota y desinflada" ) {
    val pelota6 = new Pelota with DeColores with Roja with Rebota with Desinflada
    println(s"6 ---> $pelota6")
  }
}
