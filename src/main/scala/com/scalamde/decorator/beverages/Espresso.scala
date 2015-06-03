package com.scalamde.decorator.beverages

import com.scalamde.decorator.Beverage

class Espresso extends Beverage {

  private val cost: Double = 1.50

  override def getCost : Double = { cost }

}