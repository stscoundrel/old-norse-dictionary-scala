package io.github.stscoundrel.oldnorse

import com.google.gson.Gson

import java.io.InputStreamReader

sealed trait DictionaryLocation

case object NoMarkupLocation extends DictionaryLocation

case object MarkupLocation extends DictionaryLocation

class Dictionary {
  private lazy val entries: Array[DictionaryEntry] = readDictionary(NoMarkupLocation)
  private lazy val markupEntries: Array[DictionaryEntry] = readDictionary(MarkupLocation)

  def getMarkupDictionary(): Array[DictionaryEntry] = markupEntries

  def getDictionary(): Array[DictionaryEntry] = getNoMarkupDictionary

  def getNoMarkupDictionary(): Array[DictionaryEntry] = entries

  private def readDictionary(location: DictionaryLocation): Array[DictionaryEntry] = {
    val inputStream = getClass.getResourceAsStream(getDictionaryPath(location))
    val reader = new InputStreamReader(inputStream)

    val gson = new Gson()

    val result = gson.fromJson(reader, classOf[Array[DictionaryEntry]])

    result
  }

  private def getDictionaryPath(location: DictionaryLocation): String = location match {
    case NoMarkupLocation => "/no-markup.json"
    case MarkupLocation => "/markup.json"
  }

}
