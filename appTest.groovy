import groovy.util.GroovyTestSuite 
import junit.framework.Test 
import junit.textui.TestRunner 

import org.springframework.core.env.*
import com.fasterxml.jackson.databind.*

class AllTests { 
   static Test suite() { 
      def allTests = new GroovyTestSuite() 
      allTests.addTestSuite(IndexTest.class)
      return allTests 
   } 
} 

TestRunner.run(AllTests.suite())

class IndexTest extends GroovyTestCase {
   void testDisplay() {
      assert(true)
   }
   void testContent() {
      assert(true)
   }
}
