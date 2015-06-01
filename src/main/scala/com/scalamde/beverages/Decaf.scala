package com.scalamde.beverages

import com.scalamde.Beverage

class Decaf extends Beverage {

  private val cost: Double = 1.99

  override def getCost : Double = { cost }

}
