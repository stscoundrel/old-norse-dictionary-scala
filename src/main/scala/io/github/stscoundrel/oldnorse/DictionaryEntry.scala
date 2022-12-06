package io.github.stscoundrel.oldnorse

import com.google.gson.annotations.SerializedName

case class DictionaryEntry(
  @(SerializedName @scala.annotation.meta.field)("a") headword: String,
  @(SerializedName @scala.annotation.meta.field)("b") definitions: Array[String]
)