import pandas as pd
import requests


class DataDao:
    def __init__(self):
        self.base = "http://后端"
        self.url = ''
        self.resp = None

    def setfunc(self, func):
        self.url = self.base + func
        resp = requests.get(self.url).json()
        self.resp = resp

    def get(self, name):
        return self.resp[name]

    def getx(self):
        return self.get("StartTime")

    def gety(self):
        data = []
        for i in range(len(self.resp["StartTime"]) - 1):
            data.append([self.resp["EndRate"][i - 1], self.resp["EndRate"][i], self.resp["MinRate"][i],
                         self.resp["MaxRate"][i]])
        return data

    def gety2(self):
        return self.resp["AveRate"]
