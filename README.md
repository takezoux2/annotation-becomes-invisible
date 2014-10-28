# Scala2.11.3 compiler bug

## Issue

Original annotation is made invisible after clean compile.

## Env

sbt0.13.5 + scala2.11.3

## Detail

Only after clean compile, original annotation is made RUntimeInvisibleAnnotations.But after recompile, Original annotation is made visible.

You can check it by run this project.
Visible annotations should be 2(ScalaSig and MyAnnotation).But it will be 1.


Below is pick up output of javap -v target/scala-2.11/classes/hoge/Sample.class 

'''
public class hoge.Sample implements scala.Product,scala.Serializable
  ...

  RuntimeVisibleAnnotations:
    0: #13(#14=s#15)
  RuntimeInvisibleAnnotations:
    0: #10(#11=I#12)
    ScalaSig: length = 0x3
     05 00 00 
  ...
  #9 = Utf8               Sample.scala                       \t-!C!YAAo\*ue&tw\rFGq!!AB=tf8               Lhoge/MyAnnotation;
   #11 = Ua!Z9vC2HCA2q1V.!AAICC:vmB!f]i\nA\"T=B]:|G/;j_:
   
  ...

'''
