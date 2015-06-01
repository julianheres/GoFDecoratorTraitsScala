package com.scalamde

import com.scalamde.beverages.{DarkRoast, Espresso, HouseBlend}
import com.scalamde.condiments.{Soy, Whip, Milk, Mocha}
import org.scalatest.FunSuite

class BeveragesTest extends FunSuite {

  test( "Validar el costo de un HouseBlend con Milk" ) {
    val cafe = new HouseBlend() with Milk
    assert( cafe.getCost === ( 1.40 + 0.10 ) )
  }

  test( "Validar el costo de un HouseBlend con Mocha" ) {
    val cafe = new HouseBlend() with Mocha
    assert( cafe.getCost === ( 1.40 + 0.15 ) )
  }

  test( "Validar el costo de un HouseBlend con Soy" ) {
    val cafe = new HouseBlend() with Soy
    assert( cafe.getCost === ( 1.40 + 0.25 ) )
  }

  test( "Validar el costo de un HouseBlend con Whip" ) {
    val cafe = new HouseBlend() with Whip
    assert( cafe.getCost === ( 1.40 + 0.20 ) )
  }

  test( "Validar el costo de un Espresso con Mocha y Whip" ) {
    val cafe = new Espresso() with Mocha with Whip
    assert( cafe.getCost === ( 1.50 + 0.15 + 0.20 ) )
  }

  test( "Validar el costo de un Darkroast con Mocha, Whip, Milk y Soy" ) {
    val cafe = new DarkRoast() with Mocha with Whip with Milk with Soy
    assert( cafe.getCost === ( 1.20 + 0.15 + 0.20 + 0.10 + 0.25 ) )
  }
}
