import entidades.Categoria;
import entidades.Emprendedor;
import entidades.Emprendimiento;
import entidades.Posteo;

public class ManguitoTestCreacion {

	public static void main(String[] args) {
		Emprendedor emprendedor = new Emprendedor("1234","Lara");
		EmprendedorDAO emprendedorDAO = new EmprendedorDAOJPA();
		emprendedorDAO.persistir(emprendedor);
		Emprendimiento emprendimiento = new Emprendimiento("manguito/lara",
							"cafecito para lara","Copate con un cafe",758.2,emprendedor);
		Categoria cat1 = new Categoria("Arte");
		Categoria cat2 = new Categoria("Entretenimiento");
		CategoriaDAO categoriaDAO = new CategoriaDAOJPA();
		cat1 = categoriaDAO.persistir(cat1);
		cat2 = categoriaDAO.persistir(cat2);
		EmprendimientoDAO emprendimientoDAO = new EmprendimientoDAOJPA();
		emprendimiento.agregarCategoria(cat2);
		emprendimiento.agregarCategoria(cat1);
		emprendimientoDAO.persistir(emprendimiento);
		System.out.println("Creacion del emprendimiento");
		System.out.println(emprendimientoDAO.recuperarTodos("id"));
		
		Posteo posteo = new Posteo("Hola que tal");
		PosteoDAO posteoDAO = new PosteoDAOJPA();
		emprendimiento.agregarPosteo(posteo);
		
		
		
		
	}

}
