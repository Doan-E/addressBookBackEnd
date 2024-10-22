package EE308FZ.Assignment1AddressBook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EE308FZ.Assignment1AddressBook.exception.ResourceNotFoundException;
import EE308FZ.Assignment1AddressBook.model.Contact;
import EE308FZ.Assignment1AddressBook.repository.ContactRepository;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContact(Long id) {
        return contactRepository.findById(id);
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

    public Contact updateContact(Long id, Contact contact) {
        Contact existingContact = contactRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Contact not found with id " + id));
        existingContact.setName(contact.getName());
        existingContact.setPhone(contact.getPhone());
        return contactRepository.save(existingContact);
    }
    
}
