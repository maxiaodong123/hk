package com.hk.boot.module.crm.controller.admin.receivable.vo.receivable;

import com.hk.boot.framework.common.validation.InEnum;
import com.hk.boot.module.crm.enums.common.CrmAuditStatusEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "管理后台 - CRM 回款审批 Request VO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrmReceivableApproveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "编号不能为空")
    private Long id;

    @Schema(description = "审批状态", requiredMode = Schema.RequiredMode.REQUIRED)
    @InEnum(value = CrmAuditStatusEnum.class)
    private Integer status;

}
