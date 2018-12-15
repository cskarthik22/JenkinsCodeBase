#!/bin/sh
N=${1:-10}

a=0
b=1

echo ' Fibonacci series is: '

for (( i=0; i<N; i++ ))
do 
   echo "$a"
   sleep 2
   c = $(( a+b ))
   a = $b
   b = $c
done

