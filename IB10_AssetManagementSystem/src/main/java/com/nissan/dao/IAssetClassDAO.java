package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import com.nissan.model.AssetClass;

@Repository
public interface IAssetClassDAO extends JpaRepositoryImplementation<AssetClass, Integer> {

}
