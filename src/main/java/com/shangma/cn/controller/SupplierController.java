package com.shangma.cn.controller;

import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Supplier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JAVASM
 */
@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier,Long> {
}
