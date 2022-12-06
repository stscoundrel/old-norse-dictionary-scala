# Old Norse Dictionary

Old Norse to English Dictionary for Scala / Java. The dictionary consists of 35 000+ Old Norse words with English translations.

Based on the classic dictionary by Richard Cleasby and Gudbrand Vigfusson. If you find this one too abbreviated, academic or hard to read, you might want to check out [A Concise Dictionary of Old Icelandic (Java)](https://github.com/stscoundrel/old-icelandic-dictionary-java)


## Install

As Maven dependency.

```xml
<dependency>
  <groupId>io.github.stscoundrel</groupId>
  <artifactId>oldnorse</artifactId>
  <version>0.2.1</version> <!-- Note! Check latest release number -->
</dependency>
```

For alternative install methods, see the [Maven Central Repo](https://search.maven.org/artifact/io.github.stscoundrel/oldnorse)

### Usage

The dictionary comes in two variants:
- Markup dictionary has HTML markup `<i>` and `<b>` to match look of the original book.
- No-markup version has the same content without any additional formatting tags.

Dictionary defaults to "no markup".

```scala

import io.github.stscoundrel.oldnorse.Dictionary
import io.github.stscoundrel.oldnorse.DictionaryEntry

val dictionary = new Dictionary()

// Both dictionaries return entries that consist of headword and definitions list.
val noMarkupResult = dictionary.getNoMarkupDictionary() // also aliased as getDictionary()
val markupResult = dictionary.getMarkupDictionary()

// Headwords wont differ between dictionaries.
println(noMarkupResult(1989).headword)  // át-frekr
println(markupResult(1989).headword)    // át-frekr

// But definition markup does differ.
println(noMarkupResult(14).definitions(0))   // adj. <i>greedy, voracious,</i> Hkv. 2. 41.
println(markupResult(14).definitions(0))     // adj. greedy, voracious, Hkv. 2. 41.

```

Should you use this library with Java, you may need to make some minor adjustements. For example, Java may consider fields case class DictionaryEntry to be "private". You can get around this by calling them as getters, like `myEntry.headword()` instead of `myEntry.headword`

Individual words are returned in format of:

```scala
{
    headword: String
    definitions: Array[String]
}
```

### About Cleasby & Vigfusson Dictionary

"Icelandic-English" dictionary was started by Richard Cleasby and finished by Gudbrand Vigfusson. It was published in 1874, which leads to there being many public domain versions of the book available.
