package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.User;

public class UserDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("EstoquePU");
    EntityManager em = emf.createEntityManager();
    
    public void persistir(User user) {
        // Inicia uma transação com o banco de dados
        em.getTransaction().begin();
        
        try {
           if (user.getId() < -1){
            em.persist(user);
           } else {em.merge(user);}
           // Solicita que o DB salve e execute as inserções/atualizações solicitadas
           em.getTransaction().commit();
         
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir ou atualizar estoque! " + e);
            // Solicite que o DB DESFAÇA as ações solicitadas até o último COMMIT executado
            em.getTransaction().rollback();
        } finally {
        em.close();
        }
    }
    
    public void excluir(Long id) {
        em.getTransaction().begin();
        try {
            User estoque = em.find(User.class, id);
            em.remove(estoque);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar excluir User! " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public User listar(Long id) {
        
        User user = null;
        
        try {
            user = em.find(User.class, id);
        } catch (Exception e) {
            System.out.println("Erro ao tentar selecionar User!" + e);

        } finally{
            em.close();
        }
        
        return user;
    }
}
