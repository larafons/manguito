import entidades.Emprendimiento;

public class EmprendimientoDAOJPA extends GenericDAOHibernateJPA<Emprendimiento> implements EmprendimientoDAO{

	public EmprendimientoDAOJPA() {
		super(Emprendimiento.class);
		
	}

}
