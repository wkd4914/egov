package egovframework.com.cop.ems.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.com.cop.ems.service.SndngMailVO;

/**
 * 발송메일을 등록하는 DAO 클래스
 * @author 공통서비스 개발팀 박지욱
 * @since 2009.03.12
 * @version 1.0
 * @param <haspMap>
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2009.03.12  박지욱          최초 생성
 *
 *  </pre>
 */
@Repository("sndngMailRegistDAO")
public class SndngMailRegistDAO<haspMap> extends EgovComAbstractDAO {

	/**
	 * 발송할 메일을 등록한다
	 * @param vo SndngMailVO
	 * @return SndngMailVO
	 * @exception Exception
	 */
	public SndngMailVO insertSndngMail(SndngMailVO vo) throws Exception {
		return (SndngMailVO) insert("sndngMailRegistDAO.insertSndngMail", vo);
	}

	/**
	 * 발송할 메일에 있는 첨부파일 목록을 조회한다.
	 * @param vo SndngMailVO
	 * @return List
	 * @exception Exception
	 */
	public List<?> selectAtchmnFileList(SndngMailVO vo) throws Exception {
		return list("sndngMailRegistDAO.selectAtchmnFileList", vo);
	}

	/**
	 * 발송결과를 수정한다.
	 * @param vo SndngMailVO
	 * @return SndngMailVO
	 * @exception Exception
	 */
	public SndngMailVO updateSndngMail(SndngMailVO vo) throws Exception {
		return (SndngMailVO) insert("sndngMailRegistDAO.updateSndngMail", vo);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map> selectOffieUser2(List<MultipartFile> list) throws Exception{
		List<String> paramList = new ArrayList();
		for ( MultipartFile file : list ) {
			String b = file.getOriginalFilename().substring(0,5);
			paramList.add(b);
		}
		return (List<Map>) list("sndngMailRegistDAO.SelectOfficeUserList", paramList);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map> selectOffieUser(List<String> list) throws Exception{
		return (List<Map>) list("sndngMailRegistDAO.SelectOfficeUserList", list);
	}
}
