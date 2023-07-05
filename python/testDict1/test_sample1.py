# content of test_sample.py
from biz1 import *
import random
import pytest
import time

@pytest.mark.repeat(100)
def test_add1():
    num = 0
    # time.sleep(1)
    for i in range(10):
        print("\ncount : ", i)
        num = add(num, 1)
    assert num == 10


@pytest.mark.repeat(1000)
def test_random1():
    r = random.random()
    print("\n number:", r)
    assert r > 0.1
