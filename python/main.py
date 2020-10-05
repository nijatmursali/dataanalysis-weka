import pandas as pd 


df = pd.read_csv("../dataset/yb2.csv")

df['FullTime'] = pd.to_datetime(df['FullTime'])
df['Year'] = pd.DatetimeIndex(df['FullTime']).year
df['Month'] = pd.DatetimeIndex(df['FullTime']).month

#df.info()

print(df.head())


#df.to_csv("fixed.csv", encoding="UTF-8")
