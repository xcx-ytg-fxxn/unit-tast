# content of test_sample.py
from biz import *
import pytest
import time


def test_add0():
    x,y = 100,1
    num = add0(x,y)
    assert num == 100

def test_add1():
    x,y = 100,1
    num = add1(x,y)
    assert num == 101

def test_add2():
    x,y = 100,1
    num = add2(x,y)
    assert num == 102

def test_add3():
    x,y = 100,1
    num = add3(x,y)
    assert num == 103

def test_add4():
    x,y = 100,1
    num = add4(x,y)
    assert num == 104


def test_random0():
    x,y = 100,1
    if(y>0):
        num = add0(x,y)
    else:
        num = sub0(x,y)
    assert num == 100

def test_random1():
    x,y = 100,1
    if(y>0):
        num = add1(x,y)
    else:
        num = sub1(x,y)
    assert num == 101

def test_random2():
    x,y = 100,-1
    if(y>0):
        num = add2(x,y)
    else:
        num = sub2(x,y)
    assert num == 102

def test_random3():
    x,y = 100,1
    if(y>0):
        num = add3(x,y)
    else:
        num = sub4(x,y)
    assert num == 103

def test_random4():
    x,y = 100,-1
    if(y>0):
        num = add4(x,y)
    else:
        num = sub4(x,y)
    assert num == 96
