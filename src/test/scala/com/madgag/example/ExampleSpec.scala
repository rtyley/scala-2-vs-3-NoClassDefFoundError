package com.madgag.example

import com.madgag.example.Example.useCompressUtils
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class ExampleSpec extends AnyFlatSpec with Matchers {

  "using Java Compress library" should "not throw java.lang.NoClassDefFoundError" in {
    useCompressUtils()
  }
}