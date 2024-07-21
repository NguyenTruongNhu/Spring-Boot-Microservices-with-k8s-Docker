package com.ntndev.companyms.Company;

import com.ntndev.companyms.Company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {
     List<Company> getAllCompanies();
     Company getCompanyById(Long id);
     void createCompany(Company company);
     Boolean updateCompany(Company company, Long id);
     boolean deleteCompanyById(Long id);

     void updateCompanyRating(ReviewMessage reviewMessage);
}
