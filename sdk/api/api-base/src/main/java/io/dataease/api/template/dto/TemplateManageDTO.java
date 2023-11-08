package io.dataease.api.template.dto;


import io.dataease.api.template.vo.VisualizationTemplateVO;
import lombok.Data;

import java.util.List;


@Data
public class TemplateManageDTO extends VisualizationTemplateVO {

    private String label;

    private Integer childrenCount;

    private List<TemplateManageDTO> children;


}
