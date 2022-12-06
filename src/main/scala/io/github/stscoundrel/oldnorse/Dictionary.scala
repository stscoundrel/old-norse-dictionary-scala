package io.github.stscoundrel.oldnorse

import java.io.InputStream
import java.io.InputStreamReader
import java.io.Reader

import com.google.gson.Gson

class Dictionary {
  private var entries: Array[DictionaryEntry] = _
  private var markupEntries: Array[DictionaryEntry] = _

  object DictionaryLocation extends Enumeration {
    type DictionaryLocation = Value
    val NoMarkup, Markup = Value
  }

  private def getDictionaryPath(location: DictionaryLocation.Value): String = location match {
    case DictionaryLocation.NoMarkup => "/no-markup.json"
    case DictionaryLocation.Markup => "/markup.json"
  }

  private def readDictionary(location: DictionaryLocation.Value): Array[DictionaryEntry] = {
    val inputStream = getClass.getResourceAsStream(getDictionaryPath(location))
    val reader = new InputStreamReader(inputStream)

    val gson = new Gson()

    val result = gson.fromJson(reader, classOf[Array[DictionaryEntry]])

    result
  }

  def getMarkupDictionary(): Array[DictionaryEntry] = {
    if (entries == null) {
      entries = readDictionary(DictionaryLocation.Markup)
    }

    entries
  }

  def getNoMarkupDictionary(): Array[DictionaryEntry] = {
    if (markupEntries == null) {
      markupEntries = readDictionary(DictionaryLocation.NoMarkup)
    }

    markupEntries
  }

  def getDictionary(): Array[DictionaryEntry] = getNoMarkupDictionary()
}
