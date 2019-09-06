package com.nchu.file_operator.service.impl;

import com.nchu.file_operator.dao.FileUrlDao;
import com.nchu.file_operator.model.FileUrl;
import com.nchu.file_operator.service.FileUrlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FileUrlServiceImpl implements FileUrlService {
    @Resource
    private FileUrlDao fileUrlDao;

    @Override
    public Integer addFileUrl(FileUrl fileUrl) {
        return fileUrlDao.insert(fileUrl);
    }

    @Override
    public List<FileUrl> getFileUrlByName(String fileName) {
        return fileUrlDao.findByName(fileName);
    }

    @Override
    public FileUrl getFileById(Integer id) {
        return fileUrlDao.selectOne(id);
    }
}
