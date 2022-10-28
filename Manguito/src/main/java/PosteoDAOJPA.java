import entidades.Posteo;

public class PosteoDAOJPA extends GenericDAOHibernateJPA<Posteo> implements PosteoDAO{
	
	public PosteoDAOJPA() {
		super(Posteo.class);
		
	}

}
