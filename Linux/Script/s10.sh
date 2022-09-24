#!/bin/bash
echo "Enter a key and then enter:"
read var
echo ${var:0:1}
case ${var:0:1} in
[0-9])
    echo "$var The input is a digit."
    ;;
[A-Z])
    echo "$var The input is a uppercase letter."
    ;;
 [a-z])
    echo "$var The input is a lowercase letter."
    ;;
esac
