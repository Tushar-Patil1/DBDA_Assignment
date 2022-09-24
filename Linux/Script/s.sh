#!/bin/bash
echo "Enter a number"
read num
echo "obase=2; $num" | bc

