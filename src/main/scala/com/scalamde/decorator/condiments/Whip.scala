package com.scalamde.decorator.condiments

import com.scalamde.decorator.Beverage

trait Whip extends Beverage {

  abstract override def getCost : Double = { super.getCost + 0.20 }

}
