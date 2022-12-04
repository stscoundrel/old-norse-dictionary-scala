package io.github.stscoundrel.oldnorsedictionary

import org.junit.Test
import org.junit.Assert._

class AppTest {
  @Test
  def testCasesRun(): Unit = {
    assertTrue(true)
    assertFalse(false)

    assertEquals(App.dummyMethod(2, 2), 4)
  }
}
