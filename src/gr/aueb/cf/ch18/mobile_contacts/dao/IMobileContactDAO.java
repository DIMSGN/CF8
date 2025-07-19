package gr.aueb.cf.ch18.mobile_contacts.dao;

import gr.aueb.cf.ch18.mobile_contacts.model.MobileContact;

import java.util.List;
import java.util.Optional;

public interface IMobileContactDAO {

    MobileContact insert(MobileContact mobileContact);
    MobileContact update(long id, MobileContact mobileContact);
    void deleteById(long id);
    MobileContact getById(long id);
    List<MobileContact> getAll();

    void deleteByPhoneNumber(String phoneNumber);
    Optional<MobileContact> getByphoneNumber(String phoneNumber);
    boolean contactIdExists(long id);
    boolean phoneNumberExists(String phoneNumber);


}
