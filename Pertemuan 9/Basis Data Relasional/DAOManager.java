/*
* Nama File    : DAOManager.java
* Nama Pembuat : Resma Adi Nugroho
* NIM          : 24060121120021
* Deskripsi    : File kelas DAOManager
* Tanggal      : 03 Juni 2023
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
