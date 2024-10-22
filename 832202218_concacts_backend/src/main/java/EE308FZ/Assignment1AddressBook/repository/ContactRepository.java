package EE308FZ.Assignment1AddressBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EE308FZ.Assignment1AddressBook.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
