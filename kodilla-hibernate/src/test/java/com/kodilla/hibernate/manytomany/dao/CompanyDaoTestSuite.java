package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testFindByFirstThreeCharacters() {
        // Given
        Company company1 = new Company("AAA Company");
        Company company2 = new Company("AAB Corporation");
        Company company3 = new Company("BBB Solutions");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        // When
        List<Company> companiesStartingWithAA = companyDao.findByFirstThreeCharacters("AAA");

        // Then
        assertEquals(1, companiesStartingWithAA.size());
    }

    @Test
    void testFindByLastname() {
        // Given
        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Alice", "Smith");
        Employee employee3 = new Employee("Bob", "Brown");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        // When
        List<Employee> employeesWithLastNameSmith = employeeDao.findByLastname("Smith");

        // Then
        assertEquals(2, employeesWithLastNameSmith.size());
    }
}