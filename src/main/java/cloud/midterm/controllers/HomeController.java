package cloud.midterm.controllers;

import cloud.midterm.models.Apartment;
import cloud.midterm.services.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{
    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping("/apartments")
    public String allApartments(Model model)
    {
        model.addAttribute("apartments", apartmentService.allApartments());
        return "all_apartments";
    }


    @GetMapping("/apartments/{id}")
    public String apartmentInfo(@PathVariable Long id,
                                Model model)
    {
        model.addAttribute("apartment", apartmentService.getApartment(id));
        return "apartment_info";
    }
    @PostMapping("/search")
    public String searchBar(@RequestParam String pattern,
                            Model model)
    {
        model.addAttribute("apartments", apartmentService.matchApartments(pattern));
        return "search_bar";
    }

    @GetMapping("/addApartment")
    public String addApartment()
    {
        return "add_apartment";
    }

    @PostMapping("/addApartment")
    public String addApartment(Apartment apartment)
    {
        apartmentService.addApartment(apartment);
        return "redirect:/apartments";
    }

    @GetMapping("/addPicture")
    public String addPicture(Model model)
    {
        model.addAttribute("apartments",apartmentService.allApartments());
        return "add_picture";
    }
}
