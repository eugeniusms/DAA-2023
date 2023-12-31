import matplotlib.pyplot as plt
import networkx as nx

class TernaryHeap:
    def __init__(self):
        self.items = []
 
    def size(self):
        return len(self.items)
 
    def parent(self, i):
        return (i - 1)//3
 
    def left(self, i):
        return 3*i + 1
 
    def mid(self, i):
        return 3*i + 2
 
    def right(self, i):
        return 3*i + 3
 
    def get(self, i):
        return self.items[i]
 
    def get_max(self):
        if self.size() == 0:
            return None
        return self.items[0]
 
    def extract_max(self):
        if self.size() == 0:
            return None
        largest = self.get_max()
        self.items[0] = self.items[-1]
        del self.items[-1]
        self.max_heapify(0)
        return largest
 
    def max_heapify(self, i):
        l = self.left(i)
        r = self.right(i)
        m = self.mid(i)
        if (l <= self.size() - 1 and self.get(l) > self.get(i)):
            largest = l
        else:
            largest = i
        if (m <= self.size() - 1 and self.get(m) > self.get(largest)):
            largest = m
        if (r <= self.size() - 1 and self.get(r) > self.get(largest)):
            largest = r
        if (largest != i):
            self.swap(largest, i)
            self.max_heapify(largest)
 
    def swap(self, i, j):
        self.items[i], self.items[j] = self.items[j], self.items[i]
 
    def insert(self, key):
        index = self.size()
        self.items.append(key)
 
        while (index != 0):
            p = self.parent(index)
            if self.get(p) < self.get(index):
                self.swap(p, index)
            index = p

    def inorder_traversal(self, i=0):
        if i < self.size():
            self.inorder_traversal(self.left(i))
            print(self.get(i), end=" ")
            self.inorder_traversal(self.mid(i))
            self.inorder_traversal(self.right(i))

    def draw_heap(self):
        G = nx.Graph()
        labels = {}

        for i in range(self.size()):
            parent = self.parent(i)
            if i == 0:
                labels[i] = self.get(i)
            else:
                labels[i] = self.get(i)
                G.add_edge(parent, i)

        pos = nx.spring_layout(G)
        nx.draw(G, pos, with_labels=True, labels=labels, node_size=5000, node_color='lightblue', font_size=10)
        plt.show()

    def delete_element(self, x):
        if x not in self.items:
            print(f"{x} not found in the heap.")
            return

        # Cari indeks x
        i = self.items.index(x)
        last_element = self.items[-1]

        # Gantikan elemen x dengan elemen terakhir
        self.items[i] = last_element
        del self.items[-1]

        # Lakukan heapify turun untuk mempertahankan properti heap
        self.max_heapify(i)

    def percolate_up(self, i):
        while i > 0:
            parent = self.parent(i)
            if self.get(i) > self.get(parent):
                self.swap(i, parent)
                i = parent
            else:
                break

    def combine_heap(self, other_heap):
        # Gabungkan elemen-elemen dari other_heap ke self.items
        self.items.extend(other_heap.items)

        # Lakukan heapify up untuk mempertahankan properti heap
        for i in range(self.size() - 1, -1, -1):
            self.percolate_up(i)

theap1 = TernaryHeap()
theap2 = TernaryHeap()
 
print('HEAP 1')
print('Menu (this assumes no duplicate keys)')
print('[1] insert <data>')
print('[2] delete <data>')
print('[3] max get')
print('[4] max extract')
print('[5] traverse')
print('[6] draw')
print('[7] quit')
 
while True:
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'insert':
        data = int(do[1])
        theap1.insert(data)
    elif operation == 'delete':
        data = int(do[1])
        theap1.delete_element(data)
    elif operation == 'max':
        suboperation = do[1].strip().lower()
        if suboperation == 'get':
            print('Maximum value: {}'.format(theap1.get_max()))
        elif suboperation == 'extract':
            print('Maximum value removed: {}'.format(theap1.extract_max()))
    elif operation == 'traverse':
        theap1.inorder_traversal()
    elif operation == 'draw':
        theap1.draw_heap()
 
    elif operation == 'quit':
        break

print('HEAP 2')
print('Menu (this assumes no duplicate keys)')
print('[1] insert <data>')
print('[2] delete <data>')
print('[3] max get')
print('[4] max extract')
print('[5] traverse')
print('[6] draw')
print('[7] combine')
print('[8] quit')

while True:
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'insert':
        data = int(do[1])
        theap2.insert(data)
    elif operation == 'delete':
        data = int(do[1])
        theap2.delete_element(data)
    elif operation == 'max':
        suboperation = do[1].strip().lower()
        if suboperation == 'get':
            print('Maximum value: {}'.format(theap2.get_max()))
        elif suboperation == 'extract':
            print('Maximum value removed: {}'.format(theap2.extract_max()))
    elif operation == 'traverse':
        theap2.inorder_traversal()
    elif operation == 'draw':
        theap2.draw_heap()
    elif operation == 'combine':
        theap2.combine_heap(theap1)
 
    elif operation == 'quit':
        break
