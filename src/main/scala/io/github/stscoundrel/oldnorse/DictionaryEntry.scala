package io.github.stscoundrel.oldnorse

import com.google.gson.annotations.SerializedName

case class DictionaryEntry(
                            @(SerializedName@scala.annotation.meta.field)("a") val headword: String,
                            @(SerializedName@scala.annotation.meta.field)("b") val definitions: Array[String]
                          )