package com.montesori.model;

import lombok.Builder;
import lombok.Data;

import java.io.File;
import java.util.List;

@Data
@Builder
public class ResizeParameter {
    private int width;
    private int height;
    private File file;
}
