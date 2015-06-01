package com.scalamde.condiments

import com.scalamde.Beverage

trait Whip extends Beverage {

  abstract override def getCost : Double = { super.getCost + 0.20 }

}
