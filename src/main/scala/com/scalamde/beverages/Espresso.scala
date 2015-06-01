package com.scalamde.beverages

import com.scalamde.Beverage

class Espresso extends Beverage {

  private val cost: Double = 1.50

  override def getCost : Double = { cost }

}