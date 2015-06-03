package com.scalamde.decorator.condiments

import com.scalamde.decorator.Beverage

trait Milk extends Beverage {

  abstract override def getCost : Double = { super.getCost + 0.10 }

}
