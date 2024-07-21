package com.ntndev.companyms.Company.messaging;

import com.ntndev.companyms.Company.CompanyService;
import com.ntndev.companyms.Company.dto.ReviewMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ReviewMessageConsumer {

    private final CompanyService companyService;

    public ReviewMessageConsumer(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RabbitListener(queues = "companyRatingQueue")
    public void consumerMessage(ReviewMessage reviewMessage) {
        companyService.updateCompanyRating(reviewMessage);
    }

}
