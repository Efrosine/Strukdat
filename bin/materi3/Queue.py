class Queue:
    def __init__(self, size):
        self.maxSize = size
        self.quaArray = [None] * size
        self.front = 0
        self.rear = -1
        self.nItems = 0

    def insert(self, value):
        if self.rear == self.maxSize - 1:
            self.rear = -1
        self.rear += 1
        self.quaArray[self.rear] = value
        self.nItems += 1

    def remove(self):
        temp = self.quaArray[self.front]
        self.front += 1
        if self.front == self.maxSize:
            self.front = 0
        self.nItems -= 1
        return temp

    def peekFront(self):
        return self.quaArray[self.front]

    def isEmpty(self):
        return self.nItems == 0

    def isFull(self):
        return self.nItems == self.maxSize

    def size(self):
        return self.nItems

if __name__ == "__main__":
    theQueue = Queue(100)

    data = input("Input keyboard: ")

    for c in data:
        theQueue.insert(c)

    while not theQueue.isEmpty():
        temp = theQueue.remove()
        print(temp, end=", ")
