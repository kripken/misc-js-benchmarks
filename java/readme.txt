To run java benchmarks on phone:

  javac X.java
  dx --dex --output=X.jar .
  adb push X.jar /data/opt/
  adb shell dalvikvm -cp /data/opt/X.jar helloworld

To run js benchmarks on phone:

  LD_LIBRARY_PATH=. time ./js -m -n X.js

