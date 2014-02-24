# Scala.js Minimum cross compile exmaple

Cross compile trial

## Run as scala

```
sbt run
```

## Run as javascript

Development

```
sbt packageJS
open assets/index-dev.html
```

Production(2min~)

```
sbt optimizeJS
open assets/index.html
```
