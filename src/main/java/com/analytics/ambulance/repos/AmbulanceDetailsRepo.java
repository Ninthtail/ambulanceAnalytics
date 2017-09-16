package com.analytics.ambulance.repos;

import com.analytics.ambulance.entities.Ambulance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by lenovo on 19/9/17.
 */
public interface AmbulanceDetailsRepo extends MongoRepository<Ambulance,String> {
}
