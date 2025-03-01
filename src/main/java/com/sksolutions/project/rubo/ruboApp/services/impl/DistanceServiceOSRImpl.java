package com.sksolutions.project.rubo.ruboApp.services.impl;

import com.sksolutions.project.rubo.ruboApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point destination) {
        return 0;
    }
}
