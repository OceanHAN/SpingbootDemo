package com.example.demo.service.impl;

import com.example.demo.entity.Resource;
import com.example.demo.mapper.ResourceMapper;
import com.example.demo.service.ResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author zhf
 * @since 2021-02-05
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
