package com.scalamde.decorator.beverages

import com.scalamde.decorator.Beverage

class Decaf extends Beverage {

  private val cost: Double = 1.99

  override def getCost : Double = { cost }

}
