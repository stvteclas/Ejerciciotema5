package cocheService;

import model.Coche;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    private List<Coche> coches = new ArrayList<>();
    private Coche coche;
    @Override
    public void save(Coche coche) {
        System.out.println(coche);
        System.out.println("Iniciando metodo save");
        coches.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("iniciando metodo findAll");
        System.out.println("coches = " + coches);
        return coches;
    }



    @Override
    public void delete() {
        System.out.println("iniciando metodo delete");
    }
}
