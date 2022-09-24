#!/bin/bash
echo "Enter first number "
read num1
echo "Enter second number "
read num2

echo "Before swapping the numbers are, $num1, $num2"

num1=$((num1+num2))
num2=$((num1-num2))
num1=$((num1-num2))

echo "After swapping the numbers are , $num1, $num2"
