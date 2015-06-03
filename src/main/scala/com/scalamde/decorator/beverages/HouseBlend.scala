package com.scalamde.decorator.beverages

import com.scalamde.decorator.Beverage

class HouseBlend extends Beverage {

  private val cost: Double = 1.40

  override def getCost : Double = { cost }

}
