package site.test.pdfanalysis.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.test.pdfanalysis.db.entity.Users;
import site.test.pdfanalysis.db.repository.UsersRepository;

import java.util.List;

@Service
@Transactional
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

}
