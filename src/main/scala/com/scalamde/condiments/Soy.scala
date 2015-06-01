package com.scalamde.condiments

import com.scalamde.Beverage

trait Soy extends Beverage {

  abstract override def getCost : Double = { super.getCost + 0.25 }

}
