# TaintedPrintln

This is a minimal sample to know how [Tainting Checker](https://checkerframework.org/manual/#tainting-checker) works.

## Verification

```
$ javacheck -processor org.checkerframework.checker.tainting.TaintingChecker Hello.java
Hello.java:13: error: [assignment.type.incompatible] incompatible types in assignment.
        input = kb.next();
                       ^
  found   : @Tainted String
  required: @Untainted String
1 error
```

## Compile

```
$ java -jar $CHECKERFRAMEWORK/checker/dist/checker.jar TaintedPrintln.java
```
