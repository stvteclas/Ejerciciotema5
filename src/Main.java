import cocheService.CocheCRUD;
import cocheService.CocheCRUDImpl;
import model.Coche;

public class Main {
    public static void main(String[] args) {
       Coche coche = new Coche("Ford", "Mondeo", "Rojo", 230.0);
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save(coche);
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}