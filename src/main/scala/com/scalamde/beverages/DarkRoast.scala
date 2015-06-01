package com.scalamde.beverages

import com.scalamde.Beverage

class DarkRoast extends Beverage {

  private val cost: Double = 1.20

  override def getCost : Double = { cost }
}
