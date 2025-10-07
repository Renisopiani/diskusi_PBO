public abstract class GameCharacter {
    protected String name;
    protected int hp;

    public GameCharacter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void showStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
    }

    // Abstract method: harus diimplementasikan oleh subcllass
    public abstract void attack();
}