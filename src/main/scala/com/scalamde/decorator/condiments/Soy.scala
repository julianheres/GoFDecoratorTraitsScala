package com.scalamde.decorator.condiments

import com.scalamde.decorator.Beverage

trait Soy extends Beverage {

  abstract override def getCost : Double = { super.getCost + 0.25 }

}
