import entidades.Categoria;


public class CategoriaDAOJPA extends GenericDAOHibernateJPA<Categoria> implements CategoriaDAO{
	
	public CategoriaDAOJPA() {
		super(Categoria.class);
		
	}

}
