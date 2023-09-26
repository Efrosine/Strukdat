package materi4;

public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public void insertFirst(int Data) {
        Link newLink = new Link(Data);
        newLink.next = first;
        first = newLink;
    }

    public Link deteleFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {
        Link current = first;
        while (current.Data != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;

        while (current.Data != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public boolean insert(int key, int Data) {
        Link current = first;
        while (current.Data != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        Link newLink = new Link(Data);
        if (current.next == null) {
            newLink.next = null;
        } else {
            newLink.next = current.next;
        }
        current.next = newLink;
        return true;
    }

    public void displayList() {
        System.out.println("list(first --> last :)");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
