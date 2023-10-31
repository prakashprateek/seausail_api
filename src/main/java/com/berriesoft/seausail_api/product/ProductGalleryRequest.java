package com.berriesoft.seausail_api.product;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ProductGalleryRequest {
    private int productid;
    private String imagePath;
    private boolean isThumbnailImage;
}
