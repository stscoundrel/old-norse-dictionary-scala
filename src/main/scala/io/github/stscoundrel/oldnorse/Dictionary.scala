package io.github.stscoundrel.oldnorse

import com.google.gson.Gson

import java.io.InputStreamReader

class Dictionary {
  private lazy val entries: Array[DictionaryEntry] = readDictionary(DictionaryLocation.NoMarkup)
  private lazy val markupEntries: Array[DictionaryEntry] = readDictionary(DictionaryLocation.Markup)

  def getMarkupDictionary(): Array[DictionaryEntry] = markupEntries

  def getDictionary(): Array[DictionaryEntry] = getNoMarkupDictionary

  def getNoMarkupDictionary(): Array[DictionaryEntry] = entries

  private def readDictionary(location: DictionaryLocation.Value): Array[DictionaryEntry] = {
    val inputStream = getClass.getResourceAsStream(getDictionaryPath(location))
    val reader = new InputStreamReader(inputStream)

    val gson = new Gson()

    val result = gson.fromJson(reader, classOf[Array[DictionaryEntry]])

    result
  }

  private def getDictionaryPath(location: DictionaryLocation.Value): String = location match {
    case DictionaryLocation.NoMarkup => "/no-markup.json"
    case DictionaryLocation.Markup => "/markup.json"
  }

  private object DictionaryLocation extends Enumeration {
    type DictionaryLocation = Value
    val NoMarkup, Markup = Value
  }
}
