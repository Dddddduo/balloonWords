package work.dduo.ans.service;

import work.dduo.ans.domain.TSentences;
import com.baomidou.mybatisplus.extension.service.IService;
import work.dduo.ans.model.vo.response.GetAllResp;
import work.dduo.ans.model.vo.response.GetAllTagsResp;
import work.dduo.ans.model.vo.response.GetRespVO;
import work.dduo.ans.model.vo.response.GetAllResp;

import java.util.List;

/**
* @author ZDY
* @description 针对表【t_sentences】的数据库操作Service
* @createDate 2025-02-14 23:27:19
*/
public interface TSentencesService extends IService<TSentences> {
    GetRespVO get();

    List<GetAllResp> getAll();

    List<GetAllTagsResp> getAllTags();
}
