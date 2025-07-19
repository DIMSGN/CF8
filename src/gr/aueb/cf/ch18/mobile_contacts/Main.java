package gr.aueb.cf.ch18.mobile_contacts;

import gr.aueb.cf.ch18.mobile_contacts.dao.IMobileContactDAO;
import gr.aueb.cf.ch18.mobile_contacts.dao.MobileContactDAOImpl;
import gr.aueb.cf.ch18.mobile_contacts.model.MobileContact;

public class Main {
private static final IMobileContactDAO dao = new MobileContactDAOImpl();
    public static void main(String[] args) {

        MobileContact mobileContact = new MobileContact(1, "Athan.", "Androutsos", "123456789");
        MobileContact returnedContact = dao.insert(mobileContact);
    }
}
