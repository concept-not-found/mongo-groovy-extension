Mongo Groovy Extension
======================

##### Makes the [Mongo](http://www.mongodb.org/) Java Driver more Groovy

### Installation
Mongo Groovy Extension is a [Groovy](http://groovy.codehaus.org/) [Maven](http://maven.apache.org/) project.

Maven dependency snippet

```xml
<dependency>
  <groupId>com.github.concept-not-found</groupId>
  <artifactId>mongo-groovy-extension</artifactId>
  <version>1-SNAPSHOT</version>
</dependency>
```

[Groovy Grape](http://groovy.codehaus.org/Grape) snippet

    @Grab(group="com.github.concept-not-found", module="mongo-groovy-extension", version="1-SNAPSHOT")

### Usage
MongoUtils.connect takes a closure which automatically closes the connection at the end.

Similar to the mongo console syntax db.collection.find(..), select database and collection as properties.

    import com.github.concept.not.found.mongo.groovy.util.MongoUtils

    MongoUtils.connect {
      mongo ->
        def collection = mongo.databaseName.collectionName

        collection.find(..)
    }

### Copyright and License
<pre>
Copyright 2013 Ronald Chen

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
</pre>
