#!/usr/bin/env python
# coding: utf-8

ar=[ 2, 4, 6 ]
def sumOfRecursion(ar):
    if len(ar)==1:
        return ar[0]
    else:
        return ar.pop(0)+sumOfRecursion(ar);
print(sumOfRecursion(ar));


