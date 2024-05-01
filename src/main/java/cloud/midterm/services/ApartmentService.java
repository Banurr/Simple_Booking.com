package cloud.midterm.services;

import cloud.midterm.models.Apartment;
import cloud.midterm.repositories.AparmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService
{
    @Autowired
    private AparmentRepository aparmentRepository;

    public List<Apartment> allApartments()
    {
        return aparmentRepository.findAll();
    }

    public void addApartment(Apartment apartment)
    {
        aparmentRepository.save(apartment);
    }

    public Apartment getApartment(Long id)
    {
        return aparmentRepository.findById(id).orElse(null);
    }

    public void updateApartment(Apartment apartment)
    {
        aparmentRepository.save(apartment);
    }

    public List<Apartment> matchApartments(String pattern)
    {
        return aparmentRepository.findByPattern(pattern);
    }

}
