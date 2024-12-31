package com.sksolutions.project.rubo.ruboApp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point src, Point destination);

}
