package cloud.midterm.controllers;

import cloud.midterm.models.Apartment;
import cloud.midterm.models.Picture;
import cloud.midterm.services.ApartmentService;
import cloud.midterm.services.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/images")
public class PictureController
{
    @Autowired
    private PictureService pictureService;

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping(value = "/{id}", produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody byte[] getPicture(@PathVariable Long id)
    {
        return pictureService.getImage(id);
    }

    @PostMapping(value = "/{id}")
    public void addPicture(@RequestPart(name="file") MultipartFile multipartFile,
                           @PathVariable Long id) throws IOException
    {
        Apartment apartment = apartmentService.getApartment(id);
        List<Picture> pictures = apartment.getPictures();
        pictures.add(pictureService.addPicture(multipartFile));
        apartment.setPictures(pictures);
        apartmentService.updateApartment(apartment);
    }

}
