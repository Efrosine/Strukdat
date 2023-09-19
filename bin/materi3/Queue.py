queue = []
front = 0
rear = -1
nElement = 0

def insert(val):
    rear +=1
    queue[rear] = val
    nElement +=1

def remove():
    temp = queue[front]
    front += 1
    nElement -= 1
    return temp

def isEmpty():
    return nElement == 0
