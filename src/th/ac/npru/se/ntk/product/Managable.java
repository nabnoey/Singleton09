package th.ac.npru.se.ntk.product;


/**
 * An interface that defines basic management operations for entities.
 * Implementing classes should provide a way to delete an entity by its ID.
 * 
 * @author [Your Name]
 */
public interface Managable {

    /**
     * Deletes an entity identified by the given ID.
     *
     * @param id the unique identifier of the entity to be deleted
     * @return true if the entity was successfully deleted; false otherwise
     */
    public boolean deleteById(int id);

}
