import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Player{
    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", ID=" + ID +
                '}';
    }

    public Player(String isim, int ID) {
        this.isim = isim;
        this.ID = ID;
    }

    private String isim;
    private int ID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return ID == player.ID && Objects.equals(isim, player.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isim, ID);
    }
}
public class Main {
    public static void main(String[] args) {
        Set<Player> hashset = new HashSet<Player>();
       Player player1 = new Player("Can",7);
       Player player2= new Player("Megadeth",1985);
       Player player3 = new Player("PapaHet",1982);
       Player player4= new Player("Can",7);
       hashset.add(player1);
       hashset.add(player2);
       hashset.add(player3);
       hashset.add(player4);
       for (Player p : hashset)
           System.out.println(p);


    }
}