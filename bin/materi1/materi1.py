# -*- coding: utf-8 -*-
"""Materi2.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1mbdyOd_UdaZ7SvObc9fAxu47g-uck0GI
"""



a=[1,2,3,4]
b=[30,55,70,100]
c=[]

print("jumlah A = ",sum(a))
print("jumlah B = ",sum(b))

print("banyak A",len(a))
print("banyak B",len(b))

for i in range(0,len(a)):
  c.append(a[i]+b[i])
print(c)