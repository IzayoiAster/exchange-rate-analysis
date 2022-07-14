from datetime import datetime
import time
import os


# 每n秒执行一次

def timer(n):
    while True:
        # print(datetime.now().strftime("%Y-%m-%d %H:%M:%S"))
        os.system('python usd2jpy.py')
        time.sleep(n)

timer(10)
