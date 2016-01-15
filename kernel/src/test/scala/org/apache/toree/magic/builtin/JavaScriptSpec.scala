/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package org.apache.toree.magic.builtin

import org.scalatest.mock.MockitoSugar
import org.scalatest.{FunSpec, Matchers}
import org.apache.toree.magic.CellMagicOutput
import org.apache.toree.kernel.protocol.v5.MIMEType

class JavaScriptSpec extends FunSpec with Matchers with MockitoSugar {
  describe("JavaScript"){
    describe("#execute") {
      it("should return the entire cell's contents with the MIME type of text/javascript") {
        val javaScriptMagic = new JavaScript

        val code = "some code on a line\nmore code on another line"
        val expected = CellMagicOutput(MIMEType.ApplicationJavaScript -> code)
        javaScriptMagic.execute(code) should be (expected)
      }
    }
  }
}
