package cloud.midterm.services;

import cloud.midterm.models.Picture;
import cloud.midterm.repositories.PictureRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PictureService
{
    @Autowired
    private PictureRepository pictureRepository;

    @Transactional
    public byte[] getImage(Long id)
    {
        Picture picture = pictureRepository.findById(id).orElse(null);
        if(picture != null)
        {
            return picture.getPicture();
        }
        return null;
    }

    @Transactional
    public Picture addPicture(MultipartFile picture) throws IOException
    {
        byte[] bytes = picture.getBytes();
        return pictureRepository.save(new Picture(bytes));
    }
}
