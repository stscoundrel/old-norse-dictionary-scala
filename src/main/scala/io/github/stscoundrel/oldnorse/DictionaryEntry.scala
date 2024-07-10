package io.github.stscoundrel.oldnorse

import com.google.gson.annotations.SerializedName
import scala.annotation.meta.field

case class DictionaryEntry(
  @(SerializedName@field)("a")
  val headword: String,

  @(SerializedName@field)("b")
  val definitions: Array[String]
)