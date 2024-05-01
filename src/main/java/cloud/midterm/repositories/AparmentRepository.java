package cloud.midterm.repositories;

import cloud.midterm.models.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AparmentRepository extends JpaRepository<Apartment, Long>
{
    @Query("select a from Apartment a where lower(a.title) like lower(concat('%', :pattern, '%')) or lower(a.address) like lower(concat('%', :pattern, '%'))")
    List<Apartment> findByPattern(String pattern);
}
