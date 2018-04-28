public class ItemDefinition {

    private int id;
    private String name;
    private boolean tradable;
    private boolean stackable;
    private boolean note;
    private int noteId;
    private int highAlch;
    private int lowAlch;
    private int generalPrice;

    public ItemDefinition() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTradable() {
        return tradable;
    }

    public void setTradable(boolean tradable) {
        this.tradable = tradable;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public boolean isNote() {
        return note;
    }

    public void setNote(boolean note) {
        this.note = note;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public int getHighAlch() {
        return highAlch;
    }

    public void setHighAlch(int highAlc) {
        this.highAlch = highAlch;
    }

    public int getLowAlch() {
        return lowAlch;
    }

    public void setLowAlch(int lowAlch) {
        this.lowAlch = lowAlch;
    }

    public int getGeneralPrice() {
        return generalPrice;
    }

    public void setGeneralPrice(int generalPrice) {
        this.generalPrice = generalPrice;
    }
}