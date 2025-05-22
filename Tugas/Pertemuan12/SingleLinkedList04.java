package Tugas.Pertemuan12;

public class SingleLinkedList04 {
    NodeMahasiswa04 head;
    NodeMahasiswa04 tail;

    boolean isEmpty(){
        return(head == null);
    }

    public void print(){
        if (!isEmpty()) {
            NodeMahasiswa04 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(Mahasiswa04 input){
        NodeMahasiswa04 ndInput = new NodeMahasiswa04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa04 input){
        NodeMahasiswa04 ndInput = new NodeMahasiswa04(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa04 input){
        NodeMahasiswa04 ndInput = new NodeMahasiswa04(input, null);
        NodeMahasiswa04 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput == null ) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertArt(int index, Mahasiswa04 input){
        if (index < 0) {
            System.out.println("Indeks Salah");
        }else if (index == 0) {
            addFirst(input);
        }else{
            NodeMahasiswa04 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa04(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
