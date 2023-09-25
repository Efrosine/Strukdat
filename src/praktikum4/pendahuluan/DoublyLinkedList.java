package praktikum4.pendahuluan;

public class DoublyLinkedList {
    private LinkD first, last;

    public DoublyLinkedList() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int Data) {
        LinkD newLink = new LinkD(Data);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int Data) {
        LinkD newLink = new LinkD(Data);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public LinkD deleteFirst() {
        LinkD temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }

        first = first.next;
        return temp;
    }

    public LinkD deleteLast() {
        LinkD temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int Data) {
        LinkD current = first;
        while (current.Data != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        LinkD newLink = new LinkD(Data);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public LinkD deleteKey(int key) {
        LinkD current = first;
        while (current.Data != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }

        return current;
    }

    public void displayForward() {
        System.out.print("List (first --> last) : ");
        LinkD current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.print("List (last --> first) : ");
        LinkD current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }
}