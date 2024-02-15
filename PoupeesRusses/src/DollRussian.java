public class DollRussian implements Doll {

    private boolean isOpen;
    private int size;
    private Doll doll1;

//    public boolean isOpen() {
//        return isOpen;
//    }

//    public void setSize(int size) {
//        this.size = size;
//    }
    public void setOpen(boolean open) {
        isOpen = open;
    }


    public int getSize() {
        return size;
    }


    public DollRussian(int size) {
        this.size = size;
    }

    public void open() {
        if (!isOpen) {
            setOpen(true);
            System.out.println("Russian doll is now open");
        } else {
            System.out.println("Russian doll is already open");
        }
    }

    public void close() {
        if (isOpen) {
            setOpen(false);
            System.out.println("Russian doll is now closed");
        } else {
            System.out.println("Russian doll is already closed");
        }
    }

    @Override
    public void placeIn(Doll doll) {
        if (isOpen && doll1 == null && this.getSize() < ((DollRussian) doll).getSize()) {
            this.doll1 = (DollRussian) doll;
            System.out.println("Placed doll size "+getSize()+" inside Russian doll size "+((DollRussian) doll).getSize());
        } else {
            System.out.println("Cannot place doll size " +getSize()+" inside Russian doll size "+((DollRussian) doll).getSize());
        }
    }

    @Override
    public void getOutOf(Doll doll) {
        if (isOpen && doll1 != null) {
            System.out.println("Taking doll size "+getSize()+ " out of the Russian doll size "+((DollRussian)doll).getSize());
            this.doll1 = null;
        } else {
            System.out.println("Cannot take doll out - Russian doll is closed or empty");
        }
    }


}
