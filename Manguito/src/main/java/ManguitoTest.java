import entidades.Categoria;
import entidades.Emprendedor;
import entidades.Emprendimiento;

public class ManguitoTest {

	public static void main(String[] args) {
		Emprendedor emprendedor = new Emprendedor("1234","Lara");
		Emprendimiento emprendimiento = new Emprendimiento("manguito/lara",
							"cafecito para lara","Copate con un cafe",758.2,emprendedor);
		Categoria cat1 = new Categoria("Arte");
		Categoria cat2 = new Categoria("Entretenimiento");
		
		EmprendimientoDAO emprendimientoDAO = new EmprendimientoDAOJPA();
		emprendimientoDAO.persistir(emprendimiento);
		

	}

}
