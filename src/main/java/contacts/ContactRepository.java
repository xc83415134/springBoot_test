package contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by xuc on 2017/3/8.
 */
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long>, JpaSpecificationExecutor<Contact> {
    /*private JdbcTemplate jdbc;

    @Autowired
    public ContactRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Contact> findAll(){
        return jdbc.query("SELECT id,firstName,lastName,phoneNumber,emailAddress FROM contacts ORDER BY lastName",
                new RowMapper<Contact>() {
                    @Override
                    public Contact mapRow(ResultSet resultSet, int i) throws SQLException {
                        Contact contact = new Contact();
                        contact.setId(resultSet.getLong(1));
                        contact.setFirstName(resultSet.getString(2));
                        contact.setLastName(resultSet.getString(3));
                        contact.setPhoneNumber(resultSet.getString(4));
                        contact.setEmailAddress(resultSet.getString(5));
                        return contact;
                    }
                });
    }

    public void save(Contact contact){
        jdbc.update("INSERT INTO contacts (firstName,lastName,phoneNumber,emailAddress) VALUE (?,?,?,?)",
                contact.getFirstName(),contact.getLastName(),contact.getPhoneNumber(),contact.getEmailAddress());
    }*/
}
