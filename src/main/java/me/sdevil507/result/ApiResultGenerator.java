package me.sdevil507.result;

/**
 * 请求执行反馈工具类
 *
 * @author sdevil507
 */
public class ApiResultGenerator {

    /**
     * 获取执行结果返回
     *
     * @param code 状态码
     * @param msg  消息
     * @return ApiResultDTO
     * @see ApiResultDTO
     */
    public static ApiResultDTO create(String code, String msg) {
        return new ApiResultDTO.Builder(code, msg).create();
    }

    /**
     * 获取执行结果返回
     *
     * @param code    状态码
     * @param msg     消息
     * @param content 数据
     * @return ApiResultDTO
     * @see ApiResultDTO
     */
    public static ApiResultDTO create(String code, String msg, Object content) {
        return new ApiResultDTO.Builder(code, msg).addContent(content).create();
    }
}
