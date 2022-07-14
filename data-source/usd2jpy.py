'''
import urllib.request
import urllib.parse
import re
# https://finance.sina.com.cn/money/forex/hq/DINIW.shtml
headers = {
    'User-Agent': 'User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:78.0) Gecko/20100101 Firefox/78.0',
    'Referer': 'https://finance.sina.com.cn/money/forex/hq/USDJPY.shtml',
    'sec-ch-ua':'" Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101"'
}
req = urllib.request.Request(url='https://hq.sinajs.cn/list=fx_sjpycny', headers=headers, method='GET')
response = urllib.request.urlopen(req)
html = response.read().decode('gb2312', errors='ignore')
'''
import re

import requests

url = 'https://hq.sinajs.cn/list=fx_susdjpy'
# url='https://hq.sinajs.cn/etag.php?_=1656919790289&list=fx_susdjpy'
# url = 'https://hq.sinajs.cn/rn=1657071483496list=fx_seurusd,fx_sgbpusd,fx_susdjpy,fx_saudusd,fx_susdchf,fx_susdcad,fx_snzdusd,fx_susdhkd,fx_susdrub,fx_susdkrw,fx_susdthb,fx_susdsgd'
headers = {
    'User-Agent': 'User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:78.0) Gecko/20100101 Firefox/78.0',
    'Referer': 'https://finance.sina.com.cn/money/forex/hq/USDJPY.shtml',
    # 'sec-ch-ua':'" Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101"'
}

response = requests.get(url, headers=headers)
print(response)

html = response.text

strlist = html.split(',')
print(strlist)
print(strlist[1])
patten = re.compile("\d*:\d*:\d*")
a =  patten.findall(strlist[0])
print(a)
import csv

# newline=" "
with open("data.csv", 'a', newline='') as f:
    # row = [(strlist[len(strlist) - 1][0:10]), (strlist[len(strlist) - 2]), (strlist[1])]
    row = [a[0], (strlist[1])]
    write = csv.writer(f)
    write.writerow(row)
    f.close()
    print("写入完毕！")
ratetime=(a[0])
ratevalue=(strlist[1])
url1='http://后端/update?ratetime='+ratetime+'&ratevalue='+ratevalue
requests.get(url1)