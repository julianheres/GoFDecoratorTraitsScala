package com.scalamde.decorator.beverages

import com.scalamde.decorator.Beverage

class DarkRoast extends Beverage {

  private val cost: Double = 1.20

  override def getCost : Double = { cost }
}
