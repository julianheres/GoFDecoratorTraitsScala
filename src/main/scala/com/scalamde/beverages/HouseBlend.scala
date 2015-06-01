package com.scalamde.beverages

import com.scalamde.Beverage

class HouseBlend extends Beverage {

  private val cost: Double = 1.40

  override def getCost : Double = { cost }

}
