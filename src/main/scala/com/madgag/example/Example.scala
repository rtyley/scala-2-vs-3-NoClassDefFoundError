package com.madgag.example

import com.madgag.compress.CompressUtil._

import java.io.ByteArrayInputStream
import java.nio.file.Files.createTempDirectory

object Example {
  def useCompressUtils(): Unit = {
    getClass // removing this allows Scala 3.0.0 to succeed.

    // Fails under Scala 3.0.0 with "java.lang.NoClassDefFoundError: com/madgag/compress/CompressUtil$"
    unzip(new ByteArrayInputStream(Array.emptyByteArray), createTempDirectory("example").toFile)
  }
}
