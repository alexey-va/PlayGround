import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Gun {

    int ammo=5;

    public void shoot(){
        if(ammo == 0) System.out.println("Клац");
        else {
            ammo--;
            System.out.println("Бах");
        }
    }

}
