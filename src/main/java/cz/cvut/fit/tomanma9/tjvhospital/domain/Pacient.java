package cz.cvut.fit.tjv.hospital.domain;

import java.time.LocalDateTime;

public class Pacient implements DomainEntity<Long> {

    private Long id;

    private String name;
    private LocalDateTime birthdate;
    private String emailAddress;
    private String phoneNumber;

    public Pacient(Long id, String name, LocalDateTime birthdate, String emailAddress, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }




    @Override
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDateTime getBirthdate() { return birthdate; }
    public void setBirthdate(LocalDateTime birthdate) { this.birthdate = birthdate; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
