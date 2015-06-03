package com.scalamde.richinterface

import org.scalatest.FunSuite

class SimilarityTest extends FunSuite {

  test ( " 1 y 2 ") {
      val p1 = new PuntoAMedias(2, 3)
      val p2 = new PuntoAMedias(2, 4)
      assert(!p1.isNotSimilar(p2))
  }

  test ( " 1 y 3 ") {
      val p1 = new PuntoAMedias(2, 3)
      val p3 = new PuntoCompleto(3, 3)
      assert(p1.isNotSimilar(p3))
  }

  test ( " 2 y 3 ") {
      val p2 = new PuntoAMedias(2, 4)
      val p3 = new PuntoCompleto(3, 3)
      assert(p2.isNotSimilar(p3))
  }

  test ( " 3 y 4 ") {
      val p3 = new PuntoCompleto(3, 3)
      val p4 = new PuntoCompleto(3, 3)
      assert(!p3.isNotSimilar(p4))
  }
}
