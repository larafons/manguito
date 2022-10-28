import entidades.Emprendedor;

public class EmprendedorDAOJPA extends GenericDAOHibernateJPA<Emprendedor> implements EmprendedorDAO{

	public EmprendedorDAOJPA() {
		super(Emprendedor.class);
		
	}

}
