package com.madgag

import com.madgag.compress.CompressUtil._

import java.io.ByteArrayInputStream
import java.nio.file.Files.createTempDirectory

package object example { // Not using a package object allows Scala 3.0.0 to succeed
  def useCompressUtils(): Unit = {
    getClass // removing this allows Scala 3.0.0 to succeed.

    // Fails under Scala 3.0.0 with "java.lang.NoClassDefFoundError: com/madgag/compress/CompressUtil$"
    unzip(new ByteArrayInputStream(Array.emptyByteArray), createTempDirectory("example").toFile)
  }
}
