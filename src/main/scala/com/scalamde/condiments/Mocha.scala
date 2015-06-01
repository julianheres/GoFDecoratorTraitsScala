package com.scalamde.condiments

import com.scalamde.Beverage

trait Mocha extends Beverage {

  abstract override def getCost : Double = { super.getCost + 0.15 }
}
