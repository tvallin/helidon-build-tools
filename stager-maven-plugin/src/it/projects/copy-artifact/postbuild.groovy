/*
 * Copyright (c) 2022 Oracle and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.nio.file.Files

static void assertExists(file) {
    if (!Files.exists(file)) {
        throw new AssertionError((String) "${file.toString()} does not exist")
    }
}

def stageDir = basedir.toPath().resolve("target/stage")
assertExists(stageDir)

assertExists(stageDir.resolve("helidon-bare-mp-2.0.0-RC1.jar"))
assertExists(stageDir.resolve("helidon-bare-se-2.0.0-RC1.jar"))
assertExists(stageDir.resolve("archetype-catalog.xml"))