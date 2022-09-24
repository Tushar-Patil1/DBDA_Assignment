#!/bin/bash
echo "Enter a number"
read num
d=0
rev=0
while [ $num -gt 0 ]
do
    d=$(( $num % 10 ))
    rev=$(( $rev * 10 + $d ))
    num=$(( $num / 10 ))
done
echo "Reverse number is $rev"

