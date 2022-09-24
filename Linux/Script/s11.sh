#!/bin/bash
a= date
b= pwd
c= df

function commands()
{
for i in "$@"
do
echo -e "$i\n"
done
}

commands $a $b $c

